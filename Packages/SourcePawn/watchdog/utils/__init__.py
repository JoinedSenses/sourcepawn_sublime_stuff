#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
# Copyright 2011 Yesudeep Mangalapilly <yesudeep@gmail.com>
# Copyright 2012 Google, Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.


"""
:module: watchdog.utils
:synopsis: Utility classes and functions.
:author: yesudeep@google.com (Yesudeep Mangalapilly)

Classes
-------
.. autoclass:: DaemonThread
   :members:
   :show-inheritance:
   :inherited-members:

"""
import os
import sys
import threading
import watchdog.utils.platform
from collections import namedtuple


if sys.version_info[0] == 2 and platform.is_windows():
    # st_ino is not implemented in os.stat on this platform
    import win32stat
    stat = win32stat.stat
else:
    stat = os.stat


def ctypes_find_library(name, default):
    """Finds a dynamic library."""
    try:
        import ctypes.util
    except ImportError:
        raise RuntimeError('ctypes not available on this system')
    module_path = None
    try:
        module_path = ctypes.util.find_library(name)
    except (OSError, IOError):
        module_path = default
    return module_path


def has_attribute(ob, attribute):
    """
    :func:`hasattr` swallows exceptions. :func:`has_attribute` tests a Python object for the
    presence of an attribute.

    :param ob:
        object to inspect
    :param attribute:
        ``str`` for the name of the attribute.
    """
    return getattr(ob, attribute, None) is not None


class DaemonThread(threading.Thread):

    """
    Daemon thread convenience class, sets a few properties and makes
    writing daemon threads a little easier.
    """

    def __init__(self):
        threading.Thread.__init__(self)
        if has_attribute(self, 'daemon'):
            self.daemon = True
        else:
            self.setDaemon(True)
        self._stopped_event = threading.Event()

        if not has_attribute(self._stopped_event, 'is_set'):
            self._stopped_event.is_set = self._stopped_event.isSet

    @property
    def stopped_event(self):
        return self._stopped_event

    def should_keep_running(self):
        """Determines whether the daemon thread should continue running."""
        return not self._stopped_event.is_set()

    def on_thread_stop(self):
        """Override this method instead of :meth:`stop()`.
        :meth:`stop()` calls this method.

        Note that this method is called immediately after the daemon thread
        is signaled to halt.
        """
        pass

    def stop(self):
        """Signals the daemon thread to stop."""
        self._stopped_event.set()
        self.on_thread_stop()


def load_module(module_name):
    """Imports a module given its name and returns a handle to it."""
    try:
        __import__(module_name)
    except ImportError:
        raise ImportError('No module named %s' % module_name)
    return sys.modules[module_name]


def load_class(dotted_path):
    """Loads and returns a class definition provided a dotted path
    specification the last part of the dotted path is the class name
    and there is at least one module name preceding the class name.

    Notes:
    You will need to ensure that the module you are trying to load
    exists in the Python path.

    Examples:
    - module.name.ClassName    # Provided module.name is in the Python path.
    - module.ClassName         # Provided module is in the Python path.

    What won't work:
    - ClassName
    - modle.name.ClassName     # Typo in module name.
    - module.name.ClasNam      # Typo in classname.
    """
    dotted_path_split = dotted_path.split('.')
    if len(dotted_path_split) > 1:
        klass_name = dotted_path_split[-1]
        module_name = '.'.join(dotted_path_split[:-1])

        module = load_module(module_name)
        if has_attribute(module, klass_name):
            klass = getattr(module, klass_name)
            return klass
            # Finally create and return an instance of the class
            # return klass(*args, **kwargs)
        else:
            raise AttributeError('Module %s does not have class attribute %s' % (
                                 module_name, klass_name))
    else:
        raise ValueError(
            'Dotted module path %s must contain a module name and a classname' % dotted_path)
