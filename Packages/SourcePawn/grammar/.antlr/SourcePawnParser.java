// Generated from ./SourcePawnParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SourcePawnParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntegerLiteral=1, CharacterLiteral=2, FloatLiteral=3, StringLiteral=4, 
		BooleanLiteral=5, HandleLiteral=6, MultiLineMacro=7, Directive=8, Any=9, 
		Bool=10, Break=11, Case=12, CellsOf=13, Char=14, Const=15, Continue=16, 
		Default=17, Defined=18, Delete=19, Do=20, Else=21, Enum=22, False_=23, 
		Float=24, Forward=25, Function=26, For=27, Handle=28, If=29, Int=30, Methodmap=31, 
		Native=32, New=33, Null=34, Nullable=35, Operator=36, Property=37, Public=38, 
		Return=39, SizeOf=40, Static=41, StaticAssert=42, Stock=43, Struct=44, 
		Switch=45, This=46, True_=47, TypeDef=48, TypeSet=49, ViewAs=50, Void=51, 
		While=52, LeftParen=53, RightParen=54, LeftBracket=55, RightBracket=56, 
		LeftBrace=57, RightBrace=58, Plus=59, Minus=60, Star=61, Div=62, Mod=63, 
		Caret=64, And=65, Or=66, Tilde=67, Not=68, Assign=69, Less=70, Greater=71, 
		PlusAssign=72, MinusAssign=73, StarAssign=74, DivAssign=75, ModAssign=76, 
		XorAssign=77, AndAssign=78, OrAssign=79, RightShiftUnsigned=80, RightShiftAssign=81, 
		RightShift=82, LeftShiftAssign=83, LeftShift=84, Equal=85, NotEqual=86, 
		LessEqual=87, GreaterEqual=88, AndAnd=89, OrOr=90, PlusPlus=91, MinusMinus=92, 
		Comma=93, Question=94, Colon=95, DoubleColon=96, Semi=97, Dot=98, Ellipsis=99, 
		DecimalLiteral=100, BinaryLiteral=101, HexLiteral=102, Whitespace=103, 
		Newline=104, BlockComment=105, LineComment=106, Identifier=107;
	public static final int
		RULE_methodmap = 0, RULE_methodmapbody = 1, RULE_builtinstoragetype = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"methodmap", "methodmapbody", "builtinstoragetype"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'any'", "'bool'", 
			"'break'", "'case'", "'cellsof'", "'char'", "'const'", "'continue'", 
			"'default'", "'defined'", "'delete'", "'do'", "'else'", "'enum'", "'false'", 
			"'float'", "'forward'", "'function'", "'for'", "'Handle'", "'if'", "'int'", 
			"'methodmap'", "'native'", "'new'", "'null'", "'__nullable__'", "'operator'", 
			"'property'", "'public'", "'return'", "'sizeof'", "'static'", "'static_assert'", 
			"'stock'", "'struct'", "'switch'", "'this'", "'true'", "'typedef'", "'typeset'", 
			"'view_as'", "'void'", "'while'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", "'~'", 
			"'!'", "'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", 
			"'&='", "'|='", "'>>>'", "'>>='", "'>>'", "'<<='", "'<<'", "'=='", "'!='", 
			"'<='", "'>='", "'&&'", "'||'", "'++'", "'--'", "','", "'?'", "':'", 
			"'::'", "';'", "'.'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntegerLiteral", "CharacterLiteral", "FloatLiteral", "StringLiteral", 
			"BooleanLiteral", "HandleLiteral", "MultiLineMacro", "Directive", "Any", 
			"Bool", "Break", "Case", "CellsOf", "Char", "Const", "Continue", "Default", 
			"Defined", "Delete", "Do", "Else", "Enum", "False_", "Float", "Forward", 
			"Function", "For", "Handle", "If", "Int", "Methodmap", "Native", "New", 
			"Null", "Nullable", "Operator", "Property", "Public", "Return", "SizeOf", 
			"Static", "StaticAssert", "Stock", "Struct", "Switch", "This", "True_", 
			"TypeDef", "TypeSet", "ViewAs", "Void", "While", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Plus", "Minus", 
			"Star", "Div", "Mod", "Caret", "And", "Or", "Tilde", "Not", "Assign", 
			"Less", "Greater", "PlusAssign", "MinusAssign", "StarAssign", "DivAssign", 
			"ModAssign", "XorAssign", "AndAssign", "OrAssign", "RightShiftUnsigned", 
			"RightShiftAssign", "RightShift", "LeftShiftAssign", "LeftShift", "Equal", 
			"NotEqual", "LessEqual", "GreaterEqual", "AndAnd", "OrOr", "PlusPlus", 
			"MinusMinus", "Comma", "Question", "Colon", "DoubleColon", "Semi", "Dot", 
			"Ellipsis", "DecimalLiteral", "BinaryLiteral", "HexLiteral", "Whitespace", 
			"Newline", "BlockComment", "LineComment", "Identifier"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SourcePawnParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SourcePawnParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MethodmapContext extends ParserRuleContext {
		public TerminalNode Methodmap() { return getToken(SourcePawnParser.Methodmap, 0); }
		public List<TerminalNode> Identifier() { return getTokens(SourcePawnParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SourcePawnParser.Identifier, i);
		}
		public MethodmapbodyContext methodmapbody() {
			return getRuleContext(MethodmapbodyContext.class,0);
		}
		public TerminalNode Less() { return getToken(SourcePawnParser.Less, 0); }
		public MethodmapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodmap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterMethodmap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitMethodmap(this);
		}
	}

	public final MethodmapContext methodmap() throws RecognitionException {
		MethodmapContext _localctx = new MethodmapContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_methodmap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			match(Methodmap);
			setState(7);
			match(Identifier);
			setState(10);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(8);
				match(Less);
				setState(9);
				match(Identifier);
				}
			}

			setState(12);
			methodmapbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodmapbodyContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(SourcePawnParser.LeftBrace, 0); }
		public MethodmapbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodmapbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterMethodmapbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitMethodmapbody(this);
		}
	}

	public final MethodmapbodyContext methodmapbody() throws RecognitionException {
		MethodmapbodyContext _localctx = new MethodmapbodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_methodmapbody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(LeftBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuiltinstoragetypeContext extends ParserRuleContext {
		public TerminalNode Any() { return getToken(SourcePawnParser.Any, 0); }
		public TerminalNode Bool() { return getToken(SourcePawnParser.Bool, 0); }
		public TerminalNode Char() { return getToken(SourcePawnParser.Char, 0); }
		public TerminalNode Float() { return getToken(SourcePawnParser.Float, 0); }
		public TerminalNode Handle() { return getToken(SourcePawnParser.Handle, 0); }
		public TerminalNode Int() { return getToken(SourcePawnParser.Int, 0); }
		public BuiltinstoragetypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtinstoragetype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterBuiltinstoragetype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitBuiltinstoragetype(this);
		}
	}

	public final BuiltinstoragetypeContext builtinstoragetype() throws RecognitionException {
		BuiltinstoragetypeContext _localctx = new BuiltinstoragetypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_builtinstoragetype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Any) | (1L << Bool) | (1L << Char) | (1L << Float) | (1L << Handle) | (1L << Int))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001k\u0013\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u000b\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0000\u0000\u0003\u0000\u0002\u0004\u0000"+
		"\u0001\u0005\u0000\t\n\u000e\u000e\u0018\u0018\u001c\u001c\u001e\u001e"+
		"\u0010\u0000\u0006\u0001\u0000\u0000\u0000\u0002\u000e\u0001\u0000\u0000"+
		"\u0000\u0004\u0010\u0001\u0000\u0000\u0000\u0006\u0007\u0005\u001f\u0000"+
		"\u0000\u0007\n\u0005k\u0000\u0000\b\t\u0005F\u0000\u0000\t\u000b\u0005"+
		"k\u0000\u0000\n\b\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000\u0000"+
		"\u000b\f\u0001\u0000\u0000\u0000\f\r\u0003\u0002\u0001\u0000\r\u0001\u0001"+
		"\u0000\u0000\u0000\u000e\u000f\u00059\u0000\u0000\u000f\u0003\u0001\u0000"+
		"\u0000\u0000\u0010\u0011\u0007\u0000\u0000\u0000\u0011\u0005\u0001\u0000"+
		"\u0000\u0000\u0001\n";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}