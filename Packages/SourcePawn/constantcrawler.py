import os.path
import pyperclip
import re
import sys
from argparse import ArgumentParser
from io import TextIOWrapper
from trieregex import TrieRegEx # https://github.com/ermanh/trieregex


argparser = ArgumentParser(description='Crawls through include directories and files to generate a regex trie for matching constants')
argparser.add_argument('--debug', help='Enable debug messages', action='store_true')
argparser.add_argument('paths', metavar='Paths', type=str, nargs='+', help='Paths to crawl. Can be directory or file.')
argparser.add_argument_group()

parsedargs = argparser.parse_args()


class Debug:
    __enabled = parsedargs.debug

    @staticmethod
    def log(value: str) -> None:
        if Debug.__enabled: print(value)


def main(paths: list[str]):
    """
    Crawls through include directories and files to generate a regex trie for matching constants.
    Ignores variables IN_ALL_CAPS since those are already discovered with a basic all-caps regex for the
    purpose of syntax highlighting.

    Args:
        args (list[str]): _description_
    """
    if len(paths) < 1:
        argparser.print_help()
        sys.exit(1)

    trie: TrieRegEx = TrieRegEx()

    error: str = ''
    # loop through all args and attempt to parse
    for path in paths:
        # if arg is file and ends with .inc, then parse it
        if os.path.isfile(path):
            if path.endswith('.inc'):
                with open(path) as f: parse_file(f, trie)
            continue

        if not os.path.isdir(path):
            error += '\n  Path not found: {}'.format(path)
            continue

        # loop through each file in the directory
        for file_name in os.listdir(path):
            # if it's not a .inc file, skip it
            if not file_name.endswith('.inc'): continue

            # open and read the file
            with open(os.path.join(path, file_name)) as f: parse_file(f, trie)      

    result: str = trie.regex()
    Debug.log('-- Result: --\n{}'.format(result))

    if result:
        pyperclip.copy(result)
        print('Output copied to clipboard (Len: {})'.format(len(result)))

    if error:
        print('\nErrors detected:{}'.format(error))


def parse_file(f: TextIOWrapper, trie: TrieRegEx) -> None:
    """
    Parses a file for constants and adds them to the regex trie

    Args:
        f (TextIOWrapper): The file to parse
        tre (TrieRegEx): The trie to add results to.
    """
    Debug.log('-- Reading from {} --'.format(f.name))

    code: str = f.read()

    # remove multi-line comments
    code = re.sub(r'/\*(.|\n)*?\*/', '', code)
    #remove single-line comments
    code = re.sub(r'//.*$', '', code)

    parse_enums(code, trie)
    parse_defines(code, trie)
    parse_publicconstants(code, trie)


def parse_enums(code: str, trie: TrieRegEx) -> None:
    """
    Finds enum values and adds them to the regex trie

    Args:
        code (str): Text to search through.
        trie (TrieRegEx): Trie to add results to.
    """
    # scoop the innards from all enums, excluding enum structs
    for enum_innards_match in re.finditer(r'enum(?!\s+struct)(?:.|\n)*?{((?:.|\n)*?)}', code):
        Debug.log('-- Enum match: --\n{}\n-------'.format(enum_innards_match.group(0)))
        enum_innards: str = enum_innards_match.group(1)

        # try to get each enum variable
        for enum_def_match in re.finditer(r'(?:^|\n)\s*?(\w+)\b', enum_innards):
            def_text: str = enum_def_match.group(1)

            # if it's all uppercase, skip it
            if (re.match(r'\b[A-Z_\d]+\b', def_text)): continue

            # skip if already contains
            if (trie.has(def_text)):
                Debug.log('Skipping enum, already added: {}'.format(def_text))
                continue

            trie.add(def_text)
            Debug.log('Enum added: {}'.format(def_text))


def parse_defines(code: str, trie: TrieRegEx) -> None:
    """
    Finds defines and adds them to the regex trie

    Args:
        code (str): Text to search through.
        trie (TrieRegEx): Trie to add results to.
    """
    # match all defines
    for define_match in re.finditer(r'^#define[ \t]*(\w+)\b[ \t]', code):
        define: str = define_match.group(1)

        # if all uppercase, ignore. Typically they should be uppercase but maybe there's an exception
        if (re.match(r'\b[A-Z_\d]+\b', define)): continue
        
        # skip if already contains
        if (trie.has(define)):
            Debug.log('Skipping define, already added: {}'.format(define))
            continue

        trie.add(define)
        Debug.log('Define added: {}'.format(define))


def parse_publicconstants(code: str, trie: TrieRegEx) -> None:
    """
    Finds public const variables and adds them to the regex trie

    Args:
        code (str): Text to search through.
        trie (TrieRegEx): Trie to add results to.
    """
    # match public constants aka magic variables
    for constant_match in re.finditer(r'public[ \t]+const[ \t]+\w+[ \t]+(\w+)\b', code):
        constant: str = constant_match.group(1)

        # if all uppercase, ignore
        if (re.match(r'\b[A-Z_\d]+\b', constant)): continue

        # skip if already contains
        if (trie.has(constant)):
            Debug.log('Skipping const, already added: {}'.format(constant))
            continue

        trie.add(constant)
        Debug.log('Const added: {}'.format(constant))


# -------------
if __name__ == '__main__': main(parsedargs.paths)
