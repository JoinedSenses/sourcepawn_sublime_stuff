parser grammar SourcePawnParser;

options {
    tokenVocab = SourcePawnLexer;
}

// globals
// - preprocessor
//   - pragma
//     - semicolon integer
//     - newdecls (required | optional)
//     - ctrlchar character
//     - deprecated message
//     - dynamic integer
//     - tabsize integer
//     - unused identifier
//     - rational Float
//   - include
//   - tryinclude
//   - define
//     - identifier
//     - macro
//   - undef
//   - if, elseif, else, endif
//   - endinput
//   - error
// - functions
//   - stock function
//   - "normal" function
//   - callback (public) function
// - callback functions (public)
// - global variable declarations
// - enum
// - enum struct
//   - member (1d max array dim)
//   - methody
// - struct
//   - type declaration
//   - variable declaration
// - methodmap
//   - constructor
//   - method
//   - property
// - typedef
// - typeset
// - native
// - forward
// - using (only valid for handle instrinsics)

// operator overload
// * / + - ! > >= < <= != == ++ -- %

// (stock)? type Identifier(parameters) { body }
// public type Identifier(parameters) { body }



// ------------------ Methodmap
// Methodmap Identifier ('<' Identifier)? '{'
//     // constructors
//     Public Native '~'? Identifier '(' Parameters* ')' ('=' Identifier)? Terminator
//     Public '~'? Identifier '(' Parameters* ')' '{' Body '}' Newline

//     // methods
//     Public Static? Native Type Identifier '(' Parameters* ')' ('=' Identifier)? Terminator
//     Public Static? Type Identifier '(' Parameters* ')' '{' Body '}' Newline

//     // properties
//     Property Type Identifier '{'
//         // getters
//         Public Native Get '(' ')' ('=' Identifier)? Terminator
//         Public Get '(' ')' '{' Body '}' Newline

//         // setters
//         Public Native Set '(' Type Identifier ')' ('=' Identifier)? Terminator
//         Public Set '(' Type Identifier ')' '{' Body '}' Newline
//     '}' Newline
// '}' Terminator

visibility: Public;
methodmap: Methodmap symbol methodmapInheritance? LBrace methodmapItem* RBrace Semi?;
methodmapInheritance: LT symbol;
methodmapItem
    // constructor
    :   visibility Native Tilde? symbol LParen methodArgs* RParen (Assign symbol)? Semi?
    |   visibility Tilde? symbol LParen methodArgs* RParen methodBody
    // methods
    |   visibility Static? Native type symbol LParen methodArgs* RParen (Assign symbol)? Semi?
    |   visibility Static? type symbol LParen methodArgs* RParen methodBody
    // properties
    |   Property type symbol LBrace methodmapPropertyDecl* RBrace
    ;
methodmapPropertyDecl: visibility methodmapPropertyImpl;
methodmapPropertyImpl
    :   Native sym=symbol LParen RParen (Assign symbol)? Semi?
    |   Native sym=symbol LParen type symbol RParen (Assign symbol)? Semi?
    |   sym=symbol LParen RParen methodBody
    |   sym=symbol LParen type symbol RParen methodBody
    ;

// ------------------ Enum Struct
// enumstruct: Enum Struct Identifier LeftBrace Newline enumstruct_entry+ RightBrace Newline;
// enumstruct_entry:
//     enumstruct_field
//     | enumstruct_method;
// enumstruct_field: Type Identifier Dimensions? Terminator;
// enumstruct_method: Type Identifier LeftParen Parameters* RightParen LeftBrace Body RightBrace;


// start: (expr Semi?)+ EOF;

// pragma: pragmasemi | pragmanewdecls;
// pragmas: PrePragma (
//     pragmasemicolon
//     | pragmanewdecls
//     | pragmactrlchar
//     | pragmadeprecated
//     | pragmadynamic
//     );
// pragmasemicolon: Semicolon IntegerLiteral;
// pragmanewdecls: Newdecls (Required | Optional);
// pragmactrlchar: Ctrlchar CharacterLiteral;
// pragmadeprecated: Deprecated;
// pragmadynamic: Dynamic IntegerLiteral;

