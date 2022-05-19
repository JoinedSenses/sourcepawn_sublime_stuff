# SourcePawn Completions is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this program.  If not, see <http://www.gnu.org/licenses/>.
from __future__ import annotations
from grammar.SourcePawnParser import SourcePawnParser
import grammar.SourcePawnParser
from grammar.SourcePawnLexer import SourcePawnLexer
import grammar.SourcePawnLexer
from antlr4 import *
import grammar.antlr4 as antlr4
from watchdog.utils.bricks import OrderedSetQueue
import watchdog.utils
import watchdog.observers
import watchdog.events
import importlib
import os
from pathlib import Path
import re
import sys
import codecs
from typing import Dict, Iterable
import sublime
import sublime_plugin
from queue import *
from threading import Timer

current_dir = os.path.dirname(__file__)
sys.path.append(current_dir)


importlib.reload(grammar.SourcePawnLexer)

importlib.reload(grammar.SourcePawnParser)


def PLUGIN_NAME(): return 'SourcePawn Completions'
def SETTINGS_FILENAME(): return PLUGIN_NAME() + '.sublime-settings'
def BUILDSETTINGS_FILENAME(): return 'SourcePawn.sublime-build'


FILE_OBSERVER = watchdog.observers.Observer()
FILE_PROCESS_QUEUE = OrderedSetQueue()


def clear_console():
    """
    Clears sublime console
    """
    s = sublime.load_settings('Preferences.sublime-settings')
    current = s.get('console_max_history_lines')
    s.set('console_max_history_lines', 1)
    print("")
    s.set('console_max_history_lines', current)


class Debug:
    debug: bool = True

    @staticmethod
    def Log(text: str) -> None:
        if Debug.debug:
            print(text)


class Wrapper:
    def __init__(self):
        self.value = []

    def set(self, newval):
        self.value = newval

    def get(self):
        return self.value


USER_INCLUDE_DIRS: Wrapper = Wrapper()


class Node:
    def __init__(self, file_name: str):
        self.file_name: str = file_name
        self.children: set[Node] = set()
        self.parents: set[Node] = set()
        self.funcs: set[tuple[str, str]] = set()
        self.classes = dict()
        self.globals = dict()

    def add_child(self, node: Node) -> None:
        self.children.add(node)
        node.parents.add(self)

    def remove_child(self, node: Node) -> None:
        self.children.remove(node)
        node.parents.remove(self)

        if len(node.parents) <= 0:
            NODEMAP.pop(node.file_name)

    def remove_all_children(self) -> None:
        for child in self.children:
            self.remove_child(child)
        self.funcs.clear()
        self.classes.clear()

    def find_class(self, class_name: str) -> list[tuple[str, str]]:
        visited = set()
        if class_name == 'Handle':
            return [('Close()\t(function: void) [handles]', 'Close()')]
        if class_name == 'Handle.static':
            return []
        return self.__find_class_recur(class_name, visited)

    def __find_class_recur(self, class_name: str, visited: set[Node]) -> list[tuple[str, str]]:
        if self in visited:
            return

        visited.add(self)

        Debug.Log(f'searching {self.file_name} for {class_name}', end='\n ')
        keys = self.classes.keys()
        Debug.Log(*keys, sep='\n ')

        if class_name in keys:
            return self.classes[class_name]

        for child in self.children:
            c = child.__find_class_recur(class_name, visited)
            if c is not None:
                return c

        return None


class NodeMap(Dict[str, Node]):
    def get_or_add(self, file_name: str) -> tuple[Node, bool]:
        added: bool = False

        node: Node = self.get(file_name)
        if node is None:
            node = Node(file_name)
            self[file_name] = node
            added = True

        return (node, added)


NODEMAP: NodeMap = NodeMap()  # map files to nodes


def plugin_loaded() -> None:
    """Magic function that is invoked by Sublime Text"""
    load_include_dir(True)


def plugin_unloaded() -> None:
    """Magic function that is invoked by Sublime Text"""
    FILE_OBSERVER.stop()
    PROCESS_THREAD.stop()
    # Get PROCESS_THREAD to stop by adding something to the queue
    FILE_PROCESS_QUEUE.put(('', ''))
    # remove callback
    _get_settings().clear_on_change(PLUGIN_NAME())


