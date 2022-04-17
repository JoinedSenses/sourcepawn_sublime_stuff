import os.path
import pyperclip
import re
import sys
from io import TextIOWrapper
from trieregex import TrieRegEx # https://github.com/ermanh/trieregex

DEBUG = False

def main():
    """
    Crawls through include directories to generate a regex trie for matching constants.
    Ignores variables IN_ALL_CAPS since those are already discovered with a basic all-caps regex for the
    purpose of syntax highlighting.
    """
    if len(sys.argv) < 2:
        print("Expected one or more parameters for include directory path ({})".format(len(sys.argv)))
        sys.exit(1)

    trie = TrieRegEx()

    # loop through all args and attempt to parse
    for i in range(1, len(sys.argv)):
        arg = sys.argv[i]

        # if arg is file and ends with .inc, then parse it
        if os.path.isfile(arg):
            if arg.endswith('.inc'):
                with open(arg) as f: parse_file(f, trie)
            continue

        if not os.path.isdir(arg):
            print('Path not found: {}'.format(arg))
            continue

        # loop through each file in the directory
        for file_name in os.listdir(arg):
            # if it's not a .inc file, skip it
            if not file_name.endswith('.inc'): continue

            # open and read the file
            with open(os.path.join(arg, file_name)) as f: parse_file(f, trie)      

    result = trie.regex()
    if DEBUG: print(result)

    pyperclip.copy(result)
    print("Output copied to clipboard (Len: {})".format(len(result)))

def parse_file(f: TextIOWrapper, trie: TrieRegEx) -> None:
    """
    Parses a file for constants and adds them to the regex trie

    Args:
        f (TextIOWrapper): The file to parse
        tre (TrieRegEx): The trie to add results to.
    """
    if DEBUG: print('-- Reading from {} --'.format(f.name))

    code = f.read()

    # remove multi-line comments
    code = re.sub(r'\/\*(.|\n)*?\*\/', '', code)

    #remove single-line comments
    code = re.sub(r'\/\/.*$', '', code)

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
        if DEBUG: print('-- Enum match: --\n{}\n-------'.format(enum_innards_match.group(0)))
        enum_innards = enum_innards_match.group(1)

        # try to get each enum variable
        for enum_def_match in re.finditer(r'(?:^|\n)\s*?(\w+)\b', enum_innards):
            def_text = enum_def_match.group(1)

            # if it's all uppercase, skip it
            if (re.match(r'\b[A-Z_\d]+\b', def_text)): continue

            # skip if already contains
            if (trie.has(def_text)):
                if DEBUG: print('Skipping enum, already added: {}'.format(def_text))
                continue

            trie.add(def_text)
            if DEBUG: print('Enum added: {}'.format(def_text))


def parse_defines(code: str, trie: TrieRegEx) -> None:
    """
    Finds defines and adds them to the regex trie

    Args:
        code (str): Text to search through.
        trie (TrieRegEx): Trie to add results to.
    """
    # match all defines
    for define_match in re.finditer(r'^#define[ \t]*(\w+)\b[ \t]', code):
        define = define_match.group(1)

        # if all uppercase, ignore. Typically they should be uppercase but maybe there's an exception
        if (re.match(r'\b[A-Z_\d]+\b', define)): continue
        
        # skip if already contains
        if (trie.has(define)):
            if DEBUG: print('Skipping define, already added: {}'.format(define))
            continue

        trie.add(define)
        if DEBUG: print('Define added: {}'.format(define))


def parse_publicconstants(code: str, trie: TrieRegEx) -> None:
    # match public constants aka magic variables
    for constant_match in re.finditer(r'public[ \t]+const[ \t]+\w+[ \t]+(\w+)\b', code):
        constant = constant_match.group(1)

        # if all uppercase, ignore
        if (re.match(r'\b[A-Z_\d]+\b', constant)): continue

        # skip if already contains
        if (trie.has(constant)):
            if DEBUG: print('Skipping const, already added: {}'.format(constant))
            continue

        trie.add(constant)
        if DEBUG: print('Const added: {}'.format(constant))

# -------------

main()
