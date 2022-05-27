# Generated from c:\Users\Arron\AppData\Roaming\Sublime Text\Packages\SourcePawn\grammar\SourcePawnParser.g4 by ANTLR 4.10.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,108,468,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,
        7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,
        13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,
        20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,
        26,2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,1,0,1,0,1,1,
        1,1,1,1,3,1,70,8,1,1,1,1,1,5,1,74,8,1,10,1,12,1,77,9,1,1,1,1,1,3,
        1,81,8,1,1,2,1,2,1,2,1,3,1,3,1,3,3,3,89,8,3,1,3,1,3,1,3,5,3,94,8,
        3,10,3,12,3,97,9,3,1,3,1,3,1,3,3,3,102,8,3,1,3,3,3,105,8,3,1,3,1,
        3,3,3,109,8,3,1,3,1,3,1,3,5,3,114,8,3,10,3,12,3,117,9,3,1,3,1,3,
        1,3,1,3,1,3,3,3,124,8,3,1,3,1,3,1,3,1,3,1,3,5,3,131,8,3,10,3,12,
        3,134,9,3,1,3,1,3,1,3,3,3,139,8,3,1,3,3,3,142,8,3,1,3,1,3,3,3,146,
        8,3,1,3,1,3,1,3,1,3,5,3,152,8,3,10,3,12,3,155,9,3,1,3,1,3,1,3,1,
        3,1,3,1,3,1,3,1,3,5,3,165,8,3,10,3,12,3,168,9,3,1,3,1,3,3,3,172,
        8,3,1,4,1,4,1,4,1,5,1,5,1,5,1,5,1,5,1,5,3,5,183,8,5,1,5,3,5,186,
        8,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,3,5,196,8,5,1,5,3,5,199,8,5,
        1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,3,5,213,8,5,1,6,
        1,6,4,6,217,8,6,11,6,12,6,218,1,6,1,6,1,7,1,7,1,7,1,7,1,7,3,7,228,
        8,7,1,8,1,8,1,8,3,8,233,8,8,1,9,1,9,1,10,1,10,3,10,239,8,10,1,11,
        1,11,1,12,1,12,1,12,1,12,1,13,1,13,1,13,1,13,1,13,3,13,252,8,13,
        1,14,1,14,1,14,1,14,1,14,1,14,1,14,5,14,261,8,14,10,14,12,14,264,
        9,14,3,14,266,8,14,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,
        1,15,1,15,1,15,1,15,1,15,1,15,3,15,283,8,15,1,15,1,15,1,15,1,15,
        1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,
        1,15,1,15,1,15,1,15,1,15,1,15,1,15,5,15,309,8,15,10,15,12,15,312,
        9,15,1,16,1,16,1,17,1,17,1,18,1,18,1,18,1,18,1,18,1,19,1,19,1,19,
        1,19,5,19,327,8,19,10,19,12,19,330,9,19,1,19,1,19,3,19,334,8,19,
        1,20,1,20,1,20,1,20,3,20,340,8,20,1,20,1,20,3,20,344,8,20,3,20,346,
        8,20,1,21,1,21,1,21,1,21,3,21,352,8,21,1,21,1,21,1,22,1,22,1,22,
        1,22,1,22,3,22,361,8,22,1,22,1,22,3,22,365,8,22,1,23,1,23,1,23,1,
        23,1,23,3,23,372,8,23,1,23,1,23,3,23,376,8,23,1,24,3,24,379,8,24,
        1,24,1,24,1,24,3,24,384,8,24,1,24,1,24,1,24,3,24,389,8,24,1,24,1,
        24,1,24,1,25,1,25,1,25,1,25,1,25,3,25,399,8,25,1,25,1,25,1,25,1,
        26,1,26,1,26,5,26,407,8,26,10,26,12,26,410,9,26,1,27,1,27,1,27,5,
        27,415,8,27,10,27,12,27,418,9,27,1,28,3,28,421,8,28,1,28,1,28,1,
        28,1,28,3,28,427,8,28,1,28,1,28,1,28,1,28,1,28,1,28,3,28,435,8,28,
        1,28,1,28,1,28,1,28,1,28,3,28,442,8,28,1,28,1,28,1,28,1,28,1,28,
        1,28,1,28,3,28,451,8,28,1,28,1,28,1,28,3,28,456,8,28,1,29,1,29,1,
        29,1,30,1,30,3,30,463,8,30,1,31,1,31,1,31,1,31,0,1,30,32,0,2,4,6,
        8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,
        52,54,56,58,60,62,0,10,6,0,9,10,14,14,24,24,28,28,30,30,51,51,2,
        0,84,84,92,92,1,0,85,87,1,0,83,84,1,0,70,72,1,0,88,90,1,0,75,78,
        1,0,79,80,1,0,1,5,2,0,59,69,93,93,512,0,64,1,0,0,0,2,66,1,0,0,0,
        4,82,1,0,0,0,6,171,1,0,0,0,8,173,1,0,0,0,10,212,1,0,0,0,12,216,1,
        0,0,0,14,227,1,0,0,0,16,232,1,0,0,0,18,234,1,0,0,0,20,238,1,0,0,
        0,22,240,1,0,0,0,24,242,1,0,0,0,26,251,1,0,0,0,28,265,1,0,0,0,30,
        282,1,0,0,0,32,313,1,0,0,0,34,315,1,0,0,0,36,317,1,0,0,0,38,322,
        1,0,0,0,40,345,1,0,0,0,42,347,1,0,0,0,44,355,1,0,0,0,46,366,1,0,
        0,0,48,378,1,0,0,0,50,393,1,0,0,0,52,403,1,0,0,0,54,411,1,0,0,0,
        56,455,1,0,0,0,58,457,1,0,0,0,60,460,1,0,0,0,62,464,1,0,0,0,64,65,
        5,38,0,0,65,1,1,0,0,0,66,67,5,31,0,0,67,69,3,18,9,0,68,70,3,4,2,
        0,69,68,1,0,0,0,69,70,1,0,0,0,70,71,1,0,0,0,71,75,5,57,0,0,72,74,
        3,6,3,0,73,72,1,0,0,0,74,77,1,0,0,0,75,73,1,0,0,0,75,76,1,0,0,0,
        76,78,1,0,0,0,77,75,1,0,0,0,78,80,5,58,0,0,79,81,5,98,0,0,80,79,
        1,0,0,0,80,81,1,0,0,0,81,3,1,0,0,0,82,83,5,77,0,0,83,84,3,18,9,0,
        84,5,1,0,0,0,85,86,3,0,0,0,86,88,5,32,0,0,87,89,5,91,0,0,88,87,1,
        0,0,0,88,89,1,0,0,0,89,90,1,0,0,0,90,91,3,18,9,0,91,95,5,53,0,0,
        92,94,3,52,26,0,93,92,1,0,0,0,94,97,1,0,0,0,95,93,1,0,0,0,95,96,
        1,0,0,0,96,98,1,0,0,0,97,95,1,0,0,0,98,101,5,54,0,0,99,100,5,93,
        0,0,100,102,3,18,9,0,101,99,1,0,0,0,101,102,1,0,0,0,102,104,1,0,
        0,0,103,105,5,98,0,0,104,103,1,0,0,0,104,105,1,0,0,0,105,172,1,0,
        0,0,106,108,3,0,0,0,107,109,5,91,0,0,108,107,1,0,0,0,108,109,1,0,
        0,0,109,110,1,0,0,0,110,111,3,18,9,0,111,115,5,53,0,0,112,114,3,
        52,26,0,113,112,1,0,0,0,114,117,1,0,0,0,115,113,1,0,0,0,115,116,
        1,0,0,0,116,118,1,0,0,0,117,115,1,0,0,0,118,119,5,54,0,0,119,120,
        3,62,31,0,120,172,1,0,0,0,121,123,3,0,0,0,122,124,5,41,0,0,123,122,
        1,0,0,0,123,124,1,0,0,0,124,125,1,0,0,0,125,126,5,32,0,0,126,127,
        3,20,10,0,127,128,3,18,9,0,128,132,5,53,0,0,129,131,3,52,26,0,130,
        129,1,0,0,0,131,134,1,0,0,0,132,130,1,0,0,0,132,133,1,0,0,0,133,
        135,1,0,0,0,134,132,1,0,0,0,135,138,5,54,0,0,136,137,5,93,0,0,137,
        139,3,18,9,0,138,136,1,0,0,0,138,139,1,0,0,0,139,141,1,0,0,0,140,
        142,5,98,0,0,141,140,1,0,0,0,141,142,1,0,0,0,142,172,1,0,0,0,143,
        145,3,0,0,0,144,146,5,41,0,0,145,144,1,0,0,0,145,146,1,0,0,0,146,
        147,1,0,0,0,147,148,3,20,10,0,148,149,3,18,9,0,149,153,5,53,0,0,
        150,152,3,52,26,0,151,150,1,0,0,0,152,155,1,0,0,0,153,151,1,0,0,
        0,153,154,1,0,0,0,154,156,1,0,0,0,155,153,1,0,0,0,156,157,5,54,0,
        0,157,158,3,62,31,0,158,172,1,0,0,0,159,160,5,37,0,0,160,161,3,20,
        10,0,161,162,3,18,9,0,162,166,5,57,0,0,163,165,3,8,4,0,164,163,1,
        0,0,0,165,168,1,0,0,0,166,164,1,0,0,0,166,167,1,0,0,0,167,169,1,
        0,0,0,168,166,1,0,0,0,169,170,5,58,0,0,170,172,1,0,0,0,171,85,1,
        0,0,0,171,106,1,0,0,0,171,121,1,0,0,0,171,143,1,0,0,0,171,159,1,
        0,0,0,172,7,1,0,0,0,173,174,3,0,0,0,174,175,3,10,5,0,175,9,1,0,0,
        0,176,177,5,32,0,0,177,178,3,18,9,0,178,179,5,53,0,0,179,182,5,54,
        0,0,180,181,5,93,0,0,181,183,3,18,9,0,182,180,1,0,0,0,182,183,1,
        0,0,0,183,185,1,0,0,0,184,186,5,98,0,0,185,184,1,0,0,0,185,186,1,
        0,0,0,186,213,1,0,0,0,187,188,5,32,0,0,188,189,3,18,9,0,189,190,
        5,53,0,0,190,191,3,20,10,0,191,192,3,18,9,0,192,195,5,54,0,0,193,
        194,5,93,0,0,194,196,3,18,9,0,195,193,1,0,0,0,195,196,1,0,0,0,196,
        198,1,0,0,0,197,199,5,98,0,0,198,197,1,0,0,0,198,199,1,0,0,0,199,
        213,1,0,0,0,200,201,3,18,9,0,201,202,5,53,0,0,202,203,5,54,0,0,203,
        204,3,62,31,0,204,213,1,0,0,0,205,206,3,18,9,0,206,207,5,53,0,0,
        207,208,3,20,10,0,208,209,3,18,9,0,209,210,5,54,0,0,210,211,3,62,
        31,0,211,213,1,0,0,0,212,176,1,0,0,0,212,187,1,0,0,0,212,200,1,0,
        0,0,212,205,1,0,0,0,213,11,1,0,0,0,214,217,3,14,7,0,215,217,3,16,
        8,0,216,214,1,0,0,0,216,215,1,0,0,0,217,218,1,0,0,0,218,216,1,0,
        0,0,218,219,1,0,0,0,219,220,1,0,0,0,220,221,5,0,0,1,221,13,1,0,0,
        0,222,228,3,36,18,0,223,228,3,38,19,0,224,228,3,44,22,0,225,228,
        3,46,23,0,226,228,3,2,1,0,227,222,1,0,0,0,227,223,1,0,0,0,227,224,
        1,0,0,0,227,225,1,0,0,0,227,226,1,0,0,0,228,15,1,0,0,0,229,233,3,
        48,24,0,230,233,3,50,25,0,231,233,5,98,0,0,232,229,1,0,0,0,232,230,
        1,0,0,0,232,231,1,0,0,0,233,17,1,0,0,0,234,235,5,108,0,0,235,19,
        1,0,0,0,236,239,3,22,11,0,237,239,3,18,9,0,238,236,1,0,0,0,238,237,
        1,0,0,0,239,21,1,0,0,0,240,241,7,0,0,0,241,23,1,0,0,0,242,243,3,
        30,15,0,243,244,5,94,0,0,244,245,3,30,15,0,245,25,1,0,0,0,246,247,
        5,53,0,0,247,248,3,26,13,0,248,249,5,54,0,0,249,252,1,0,0,0,250,
        252,3,18,9,0,251,246,1,0,0,0,251,250,1,0,0,0,252,27,1,0,0,0,253,
        254,5,53,0,0,254,255,3,28,14,0,255,256,5,54,0,0,256,266,1,0,0,0,
        257,262,3,18,9,0,258,259,5,55,0,0,259,261,5,56,0,0,260,258,1,0,0,
        0,261,264,1,0,0,0,262,260,1,0,0,0,262,263,1,0,0,0,263,266,1,0,0,
        0,264,262,1,0,0,0,265,253,1,0,0,0,265,257,1,0,0,0,266,29,1,0,0,0,
        267,268,6,15,-1,0,268,269,5,40,0,0,269,283,3,28,14,0,270,271,7,1,
        0,0,271,283,3,30,15,12,272,273,3,18,9,0,273,274,3,34,17,0,274,275,
        3,30,15,4,275,283,1,0,0,0,276,277,5,53,0,0,277,278,3,30,15,0,278,
        279,5,54,0,0,279,283,1,0,0,0,280,283,3,32,16,0,281,283,3,18,9,0,
        282,267,1,0,0,0,282,270,1,0,0,0,282,272,1,0,0,0,282,276,1,0,0,0,
        282,280,1,0,0,0,282,281,1,0,0,0,283,310,1,0,0,0,284,285,10,11,0,
        0,285,286,7,2,0,0,286,309,3,30,15,12,287,288,10,10,0,0,288,289,7,
        3,0,0,289,309,3,30,15,11,290,291,10,9,0,0,291,292,7,4,0,0,292,309,
        3,30,15,10,293,294,10,8,0,0,294,295,7,5,0,0,295,309,3,30,15,9,296,
        297,10,7,0,0,297,298,7,6,0,0,298,309,3,30,15,8,299,300,10,6,0,0,
        300,301,7,7,0,0,301,309,3,30,15,7,302,303,10,5,0,0,303,304,5,95,
        0,0,304,305,3,30,15,0,305,306,5,98,0,0,306,307,3,30,15,6,307,309,
        1,0,0,0,308,284,1,0,0,0,308,287,1,0,0,0,308,290,1,0,0,0,308,293,
        1,0,0,0,308,296,1,0,0,0,308,299,1,0,0,0,308,302,1,0,0,0,309,312,
        1,0,0,0,310,308,1,0,0,0,310,311,1,0,0,0,311,31,1,0,0,0,312,310,1,
        0,0,0,313,314,7,8,0,0,314,33,1,0,0,0,315,316,7,9,0,0,316,35,1,0,
        0,0,317,318,5,48,0,0,318,319,3,18,9,0,319,320,5,93,0,0,320,321,3,
        40,20,0,321,37,1,0,0,0,322,323,5,49,0,0,323,324,3,18,9,0,324,328,
        5,57,0,0,325,327,3,40,20,0,326,325,1,0,0,0,327,330,1,0,0,0,328,326,
        1,0,0,0,328,329,1,0,0,0,329,331,1,0,0,0,330,328,1,0,0,0,331,333,
        5,58,0,0,332,334,5,98,0,0,333,332,1,0,0,0,333,334,1,0,0,0,334,39,
        1,0,0,0,335,336,5,53,0,0,336,337,3,42,21,0,337,339,5,54,0,0,338,
        340,5,98,0,0,339,338,1,0,0,0,339,340,1,0,0,0,340,346,1,0,0,0,341,
        343,3,42,21,0,342,344,5,98,0,0,343,342,1,0,0,0,343,344,1,0,0,0,344,
        346,1,0,0,0,345,335,1,0,0,0,345,341,1,0,0,0,346,41,1,0,0,0,347,348,
        5,26,0,0,348,349,3,20,10,0,349,351,5,53,0,0,350,352,3,54,27,0,351,
        350,1,0,0,0,351,352,1,0,0,0,352,353,1,0,0,0,353,354,5,54,0,0,354,
        43,1,0,0,0,355,356,5,32,0,0,356,357,3,20,10,0,357,358,3,18,9,0,358,
        360,5,53,0,0,359,361,3,52,26,0,360,359,1,0,0,0,360,361,1,0,0,0,361,
        362,1,0,0,0,362,364,5,54,0,0,363,365,5,98,0,0,364,363,1,0,0,0,364,
        365,1,0,0,0,365,45,1,0,0,0,366,367,5,25,0,0,367,368,3,20,10,0,368,
        369,3,18,9,0,369,371,5,53,0,0,370,372,3,52,26,0,371,370,1,0,0,0,
        371,372,1,0,0,0,372,373,1,0,0,0,373,375,5,54,0,0,374,376,5,98,0,
        0,375,374,1,0,0,0,375,376,1,0,0,0,376,47,1,0,0,0,377,379,5,43,0,
        0,378,377,1,0,0,0,378,379,1,0,0,0,379,380,1,0,0,0,380,383,3,20,10,
        0,381,382,5,55,0,0,382,384,5,56,0,0,383,381,1,0,0,0,383,384,1,0,
        0,0,384,385,1,0,0,0,385,386,3,18,9,0,386,388,5,53,0,0,387,389,3,
        52,26,0,388,387,1,0,0,0,388,389,1,0,0,0,389,390,1,0,0,0,390,391,
        5,54,0,0,391,392,3,62,31,0,392,49,1,0,0,0,393,394,5,38,0,0,394,395,
        3,20,10,0,395,396,3,18,9,0,396,398,5,53,0,0,397,399,3,52,26,0,398,
        397,1,0,0,0,398,399,1,0,0,0,399,400,1,0,0,0,400,401,5,54,0,0,401,
        402,3,62,31,0,402,51,1,0,0,0,403,408,3,60,30,0,404,405,5,94,0,0,
        405,407,3,60,30,0,406,404,1,0,0,0,407,410,1,0,0,0,408,406,1,0,0,
        0,408,409,1,0,0,0,409,53,1,0,0,0,410,408,1,0,0,0,411,416,3,56,28,
        0,412,413,5,94,0,0,413,415,3,56,28,0,414,412,1,0,0,0,415,418,1,0,
        0,0,416,414,1,0,0,0,416,417,1,0,0,0,417,55,1,0,0,0,418,416,1,0,0,
        0,419,421,5,15,0,0,420,419,1,0,0,0,420,421,1,0,0,0,421,422,1,0,0,
        0,422,423,3,20,10,0,423,424,3,18,9,0,424,456,1,0,0,0,425,427,5,15,
        0,0,426,425,1,0,0,0,426,427,1,0,0,0,427,428,1,0,0,0,428,429,3,20,
        10,0,429,430,5,55,0,0,430,431,5,56,0,0,431,432,3,18,9,0,432,456,
        1,0,0,0,433,435,5,15,0,0,434,433,1,0,0,0,434,435,1,0,0,0,435,436,
        1,0,0,0,436,437,3,20,10,0,437,438,5,88,0,0,438,439,3,18,9,0,439,
        456,1,0,0,0,440,442,5,15,0,0,441,440,1,0,0,0,441,442,1,0,0,0,442,
        443,1,0,0,0,443,444,3,20,10,0,444,445,3,18,9,0,445,446,5,55,0,0,
        446,447,3,30,15,0,447,448,5,56,0,0,448,456,1,0,0,0,449,451,5,15,
        0,0,450,449,1,0,0,0,450,451,1,0,0,0,451,452,1,0,0,0,452,453,3,20,
        10,0,453,454,5,99,0,0,454,456,1,0,0,0,455,420,1,0,0,0,455,426,1,
        0,0,0,455,434,1,0,0,0,455,441,1,0,0,0,455,450,1,0,0,0,456,57,1,0,
        0,0,457,458,5,93,0,0,458,459,3,30,15,0,459,59,1,0,0,0,460,462,3,
        56,28,0,461,463,3,58,29,0,462,461,1,0,0,0,462,463,1,0,0,0,463,61,
        1,0,0,0,464,465,5,57,0,0,465,466,5,58,0,0,466,63,1,0,0,0,56,69,75,
        80,88,95,101,104,108,115,123,132,138,141,145,153,166,171,182,185,
        195,198,212,216,218,227,232,238,251,262,265,282,308,310,328,333,
        339,343,345,351,360,364,371,375,378,383,388,398,408,416,420,426,
        434,441,450,455,462
    ]