class SPCompletions(sublime_plugin.EventListener):
    def __init__(self):
        PROCESS_THREAD.start()
        self.delay_queue = None
        FILE_OBSERVER.start()

    def on_activated(self, view):
        """ Built-In:
        Called when a view gains input focus.
        """
        if not self.is_sourcepawn_file(view):
            return

        file_name = view.file_name()
        if file_name is not None and file_name and not file_name in NODEMAP:
            add_to_queue(view)

    def on_activated_async(self, view):
        """ Built-In:
        Called when a view gains input focus.
        Runs in a separate thread, and does not block the application.
        """
        _save_user_settings()

    def on_modified(self, view):
        """ Built-In:
        Called after changes have been made to a view.
        """
        self.add_to_queue_delayed(view)

    def on_post_save(self, view):
        """ Built-In:
        Called after a view has been saved.
        """
        self.add_to_queue_now(view)

    def on_load(self, view):
        """ Built-In:
        Called when the file is finished loading.
        """
        self.add_to_queue_now(view)

    def add_to_queue_now(self, view):
        """
        Begin processing the view immediately

        Args:
            view (sublime.View): Represents a view into a text buffer
        """
        if self.is_sourcepawn_file(view):
            add_to_queue(view)

    def add_to_queue_delayed(self, view) -> None:
        """
        Add the view to a delayed timer for processing based on user config live_refresh_delay

        Args:
            view (sublime.View): Represents a view into a text buffer
        """
        if not self.is_sourcepawn_file(view):
            return

        deley_queue = self.delay_queue
        if deley_queue:
            deley_queue.cancel()

        delay_time = _get_settings().get('live_refresh_delay', 1.0)
        deley_queue = Timer(float(delay_time), add_to_queue_forward, [view])
        deley_queue.start()
        self.delay_queue = deley_queue

    def is_sourcepawn_file(self, view) -> bool:
        """
        True if a file is open and the scope is for sourcepawn

        Args:
            view (sublime.View): Represents a view into a text buffer

        Returns:
            bool: True if view file is not none and is scoped for sp
        """
        return (
            view.file_name() is not None and
            view.match_selector(0, 'source.sp')
        )

    def on_query_completions(self, view, prefix, locations):
        """Built-In:

        Called whenever completions are to be presented to the user. The prefix is a unicode string of the text to complete.

        Args:
            view (sublime.View): Represents a view into a text buffer
            prefix (str): A unicode string of the text to complete
            locations (list[point]): locations is a list of points. Since this method is called for all completions in every view no matter the syntax,
                view.match_selector(point, relevant_scope) should be called to determine if the point is relevant.

        Returns:
            - None: no completions are provided
            - A list of completion values
            - A 2-element tuple with the first element being a list of completion values,
            and the second element being flags composed via bitwise OR of:
                - sublime.INHIBIT_WORD_COMPLETIONS: prevent Sublime Text from showing completions based on the contents of the view
                - sublime.INHIBIT_EXPLICIT_COMPLETIONS: prevent Sublime Text from showing completions based on .sublime-completions files
                - sublime.DYNAMIC_COMPLETIONS: if completions should be re-queried as the user types 4057
                - sublime.INHIBIT_REORDER: prevent Sublime Text from changing the completion order 4074
            - A CompletionList object 4050
        """
        # Dont query if we're not in a sourcepawn file or if we're in a string, comment, or constant
        if not view.match_selector(locations[0], 'source.sp -string -comment -constant'):
            return []

        file_name = view.file_name()
        if file_name is None:
            return []

        return None

    def generate_funcset(self, file_name: str) -> list:
        funcset: set[set] = set()
        visited: set[Node] = set()

        self.generate_funcset_recur(NODEMAP[file_name], funcset, visited)

        return Sorter.sorted_nicely(funcset)

    def generate_funcset_recur(self, node: Node, funcset: set[set], visited: set[Node]) -> None:
        if node in visited:
            return

        visited.add(node)
        for child in node.children:
            self.generate_funcset_recur(child, funcset, visited)

        funcset.update(node.funcs)

    def get_classes(self, file_name: str) -> dict[str, list[tuple[str, str]]]:
        classes: dict[str, list[tuple[str, str]]] = dict(
            {
                'Handle': [('Close()\t(function: void) [handles]', 'Close()')],
                'Handle.static': []
            }
        )

        visited: set[Node] = set()

        node = NODEMAP[file_name]
        self.get_classes_recur(node, classes, visited)

        return classes

    def get_classes_recur(self, node: Node, classes: dict[str, list[tuple[str, str]]], visited: set[Node]):
        if node in visited:
            return

        visited.add(node)
        for child in node.children:
            self.get_classes_recur(child, classes, visited)

        classes.update(node.classes)


