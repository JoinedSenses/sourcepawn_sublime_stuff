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
		BooleanLiteral=5, HandleLiteral=6, Any=7, Bool=8, Break=9, Case=10, CellsOf=11, 
		Char=12, Const=13, Continue=14, Default=15, Defined=16, Delete=17, Do=18, 
		Else=19, Enum=20, False_=21, Float=22, Forward=23, Function=24, For=25, 
		Handle=26, If=27, Int=28, Methodmap=29, Native=30, New=31, Null=32, Nullable=33, 
		Operator=34, Property=35, Public=36, Return=37, SizeOf=38, Static=39, 
		StaticAssert=40, Stock=41, Struct=42, Switch=43, This=44, True_=45, TypeDef=46, 
		TypeSet=47, ViewAs=48, Void=49, While=50, LeftParen=51, RightParen=52, 
		LeftBracket=53, RightBracket=54, LeftBrace=55, RightBrace=56, Plus=57, 
		Minus=58, Star=59, Div=60, Mod=61, Caret=62, And=63, Or=64, Tilde=65, 
		Not=66, Assign=67, Less=68, Greater=69, PlusAssign=70, MinusAssign=71, 
		StarAssign=72, DivAssign=73, ModAssign=74, XorAssign=75, AndAssign=76, 
		OrAssign=77, RightShiftUnsigned=78, RightShiftAssign=79, RightShift=80, 
		LeftShiftAssign=81, LeftShift=82, Equal=83, NotEqual=84, LessEqual=85, 
		GreaterEqual=86, AndAnd=87, OrOr=88, PlusPlus=89, MinusMinus=90, Comma=91, 
		Question=92, Colon=93, DoubleColon=94, Semi=95, Dot=96, Ellipsis=97, Identifier=98, 
		DecimalLiteral=99, BinaryLiteral=100, HexLiteral=101, PreAssert=102, PreDefine=103, 
		PreDeprecated=104, PreElse=105, PreElseif=106, PreEndif=107, PreEndinput=108, 
		PreEndscript=109, PreError=110, PreFile=111, PreIf=112, PreInclude=113, 
		PreLine=114, PrePragma=115, PreTryinclude=116, PreUndef=117, Ctrlchar=118, 
		Dynamic=119, Newdecls=120, Optional=121, Rational=122, Required=123, Semicolon=124, 
		Tabsize=125, Unused=126, Whitespace=127, Newline=128, BlockComment=129, 
		LineComment=130;
	public static final int
		RULE_start = 0, RULE_pragma = 1, RULE_pragmasemi = 2, RULE_pragmanewdecls = 3, 
		RULE_methodmap = 4, RULE_methodmapbody = 5, RULE_builtinstoragetype = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "pragma", "pragmasemi", "pragmanewdecls", "methodmap", "methodmapbody", 
			"builtinstoragetype"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'any'", "'bool'", "'break'", 
			"'case'", "'cellsof'", "'char'", "'const'", "'continue'", "'default'", 
			"'defined'", "'delete'", "'do'", "'else'", "'enum'", "'false'", "'float'", 
			"'forward'", "'function'", "'for'", "'Handle'", "'if'", "'int'", "'methodmap'", 
			"'native'", "'new'", "'null'", "'__nullable__'", "'operator'", "'property'", 
			"'public'", "'return'", "'sizeof'", "'static'", "'static_assert'", "'stock'", 
			"'struct'", "'switch'", "'this'", "'true'", "'typedef'", "'typeset'", 
			"'view_as'", "'void'", "'while'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", "'~'", 
			"'!'", "'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", 
			"'&='", "'|='", "'>>>'", "'>>='", "'>>'", "'<<='", "'<<'", "'=='", "'!='", 
			"'<='", "'>='", "'&&'", "'||'", "'++'", "'--'", "','", "'?'", "':'", 
			"'::'", "';'", "'.'", "'...'", null, null, null, null, "'#assert'", "'#define'", 
			"'#deprecated'", "'#else'", "'#elseif'", "'#endif'", "'#endinput'", "'#endscript'", 
			"'#error'", "'#file'", "'#if'", "'#include'", "'#line'", "'#pragma'", 
			"'#tryinclude'", "'#undef'", "'ctrlchar'", "'dynamic'", "'newdecls'", 
			"'optional'", "'rational'", "'required'", "'semicolon'", "'tabsize'", 
			"'unused'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntegerLiteral", "CharacterLiteral", "FloatLiteral", "StringLiteral", 
			"BooleanLiteral", "HandleLiteral", "Any", "Bool", "Break", "Case", "CellsOf", 
			"Char", "Const", "Continue", "Default", "Defined", "Delete", "Do", "Else", 
			"Enum", "False_", "Float", "Forward", "Function", "For", "Handle", "If", 
			"Int", "Methodmap", "Native", "New", "Null", "Nullable", "Operator", 
			"Property", "Public", "Return", "SizeOf", "Static", "StaticAssert", "Stock", 
			"Struct", "Switch", "This", "True_", "TypeDef", "TypeSet", "ViewAs", 
			"Void", "While", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Plus", "Minus", "Star", "Div", "Mod", "Caret", 
			"And", "Or", "Tilde", "Not", "Assign", "Less", "Greater", "PlusAssign", 
			"MinusAssign", "StarAssign", "DivAssign", "ModAssign", "XorAssign", "AndAssign", 
			"OrAssign", "RightShiftUnsigned", "RightShiftAssign", "RightShift", "LeftShiftAssign", 
			"LeftShift", "Equal", "NotEqual", "LessEqual", "GreaterEqual", "AndAnd", 
			"OrOr", "PlusPlus", "MinusMinus", "Comma", "Question", "Colon", "DoubleColon", 
			"Semi", "Dot", "Ellipsis", "Identifier", "DecimalLiteral", "BinaryLiteral", 
			"HexLiteral", "PreAssert", "PreDefine", "PreDeprecated", "PreElse", "PreElseif", 
			"PreEndif", "PreEndinput", "PreEndscript", "PreError", "PreFile", "PreIf", 
			"PreInclude", "PreLine", "PrePragma", "PreTryinclude", "PreUndef", "Ctrlchar", 
			"Dynamic", "Newdecls", "Optional", "Rational", "Required", "Semicolon", 
			"Tabsize", "Unused", "Whitespace", "Newline", "BlockComment", "LineComment"
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

	public static class StartContext extends ParserRuleContext {
		public MethodmapContext methodmap() {
			return getRuleContext(MethodmapContext.class,0);
		}
		public PragmaContext pragma() {
			return getRuleContext(PragmaContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Methodmap:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				methodmap();
				}
				break;
			case PrePragma:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				pragma();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PragmaContext extends ParserRuleContext {
		public PragmasemiContext pragmasemi() {
			return getRuleContext(PragmasemiContext.class,0);
		}
		public PragmanewdeclsContext pragmanewdecls() {
			return getRuleContext(PragmanewdeclsContext.class,0);
		}
		public PragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterPragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitPragma(this);
		}
	}

	public final PragmaContext pragma() throws RecognitionException {
		PragmaContext _localctx = new PragmaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragma);
		try {
			setState(20);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				pragmasemi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				pragmanewdecls();
				}
				break;
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

	public static class PragmasemiContext extends ParserRuleContext {
		public TerminalNode PrePragma() { return getToken(SourcePawnParser.PrePragma, 0); }
		public TerminalNode Semicolon() { return getToken(SourcePawnParser.Semicolon, 0); }
		public TerminalNode IntegerLiteral() { return getToken(SourcePawnParser.IntegerLiteral, 0); }
		public PragmasemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmasemi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterPragmasemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitPragmasemi(this);
		}
	}

	public final PragmasemiContext pragmasemi() throws RecognitionException {
		PragmasemiContext _localctx = new PragmasemiContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pragmasemi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(PrePragma);
			setState(23);
			match(Semicolon);
			setState(24);
			match(IntegerLiteral);
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

	public static class PragmanewdeclsContext extends ParserRuleContext {
		public TerminalNode PrePragma() { return getToken(SourcePawnParser.PrePragma, 0); }
		public TerminalNode Newdecls() { return getToken(SourcePawnParser.Newdecls, 0); }
		public TerminalNode Required() { return getToken(SourcePawnParser.Required, 0); }
		public TerminalNode Optional() { return getToken(SourcePawnParser.Optional, 0); }
		public PragmanewdeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmanewdecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterPragmanewdecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitPragmanewdecls(this);
		}
	}

	public final PragmanewdeclsContext pragmanewdecls() throws RecognitionException {
		PragmanewdeclsContext _localctx = new PragmanewdeclsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pragmanewdecls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(PrePragma);
			setState(27);
			match(Newdecls);
			setState(28);
			_la = _input.LA(1);
			if ( !(_la==Optional || _la==Required) ) {
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
		enterRule(_localctx, 8, RULE_methodmap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(Methodmap);
			setState(31);
			match(Identifier);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(32);
				match(Less);
				setState(33);
				match(Identifier);
				}
			}

			setState(36);
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
		enterRule(_localctx, 10, RULE_methodmapbody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
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
		enterRule(_localctx, 12, RULE_builtinstoragetype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
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
		"\u0004\u0001\u0082+\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u0011\b\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u0015\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004#\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004"+
		"\u0006\b\n\f\u0000\u0002\u0002\u0000yy{{\u0005\u0000\u0007\b\f\f\u0016"+
		"\u0016\u001a\u001a\u001c\u001c&\u0000\u0010\u0001\u0000\u0000\u0000\u0002"+
		"\u0014\u0001\u0000\u0000\u0000\u0004\u0016\u0001\u0000\u0000\u0000\u0006"+
		"\u001a\u0001\u0000\u0000\u0000\b\u001e\u0001\u0000\u0000\u0000\n&\u0001"+
		"\u0000\u0000\u0000\f(\u0001\u0000\u0000\u0000\u000e\u0011\u0003\b\u0004"+
		"\u0000\u000f\u0011\u0003\u0002\u0001\u0000\u0010\u000e\u0001\u0000\u0000"+
		"\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0011\u0001\u0001\u0000\u0000"+
		"\u0000\u0012\u0015\u0003\u0004\u0002\u0000\u0013\u0015\u0003\u0006\u0003"+
		"\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0014\u0013\u0001\u0000\u0000"+
		"\u0000\u0015\u0003\u0001\u0000\u0000\u0000\u0016\u0017\u0005s\u0000\u0000"+
		"\u0017\u0018\u0005|\u0000\u0000\u0018\u0019\u0005\u0001\u0000\u0000\u0019"+
		"\u0005\u0001\u0000\u0000\u0000\u001a\u001b\u0005s\u0000\u0000\u001b\u001c"+
		"\u0005x\u0000\u0000\u001c\u001d\u0007\u0000\u0000\u0000\u001d\u0007\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0005\u001d\u0000\u0000\u001f\"\u0005b"+
		"\u0000\u0000 !\u0005D\u0000\u0000!#\u0005b\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0003"+
		"\n\u0005\u0000%\t\u0001\u0000\u0000\u0000&\'\u00057\u0000\u0000\'\u000b"+
		"\u0001\u0000\u0000\u0000()\u0007\u0001\u0000\u0000)\r\u0001\u0000\u0000"+
		"\u0000\u0003\u0010\u0014\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}