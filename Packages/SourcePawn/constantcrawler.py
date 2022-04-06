import sys
import os.path
import re
from trieregex import TrieRegEx as TRE # https://github.com/ermanh/trieregex
import pyperclip

DEBUG = False

"""
Crawls through include directories to generate a regex trie for matching constants.
Ignores variables IN_ALL_CAPS since those are already discovered with a basic all-caps regex for the
purpose of syntax highlighting.
"""
if len(sys.argv) < 2:
    print("Expected one or more parameters for include directory path ({})".format(len(sys.argv)))
    for arg in sys.argv:
        print(arg)
    sys.exit(1)

tre = TRE()

for i in range(1, len(sys.argv)):
    include_dir = sys.argv[i]

    if not os.path.isdir(include_dir):
        print('Path not found: {}'.format(include_dir))
        continue

    # loop through each file in the directory
    for file_name in os.listdir(include_dir):
        # if it's not a .inc file, skip it
        if not file_name.endswith('.inc'):
            continue

        code = ''

        # open and read the file
        with open(os.path.join(include_dir, file_name)) as f:
            if DEBUG: print('-- Reading from {} --'.format(file_name))

            code = f.read()

            # remove multi-line comments
            code = re.sub(r'\/\*(.|\n)*?\*\/', '', code)

            #remove single-line comments
            code = re.sub(r'\/\/.*\n', '', code)

            # scoop the innards from all enums, excluding enum structs
            for enum_innards_match in re.finditer(r'enum(?!\s+struct)(?:.|\n)*?{((?:.|\n)*?)}', code):
                enum_innards = enum_innards_match.group(1)

                # try to get each enum variable
                for enum_def_match in re.finditer(r'(?:^|\n)\s*?(\w+)\b', enum_innards):
                    def_text = enum_def_match.group(1)

                    # if it's all uppercase, skip it
                    if (re.match(r'\b[A-Z_\d]+\b', def_text)):
                        continue

                    # skip if already contains
                    if (tre.has(def_text)):
                        if DEBUG: print('Skipping enum, already added: {}'.format(def_text))
                        continue

                    tre.add(def_text)
                    if DEBUG: print('Enum added: {}'.format(def_text))

            # match all defines
            for define_match in re.finditer(r'^#define[ \t]*(\w+)\b[ \t]', code):
                define = define_match.group(1)

                # if all uppercase, ignore. Typically they should be uppercase but maybe there's an exception
                if (re.match(r'\b[A-Z_\d]+\b', define)):
                    continue
                
                # skip if already contains
                if (tre.has(define)):
                    if DEBUG: print('Skipping define, already added: {}'.format(define))
                    continue

                tre.add(define)
                if DEBUG: print('Define added: {}'.format(define))

            # match public constants aka magic variables
            for constant_match in re.finditer(r'public[ \t]+const[ \t]+\w+[ \t]+(\w+)\b', code):
                constant = constant_match.group(1)

                # if all uppercase, ignore
                if (re.match(r'\b[A-Z_\d]+\b', constant)):
                    continue

                # skip if already contains
                if (tre.has(constant)):
                    if DEBUG: print('Skipping const, already added: {}'.format(constant))
                    continue

                tre.add(constant)
                if DEBUG: print('Const added: {}'.format(constant))

result = tre.regex()

if DEBUG: print(result)

pyperclip.copy(result)
print("Output copied to clipboard")