def _get_settings():
    """
    Returns user settings file

    Returns:
        sublime.Settings: Sublime settings file
    """
    return sublime.load_settings(SETTINGS_FILENAME())


def on_settings_modified() -> None:
    load_include_dir()


def load_include_dir(register_callback: bool = False) -> None:
    settings = _get_settings()
    if register_callback:
        settings.add_on_change(PLUGIN_NAME(), on_settings_modified)

    dirs = settings.get('include_directory', '.')
    USER_INCLUDE_DIRS.set(dirs)
    if type(dirs) is not list:
        if not os.path.isabs(str(dirs)):
            raise RuntimeError(
                "Invalid 'include_directory' setting (%s): directory doesn't exists" % str(dirs))

        FILE_OBSERVER.unschedule_all()
        FILE_OBSERVER.schedule(FILE_EVENT_HANDLER, dirs, True)
    else:
        for path in dirs:
            if not os.path.isabs(str(path)):
                raise RuntimeError(
                    "Invalid 'include_directory' setting (%s): directory doesn't exists" % str(path))

            FILE_OBSERVER.unschedule_all()
            FILE_OBSERVER.schedule(FILE_EVENT_HANDLER, path, True)


class Sorter:
    def __convert(text): return int(text) if text.isdigit() else text

    def __alphanum_key(key): return [Sorter.__convert(c)
                                     for c in re.split('([0-9]+)', key[0])]

    @staticmethod
    def sorted_nicely(iterable: Iterable) -> list:
        return sorted(iterable, key=Sorter.__alphanum_key)


def add_to_queue_forward(view) -> None:
    sublime.set_timeout(lambda: add_to_queue(view), 0)


def add_to_queue(view) -> None:
    # The view can only be accessed from the main thread, so run the regex
    # now and process the results later
    file_name: str = view.file_name()
    if file_name is not None:
        FILE_PROCESS_QUEUE.put(
            (file_name, view.substr(sublime.Region(0, view.size()))))


def add_include_to_queue(file_name: str) -> None:
    FILE_PROCESS_QUEUE.put((file_name, None))


def _save_user_settings() -> None:
    changed: bool = False
    settings = _get_settings()
    if not settings.get('bootstrapped'):
        settings.set('bootstrapped', True)
        changed = True
    if not settings.get('live_refresh_delay'):
        settings.set('live_refresh_delay', 1.0)
        changed = True

    if changed:
        sublime.save_settings(SETTINGS_FILENAME())
        changed = False

    build_filename: str = BUILDSETTINGS_FILENAME()
    build = sublime.load_settings(build_filename)
    if not build.get('file_patterns'):
        build.set('file_patterns', ['*.sp'])
        changed = True
    if not build.get('quiet'):
        build.set('quiet', True)
        changed = True
    if not build.get('file_regex'):
        build.set('file_regex', r'(.*)\\((\\d+)\\) : ()(.*$)')
        changed = True
    if not build.get('selector'):
        build.set('selector', 'source.sp')
        changed = True

    if changed:
        sublime.save_settings(build_filename)


class IncludeFileEventHandler(watchdog.events.FileSystemEventHandler):
    def __init__(self):
        watchdog.events.FileSystemEventHandler.__init__(self)

    def on_created(self, event):
        sublime.set_timeout(lambda: on_modified_main_thread(event.src_path), 0)

    def on_modified(self, event):
        sublime.set_timeout(lambda: on_modified_main_thread(event.src_path), 0)

    def on_deleted(self, event):
        sublime.set_timeout(lambda: on_deleted_main_thread(event.src_path), 0)


FILE_EVENT_HANDLER = IncludeFileEventHandler()


def on_modified_main_thread(file_path: str) -> None:
    if not is_active(file_path):
        add_include_to_queue(file_path)


def on_deleted_main_thread(file_path: str) -> None:
    if is_active(file_path):
        return

    node = NODEMAP.get(file_path)
    if node is None:
        return

    node.remove_all_children_and_funcs()