class SourcePawnParser ( Parser ):

    grammarFileName = "SourcePawnParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'any'", "'bool'", "'break'", "'case'", 
                     "'cellsof'", "'char'", "'const'", "'continue'", "'default'", 
                     "'defined'", "'delete'", "'do'", "'else'", "'enum'", 
                     "'false'", "'float'", "'forward'", "'function'", "'for'", 
                     "'Handle'", "'if'", "'int'", "'methodmap'", "'native'", 
                     "'new'", "'null'", "'__nullable__'", "'operator'", 
                     "'property'", "'public'", "'return'", "'sizeof'", "'static'", 
                     "'static_assert'", "'stock'", "'struct'", "'switch'", 
                     "'this'", "'true'", "'typedef'", "'typeset'", "'view_as'", 
                     "'void'", "'while'", "'('", "')'", "'['", "']'", "'{'", 
                     "'}'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", 
                     "'&='", "'|='", "'>>='", "'>>>='", "'<<='", "'>>>'", 
                     "'>>'", "'<<'", "'=='", "'!='", "'<='", "'>='", "'<'", 
                     "'>'", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", 
                     "'*'", "'/'", "'%'", "'&'", "'|'", "'^'", "'~'", "'!'", 
                     "'='", "','", "'?'", "'::'", "':'", "';'", "'...'", 
                     "'.'" ]

    symbolicNames = [ "<INVALID>", "IntegerLiteral", "CharacterLiteral", 
                      "FloatLiteral", "StringLiteral", "BooleanLiteral", 
                      "HandleLiteral", "MultiLineMacro", "Directive", "Any", 
                      "Bool", "Break", "Case", "CellsOf", "Char", "Const", 
                      "Continue", "Default", "Defined", "Delete", "Do", 
                      "Else", "Enum", "False_", "Float", "Forward", "Function", 
                      "For", "Handle", "If", "Int", "Methodmap", "Native", 
                      "New", "Null", "Nullable", "Operator", "Property", 
                      "Public", "Return", "SizeOf", "Static", "StaticAssert", 
                      "Stock", "Struct", "Switch", "This", "True_", "TypeDef", 
                      "TypeSet", "ViewAs", "Void", "While", "LParen", "RParen", 
                      "LBrack", "RBrack", "LBrace", "RBrace", "PlusAssign", 
                      "MinusAssign", "StarAssign", "DivAssign", "ModAssign", 
                      "XorAssign", "AndAssign", "OrAssign", "RShiftAssign", 
                      "RShiftUnsignedAssign", "LShiftAssign", "RShiftUnsigned", 
                      "RShift", "LShift", "EQ", "NE", "LE", "GE", "LT", 
                      "GT", "AndAnd", "OrOr", "Increment", "Decrement", 
                      "Plus", "Minus", "Mult", "Div", "Mod", "And", "Or", 
                      "Xor", "Tilde", "Not", "Assign", "Comma", "QuestionMark", 
                      "DoubleColon", "Colon", "Semi", "Ellipsis", "Dot", 
                      "DecimalLiteral", "BinaryLiteral", "HexLiteral", "Whitespace", 
                      "Newline", "BlockComment", "LineComment", "Identifier" ]

    RULE_visibility = 0
    RULE_methodmap = 1
    RULE_methodmapInheritance = 2
    RULE_methodmapItem = 3
    RULE_methodmapPropertyDecl = 4
    RULE_methodmapPropertyImpl = 5
    RULE_compilationUnit = 6
    RULE_definition = 7
    RULE_declaration = 8
    RULE_symbol = 9
    RULE_type = 10
    RULE_builtin_type = 11
    RULE_commaExpr = 12
    RULE_definedArg = 13
    RULE_sizeofArg = 14
    RULE_expr = 15
    RULE_literal = 16
    RULE_assignmentOperator = 17
    RULE_typedef = 18
    RULE_typeset = 19
    RULE_fullTypedefExpression = 20
    RULE_typedefExpression = 21
    RULE_nativeDefinition = 22
    RULE_forwardDefinition = 23
    RULE_functionDeclaration = 24
    RULE_functionCallback = 25
    RULE_methodArgs = 26
    RULE_methodArgsNoAssign = 27
    RULE_methodArgDecl = 28
    RULE_methodArgAssigment = 29
    RULE_methodArg = 30
    RULE_methodBody = 31

    ruleNames =  [ "visibility", "methodmap", "methodmapInheritance", "methodmapItem", 
                   "methodmapPropertyDecl", "methodmapPropertyImpl", "compilationUnit", 
                   "definition", "declaration", "symbol", "type", "builtin_type", 
                   "commaExpr", "definedArg", "sizeofArg", "expr", "literal", 
                   "assignmentOperator", "typedef", "typeset", "fullTypedefExpression", 
                   "typedefExpression", "nativeDefinition", "forwardDefinition", 
                   "functionDeclaration", "functionCallback", "methodArgs", 
                   "methodArgsNoAssign", "methodArgDecl", "methodArgAssigment", 
                   "methodArg", "methodBody" ]

    EOF = Token.EOF
    IntegerLiteral=1
    CharacterLiteral=2
    FloatLiteral=3
    StringLiteral=4
    BooleanLiteral=5
    HandleLiteral=6
    MultiLineMacro=7
    Directive=8
    Any=9
    Bool=10
    Break=11
    Case=12
    CellsOf=13
    Char=14
    Const=15
    Continue=16
    Default=17
    Defined=18
    Delete=19
    Do=20
    Else=21
    Enum=22
    False_=23
    Float=24
    Forward=25
    Function=26
    For=27
    Handle=28
    If=29
    Int=30
    Methodmap=31
    Native=32
    New=33
    Null=34
    Nullable=35
    Operator=36
    Property=37
    Public=38
    Return=39
    SizeOf=40
    Static=41
    StaticAssert=42
    Stock=43
    Struct=44
    Switch=45
    This=46
    True_=47
    TypeDef=48
    TypeSet=49
    ViewAs=50
    Void=51
    While=52
    LParen=53
    RParen=54
    LBrack=55
    RBrack=56
    LBrace=57
    RBrace=58
    PlusAssign=59
    MinusAssign=60
    StarAssign=61
    DivAssign=62
    ModAssign=63
    XorAssign=64
    AndAssign=65
    OrAssign=66
    RShiftAssign=67
    RShiftUnsignedAssign=68
    LShiftAssign=69
    RShiftUnsigned=70
    RShift=71
    LShift=72
    EQ=73
    NE=74
    LE=75
    GE=76
    LT=77
    GT=78
    AndAnd=79
    OrOr=80
    Increment=81
    Decrement=82
    Plus=83
    Minus=84
    Mult=85
    Div=86
    Mod=87
    And=88
    Or=89
    Xor=90
    Tilde=91
    Not=92
    Assign=93
    Comma=94
    QuestionMark=95
    DoubleColon=96
    Colon=97
    Semi=98
    Ellipsis=99
    Dot=100
    DecimalLiteral=101
    BinaryLiteral=102
    HexLiteral=103
    Whitespace=104
    Newline=105
    BlockComment=106
    LineComment=107
    Identifier=108

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.10.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class VisibilityContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Public(self):
            return self.getToken(SourcePawnParser.Public, 0)

        def getRuleIndex(self):
            return SourcePawnParser.RULE_visibility

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVisibility" ):
                listener.enterVisibility(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVisibility" ):
                listener.exitVisibility(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVisibility" ):
                return visitor.visitVisibility(self)
            else:
                return visitor.visitChildren(self)




    def visibility(self):

        localctx = SourcePawnParser.VisibilityContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_visibility)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 64
            self.match(SourcePawnParser.Public)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodmapContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Methodmap(self):
            return self.getToken(SourcePawnParser.Methodmap, 0)

        def symbol(self):
            return self.getTypedRuleContext(SourcePawnParser.SymbolContext,0)


        def LBrace(self):
            return self.getToken(SourcePawnParser.LBrace, 0)

        def RBrace(self):
            return self.getToken(SourcePawnParser.RBrace, 0)

        def methodmapInheritance(self):
            return self.getTypedRuleContext(SourcePawnParser.MethodmapInheritanceContext,0)


        def methodmapItem(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SourcePawnParser.MethodmapItemContext)
            else:
                return self.getTypedRuleContext(SourcePawnParser.MethodmapItemContext,i)


        def Semi(self):
            return self.getToken(SourcePawnParser.Semi, 0)

        def getRuleIndex(self):
            return SourcePawnParser.RULE_methodmap

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodmap" ):
                listener.enterMethodmap(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodmap" ):
                listener.exitMethodmap(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodmap" ):
                return visitor.visitMethodmap(self)
            else:
                return visitor.visitChildren(self)




    def methodmap(self):

        localctx = SourcePawnParser.MethodmapContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_methodmap)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 66
            self.match(SourcePawnParser.Methodmap)
            self.state = 67
            self.symbol()
            self.state = 69
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==SourcePawnParser.LT:
                self.state = 68
                self.methodmapInheritance()


            self.state = 71
            self.match(SourcePawnParser.LBrace)
            self.state = 75
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==SourcePawnParser.Property or _la==SourcePawnParser.Public:
                self.state = 72
                self.methodmapItem()
                self.state = 77
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 78
            self.match(SourcePawnParser.RBrace)
            self.state = 80
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
            if la_ == 1:
                self.state = 79
                self.match(SourcePawnParser.Semi)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodmapInheritanceContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LT(self):
            return self.getToken(SourcePawnParser.LT, 0)

        def symbol(self):
            return self.getTypedRuleContext(SourcePawnParser.SymbolContext,0)


        def getRuleIndex(self):
            return SourcePawnParser.RULE_methodmapInheritance

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodmapInheritance" ):
                listener.enterMethodmapInheritance(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodmapInheritance" ):
                listener.exitMethodmapInheritance(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodmapInheritance" ):
                return visitor.visitMethodmapInheritance(self)
            else:
                return visitor.visitChildren(self)




    def methodmapInheritance(self):

        localctx = SourcePawnParser.MethodmapInheritanceContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_methodmapInheritance)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 82
            self.match(SourcePawnParser.LT)
            self.state = 83
            self.symbol()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodmapItemContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def visibility(self):
            return self.getTypedRuleContext(SourcePawnParser.VisibilityContext,0)


        def Native(self):
            return self.getToken(SourcePawnParser.Native, 0)

        def symbol(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SourcePawnParser.SymbolContext)
            else:
                return self.getTypedRuleContext(SourcePawnParser.SymbolContext,i)


        def LParen(self):
            return self.getToken(SourcePawnParser.LParen, 0)

        def RParen(self):
            return self.getToken(SourcePawnParser.RParen, 0)

        def Tilde(self):
            return self.getToken(SourcePawnParser.Tilde, 0)

        def methodArgs(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SourcePawnParser.MethodArgsContext)
            else:
                return self.getTypedRuleContext(SourcePawnParser.MethodArgsContext,i)


        def Assign(self):
            return self.getToken(SourcePawnParser.Assign, 0)

        def Semi(self):
            return self.getToken(SourcePawnParser.Semi, 0)

        def methodBody(self):
            return self.getTypedRuleContext(SourcePawnParser.MethodBodyContext,0)


        def type_(self):
            return self.getTypedRuleContext(SourcePawnParser.TypeContext,0)


        def Static(self):
            return self.getToken(SourcePawnParser.Static, 0)

        def Property(self):
            return self.getToken(SourcePawnParser.Property, 0)

        def LBrace(self):
            return self.getToken(SourcePawnParser.LBrace, 0)

        def RBrace(self):
            return self.getToken(SourcePawnParser.RBrace, 0)

        def methodmapPropertyDecl(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SourcePawnParser.MethodmapPropertyDeclContext)
            else:
                return self.getTypedRuleContext(SourcePawnParser.MethodmapPropertyDeclContext,i)


        def getRuleIndex(self):
            return SourcePawnParser.RULE_methodmapItem

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodmapItem" ):
                listener.enterMethodmapItem(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodmapItem" ):
                listener.exitMethodmapItem(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodmapItem" ):
                return visitor.visitMethodmapItem(self)
            else:
                return visitor.visitChildren(self)




    def methodmapItem(self):

        localctx = SourcePawnParser.MethodmapItemContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_methodmapItem)
        self._la = 0 # Token type
        try:
            self.state = 171
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,16,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 85
                self.visibility()
                self.state = 86
                self.match(SourcePawnParser.Native)
                self.state = 88
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==SourcePawnParser.Tilde:
                    self.state = 87
                    self.match(SourcePawnParser.Tilde)


                self.state = 90
                self.symbol()
                self.state = 91
                self.match(SourcePawnParser.LParen)
                self.state = 95
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << SourcePawnParser.Any) | (1 << SourcePawnParser.Bool) | (1 << SourcePawnParser.Char) | (1 << SourcePawnParser.Const) | (1 << SourcePawnParser.Float) | (1 << SourcePawnParser.Handle) | (1 << SourcePawnParser.Int) | (1 << SourcePawnParser.Void))) != 0) or _la==SourcePawnParser.Identifier:
                    self.state = 92
                    self.methodArgs()
                    self.state = 97
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 98
                self.match(SourcePawnParser.RParen)
                self.state = 101
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==SourcePawnParser.Assign:
                    self.state = 99
                    self.match(SourcePawnParser.Assign)
                    self.state = 100
                    self.symbol()


                self.state = 104
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==SourcePawnParser.Semi:
                    self.state = 103
                    self.match(SourcePawnParser.Semi)


                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 106
                self.visibility()
                self.state = 108
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==SourcePawnParser.Tilde:
                    self.state = 107
                    self.match(SourcePawnParser.Tilde)


                self.state = 110
                self.symbol()
                self.state = 111
                self.match(SourcePawnParser.LParen)
                self.state = 115
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << SourcePawnParser.Any) | (1 << SourcePawnParser.Bool) | (1 << SourcePawnParser.Char) | (1 << SourcePawnParser.Const) | (1 << SourcePawnParser.Float) | (1 << SourcePawnParser.Handle) | (1 << SourcePawnParser.Int) | (1 << SourcePawnParser.Void))) != 0) or _la==SourcePawnParser.Identifier:
                    self.state = 112
                    self.methodArgs()
                    self.state = 117
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 118
                self.match(SourcePawnParser.RParen)
                self.state = 119
                self.methodBody()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 121
                self.visibility()
                self.state = 123
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==SourcePawnParser.Static:
                    self.state = 122
                    self.match(SourcePawnParser.Static)


                self.state = 125
                self.match(SourcePawnParser.Native)
                self.state = 126
                self.type_()
                self.state = 127
                self.symbol()
                self.state = 128
                self.match(SourcePawnParser.LParen)
                self.state = 132
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << SourcePawnParser.Any) | (1 << SourcePawnParser.Bool) | (1 << SourcePawnParser.Char) | (1 << SourcePawnParser.Const) | (1 << SourcePawnParser.Float) | (1 << SourcePawnParser.Handle) | (1 << SourcePawnParser.Int) | (1 << SourcePawnParser.Void))) != 0) or _la==SourcePawnParser.Identifier:
                    self.state = 129
                    self.methodArgs()
                    self.state = 134
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 135
                self.match(SourcePawnParser.RParen)
                self.state = 138
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==SourcePawnParser.Assign:
                    self.state = 136
                    self.match(SourcePawnParser.Assign)
                    self.state = 137
                    self.symbol()


                self.state = 141
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==SourcePawnParser.Semi:
                    self.state = 140
                    self.match(SourcePawnParser.Semi)


                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 143
                self.visibility()
                self.state = 145
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==SourcePawnParser.Static:
                    self.state = 144
                    self.match(SourcePawnParser.Static)


                self.state = 147
                self.type_()
                self.state = 148
                self.symbol()
                self.state = 149
                self.match(SourcePawnParser.LParen)
                self.state = 153
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << SourcePawnParser.Any) | (1 << SourcePawnParser.Bool) | (1 << SourcePawnParser.Char) | (1 << SourcePawnParser.Const) | (1 << SourcePawnParser.Float) | (1 << SourcePawnParser.Handle) | (1 << SourcePawnParser.Int) | (1 << SourcePawnParser.Void))) != 0) or _la==SourcePawnParser.Identifier:
                    self.state = 150
                    self.methodArgs()
                    self.state = 155
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 156
                self.match(SourcePawnParser.RParen)
                self.state = 157
                self.methodBody()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 159
                self.match(SourcePawnParser.Property)
                self.state = 160
                self.type_()
                self.state = 161
                self.symbol()
                self.state = 162
                self.match(SourcePawnParser.LBrace)
                self.state = 166
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==SourcePawnParser.Public:
                    self.state = 163
                    self.methodmapPropertyDecl()
                    self.state = 168
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 169
                self.match(SourcePawnParser.RBrace)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodmapPropertyDeclContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def visibility(self):
            return self.getTypedRuleContext(SourcePawnParser.VisibilityContext,0)


        def methodmapPropertyImpl(self):
            return self.getTypedRuleContext(SourcePawnParser.MethodmapPropertyImplContext,0)


        def getRuleIndex(self):
            return SourcePawnParser.RULE_methodmapPropertyDecl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodmapPropertyDecl" ):
                listener.enterMethodmapPropertyDecl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodmapPropertyDecl" ):
                listener.exitMethodmapPropertyDecl(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodmapPropertyDecl" ):
                return visitor.visitMethodmapPropertyDecl(self)
            else:
                return visitor.visitChildren(self)




    def methodmapPropertyDecl(self):

        localctx = SourcePawnParser.MethodmapPropertyDeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_methodmapPropertyDecl)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 173
            self.visibility()
            self.state = 174
            self.methodmapPropertyImpl()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodmapPropertyImplContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.sym = None # SymbolContext

        def Native(self):
            return self.getToken(SourcePawnParser.Native, 0)

        def LParen(self):
            return self.getToken(SourcePawnParser.LParen, 0)

        def RParen(self):
            return self.getToken(SourcePawnParser.RParen, 0)

        def symbol(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SourcePawnParser.SymbolContext)
            else:
                return self.getTypedRuleContext(SourcePawnParser.SymbolContext,i)


        def Assign(self):
            return self.getToken(SourcePawnParser.Assign, 0)

        def Semi(self):
            return self.getToken(SourcePawnParser.Semi, 0)

        def type_(self):
            return self.getTypedRuleContext(SourcePawnParser.TypeContext,0)


        def methodBody(self):
            return self.getTypedRuleContext(SourcePawnParser.MethodBodyContext,0)


        def getRuleIndex(self):
            return SourcePawnParser.RULE_methodmapPropertyImpl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodmapPropertyImpl" ):
                listener.enterMethodmapPropertyImpl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodmapPropertyImpl" ):
                listener.exitMethodmapPropertyImpl(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodmapPropertyImpl" ):
                return visitor.visitMethodmapPropertyImpl(self)
            else:
                return visitor.visitChildren(self)




    def methodmapPropertyImpl(self):

        localctx = SourcePawnParser.MethodmapPropertyImplContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_methodmapPropertyImpl)
        self._la = 0 # Token type
        try:
            self.state = 212
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,21,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 176
                self.match(SourcePawnParser.Native)
                self.state = 177
                localctx.sym = self.symbol()
                self.state = 178
                self.match(SourcePawnParser.LParen)
                self.state = 179
                self.match(SourcePawnParser.RParen)
                self.state = 182
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==SourcePawnParser.Assign:
                    self.state = 180
                    self.match(SourcePawnParser.Assign)
                    self.state = 181
                    self.symbol()


                self.state = 185
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==SourcePawnParser.Semi:
                    self.state = 184
                    self.match(SourcePawnParser.Semi)


                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 187
                self.match(SourcePawnParser.Native)
                self.state = 188
                localctx.sym = self.symbol()
                self.state = 189
                self.match(SourcePawnParser.LParen)
                self.state = 190
                self.type_()
                self.state = 191
                self.symbol()
                self.state = 192
                self.match(SourcePawnParser.RParen)
                self.state = 195
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==SourcePawnParser.Assign:
                    self.state = 193
                    self.match(SourcePawnParser.Assign)
                    self.state = 194
                    self.symbol()


                self.state = 198
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==SourcePawnParser.Semi:
                    self.state = 197
                    self.match(SourcePawnParser.Semi)


                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 200
                localctx.sym = self.symbol()
                self.state = 201
                self.match(SourcePawnParser.LParen)
                self.state = 202
                self.match(SourcePawnParser.RParen)
                self.state = 203
                self.methodBody()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 205
                localctx.sym = self.symbol()
                self.state = 206
                self.match(SourcePawnParser.LParen)
                self.state = 207
                self.type_()
                self.state = 208
                self.symbol()
                self.state = 209
                self.match(SourcePawnParser.RParen)
                self.state = 210
                self.methodBody()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CompilationUnitContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(SourcePawnParser.EOF, 0)

        def definition(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SourcePawnParser.DefinitionContext)
            else:
                return self.getTypedRuleContext(SourcePawnParser.DefinitionContext,i)


        def declaration(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SourcePawnParser.DeclarationContext)
            else:
                return self.getTypedRuleContext(SourcePawnParser.DeclarationContext,i)


        def getRuleIndex(self):
            return SourcePawnParser.RULE_compilationUnit

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCompilationUnit" ):
                listener.enterCompilationUnit(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCompilationUnit" ):
                listener.exitCompilationUnit(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCompilationUnit" ):
                return visitor.visitCompilationUnit(self)
            else:
                return visitor.visitChildren(self)




    def compilationUnit(self):

        localctx = SourcePawnParser.CompilationUnitContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_compilationUnit)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 216 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 216
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [SourcePawnParser.Forward, SourcePawnParser.Methodmap, SourcePawnParser.Native, SourcePawnParser.TypeDef, SourcePawnParser.TypeSet]:
                    self.state = 214
                    self.definition()
                    pass
                elif token in [SourcePawnParser.Any, SourcePawnParser.Bool, SourcePawnParser.Char, SourcePawnParser.Float, SourcePawnParser.Handle, SourcePawnParser.Int, SourcePawnParser.Public, SourcePawnParser.Stock, SourcePawnParser.Void, SourcePawnParser.Semi, SourcePawnParser.Identifier]:
                    self.state = 215
                    self.declaration()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 218 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << SourcePawnParser.Any) | (1 << SourcePawnParser.Bool) | (1 << SourcePawnParser.Char) | (1 << SourcePawnParser.Float) | (1 << SourcePawnParser.Forward) | (1 << SourcePawnParser.Handle) | (1 << SourcePawnParser.Int) | (1 << SourcePawnParser.Methodmap) | (1 << SourcePawnParser.Native) | (1 << SourcePawnParser.Public) | (1 << SourcePawnParser.Stock) | (1 << SourcePawnParser.TypeDef) | (1 << SourcePawnParser.TypeSet) | (1 << SourcePawnParser.Void))) != 0) or _la==SourcePawnParser.Semi or _la==SourcePawnParser.Identifier):
                    break

            self.state = 220
            self.match(SourcePawnParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DefinitionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def typedef(self):
            return self.getTypedRuleContext(SourcePawnParser.TypedefContext,0)


        def typeset(self):
            return self.getTypedRuleContext(SourcePawnParser.TypesetContext,0)


        def nativeDefinition(self):
            return self.getTypedRuleContext(SourcePawnParser.NativeDefinitionContext,0)


        def forwardDefinition(self):
            return self.getTypedRuleContext(SourcePawnParser.ForwardDefinitionContext,0)


        def methodmap(self):
            return self.getTypedRuleContext(SourcePawnParser.MethodmapContext,0)


        def getRuleIndex(self):
            return SourcePawnParser.RULE_definition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDefinition" ):
                listener.enterDefinition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDefinition" ):
                listener.exitDefinition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDefinition" ):
                return visitor.visitDefinition(self)
            else:
                return visitor.visitChildren(self)




    def definition(self):

        localctx = SourcePawnParser.DefinitionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_definition)
        try:
            self.state = 227
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [SourcePawnParser.TypeDef]:
                self.enterOuterAlt(localctx, 1)
                self.state = 222
                self.typedef()
                pass
            elif token in [SourcePawnParser.TypeSet]:
                self.enterOuterAlt(localctx, 2)
                self.state = 223
                self.typeset()
                pass
            elif token in [SourcePawnParser.Native]:
                self.enterOuterAlt(localctx, 3)
                self.state = 224
                self.nativeDefinition()
                pass
            elif token in [SourcePawnParser.Forward]:
                self.enterOuterAlt(localctx, 4)
                self.state = 225
                self.forwardDefinition()
                pass
            elif token in [SourcePawnParser.Methodmap]:
                self.enterOuterAlt(localctx, 5)
                self.state = 226
                self.methodmap()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclarationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def functionDeclaration(self):
            return self.getTypedRuleContext(SourcePawnParser.FunctionDeclarationContext,0)


        def functionCallback(self):
            return self.getTypedRuleContext(SourcePawnParser.FunctionCallbackContext,0)


        def Semi(self):
            return self.getToken(SourcePawnParser.Semi, 0)

        def getRuleIndex(self):
            return SourcePawnParser.RULE_declaration

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDeclaration" ):
                listener.enterDeclaration(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDeclaration" ):
                listener.exitDeclaration(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDeclaration" ):
                return visitor.visitDeclaration(self)
            else:
                return visitor.visitChildren(self)




    def declaration(self):

        localctx = SourcePawnParser.DeclarationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_declaration)
        try:
            self.state = 232
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [SourcePawnParser.Any, SourcePawnParser.Bool, SourcePawnParser.Char, SourcePawnParser.Float, SourcePawnParser.Handle, SourcePawnParser.Int, SourcePawnParser.Stock, SourcePawnParser.Void, SourcePawnParser.Identifier]:
                self.enterOuterAlt(localctx, 1)
                self.state = 229
                self.functionDeclaration()
                pass
            elif token in [SourcePawnParser.Public]:
                self.enterOuterAlt(localctx, 2)
                self.state = 230
                self.functionCallback()
                pass
            elif token in [SourcePawnParser.Semi]:
                self.enterOuterAlt(localctx, 3)
                self.state = 231
                self.match(SourcePawnParser.Semi)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SymbolContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Identifier(self):
            return self.getToken(SourcePawnParser.Identifier, 0)

        def getRuleIndex(self):
            return SourcePawnParser.RULE_symbol

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSymbol" ):
                listener.enterSymbol(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSymbol" ):
                listener.exitSymbol(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSymbol" ):
                return visitor.visitSymbol(self)
            else:
                return visitor.visitChildren(self)




    def symbol(self):

        localctx = SourcePawnParser.SymbolContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_symbol)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 234
            self.match(SourcePawnParser.Identifier)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TypeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def builtin_type(self):
            return self.getTypedRuleContext(SourcePawnParser.Builtin_typeContext,0)


        def symbol(self):
            return self.getTypedRuleContext(SourcePawnParser.SymbolContext,0)


        def getRuleIndex(self):
            return SourcePawnParser.RULE_type

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterType" ):
                listener.enterType(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitType" ):
                listener.exitType(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitType" ):
                return visitor.visitType(self)
            else:
                return visitor.visitChildren(self)




    def type_(self):

        localctx = SourcePawnParser.TypeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_type)
        try:
            self.state = 238
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [SourcePawnParser.Any, SourcePawnParser.Bool, SourcePawnParser.Char, SourcePawnParser.Float, SourcePawnParser.Handle, SourcePawnParser.Int, SourcePawnParser.Void]:
                self.enterOuterAlt(localctx, 1)
                self.state = 236
                self.builtin_type()
                pass
            elif token in [SourcePawnParser.Identifier]:
                self.enterOuterAlt(localctx, 2)
                self.state = 237
                self.symbol()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Builtin_typeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Any(self):
            return self.getToken(SourcePawnParser.Any, 0)

        def Bool(self):
            return self.getToken(SourcePawnParser.Bool, 0)

        def Char(self):
            return self.getToken(SourcePawnParser.Char, 0)

        def Float(self):
            return self.getToken(SourcePawnParser.Float, 0)

        def Handle(self):
            return self.getToken(SourcePawnParser.Handle, 0)

        def Int(self):
            return self.getToken(SourcePawnParser.Int, 0)

        def Void(self):
            return self.getToken(SourcePawnParser.Void, 0)

        def getRuleIndex(self):
            return SourcePawnParser.RULE_builtin_type

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBuiltin_type" ):
                listener.enterBuiltin_type(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBuiltin_type" ):
                listener.exitBuiltin_type(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBuiltin_type" ):
                return visitor.visitBuiltin_type(self)
            else:
                return visitor.visitChildren(self)




    def builtin_type(self):

        localctx = SourcePawnParser.Builtin_typeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_builtin_type)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 240
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << SourcePawnParser.Any) | (1 << SourcePawnParser.Bool) | (1 << SourcePawnParser.Char) | (1 << SourcePawnParser.Float) | (1 << SourcePawnParser.Handle) | (1 << SourcePawnParser.Int) | (1 << SourcePawnParser.Void))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CommaExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SourcePawnParser.ExprContext)
            else:
                return self.getTypedRuleContext(SourcePawnParser.ExprContext,i)


        def Comma(self):
            return self.getToken(SourcePawnParser.Comma, 0)

        def getRuleIndex(self):
            return SourcePawnParser.RULE_commaExpr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCommaExpr" ):
                listener.enterCommaExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCommaExpr" ):
                listener.exitCommaExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCommaExpr" ):
                return visitor.visitCommaExpr(self)
            else:
                return visitor.visitChildren(self)




    def commaExpr(self):

        localctx = SourcePawnParser.CommaExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_commaExpr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 242
            self.expr(0)
            self.state = 243
            self.match(SourcePawnParser.Comma)
            self.state = 244
            self.expr(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DefinedArgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LParen(self):
            return self.getToken(SourcePawnParser.LParen, 0)

        def definedArg(self):
            return self.getTypedRuleContext(SourcePawnParser.DefinedArgContext,0)


        def RParen(self):
            return self.getToken(SourcePawnParser.RParen, 0)

        def symbol(self):
            return self.getTypedRuleContext(SourcePawnParser.SymbolContext,0)


        def getRuleIndex(self):
            return SourcePawnParser.RULE_definedArg

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDefinedArg" ):
                listener.enterDefinedArg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDefinedArg" ):
                listener.exitDefinedArg(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDefinedArg" ):
                return visitor.visitDefinedArg(self)
            else:
                return visitor.visitChildren(self)




    def definedArg(self):

        localctx = SourcePawnParser.DefinedArgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_definedArg)
        try:
            self.state = 251
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [SourcePawnParser.LParen]:
                self.enterOuterAlt(localctx, 1)
                self.state = 246
                self.match(SourcePawnParser.LParen)
                self.state = 247
                self.definedArg()
                self.state = 248
                self.match(SourcePawnParser.RParen)
                pass
            elif token in [SourcePawnParser.Identifier]:
                self.enterOuterAlt(localctx, 2)
                self.state = 250
                self.symbol()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SizeofArgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LParen(self):
            return self.getToken(SourcePawnParser.LParen, 0)

        def sizeofArg(self):
            return self.getTypedRuleContext(SourcePawnParser.SizeofArgContext,0)


        def RParen(self):
            return self.getToken(SourcePawnParser.RParen, 0)

        def symbol(self):
            return self.getTypedRuleContext(SourcePawnParser.SymbolContext,0)


        def LBrack(self, i:int=None):
            if i is None:
                return self.getTokens(SourcePawnParser.LBrack)
            else:
                return self.getToken(SourcePawnParser.LBrack, i)

        def RBrack(self, i:int=None):
            if i is None:
                return self.getTokens(SourcePawnParser.RBrack)
            else:
                return self.getToken(SourcePawnParser.RBrack, i)

        def getRuleIndex(self):
            return SourcePawnParser.RULE_sizeofArg

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSizeofArg" ):
                listener.enterSizeofArg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSizeofArg" ):
                listener.exitSizeofArg(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSizeofArg" ):
                return visitor.visitSizeofArg(self)
            else:
                return visitor.visitChildren(self)




    def sizeofArg(self):

        localctx = SourcePawnParser.SizeofArgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_sizeofArg)
        try:
            self.state = 265
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [SourcePawnParser.LParen]:
                self.enterOuterAlt(localctx, 1)
                self.state = 253
                self.match(SourcePawnParser.LParen)
                self.state = 254
                self.sizeofArg()
                self.state = 255
                self.match(SourcePawnParser.RParen)
                pass
            elif token in [SourcePawnParser.Identifier]:
                self.enterOuterAlt(localctx, 2)
                self.state = 257
                self.symbol()
                self.state = 262
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,28,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 258
                        self.match(SourcePawnParser.LBrack)
                        self.state = 259
                        self.match(SourcePawnParser.RBrack) 
                    self.state = 264
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,28,self._ctx)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SizeOf(self):
            return self.getToken(SourcePawnParser.SizeOf, 0)

        def sizeofArg(self):
            return self.getTypedRuleContext(SourcePawnParser.SizeofArgContext,0)


        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SourcePawnParser.ExprContext)
            else:
                return self.getTypedRuleContext(SourcePawnParser.ExprContext,i)


        def Not(self):
            return self.getToken(SourcePawnParser.Not, 0)

        def Minus(self):
            return self.getToken(SourcePawnParser.Minus, 0)

        def symbol(self):
            return self.getTypedRuleContext(SourcePawnParser.SymbolContext,0)


        def assignmentOperator(self):
            return self.getTypedRuleContext(SourcePawnParser.AssignmentOperatorContext,0)


        def LParen(self):
            return self.getToken(SourcePawnParser.LParen, 0)

        def RParen(self):
            return self.getToken(SourcePawnParser.RParen, 0)

        def literal(self):
            return self.getTypedRuleContext(SourcePawnParser.LiteralContext,0)


        def Mult(self):
            return self.getToken(SourcePawnParser.Mult, 0)

        def Div(self):
            return self.getToken(SourcePawnParser.Div, 0)

        def Mod(self):
            return self.getToken(SourcePawnParser.Mod, 0)

        def Plus(self):
            return self.getToken(SourcePawnParser.Plus, 0)

        def RShift(self):
            return self.getToken(SourcePawnParser.RShift, 0)

        def RShiftUnsigned(self):
            return self.getToken(SourcePawnParser.RShiftUnsigned, 0)

        def LShift(self):
            return self.getToken(SourcePawnParser.LShift, 0)

        def And(self):
            return self.getToken(SourcePawnParser.And, 0)

        def Xor(self):
            return self.getToken(SourcePawnParser.Xor, 0)

        def Or(self):
            return self.getToken(SourcePawnParser.Or, 0)

        def LT(self):
            return self.getToken(SourcePawnParser.LT, 0)

        def LE(self):
            return self.getToken(SourcePawnParser.LE, 0)

        def GT(self):
            return self.getToken(SourcePawnParser.GT, 0)

        def GE(self):
            return self.getToken(SourcePawnParser.GE, 0)

        def AndAnd(self):
            return self.getToken(SourcePawnParser.AndAnd, 0)

        def OrOr(self):
            return self.getToken(SourcePawnParser.OrOr, 0)

        def QuestionMark(self):
            return self.getToken(SourcePawnParser.QuestionMark, 0)

        def Semi(self):
            return self.getToken(SourcePawnParser.Semi, 0)

        def getRuleIndex(self):
            return SourcePawnParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpr" ):
                return visitor.visitExpr(self)
            else:
                return visitor.visitChildren(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = SourcePawnParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 30
        self.enterRecursionRule(localctx, 30, self.RULE_expr, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 282
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,30,self._ctx)
            if la_ == 1:
                self.state = 268
                self.match(SourcePawnParser.SizeOf)
                self.state = 269
                self.sizeofArg()
                pass

            elif la_ == 2:
                self.state = 270
                _la = self._input.LA(1)
                if not(_la==SourcePawnParser.Minus or _la==SourcePawnParser.Not):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 271
                self.expr(12)
                pass

            elif la_ == 3:
                self.state = 272
                self.symbol()
                self.state = 273
                self.assignmentOperator()
                self.state = 274
                self.expr(4)
                pass

            elif la_ == 4:
                self.state = 276
                self.match(SourcePawnParser.LParen)
                self.state = 277
                self.expr(0)
                self.state = 278
                self.match(SourcePawnParser.RParen)
                pass

            elif la_ == 5:
                self.state = 280
                self.literal()
                pass

            elif la_ == 6:
                self.state = 281
                self.symbol()
                pass


            self._ctx.stop = self._input.LT(-1)
            self.state = 310
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,32,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 308
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,31,self._ctx)
                    if la_ == 1:
                        localctx = SourcePawnParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 284
                        if not self.precpred(self._ctx, 11):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 11)")
                        self.state = 285
                        _la = self._input.LA(1)
                        if not(((((_la - 85)) & ~0x3f) == 0 and ((1 << (_la - 85)) & ((1 << (SourcePawnParser.Mult - 85)) | (1 << (SourcePawnParser.Div - 85)) | (1 << (SourcePawnParser.Mod - 85)))) != 0)):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 286
                        self.expr(12)
                        pass

                    elif la_ == 2:
                        localctx = SourcePawnParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 287
                        if not self.precpred(self._ctx, 10):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 10)")
                        self.state = 288
                        _la = self._input.LA(1)
                        if not(_la==SourcePawnParser.Plus or _la==SourcePawnParser.Minus):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 289
                        self.expr(11)
                        pass

                    elif la_ == 3:
                        localctx = SourcePawnParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 290
                        if not self.precpred(self._ctx, 9):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 9)")
                        self.state = 291
                        _la = self._input.LA(1)
                        if not(((((_la - 70)) & ~0x3f) == 0 and ((1 << (_la - 70)) & ((1 << (SourcePawnParser.RShiftUnsigned - 70)) | (1 << (SourcePawnParser.RShift - 70)) | (1 << (SourcePawnParser.LShift - 70)))) != 0)):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 292
                        self.expr(10)
                        pass

                    elif la_ == 4:
                        localctx = SourcePawnParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 293
                        if not self.precpred(self._ctx, 8):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 8)")
                        self.state = 294
                        _la = self._input.LA(1)
                        if not(((((_la - 88)) & ~0x3f) == 0 and ((1 << (_la - 88)) & ((1 << (SourcePawnParser.And - 88)) | (1 << (SourcePawnParser.Or - 88)) | (1 << (SourcePawnParser.Xor - 88)))) != 0)):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 295
                        self.expr(9)
                        pass

                    elif la_ == 5:
                        localctx = SourcePawnParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 296
                        if not self.precpred(self._ctx, 7):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 7)")
                        self.state = 297
                        _la = self._input.LA(1)
                        if not(((((_la - 75)) & ~0x3f) == 0 and ((1 << (_la - 75)) & ((1 << (SourcePawnParser.LE - 75)) | (1 << (SourcePawnParser.GE - 75)) | (1 << (SourcePawnParser.LT - 75)) | (1 << (SourcePawnParser.GT - 75)))) != 0)):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 298
                        self.expr(8)
                        pass

                    elif la_ == 6:
                        localctx = SourcePawnParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 299
                        if not self.precpred(self._ctx, 6):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 6)")
                        self.state = 300
                        _la = self._input.LA(1)
                        if not(_la==SourcePawnParser.AndAnd or _la==SourcePawnParser.OrOr):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 301
                        self.expr(7)
                        pass

                    elif la_ == 7:
                        localctx = SourcePawnParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 302
                        if not self.precpred(self._ctx, 5):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 5)")
                        self.state = 303
                        self.match(SourcePawnParser.QuestionMark)
                        self.state = 304
                        self.expr(0)
                        self.state = 305
                        self.match(SourcePawnParser.Semi)
                        self.state = 306
                        self.expr(6)
                        pass

             
                self.state = 312
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,32,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class LiteralContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FloatLiteral(self):
            return self.getToken(SourcePawnParser.FloatLiteral, 0)

        def IntegerLiteral(self):
            return self.getToken(SourcePawnParser.IntegerLiteral, 0)

        def StringLiteral(self):
            return self.getToken(SourcePawnParser.StringLiteral, 0)

        def CharacterLiteral(self):
            return self.getToken(SourcePawnParser.CharacterLiteral, 0)

        def BooleanLiteral(self):
            return self.getToken(SourcePawnParser.BooleanLiteral, 0)

        def getRuleIndex(self):
            return SourcePawnParser.RULE_literal

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLiteral" ):
                listener.enterLiteral(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLiteral" ):
                listener.exitLiteral(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLiteral" ):
                return visitor.visitLiteral(self)
            else:
                return visitor.visitChildren(self)




    def literal(self):

        localctx = SourcePawnParser.LiteralContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_literal)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 313
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << SourcePawnParser.IntegerLiteral) | (1 << SourcePawnParser.CharacterLiteral) | (1 << SourcePawnParser.FloatLiteral) | (1 << SourcePawnParser.StringLiteral) | (1 << SourcePawnParser.BooleanLiteral))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignmentOperatorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Assign(self):
            return self.getToken(SourcePawnParser.Assign, 0)

        def StarAssign(self):
            return self.getToken(SourcePawnParser.StarAssign, 0)

        def DivAssign(self):
            return self.getToken(SourcePawnParser.DivAssign, 0)

        def ModAssign(self):
            return self.getToken(SourcePawnParser.ModAssign, 0)

        def PlusAssign(self):
            return self.getToken(SourcePawnParser.PlusAssign, 0)

        def MinusAssign(self):
            return self.getToken(SourcePawnParser.MinusAssign, 0)

        def RShiftAssign(self):
            return self.getToken(SourcePawnParser.RShiftAssign, 0)

        def RShiftUnsignedAssign(self):
            return self.getToken(SourcePawnParser.RShiftUnsignedAssign, 0)

        def LShiftAssign(self):
            return self.getToken(SourcePawnParser.LShiftAssign, 0)

        def AndAssign(self):
            return self.getToken(SourcePawnParser.AndAssign, 0)

        def XorAssign(self):
            return self.getToken(SourcePawnParser.XorAssign, 0)

        def OrAssign(self):
            return self.getToken(SourcePawnParser.OrAssign, 0)

        def getRuleIndex(self):
            return SourcePawnParser.RULE_assignmentOperator

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignmentOperator" ):
                listener.enterAssignmentOperator(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignmentOperator" ):
                listener.exitAssignmentOperator(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssignmentOperator" ):
                return visitor.visitAssignmentOperator(self)
            else:
                return visitor.visitChildren(self)




    def assignmentOperator(self):

        localctx = SourcePawnParser.AssignmentOperatorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_assignmentOperator)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 315
            _la = self._input.LA(1)
            if not(((((_la - 59)) & ~0x3f) == 0 and ((1 << (_la - 59)) & ((1 << (SourcePawnParser.PlusAssign - 59)) | (1 << (SourcePawnParser.MinusAssign - 59)) | (1 << (SourcePawnParser.StarAssign - 59)) | (1 << (SourcePawnParser.DivAssign - 59)) | (1 << (SourcePawnParser.ModAssign - 59)) | (1 << (SourcePawnParser.XorAssign - 59)) | (1 << (SourcePawnParser.AndAssign - 59)) | (1 << (SourcePawnParser.OrAssign - 59)) | (1 << (SourcePawnParser.RShiftAssign - 59)) | (1 << (SourcePawnParser.RShiftUnsignedAssign - 59)) | (1 << (SourcePawnParser.LShiftAssign - 59)) | (1 << (SourcePawnParser.Assign - 59)))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TypedefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TypeDef(self):
            return self.getToken(SourcePawnParser.TypeDef, 0)

        def symbol(self):
            return self.getTypedRuleContext(SourcePawnParser.SymbolContext,0)


        def Assign(self):
            return self.getToken(SourcePawnParser.Assign, 0)

        def fullTypedefExpression(self):
            return self.getTypedRuleContext(SourcePawnParser.FullTypedefExpressionContext,0)


        def getRuleIndex(self):
            return SourcePawnParser.RULE_typedef

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTypedef" ):
                listener.enterTypedef(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTypedef" ):
                listener.exitTypedef(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTypedef" ):
                return visitor.visitTypedef(self)
            else:
                return visitor.visitChildren(self)




    def typedef(self):

        localctx = SourcePawnParser.TypedefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_typedef)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 317
            self.match(SourcePawnParser.TypeDef)
            self.state = 318
            self.symbol()
            self.state = 319
            self.match(SourcePawnParser.Assign)
            self.state = 320
            self.fullTypedefExpression()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TypesetContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TypeSet(self):
            return self.getToken(SourcePawnParser.TypeSet, 0)

        def symbol(self):
            return self.getTypedRuleContext(SourcePawnParser.SymbolContext,0)


        def LBrace(self):
            return self.getToken(SourcePawnParser.LBrace, 0)

        def RBrace(self):
            return self.getToken(SourcePawnParser.RBrace, 0)

        def fullTypedefExpression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SourcePawnParser.FullTypedefExpressionContext)
            else:
                return self.getTypedRuleContext(SourcePawnParser.FullTypedefExpressionContext,i)


        def Semi(self):
            return self.getToken(SourcePawnParser.Semi, 0)

        def getRuleIndex(self):
            return SourcePawnParser.RULE_typeset

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTypeset" ):
                listener.enterTypeset(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTypeset" ):
                listener.exitTypeset(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTypeset" ):
                return visitor.visitTypeset(self)
            else:
                return visitor.visitChildren(self)




    def typeset(self):

        localctx = SourcePawnParser.TypesetContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_typeset)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 322
            self.match(SourcePawnParser.TypeSet)
            self.state = 323
            self.symbol()
            self.state = 324
            self.match(SourcePawnParser.LBrace)
            self.state = 328
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==SourcePawnParser.Function or _la==SourcePawnParser.LParen:
                self.state = 325
                self.fullTypedefExpression()
                self.state = 330
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 331
            self.match(SourcePawnParser.RBrace)
            self.state = 333
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,34,self._ctx)
            if la_ == 1:
                self.state = 332
                self.match(SourcePawnParser.Semi)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FullTypedefExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LParen(self):
            return self.getToken(SourcePawnParser.LParen, 0)

        def typedefExpression(self):
            return self.getTypedRuleContext(SourcePawnParser.TypedefExpressionContext,0)


        def RParen(self):
            return self.getToken(SourcePawnParser.RParen, 0)

        def Semi(self):
            return self.getToken(SourcePawnParser.Semi, 0)

        def getRuleIndex(self):
            return SourcePawnParser.RULE_fullTypedefExpression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFullTypedefExpression" ):
                listener.enterFullTypedefExpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFullTypedefExpression" ):
                listener.exitFullTypedefExpression(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFullTypedefExpression" ):
                return visitor.visitFullTypedefExpression(self)
            else:
                return visitor.visitChildren(self)




    def fullTypedefExpression(self):

        localctx = SourcePawnParser.FullTypedefExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_fullTypedefExpression)
        try:
            self.state = 345
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [SourcePawnParser.LParen]:
                self.enterOuterAlt(localctx, 1)
                self.state = 335
                self.match(SourcePawnParser.LParen)
                self.state = 336
                self.typedefExpression()
                self.state = 337
                self.match(SourcePawnParser.RParen)
                self.state = 339
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,35,self._ctx)
                if la_ == 1:
                    self.state = 338
                    self.match(SourcePawnParser.Semi)


                pass
            elif token in [SourcePawnParser.Function]:
                self.enterOuterAlt(localctx, 2)
                self.state = 341
                self.typedefExpression()
                self.state = 343
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,36,self._ctx)
                if la_ == 1:
                    self.state = 342
                    self.match(SourcePawnParser.Semi)


                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TypedefExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Function(self):
            return self.getToken(SourcePawnParser.Function, 0)

        def type_(self):
            return self.getTypedRuleContext(SourcePawnParser.TypeContext,0)


        def LParen(self):
            return self.getToken(SourcePawnParser.LParen, 0)

        def RParen(self):
            return self.getToken(SourcePawnParser.RParen, 0)

        def methodArgsNoAssign(self):
            return self.getTypedRuleContext(SourcePawnParser.MethodArgsNoAssignContext,0)


        def getRuleIndex(self):
            return SourcePawnParser.RULE_typedefExpression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTypedefExpression" ):
                listener.enterTypedefExpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTypedefExpression" ):
                listener.exitTypedefExpression(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTypedefExpression" ):
                return visitor.visitTypedefExpression(self)
            else:
                return visitor.visitChildren(self)




    def typedefExpression(self):

        localctx = SourcePawnParser.TypedefExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_typedefExpression)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 347
            self.match(SourcePawnParser.Function)
            self.state = 348
            self.type_()
            self.state = 349
            self.match(SourcePawnParser.LParen)
            self.state = 351
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << SourcePawnParser.Any) | (1 << SourcePawnParser.Bool) | (1 << SourcePawnParser.Char) | (1 << SourcePawnParser.Const) | (1 << SourcePawnParser.Float) | (1 << SourcePawnParser.Handle) | (1 << SourcePawnParser.Int) | (1 << SourcePawnParser.Void))) != 0) or _la==SourcePawnParser.Identifier:
                self.state = 350
                self.methodArgsNoAssign()


            self.state = 353
            self.match(SourcePawnParser.RParen)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NativeDefinitionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Native(self):
            return self.getToken(SourcePawnParser.Native, 0)

        def type_(self):
            return self.getTypedRuleContext(SourcePawnParser.TypeContext,0)


        def symbol(self):
            return self.getTypedRuleContext(SourcePawnParser.SymbolContext,0)


        def LParen(self):
            return self.getToken(SourcePawnParser.LParen, 0)

        def RParen(self):
            return self.getToken(SourcePawnParser.RParen, 0)

        def methodArgs(self):
            return self.getTypedRuleContext(SourcePawnParser.MethodArgsContext,0)


        def Semi(self):
            return self.getToken(SourcePawnParser.Semi, 0)

        def getRuleIndex(self):
            return SourcePawnParser.RULE_nativeDefinition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNativeDefinition" ):
                listener.enterNativeDefinition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNativeDefinition" ):
                listener.exitNativeDefinition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNativeDefinition" ):
                return visitor.visitNativeDefinition(self)
            else:
                return visitor.visitChildren(self)




    def nativeDefinition(self):

        localctx = SourcePawnParser.NativeDefinitionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_nativeDefinition)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 355
            self.match(SourcePawnParser.Native)
            self.state = 356
            self.type_()
            self.state = 357
            self.symbol()
            self.state = 358
            self.match(SourcePawnParser.LParen)
            self.state = 360
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << SourcePawnParser.Any) | (1 << SourcePawnParser.Bool) | (1 << SourcePawnParser.Char) | (1 << SourcePawnParser.Const) | (1 << SourcePawnParser.Float) | (1 << SourcePawnParser.Handle) | (1 << SourcePawnParser.Int) | (1 << SourcePawnParser.Void))) != 0) or _la==SourcePawnParser.Identifier:
                self.state = 359
                self.methodArgs()


            self.state = 362
            self.match(SourcePawnParser.RParen)
            self.state = 364
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,40,self._ctx)
            if la_ == 1:
                self.state = 363
                self.match(SourcePawnParser.Semi)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ForwardDefinitionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Forward(self):
            return self.getToken(SourcePawnParser.Forward, 0)

        def type_(self):
            return self.getTypedRuleContext(SourcePawnParser.TypeContext,0)


        def symbol(self):
            return self.getTypedRuleContext(SourcePawnParser.SymbolContext,0)


        def LParen(self):
            return self.getToken(SourcePawnParser.LParen, 0)

        def RParen(self):
            return self.getToken(SourcePawnParser.RParen, 0)

        def methodArgs(self):
            return self.getTypedRuleContext(SourcePawnParser.MethodArgsContext,0)


        def Semi(self):
            return self.getToken(SourcePawnParser.Semi, 0)

        def getRuleIndex(self):
            return SourcePawnParser.RULE_forwardDefinition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterForwardDefinition" ):
                listener.enterForwardDefinition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitForwardDefinition" ):
                listener.exitForwardDefinition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitForwardDefinition" ):
                return visitor.visitForwardDefinition(self)
            else:
                return visitor.visitChildren(self)




    def forwardDefinition(self):

        localctx = SourcePawnParser.ForwardDefinitionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_forwardDefinition)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 366
            self.match(SourcePawnParser.Forward)
            self.state = 367
            self.type_()
            self.state = 368
            self.symbol()
            self.state = 369
            self.match(SourcePawnParser.LParen)
            self.state = 371
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << SourcePawnParser.Any) | (1 << SourcePawnParser.Bool) | (1 << SourcePawnParser.Char) | (1 << SourcePawnParser.Const) | (1 << SourcePawnParser.Float) | (1 << SourcePawnParser.Handle) | (1 << SourcePawnParser.Int) | (1 << SourcePawnParser.Void))) != 0) or _la==SourcePawnParser.Identifier:
                self.state = 370
                self.methodArgs()


            self.state = 373
            self.match(SourcePawnParser.RParen)
            self.state = 375
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,42,self._ctx)
            if la_ == 1:
                self.state = 374
                self.match(SourcePawnParser.Semi)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FunctionDeclarationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def type_(self):
            return self.getTypedRuleContext(SourcePawnParser.TypeContext,0)


        def symbol(self):
            return self.getTypedRuleContext(SourcePawnParser.SymbolContext,0)


        def LParen(self):
            return self.getToken(SourcePawnParser.LParen, 0)

        def RParen(self):
            return self.getToken(SourcePawnParser.RParen, 0)

        def methodBody(self):
            return self.getTypedRuleContext(SourcePawnParser.MethodBodyContext,0)


        def Stock(self):
            return self.getToken(SourcePawnParser.Stock, 0)

        def LBrack(self):
            return self.getToken(SourcePawnParser.LBrack, 0)

        def RBrack(self):
            return self.getToken(SourcePawnParser.RBrack, 0)

        def methodArgs(self):
            return self.getTypedRuleContext(SourcePawnParser.MethodArgsContext,0)


        def getRuleIndex(self):
            return SourcePawnParser.RULE_functionDeclaration

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunctionDeclaration" ):
                listener.enterFunctionDeclaration(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunctionDeclaration" ):
                listener.exitFunctionDeclaration(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunctionDeclaration" ):
                return visitor.visitFunctionDeclaration(self)
            else:
                return visitor.visitChildren(self)




    def functionDeclaration(self):

        localctx = SourcePawnParser.FunctionDeclarationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_functionDeclaration)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 378
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==SourcePawnParser.Stock:
                self.state = 377
                self.match(SourcePawnParser.Stock)


            self.state = 380
            self.type_()
            self.state = 383
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==SourcePawnParser.LBrack:
                self.state = 381
                self.match(SourcePawnParser.LBrack)
                self.state = 382
                self.match(SourcePawnParser.RBrack)


            self.state = 385
            self.symbol()
            self.state = 386
            self.match(SourcePawnParser.LParen)
            self.state = 388
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << SourcePawnParser.Any) | (1 << SourcePawnParser.Bool) | (1 << SourcePawnParser.Char) | (1 << SourcePawnParser.Const) | (1 << SourcePawnParser.Float) | (1 << SourcePawnParser.Handle) | (1 << SourcePawnParser.Int) | (1 << SourcePawnParser.Void))) != 0) or _la==SourcePawnParser.Identifier:
                self.state = 387
                self.methodArgs()


            self.state = 390
            self.match(SourcePawnParser.RParen)
            self.state = 391
            self.methodBody()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FunctionCallbackContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Public(self):
            return self.getToken(SourcePawnParser.Public, 0)

        def type_(self):
            return self.getTypedRuleContext(SourcePawnParser.TypeContext,0)


        def symbol(self):
            return self.getTypedRuleContext(SourcePawnParser.SymbolContext,0)


        def LParen(self):
            return self.getToken(SourcePawnParser.LParen, 0)

        def RParen(self):
            return self.getToken(SourcePawnParser.RParen, 0)

        def methodBody(self):
            return self.getTypedRuleContext(SourcePawnParser.MethodBodyContext,0)


        def methodArgs(self):
            return self.getTypedRuleContext(SourcePawnParser.MethodArgsContext,0)


        def getRuleIndex(self):
            return SourcePawnParser.RULE_functionCallback

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunctionCallback" ):
                listener.enterFunctionCallback(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunctionCallback" ):
                listener.exitFunctionCallback(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunctionCallback" ):
                return visitor.visitFunctionCallback(self)
            else:
                return visitor.visitChildren(self)




    def functionCallback(self):

        localctx = SourcePawnParser.FunctionCallbackContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_functionCallback)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 393
            self.match(SourcePawnParser.Public)
            self.state = 394
            self.type_()
            self.state = 395
            self.symbol()
            self.state = 396
            self.match(SourcePawnParser.LParen)
            self.state = 398
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << SourcePawnParser.Any) | (1 << SourcePawnParser.Bool) | (1 << SourcePawnParser.Char) | (1 << SourcePawnParser.Const) | (1 << SourcePawnParser.Float) | (1 << SourcePawnParser.Handle) | (1 << SourcePawnParser.Int) | (1 << SourcePawnParser.Void))) != 0) or _la==SourcePawnParser.Identifier:
                self.state = 397
                self.methodArgs()


            self.state = 400
            self.match(SourcePawnParser.RParen)
            self.state = 401
            self.methodBody()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodArgsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def methodArg(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SourcePawnParser.MethodArgContext)
            else:
                return self.getTypedRuleContext(SourcePawnParser.MethodArgContext,i)


        def Comma(self, i:int=None):
            if i is None:
                return self.getTokens(SourcePawnParser.Comma)
            else:
                return self.getToken(SourcePawnParser.Comma, i)

        def getRuleIndex(self):
            return SourcePawnParser.RULE_methodArgs

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodArgs" ):
                listener.enterMethodArgs(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodArgs" ):
                listener.exitMethodArgs(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodArgs" ):
                return visitor.visitMethodArgs(self)
            else:
                return visitor.visitChildren(self)




    def methodArgs(self):

        localctx = SourcePawnParser.MethodArgsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_methodArgs)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 403
            self.methodArg()
            self.state = 408
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==SourcePawnParser.Comma:
                self.state = 404
                self.match(SourcePawnParser.Comma)
                self.state = 405
                self.methodArg()
                self.state = 410
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodArgsNoAssignContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def methodArgDecl(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SourcePawnParser.MethodArgDeclContext)
            else:
                return self.getTypedRuleContext(SourcePawnParser.MethodArgDeclContext,i)


        def Comma(self, i:int=None):
            if i is None:
                return self.getTokens(SourcePawnParser.Comma)
            else:
                return self.getToken(SourcePawnParser.Comma, i)

        def getRuleIndex(self):
            return SourcePawnParser.RULE_methodArgsNoAssign

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodArgsNoAssign" ):
                listener.enterMethodArgsNoAssign(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodArgsNoAssign" ):
                listener.exitMethodArgsNoAssign(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodArgsNoAssign" ):
                return visitor.visitMethodArgsNoAssign(self)
            else:
                return visitor.visitChildren(self)




    def methodArgsNoAssign(self):

        localctx = SourcePawnParser.MethodArgsNoAssignContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_methodArgsNoAssign)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 411
            self.methodArgDecl()
            self.state = 416
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==SourcePawnParser.Comma:
                self.state = 412
                self.match(SourcePawnParser.Comma)
                self.state = 413
                self.methodArgDecl()
                self.state = 418
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodArgDeclContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def type_(self):
            return self.getTypedRuleContext(SourcePawnParser.TypeContext,0)


        def symbol(self):
            return self.getTypedRuleContext(SourcePawnParser.SymbolContext,0)


        def Const(self):
            return self.getToken(SourcePawnParser.Const, 0)

        def LBrack(self):
            return self.getToken(SourcePawnParser.LBrack, 0)

        def RBrack(self):
            return self.getToken(SourcePawnParser.RBrack, 0)

        def And(self):
            return self.getToken(SourcePawnParser.And, 0)

        def expr(self):
            return self.getTypedRuleContext(SourcePawnParser.ExprContext,0)


        def Ellipsis(self):
            return self.getToken(SourcePawnParser.Ellipsis, 0)

        def getRuleIndex(self):
            return SourcePawnParser.RULE_methodArgDecl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodArgDecl" ):
                listener.enterMethodArgDecl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodArgDecl" ):
                listener.exitMethodArgDecl(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodArgDecl" ):
                return visitor.visitMethodArgDecl(self)
            else:
                return visitor.visitChildren(self)




    def methodArgDecl(self):

        localctx = SourcePawnParser.MethodArgDeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_methodArgDecl)
        self._la = 0 # Token type
        try:
            self.state = 455
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,54,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 420
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==SourcePawnParser.Const:
                    self.state = 419
                    self.match(SourcePawnParser.Const)


                self.state = 422
                self.type_()
                self.state = 423
                self.symbol()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 426
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==SourcePawnParser.Const:
                    self.state = 425
                    self.match(SourcePawnParser.Const)


                self.state = 428
                self.type_()
                self.state = 429
                self.match(SourcePawnParser.LBrack)
                self.state = 430
                self.match(SourcePawnParser.RBrack)
                self.state = 431
                self.symbol()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 434
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==SourcePawnParser.Const:
                    self.state = 433
                    self.match(SourcePawnParser.Const)


                self.state = 436
                self.type_()
                self.state = 437
                self.match(SourcePawnParser.And)
                self.state = 438
                self.symbol()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 441
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==SourcePawnParser.Const:
                    self.state = 440
                    self.match(SourcePawnParser.Const)


                self.state = 443
                self.type_()
                self.state = 444
                self.symbol()
                self.state = 445
                self.match(SourcePawnParser.LBrack)
                self.state = 446
                self.expr(0)
                self.state = 447
                self.match(SourcePawnParser.RBrack)
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 450
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==SourcePawnParser.Const:
                    self.state = 449
                    self.match(SourcePawnParser.Const)


                self.state = 452
                self.type_()
                self.state = 453
                self.match(SourcePawnParser.Ellipsis)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodArgAssigmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Assign(self):
            return self.getToken(SourcePawnParser.Assign, 0)

        def expr(self):
            return self.getTypedRuleContext(SourcePawnParser.ExprContext,0)


        def getRuleIndex(self):
            return SourcePawnParser.RULE_methodArgAssigment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodArgAssigment" ):
                listener.enterMethodArgAssigment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodArgAssigment" ):
                listener.exitMethodArgAssigment(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodArgAssigment" ):
                return visitor.visitMethodArgAssigment(self)
            else:
                return visitor.visitChildren(self)




    def methodArgAssigment(self):

        localctx = SourcePawnParser.MethodArgAssigmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 58, self.RULE_methodArgAssigment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 457
            self.match(SourcePawnParser.Assign)
            self.state = 458
            self.expr(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodArgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def methodArgDecl(self):
            return self.getTypedRuleContext(SourcePawnParser.MethodArgDeclContext,0)


        def methodArgAssigment(self):
            return self.getTypedRuleContext(SourcePawnParser.MethodArgAssigmentContext,0)


        def getRuleIndex(self):
            return SourcePawnParser.RULE_methodArg

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodArg" ):
                listener.enterMethodArg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodArg" ):
                listener.exitMethodArg(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodArg" ):
                return visitor.visitMethodArg(self)
            else:
                return visitor.visitChildren(self)




    def methodArg(self):

        localctx = SourcePawnParser.MethodArgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 60, self.RULE_methodArg)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 460
            self.methodArgDecl()
            self.state = 462
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==SourcePawnParser.Assign:
                self.state = 461
                self.methodArgAssigment()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodBodyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LBrace(self):
            return self.getToken(SourcePawnParser.LBrace, 0)

        def RBrace(self):
            return self.getToken(SourcePawnParser.RBrace, 0)

        def getRuleIndex(self):
            return SourcePawnParser.RULE_methodBody

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodBody" ):
                listener.enterMethodBody(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodBody" ):
                listener.exitMethodBody(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodBody" ):
                return visitor.visitMethodBody(self)
            else:
                return visitor.visitChildren(self)




    def methodBody(self):

        localctx = SourcePawnParser.MethodBodyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 62, self.RULE_methodBody)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 464
            self.match(SourcePawnParser.LBrace)
            self.state = 465
            self.match(SourcePawnParser.RBrace)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[15] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 11)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 10)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 9)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 8)
         

            if predIndex == 4:
                return self.precpred(self._ctx, 7)
         

            if predIndex == 5:
                return self.precpred(self._ctx, 6)
         

            if predIndex == 6:
                return self.precpred(self._ctx, 5)
         




