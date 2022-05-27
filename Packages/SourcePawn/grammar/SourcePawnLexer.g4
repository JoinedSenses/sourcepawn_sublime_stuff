lexer grammar SourcePawnLexer;

IntegerLiteral:
    BinaryLiteral
    | HexLiteral
    | DecimalLiteral;

CharacterLiteral: '\'' Cchar+ '\'';

FloatLiteral: DIGIT ('_' | DIGIT)* '.' DIGIT ('e' '-'?)? ('_' | DIGIT)*;

StringLiteral: '"' Schar* '"';

BooleanLiteral: False_ | True_;

HandleLiteral: Null;

MultiLineMacro:
	'#' (~[\n]*? '\\' '\r'? '\n')+ ~ [\n]+ -> channel (HIDDEN);

Directive: '#' ~ [\n]* -> channel (HIDDEN);

Any: 'any';
Bool: 'bool';
Break: 'break';
Case: 'case';
CellsOf: 'cellsof';
Char: 'char';
Const: 'const';
Continue: 'continue';
Default: 'default';
Defined: 'defined';
Delete: 'delete';
Do: 'do';
Else: 'else';
Enum: 'enum';
False_: 'false';
Float: 'float';
Forward: 'forward';
Function: 'function';
For: 'for';
Handle: 'Handle';
If: 'if';
Int: 'int';
Methodmap: 'methodmap';
Native: 'native';
New: 'new';
Null: 'null';
Nullable: '__nullable__';
Operator: 'operator';
Property: 'property';
Public: 'public';
Return: 'return';
SizeOf: 'sizeof';
Static: 'static';
StaticAssert: 'static_assert';
Stock: 'stock';
Struct: 'struct';
Switch: 'switch';
This: 'this';
True_: 'true';
TypeDef: 'typedef';
TypeSet: 'typeset';
ViewAs: 'view_as';
Void: 'void';
While: 'while';

LParen: '(';
RParen: ')';
LBrack: '[';
RBrack: ']';
LBrace: '{';
RBrace: '}';

PlusAssign: '+=';
MinusAssign: '-=';
StarAssign: '*=';
DivAssign: '/=';
ModAssign: '%=';
XorAssign: '^=';
AndAssign: '&=';
OrAssign: '|=';
RShiftAssign: '>>=';
RShiftUnsignedAssign: '>>>=';
LShiftAssign: '<<=';

RShiftUnsigned: '>>>';
RShift: '>>';
LShift: '<<';
EQ: '==';
NE: '!=';
LE: '<=';
GE: '>=';
LT: '<';
GT: '>';
AndAnd: '&&';
OrOr: '||';
Increment: '++';
Decrement: '--';
Plus: '+';
Minus: '-';
Mult: '*';
Div: '/';
Mod: '%';
And: '&';
Or: '|';
Xor: '^';
Tilde: '~';
Not: '!';
Assign: '=';
Comma: ',';
QuestionMark: '?';
DoubleColon: '::';
Colon: ':';
Semi: ';';
Ellipsis: '...';
Dot: '.';


DecimalLiteral: DIGIT (DIGIT | '_')*;
BinaryLiteral: '0b' (BINARYDIGIT | '_')*;
HexLiteral: '0x' ((((((((HEXDIGIT)? HEXDIGIT)? HEXDIGIT)? HEXDIGIT)? HEXDIGIT)? HEXDIGIT)? HEXDIGIT)? HEXDIGIT)?;

fragment BINARYDIGIT: [01];
fragment DIGIT: [0-9];
fragment HEXDIGIT: [0-9a-fA-F];

fragment Schar:
    ~ ["\\\r\n]
    |  Escapesequence;

fragment Cchar:
    ~ ['\\\r\n]
    | Escapesequence;

fragment Escapesequence:
    Simplesscapesequence
    | Decimalescapesequence
    | Hexadecimalescapesequence
    ;

fragment Decimalescapesequence: '\\' ( ( [01]? DIGIT? DIGIT ) | ( '2' [0-4] DIGIT ) | ( '25'[0-5] ) ) ';'?;

fragment Hexadecimalescapesequence: '\\x' ( ( HEXDIGIT )? HEXDIGIT )? ';'?;

fragment Simplesscapesequence:
    '\\' (['"%\\abefnrtv] | ('\r' '\n'? | '\n'));

// /* Preprocessor */
// PreAssert: '#assert';
// PreDefine: '#define';
// PreDeprecated: '#deprecated';
// PreElse: '#else';
// PreElseif: '#elseif';
// PreEndif: '#endif';
// PreEndinput: '#endinput';
// PreEndscript: '#endscript';
// PreError: '#error';
// PreFile: '#file';
// PreIf: '#if';
// PreInclude: '#include';
// PreLine: '#line';
// PrePragma: '#pragma';
// PreTryinclude: '#tryinclude';
// PreUndef: '#undef';

// Ctrlchar: 'ctrlchar';
// Deprecated: 'deprecated';
// Dynamic: 'dynamic';
// Newdecls: 'newdecls';
// Optional: 'optional';
// Rational: 'rational';
// Required: 'required';
// Semicolon: 'semicolon';
// Tabsize: 'tabsize';
// Unused: 'unused';

Whitespace: [ \t]+ -> skip;
Newline: ('\r' '\n'? | '\n') -> skip;
BlockComment: '/*' .*? '*/' -> skip;
LineComment: '//' ~ [\r\n]* -> skip;

Identifier: [a-zA-Z_][a-zA-Z_0-9]*;