def is_active(file_name: str) -> bool:
    return sublime.active_window().active_view().file_name() == file_name


class ProcessQueueThread(watchdog.utils.DaemonThread):
    pattern_includes = re.compile(
        r'^[ \t]*#include[ \t]+[<"]([^>"]+)[>"]', re.MULTILINE)
    pattern_spfiletype = re.compile(r'\.(sp|inc)$')

    def run(self) -> None:
        while self.should_keep_running():
            (file_name, view_buffer) = FILE_PROCESS_QUEUE.get()
            if not file_name:
                continue

            if view_buffer is None:
                self.process_existing_include(file_name)
            else:
                self.process(file_name, view_buffer)

    def process(self, view_file_name: str, view_buffer: str) -> None:
        clear_console()

        (current_node, node_added) = NODEMAP.get_or_add(view_file_name)

        base_includes = set()
        includes = self.pattern_includes.findall(view_buffer)

        self.load_from_file(view_file_name, 'sourcemod',
                            current_node, current_node, base_includes)

        for include in includes:
            if include == 'sourcemod':
                continue
            self.load_from_file(view_file_name, include,
                                current_node, current_node, base_includes)

        for removed_node in current_node.children.difference(base_includes):
            current_node.remove_child(removed_node)

        process_buffer(view_buffer, current_node)

    def process_existing_include(self, file_name: str) -> None:
        current_node: Node = NODEMAP.get(file_name)
        if current_node is None:
            return

        base_includes: set[Node] = set()

        with codecs.open(file_name, 'r', 'utf-8') as f:
            includes: list[str] = self.pattern_includes.findall(f.read())

        self.load_from_file(file_name, 'sourcemod',
                            current_node, current_node, base_includes)
        for include in includes:
            if include == 'sourcemod':
                continue
            self.load_from_file(file_name, include,
                                current_node, current_node, base_includes)

        for removed_node in current_node.children.difference(base_includes):
            current_node.remove_child(removed_node)

        process_include_file(current_node)

    def load_from_file(self, view_file_name: str, base_file_name: str, parent_node: Node, base_node: Node, base_includes: set[Node]) -> None:
        (file_name, exists) = self.get_file_name(
            view_file_name, base_file_name)
        if not exists:
            Debug.Log(f'Include File Not Found: {base_file_name}')
            Debug.Log(f'Result: {file_name}')

        (node, node_added) = NODEMAP.get_or_add(file_name)
        parent_node.add_child(node)

        if parent_node == base_node:
            base_includes.add(node)

        if not node_added or not exists:
            return

        with codecs.open(file_name, 'r', 'utf-8') as f:
            for include in self.pattern_includes.findall(f.read()):
                self.load_from_file(view_file_name, include,
                                    node, base_node, base_includes)

        process_include_file(node)

    def get_file_name(self, view_file_name: str, base_file_name: str) -> tuple[str, bool]:
        file_name: str = ''
        # If file name doesn't contain .sp or .inc
        if self.pattern_spfiletype.search(base_file_name) == None:
            # then try to find a .inc file with the name in the dir path(s)
            dirs = USER_INCLUDE_DIRS.get()
            incfile = base_file_name + '.inc'
            if type(dirs) is not list:
                file_name = Path(dirs) / incfile
            else:
                for path in dirs:
                    file_name = Path(path) / incfile
                    if os.path.exists(file_name):
                        return (file_name, True)
        else:
            file_name = Path(view_file_name).parents[0] / base_file_name

        return (file_name, os.path.exists(file_name))


PROCESS_THREAD = ProcessQueueThread()

# Processing below here


def process_include_file(node):
    pass
    # TODO: uncomment when process_buffer is OK
    # with codecs.open(node.file_name, 'r', 'utf-8') as f:
    #     process_buffer(f.read(), node)


def process_buffer(text: str, node: Node):
    Debug.Log(f'process_buffer: {node.file_name}')
    # traceback.print_stack()

    lexer = SourcePawnLexer(antlr4.InputStream(text))

    # for t in lexer.getAllTokens(): Debug.Log(f'{t.line}:{t.column} {t.text} {lexer.symbolicNames[t.type]}')

    stream = antlr4.CommonTokenStream(lexer)
    # stream.fill()

    parser = SourcePawnParser(stream)
    tree = parser.start()
    Debug.Log(tree.toStringTree(parser.ruleNames))
