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
        4,1,107,23,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,1,0,1,0,1,1,1,1,1,1,1,
        1,3,1,15,8,1,1,1,1,1,1,2,1,2,1,3,1,3,1,3,0,0,4,0,2,4,6,0,1,5,0,9,
        10,14,14,24,24,28,28,30,30,19,0,8,1,0,0,0,2,10,1,0,0,0,4,18,1,0,
        0,0,6,20,1,0,0,0,8,9,3,2,1,0,9,1,1,0,0,0,10,11,5,31,0,0,11,14,5,
        107,0,0,12,13,5,70,0,0,13,15,5,107,0,0,14,12,1,0,0,0,14,15,1,0,0,
        0,15,16,1,0,0,0,16,17,3,4,2,0,17,3,1,0,0,0,18,19,5,57,0,0,19,5,1,
        0,0,0,20,21,7,0,0,0,21,7,1,0,0,0,1,14
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
                     "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", 
                     "'|'", "'~'", "'!'", "'='", "'<'", "'>'", "'+='", "'-='", 
                     "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'>>>'", 
                     "'>>='", "'>>'", "'<<='", "'<<'", "'=='", "'!='", "'<='", 
                     "'>='", "'&&'", "'||'", "'++'", "'--'", "','", "'?'", 
                     "':'", "'::'", "';'", "'.'", "'...'" ]

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
                      "TypeSet", "ViewAs", "Void", "While", "LeftParen", 
                      "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
                      "RightBrace", "Plus", "Minus", "Star", "Div", "Mod", 
                      "Caret", "And", "Or", "Tilde", "Not", "Assign", "Less", 
                      "Greater", "PlusAssign", "MinusAssign", "StarAssign", 
                      "DivAssign", "ModAssign", "XorAssign", "AndAssign", 
                      "OrAssign", "RightShiftUnsigned", "RightShiftAssign", 
                      "RightShift", "LeftShiftAssign", "LeftShift", "Equal", 
                      "NotEqual", "LessEqual", "GreaterEqual", "AndAnd", 
                      "OrOr", "PlusPlus", "MinusMinus", "Comma", "Question", 
                      "Colon", "DoubleColon", "Semi", "Dot", "Ellipsis", 
                      "DecimalLiteral", "BinaryLiteral", "HexLiteral", "Whitespace", 
                      "Newline", "BlockComment", "LineComment", "Identifier" ]

    RULE_start = 0
    RULE_methodmap = 1
    RULE_methodmapbody = 2
    RULE_builtinstoragetype = 3

    ruleNames =  [ "start", "methodmap", "methodmapbody", "builtinstoragetype" ]

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
    LeftParen=53
    RightParen=54
    LeftBracket=55
    RightBracket=56
    LeftBrace=57
    RightBrace=58
    Plus=59
    Minus=60
    Star=61
    Div=62
    Mod=63
    Caret=64
    And=65
    Or=66
    Tilde=67
    Not=68
    Assign=69
    Less=70
    Greater=71
    PlusAssign=72
    MinusAssign=73
    StarAssign=74
    DivAssign=75
    ModAssign=76
    XorAssign=77
    AndAssign=78
    OrAssign=79
    RightShiftUnsigned=80
    RightShiftAssign=81
    RightShift=82
    LeftShiftAssign=83
    LeftShift=84
    Equal=85
    NotEqual=86
    LessEqual=87
    GreaterEqual=88
    AndAnd=89
    OrOr=90
    PlusPlus=91
    MinusMinus=92
    Comma=93
    Question=94
    Colon=95
    DoubleColon=96
    Semi=97
    Dot=98
    Ellipsis=99
    DecimalLiteral=100
    BinaryLiteral=101
    HexLiteral=102
    Whitespace=103
    Newline=104
    BlockComment=105
    LineComment=106
    Identifier=107

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.10.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StartContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def methodmap(self):
            return self.getTypedRuleContext(SourcePawnParser.MethodmapContext,0)


        def getRuleIndex(self):
            return SourcePawnParser.RULE_start

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart" ):
                listener.enterStart(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart" ):
                listener.exitStart(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStart" ):
                return visitor.visitStart(self)
            else:
                return visitor.visitChildren(self)




    def start(self):

        localctx = SourcePawnParser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_start)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 8
            self.methodmap()
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

        def Identifier(self, i:int=None):
            if i is None:
                return self.getTokens(SourcePawnParser.Identifier)
            else:
                return self.getToken(SourcePawnParser.Identifier, i)

        def methodmapbody(self):
            return self.getTypedRuleContext(SourcePawnParser.MethodmapbodyContext,0)


        def Less(self):
            return self.getToken(SourcePawnParser.Less, 0)

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
            self.state = 10
            self.match(SourcePawnParser.Methodmap)
            self.state = 11
            self.match(SourcePawnParser.Identifier)
            self.state = 14
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==SourcePawnParser.Less:
                self.state = 12
                self.match(SourcePawnParser.Less)
                self.state = 13
                self.match(SourcePawnParser.Identifier)


            self.state = 16
            self.methodmapbody()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodmapbodyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LeftBrace(self):
            return self.getToken(SourcePawnParser.LeftBrace, 0)

        def getRuleIndex(self):
            return SourcePawnParser.RULE_methodmapbody

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodmapbody" ):
                listener.enterMethodmapbody(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodmapbody" ):
                listener.exitMethodmapbody(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodmapbody" ):
                return visitor.visitMethodmapbody(self)
            else:
                return visitor.visitChildren(self)




    def methodmapbody(self):

        localctx = SourcePawnParser.MethodmapbodyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_methodmapbody)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 18
            self.match(SourcePawnParser.LeftBrace)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BuiltinstoragetypeContext(ParserRuleContext):
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

        def getRuleIndex(self):
            return SourcePawnParser.RULE_builtinstoragetype

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBuiltinstoragetype" ):
                listener.enterBuiltinstoragetype(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBuiltinstoragetype" ):
                listener.exitBuiltinstoragetype(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBuiltinstoragetype" ):
                return visitor.visitBuiltinstoragetype(self)
            else:
                return visitor.visitChildren(self)




    def builtinstoragetype(self):

        localctx = SourcePawnParser.BuiltinstoragetypeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_builtinstoragetype)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 20
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << SourcePawnParser.Any) | (1 << SourcePawnParser.Bool) | (1 << SourcePawnParser.Char) | (1 << SourcePawnParser.Float) | (1 << SourcePawnParser.Handle) | (1 << SourcePawnParser.Int))) != 0)):
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





