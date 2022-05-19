parser grammar SourcePawnParser;

options {
    tokenVocab = SourcePawnLexer;
}

// start: pragmas+ EOF;
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

// #pragma
//   semicolon integer
//   newdecls (required | optional)
//   ctrlchar characterLiteral
//   deprecated message
//   dynamic integer
//   tabsize integer
//   unused
// #define identifier(parameters)? value

start: methodmap;
methodmap: Methodmap Identifier (Less Identifier)? methodmapbody;
methodmapbody: LeftBrace;

builtinstoragetype: Any | Bool | Char | Float | Handle | Int;