compilationUnit: (
        definition | declaration
    )+
    EOF;

definition
    :   typedef
    |   typeset
    |   nativeDefinition
    |   forwardDefinition
    |   methodmap
    ;
declaration:
    functionDeclaration
    | functionCallback
    | Semi // stray ;
    ;

symbol: Identifier;

type: builtin_type | symbol;
builtin_type: Any | Bool | Char | Float | Handle | Int | Void;

commaExpr: expr Comma expr;

// expr
//     :   ViewAs LT type GT LParen expr RParen // retag
//     |   expr (EQ|NE|LE|GE|LT|GT) expr // relational
//     |   expr (AndAnd|OrOr) expr // logical
//     |   Not expr // logical
//     |   expr (Plus|Minus|Mult|Div|Mod) expr // arithmatic
//     |   (Increment|Decrement) expr // arithmatic
//     |   expr (Increment|Decrement) // arithmatic
//     |   expr (And|Or|Xor|LShift|RShift|RShiftUnsigned) expr // bitwise
//     |   Tilde expr // bitwise
//     |   expr QuestionMark expr Colon expr // ternary
//     |   (StringLiteral | symbol) Ellipsis (StringLiteral | symbol) // concat
//     |   LParen expr RParen // group
//     |   literal // symbol
//     |   symbol (LBrack expr RBrack)+ // arrayaccess
//     |   symbol // symbol
//     ;

definedArg
    :   LParen definedArg RParen
    |   symbol
    ;

sizeofArg
    :   LParen sizeofArg RParen
    |   symbol (LBrack RBrack)*
    ;

expr
    :   SizeOf sizeofArg
    |   (Not|Minus) expr
    |   expr (Mult|Div|Mod) expr
    |   expr (Plus|Minus) expr
    |   expr (RShift|RShiftUnsigned|LShift) expr
    |   expr (And|Xor|Or) expr
    |   expr (LT|LE|GT|GE) expr
    |   expr (AndAnd|OrOr) expr
    |   expr QuestionMark expr Semi expr
    |   symbol assignmentOperator expr
    |   LParen expr RParen
    |   literal
    |   symbol
    ;
literal
    :   FloatLiteral
    |   IntegerLiteral
    |   StringLiteral
    |   CharacterLiteral
    |   BooleanLiteral
    ;

assignmentOperator
    :   Assign
	|   StarAssign
	|   DivAssign
	|   ModAssign
	|   PlusAssign
	|   MinusAssign
	|   RShiftAssign
    |   RShiftUnsignedAssign
	|   LShiftAssign
	|   AndAssign
	|   XorAssign
	|   OrAssign
    ;

typedef: TypeDef symbol Assign fullTypedefExpression;
typeset: TypeSet symbol LBrace fullTypedefExpression* RBrace Semi?;
fullTypedefExpression
    :   LParen typedefExpression RParen Semi?
    |   typedefExpression Semi?
    ;
typedefExpression: Function type LParen methodArgsNoAssign? RParen;

nativeDefinition: Native type symbol LParen methodArgs? RParen Semi?;
forwardDefinition: Forward type symbol LParen methodArgs? RParen Semi?; // args cannot have default param


functionDeclaration: Stock? type (LBrack RBrack)? symbol LParen methodArgs? RParen methodBody;

functionCallback: Public type symbol LParen methodArgs? RParen methodBody; // args cannot have default param

methodArgs: methodArg (Comma methodArg)*;
methodArgsNoAssign: methodArgDecl (Comma methodArgDecl)*;

methodArgDecl
    :  Const? type symbol
    |   Const? type LBrack RBrack symbol
    |   Const? type And symbol
    |   Const? type symbol LBrack expr RBrack
    |   Const? type Ellipsis
    ;
methodArgAssigment: Assign expr;

methodArg: methodArgDecl methodArgAssigment?;

methodBody: LBrace /* TODO */ RBrace;
