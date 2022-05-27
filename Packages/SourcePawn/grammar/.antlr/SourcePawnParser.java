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
		While=52, LParen=53, RParen=54, LBrack=55, RBrack=56, LBrace=57, RBrace=58, 
		PlusAssign=59, MinusAssign=60, StarAssign=61, DivAssign=62, ModAssign=63, 
		XorAssign=64, AndAssign=65, OrAssign=66, RShiftAssign=67, RShiftUnsignedAssign=68, 
		LShiftAssign=69, RShiftUnsigned=70, RShift=71, LShift=72, EQ=73, NE=74, 
		LE=75, GE=76, LT=77, GT=78, AndAnd=79, OrOr=80, Increment=81, Decrement=82, 
		Plus=83, Minus=84, Mult=85, Div=86, Mod=87, And=88, Or=89, Xor=90, Tilde=91, 
		Not=92, Assign=93, Comma=94, QuestionMark=95, DoubleColon=96, Colon=97, 
		Semi=98, Ellipsis=99, Dot=100, DecimalLiteral=101, BinaryLiteral=102, 
		HexLiteral=103, Whitespace=104, Newline=105, BlockComment=106, LineComment=107, 
		Identifier=108;
	public static final int
		RULE_visibility = 0, RULE_methodmap = 1, RULE_methodmapInheritance = 2, 
		RULE_methodmapItem = 3, RULE_methodmapPropertyDecl = 4, RULE_methodmapPropertyImpl = 5, 
		RULE_compilationUnit = 6, RULE_definition = 7, RULE_declaration = 8, RULE_symbol = 9, 
		RULE_type = 10, RULE_builtin_type = 11, RULE_commaExpr = 12, RULE_definedArg = 13, 
		RULE_sizeofArg = 14, RULE_expr = 15, RULE_literal = 16, RULE_assignmentOperator = 17, 
		RULE_typedef = 18, RULE_typeset = 19, RULE_fullTypedefExpression = 20, 
		RULE_typedefExpression = 21, RULE_nativeDefinition = 22, RULE_forwardDefinition = 23, 
		RULE_functionDeclaration = 24, RULE_functionCallback = 25, RULE_methodArgs = 26, 
		RULE_methodArgsNoAssign = 27, RULE_methodArgDecl = 28, RULE_methodArgAssigment = 29, 
		RULE_methodArg = 30, RULE_methodBody = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"visibility", "methodmap", "methodmapInheritance", "methodmapItem", "methodmapPropertyDecl", 
			"methodmapPropertyImpl", "compilationUnit", "definition", "declaration", 
			"symbol", "type", "builtin_type", "commaExpr", "definedArg", "sizeofArg", 
			"expr", "literal", "assignmentOperator", "typedef", "typeset", "fullTypedefExpression", 
			"typedefExpression", "nativeDefinition", "forwardDefinition", "functionDeclaration", 
			"functionCallback", "methodArgs", "methodArgsNoAssign", "methodArgDecl", 
			"methodArgAssigment", "methodArg", "methodBody"
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
			"'}'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", 
			"'>>='", "'>>>='", "'<<='", "'>>>'", "'>>'", "'<<'", "'=='", "'!='", 
			"'<='", "'>='", "'<'", "'>'", "'&&'", "'||'", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'^'", "'~'", "'!'", "'='", 
			"','", "'?'", "'::'", "':'", "';'", "'...'", "'.'"
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
			"TypeDef", "TypeSet", "ViewAs", "Void", "While", "LParen", "RParen", 
			"LBrack", "RBrack", "LBrace", "RBrace", "PlusAssign", "MinusAssign", 
			"StarAssign", "DivAssign", "ModAssign", "XorAssign", "AndAssign", "OrAssign", 
			"RShiftAssign", "RShiftUnsignedAssign", "LShiftAssign", "RShiftUnsigned", 
			"RShift", "LShift", "EQ", "NE", "LE", "GE", "LT", "GT", "AndAnd", "OrOr", 
			"Increment", "Decrement", "Plus", "Minus", "Mult", "Div", "Mod", "And", 
			"Or", "Xor", "Tilde", "Not", "Assign", "Comma", "QuestionMark", "DoubleColon", 
			"Colon", "Semi", "Ellipsis", "Dot", "DecimalLiteral", "BinaryLiteral", 
			"HexLiteral", "Whitespace", "Newline", "BlockComment", "LineComment", 
			"Identifier"
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

	public static class VisibilityContext extends ParserRuleContext {
		public TerminalNode Public() { return getToken(SourcePawnParser.Public, 0); }
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitVisibility(this);
		}
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_visibility);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(Public);
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
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode LBrace() { return getToken(SourcePawnParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SourcePawnParser.RBrace, 0); }
		public MethodmapInheritanceContext methodmapInheritance() {
			return getRuleContext(MethodmapInheritanceContext.class,0);
		}
		public List<MethodmapItemContext> methodmapItem() {
			return getRuleContexts(MethodmapItemContext.class);
		}
		public MethodmapItemContext methodmapItem(int i) {
			return getRuleContext(MethodmapItemContext.class,i);
		}
		public TerminalNode Semi() { return getToken(SourcePawnParser.Semi, 0); }
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
		enterRule(_localctx, 2, RULE_methodmap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(Methodmap);
			setState(67);
			symbol();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(68);
				methodmapInheritance();
				}
			}

			setState(71);
			match(LBrace);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Property || _la==Public) {
				{
				{
				setState(72);
				methodmapItem();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(RBrace);
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(79);
				match(Semi);
				}
				break;
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

	public static class MethodmapInheritanceContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(SourcePawnParser.LT, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public MethodmapInheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodmapInheritance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterMethodmapInheritance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitMethodmapInheritance(this);
		}
	}

	public final MethodmapInheritanceContext methodmapInheritance() throws RecognitionException {
		MethodmapInheritanceContext _localctx = new MethodmapInheritanceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_methodmapInheritance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(LT);
			setState(83);
			symbol();
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

	public static class MethodmapItemContext extends ParserRuleContext {
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode Native() { return getToken(SourcePawnParser.Native, 0); }
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public TerminalNode LParen() { return getToken(SourcePawnParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SourcePawnParser.RParen, 0); }
		public TerminalNode Tilde() { return getToken(SourcePawnParser.Tilde, 0); }
		public List<MethodArgsContext> methodArgs() {
			return getRuleContexts(MethodArgsContext.class);
		}
		public MethodArgsContext methodArgs(int i) {
			return getRuleContext(MethodArgsContext.class,i);
		}
		public TerminalNode Assign() { return getToken(SourcePawnParser.Assign, 0); }
		public TerminalNode Semi() { return getToken(SourcePawnParser.Semi, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Static() { return getToken(SourcePawnParser.Static, 0); }
		public TerminalNode Property() { return getToken(SourcePawnParser.Property, 0); }
		public TerminalNode LBrace() { return getToken(SourcePawnParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SourcePawnParser.RBrace, 0); }
		public List<MethodmapPropertyDeclContext> methodmapPropertyDecl() {
			return getRuleContexts(MethodmapPropertyDeclContext.class);
		}
		public MethodmapPropertyDeclContext methodmapPropertyDecl(int i) {
			return getRuleContext(MethodmapPropertyDeclContext.class,i);
		}
		public MethodmapItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodmapItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterMethodmapItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitMethodmapItem(this);
		}
	}

	public final MethodmapItemContext methodmapItem() throws RecognitionException {
		MethodmapItemContext _localctx = new MethodmapItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodmapItem);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				visibility();
				setState(86);
				match(Native);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tilde) {
					{
					setState(87);
					match(Tilde);
					}
				}

				setState(90);
				symbol();
				setState(91);
				match(LParen);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Any) | (1L << Bool) | (1L << Char) | (1L << Const) | (1L << Float) | (1L << Handle) | (1L << Int) | (1L << Void))) != 0) || _la==Identifier) {
					{
					{
					setState(92);
					methodArgs();
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				match(RParen);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(99);
					match(Assign);
					setState(100);
					symbol();
					}
				}

				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semi) {
					{
					setState(103);
					match(Semi);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				visibility();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tilde) {
					{
					setState(107);
					match(Tilde);
					}
				}

				setState(110);
				symbol();
				setState(111);
				match(LParen);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Any) | (1L << Bool) | (1L << Char) | (1L << Const) | (1L << Float) | (1L << Handle) | (1L << Int) | (1L << Void))) != 0) || _la==Identifier) {
					{
					{
					setState(112);
					methodArgs();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
				match(RParen);
				setState(119);
				methodBody();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				visibility();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Static) {
					{
					setState(122);
					match(Static);
					}
				}

				setState(125);
				match(Native);
				setState(126);
				type();
				setState(127);
				symbol();
				setState(128);
				match(LParen);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Any) | (1L << Bool) | (1L << Char) | (1L << Const) | (1L << Float) | (1L << Handle) | (1L << Int) | (1L << Void))) != 0) || _la==Identifier) {
					{
					{
					setState(129);
					methodArgs();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(RParen);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(136);
					match(Assign);
					setState(137);
					symbol();
					}
				}

				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semi) {
					{
					setState(140);
					match(Semi);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				visibility();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Static) {
					{
					setState(144);
					match(Static);
					}
				}

				setState(147);
				type();
				setState(148);
				symbol();
				setState(149);
				match(LParen);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Any) | (1L << Bool) | (1L << Char) | (1L << Const) | (1L << Float) | (1L << Handle) | (1L << Int) | (1L << Void))) != 0) || _la==Identifier) {
					{
					{
					setState(150);
					methodArgs();
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(RParen);
				setState(157);
				methodBody();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				match(Property);
				setState(160);
				type();
				setState(161);
				symbol();
				setState(162);
				match(LBrace);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Public) {
					{
					{
					setState(163);
					methodmapPropertyDecl();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(RBrace);
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

	public static class MethodmapPropertyDeclContext extends ParserRuleContext {
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public MethodmapPropertyImplContext methodmapPropertyImpl() {
			return getRuleContext(MethodmapPropertyImplContext.class,0);
		}
		public MethodmapPropertyDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodmapPropertyDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterMethodmapPropertyDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitMethodmapPropertyDecl(this);
		}
	}

	public final MethodmapPropertyDeclContext methodmapPropertyDecl() throws RecognitionException {
		MethodmapPropertyDeclContext _localctx = new MethodmapPropertyDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodmapPropertyDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			visibility();
			setState(174);
			methodmapPropertyImpl();
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

	public static class MethodmapPropertyImplContext extends ParserRuleContext {
		public SymbolContext sym;
		public TerminalNode Native() { return getToken(SourcePawnParser.Native, 0); }
		public TerminalNode LParen() { return getToken(SourcePawnParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SourcePawnParser.RParen, 0); }
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public TerminalNode Assign() { return getToken(SourcePawnParser.Assign, 0); }
		public TerminalNode Semi() { return getToken(SourcePawnParser.Semi, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodmapPropertyImplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodmapPropertyImpl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterMethodmapPropertyImpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitMethodmapPropertyImpl(this);
		}
	}

	public final MethodmapPropertyImplContext methodmapPropertyImpl() throws RecognitionException {
		MethodmapPropertyImplContext _localctx = new MethodmapPropertyImplContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodmapPropertyImpl);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(Native);
				setState(177);
				((MethodmapPropertyImplContext)_localctx).sym = symbol();
				setState(178);
				match(LParen);
				setState(179);
				match(RParen);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(180);
					match(Assign);
					setState(181);
					symbol();
					}
				}

				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semi) {
					{
					setState(184);
					match(Semi);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(Native);
				setState(188);
				((MethodmapPropertyImplContext)_localctx).sym = symbol();
				setState(189);
				match(LParen);
				setState(190);
				type();
				setState(191);
				symbol();
				setState(192);
				match(RParen);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(193);
					match(Assign);
					setState(194);
					symbol();
					}
				}

				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semi) {
					{
					setState(197);
					match(Semi);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				((MethodmapPropertyImplContext)_localctx).sym = symbol();
				setState(201);
				match(LParen);
				setState(202);
				match(RParen);
				setState(203);
				methodBody();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				((MethodmapPropertyImplContext)_localctx).sym = symbol();
				setState(206);
				match(LParen);
				setState(207);
				type();
				setState(208);
				symbol();
				setState(209);
				match(RParen);
				setState(210);
				methodBody();
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

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SourcePawnParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(216);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Forward:
				case Methodmap:
				case Native:
				case TypeDef:
				case TypeSet:
					{
					setState(214);
					definition();
					}
					break;
				case Any:
				case Bool:
				case Char:
				case Float:
				case Handle:
				case Int:
				case Public:
				case Stock:
				case Void:
				case Semi:
				case Identifier:
					{
					setState(215);
					declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Any) | (1L << Bool) | (1L << Char) | (1L << Float) | (1L << Forward) | (1L << Handle) | (1L << Int) | (1L << Methodmap) | (1L << Native) | (1L << Public) | (1L << Stock) | (1L << TypeDef) | (1L << TypeSet) | (1L << Void))) != 0) || _la==Semi || _la==Identifier );
			setState(220);
			match(EOF);
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

	public static class DefinitionContext extends ParserRuleContext {
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public TypesetContext typeset() {
			return getRuleContext(TypesetContext.class,0);
		}
		public NativeDefinitionContext nativeDefinition() {
			return getRuleContext(NativeDefinitionContext.class,0);
		}
		public ForwardDefinitionContext forwardDefinition() {
			return getRuleContext(ForwardDefinitionContext.class,0);
		}
		public MethodmapContext methodmap() {
			return getRuleContext(MethodmapContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_definition);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeDef:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				typedef();
				}
				break;
			case TypeSet:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				typeset();
				}
				break;
			case Native:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				nativeDefinition();
				}
				break;
			case Forward:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				forwardDefinition();
				}
				break;
			case Methodmap:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				methodmap();
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

	public static class DeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionCallbackContext functionCallback() {
			return getRuleContext(FunctionCallbackContext.class,0);
		}
		public TerminalNode Semi() { return getToken(SourcePawnParser.Semi, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaration);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Any:
			case Bool:
			case Char:
			case Float:
			case Handle:
			case Int:
			case Stock:
			case Void:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				functionDeclaration();
				}
				break;
			case Public:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				functionCallback();
				}
				break;
			case Semi:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(Semi);
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

	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SourcePawnParser.Identifier, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitSymbol(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(Identifier);
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

	public static class TypeContext extends ParserRuleContext {
		public Builtin_typeContext builtin_type() {
			return getRuleContext(Builtin_typeContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Any:
			case Bool:
			case Char:
			case Float:
			case Handle:
			case Int:
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				builtin_type();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				symbol();
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

	public static class Builtin_typeContext extends ParserRuleContext {
		public TerminalNode Any() { return getToken(SourcePawnParser.Any, 0); }
		public TerminalNode Bool() { return getToken(SourcePawnParser.Bool, 0); }
		public TerminalNode Char() { return getToken(SourcePawnParser.Char, 0); }
		public TerminalNode Float() { return getToken(SourcePawnParser.Float, 0); }
		public TerminalNode Handle() { return getToken(SourcePawnParser.Handle, 0); }
		public TerminalNode Int() { return getToken(SourcePawnParser.Int, 0); }
		public TerminalNode Void() { return getToken(SourcePawnParser.Void, 0); }
		public Builtin_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterBuiltin_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitBuiltin_type(this);
		}
	}

	public final Builtin_typeContext builtin_type() throws RecognitionException {
		Builtin_typeContext _localctx = new Builtin_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_builtin_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Any) | (1L << Bool) | (1L << Char) | (1L << Float) | (1L << Handle) | (1L << Int) | (1L << Void))) != 0)) ) {
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

	public static class CommaExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Comma() { return getToken(SourcePawnParser.Comma, 0); }
		public CommaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterCommaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitCommaExpr(this);
		}
	}

	public final CommaExprContext commaExpr() throws RecognitionException {
		CommaExprContext _localctx = new CommaExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_commaExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			expr(0);
			setState(243);
			match(Comma);
			setState(244);
			expr(0);
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

	public static class DefinedArgContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(SourcePawnParser.LParen, 0); }
		public DefinedArgContext definedArg() {
			return getRuleContext(DefinedArgContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SourcePawnParser.RParen, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public DefinedArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definedArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterDefinedArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitDefinedArg(this);
		}
	}

	public final DefinedArgContext definedArg() throws RecognitionException {
		DefinedArgContext _localctx = new DefinedArgContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_definedArg);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(LParen);
				setState(247);
				definedArg();
				setState(248);
				match(RParen);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				symbol();
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

	public static class SizeofArgContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(SourcePawnParser.LParen, 0); }
		public SizeofArgContext sizeofArg() {
			return getRuleContext(SizeofArgContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SourcePawnParser.RParen, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public List<TerminalNode> LBrack() { return getTokens(SourcePawnParser.LBrack); }
		public TerminalNode LBrack(int i) {
			return getToken(SourcePawnParser.LBrack, i);
		}
		public List<TerminalNode> RBrack() { return getTokens(SourcePawnParser.RBrack); }
		public TerminalNode RBrack(int i) {
			return getToken(SourcePawnParser.RBrack, i);
		}
		public SizeofArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeofArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterSizeofArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitSizeofArg(this);
		}
	}

	public final SizeofArgContext sizeofArg() throws RecognitionException {
		SizeofArgContext _localctx = new SizeofArgContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sizeofArg);
		try {
			int _alt;
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(LParen);
				setState(254);
				sizeofArg();
				setState(255);
				match(RParen);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				symbol();
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(258);
						match(LBrack);
						setState(259);
						match(RBrack);
						}
						} 
					}
					setState(264);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode SizeOf() { return getToken(SourcePawnParser.SizeOf, 0); }
		public SizeofArgContext sizeofArg() {
			return getRuleContext(SizeofArgContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Not() { return getToken(SourcePawnParser.Not, 0); }
		public TerminalNode Minus() { return getToken(SourcePawnParser.Minus, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public TerminalNode LParen() { return getToken(SourcePawnParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SourcePawnParser.RParen, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Mult() { return getToken(SourcePawnParser.Mult, 0); }
		public TerminalNode Div() { return getToken(SourcePawnParser.Div, 0); }
		public TerminalNode Mod() { return getToken(SourcePawnParser.Mod, 0); }
		public TerminalNode Plus() { return getToken(SourcePawnParser.Plus, 0); }
		public TerminalNode RShift() { return getToken(SourcePawnParser.RShift, 0); }
		public TerminalNode RShiftUnsigned() { return getToken(SourcePawnParser.RShiftUnsigned, 0); }
		public TerminalNode LShift() { return getToken(SourcePawnParser.LShift, 0); }
		public TerminalNode And() { return getToken(SourcePawnParser.And, 0); }
		public TerminalNode Xor() { return getToken(SourcePawnParser.Xor, 0); }
		public TerminalNode Or() { return getToken(SourcePawnParser.Or, 0); }
		public TerminalNode LT() { return getToken(SourcePawnParser.LT, 0); }
		public TerminalNode LE() { return getToken(SourcePawnParser.LE, 0); }
		public TerminalNode GT() { return getToken(SourcePawnParser.GT, 0); }
		public TerminalNode GE() { return getToken(SourcePawnParser.GE, 0); }
		public TerminalNode AndAnd() { return getToken(SourcePawnParser.AndAnd, 0); }
		public TerminalNode OrOr() { return getToken(SourcePawnParser.OrOr, 0); }
		public TerminalNode QuestionMark() { return getToken(SourcePawnParser.QuestionMark, 0); }
		public TerminalNode Semi() { return getToken(SourcePawnParser.Semi, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(268);
				match(SizeOf);
				setState(269);
				sizeofArg();
				}
				break;
			case 2:
				{
				setState(270);
				_la = _input.LA(1);
				if ( !(_la==Minus || _la==Not) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(271);
				expr(12);
				}
				break;
			case 3:
				{
				setState(272);
				symbol();
				setState(273);
				assignmentOperator();
				setState(274);
				expr(4);
				}
				break;
			case 4:
				{
				setState(276);
				match(LParen);
				setState(277);
				expr(0);
				setState(278);
				match(RParen);
				}
				break;
			case 5:
				{
				setState(280);
				literal();
				}
				break;
			case 6:
				{
				setState(281);
				symbol();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(308);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(284);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(285);
						_la = _input.LA(1);
						if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (Mult - 85)) | (1L << (Div - 85)) | (1L << (Mod - 85)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(286);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(287);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(288);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(289);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(290);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(291);
						_la = _input.LA(1);
						if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (RShiftUnsigned - 70)) | (1L << (RShift - 70)) | (1L << (LShift - 70)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(292);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(293);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(294);
						_la = _input.LA(1);
						if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (And - 88)) | (1L << (Or - 88)) | (1L << (Xor - 88)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(295);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(296);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(297);
						_la = _input.LA(1);
						if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (LE - 75)) | (1L << (GE - 75)) | (1L << (LT - 75)) | (1L << (GT - 75)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(298);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(299);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(300);
						_la = _input.LA(1);
						if ( !(_la==AndAnd || _la==OrOr) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(301);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(302);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(303);
						match(QuestionMark);
						setState(304);
						expr(0);
						setState(305);
						match(Semi);
						setState(306);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode FloatLiteral() { return getToken(SourcePawnParser.FloatLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(SourcePawnParser.IntegerLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SourcePawnParser.StringLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(SourcePawnParser.CharacterLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(SourcePawnParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral))) != 0)) ) {
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(SourcePawnParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(SourcePawnParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(SourcePawnParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(SourcePawnParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(SourcePawnParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(SourcePawnParser.MinusAssign, 0); }
		public TerminalNode RShiftAssign() { return getToken(SourcePawnParser.RShiftAssign, 0); }
		public TerminalNode RShiftUnsignedAssign() { return getToken(SourcePawnParser.RShiftUnsignedAssign, 0); }
		public TerminalNode LShiftAssign() { return getToken(SourcePawnParser.LShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(SourcePawnParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(SourcePawnParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(SourcePawnParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (PlusAssign - 59)) | (1L << (MinusAssign - 59)) | (1L << (StarAssign - 59)) | (1L << (DivAssign - 59)) | (1L << (ModAssign - 59)) | (1L << (XorAssign - 59)) | (1L << (AndAssign - 59)) | (1L << (OrAssign - 59)) | (1L << (RShiftAssign - 59)) | (1L << (RShiftUnsignedAssign - 59)) | (1L << (LShiftAssign - 59)) | (1L << (Assign - 59)))) != 0)) ) {
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

	public static class TypedefContext extends ParserRuleContext {
		public TerminalNode TypeDef() { return getToken(SourcePawnParser.TypeDef, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode Assign() { return getToken(SourcePawnParser.Assign, 0); }
		public FullTypedefExpressionContext fullTypedefExpression() {
			return getRuleContext(FullTypedefExpressionContext.class,0);
		}
		public TypedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterTypedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitTypedef(this);
		}
	}

	public final TypedefContext typedef() throws RecognitionException {
		TypedefContext _localctx = new TypedefContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(TypeDef);
			setState(318);
			symbol();
			setState(319);
			match(Assign);
			setState(320);
			fullTypedefExpression();
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

	public static class TypesetContext extends ParserRuleContext {
		public TerminalNode TypeSet() { return getToken(SourcePawnParser.TypeSet, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode LBrace() { return getToken(SourcePawnParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SourcePawnParser.RBrace, 0); }
		public List<FullTypedefExpressionContext> fullTypedefExpression() {
			return getRuleContexts(FullTypedefExpressionContext.class);
		}
		public FullTypedefExpressionContext fullTypedefExpression(int i) {
			return getRuleContext(FullTypedefExpressionContext.class,i);
		}
		public TerminalNode Semi() { return getToken(SourcePawnParser.Semi, 0); }
		public TypesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterTypeset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitTypeset(this);
		}
	}

	public final TypesetContext typeset() throws RecognitionException {
		TypesetContext _localctx = new TypesetContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(TypeSet);
			setState(323);
			symbol();
			setState(324);
			match(LBrace);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Function || _la==LParen) {
				{
				{
				setState(325);
				fullTypedefExpression();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(331);
			match(RBrace);
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(332);
				match(Semi);
				}
				break;
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

	public static class FullTypedefExpressionContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(SourcePawnParser.LParen, 0); }
		public TypedefExpressionContext typedefExpression() {
			return getRuleContext(TypedefExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SourcePawnParser.RParen, 0); }
		public TerminalNode Semi() { return getToken(SourcePawnParser.Semi, 0); }
		public FullTypedefExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullTypedefExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterFullTypedefExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitFullTypedefExpression(this);
		}
	}

	public final FullTypedefExpressionContext fullTypedefExpression() throws RecognitionException {
		FullTypedefExpressionContext _localctx = new FullTypedefExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fullTypedefExpression);
		try {
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(LParen);
				setState(336);
				typedefExpression();
				setState(337);
				match(RParen);
				setState(339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(338);
					match(Semi);
					}
					break;
				}
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				typedefExpression();
				setState(343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(342);
					match(Semi);
					}
					break;
				}
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

	public static class TypedefExpressionContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(SourcePawnParser.Function, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LParen() { return getToken(SourcePawnParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SourcePawnParser.RParen, 0); }
		public MethodArgsNoAssignContext methodArgsNoAssign() {
			return getRuleContext(MethodArgsNoAssignContext.class,0);
		}
		public TypedefExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterTypedefExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitTypedefExpression(this);
		}
	}

	public final TypedefExpressionContext typedefExpression() throws RecognitionException {
		TypedefExpressionContext _localctx = new TypedefExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typedefExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(Function);
			setState(348);
			type();
			setState(349);
			match(LParen);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Any) | (1L << Bool) | (1L << Char) | (1L << Const) | (1L << Float) | (1L << Handle) | (1L << Int) | (1L << Void))) != 0) || _la==Identifier) {
				{
				setState(350);
				methodArgsNoAssign();
				}
			}

			setState(353);
			match(RParen);
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

	public static class NativeDefinitionContext extends ParserRuleContext {
		public TerminalNode Native() { return getToken(SourcePawnParser.Native, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode LParen() { return getToken(SourcePawnParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SourcePawnParser.RParen, 0); }
		public MethodArgsContext methodArgs() {
			return getRuleContext(MethodArgsContext.class,0);
		}
		public TerminalNode Semi() { return getToken(SourcePawnParser.Semi, 0); }
		public NativeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nativeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterNativeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitNativeDefinition(this);
		}
	}

	public final NativeDefinitionContext nativeDefinition() throws RecognitionException {
		NativeDefinitionContext _localctx = new NativeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nativeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(Native);
			setState(356);
			type();
			setState(357);
			symbol();
			setState(358);
			match(LParen);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Any) | (1L << Bool) | (1L << Char) | (1L << Const) | (1L << Float) | (1L << Handle) | (1L << Int) | (1L << Void))) != 0) || _la==Identifier) {
				{
				setState(359);
				methodArgs();
				}
			}

			setState(362);
			match(RParen);
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(363);
				match(Semi);
				}
				break;
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

	public static class ForwardDefinitionContext extends ParserRuleContext {
		public TerminalNode Forward() { return getToken(SourcePawnParser.Forward, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode LParen() { return getToken(SourcePawnParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SourcePawnParser.RParen, 0); }
		public MethodArgsContext methodArgs() {
			return getRuleContext(MethodArgsContext.class,0);
		}
		public TerminalNode Semi() { return getToken(SourcePawnParser.Semi, 0); }
		public ForwardDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forwardDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterForwardDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitForwardDefinition(this);
		}
	}

	public final ForwardDefinitionContext forwardDefinition() throws RecognitionException {
		ForwardDefinitionContext _localctx = new ForwardDefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forwardDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(Forward);
			setState(367);
			type();
			setState(368);
			symbol();
			setState(369);
			match(LParen);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Any) | (1L << Bool) | (1L << Char) | (1L << Const) | (1L << Float) | (1L << Handle) | (1L << Int) | (1L << Void))) != 0) || _la==Identifier) {
				{
				setState(370);
				methodArgs();
				}
			}

			setState(373);
			match(RParen);
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(374);
				match(Semi);
				}
				break;
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode LParen() { return getToken(SourcePawnParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SourcePawnParser.RParen, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode Stock() { return getToken(SourcePawnParser.Stock, 0); }
		public TerminalNode LBrack() { return getToken(SourcePawnParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(SourcePawnParser.RBrack, 0); }
		public MethodArgsContext methodArgs() {
			return getRuleContext(MethodArgsContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Stock) {
				{
				setState(377);
				match(Stock);
				}
			}

			setState(380);
			type();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBrack) {
				{
				setState(381);
				match(LBrack);
				setState(382);
				match(RBrack);
				}
			}

			setState(385);
			symbol();
			setState(386);
			match(LParen);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Any) | (1L << Bool) | (1L << Char) | (1L << Const) | (1L << Float) | (1L << Handle) | (1L << Int) | (1L << Void))) != 0) || _la==Identifier) {
				{
				setState(387);
				methodArgs();
				}
			}

			setState(390);
			match(RParen);
			setState(391);
			methodBody();
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

	public static class FunctionCallbackContext extends ParserRuleContext {
		public TerminalNode Public() { return getToken(SourcePawnParser.Public, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode LParen() { return getToken(SourcePawnParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SourcePawnParser.RParen, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodArgsContext methodArgs() {
			return getRuleContext(MethodArgsContext.class,0);
		}
		public FunctionCallbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterFunctionCallback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitFunctionCallback(this);
		}
	}

	public final FunctionCallbackContext functionCallback() throws RecognitionException {
		FunctionCallbackContext _localctx = new FunctionCallbackContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionCallback);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(Public);
			setState(394);
			type();
			setState(395);
			symbol();
			setState(396);
			match(LParen);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Any) | (1L << Bool) | (1L << Char) | (1L << Const) | (1L << Float) | (1L << Handle) | (1L << Int) | (1L << Void))) != 0) || _la==Identifier) {
				{
				setState(397);
				methodArgs();
				}
			}

			setState(400);
			match(RParen);
			setState(401);
			methodBody();
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

	public static class MethodArgsContext extends ParserRuleContext {
		public List<MethodArgContext> methodArg() {
			return getRuleContexts(MethodArgContext.class);
		}
		public MethodArgContext methodArg(int i) {
			return getRuleContext(MethodArgContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SourcePawnParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SourcePawnParser.Comma, i);
		}
		public MethodArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterMethodArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitMethodArgs(this);
		}
	}

	public final MethodArgsContext methodArgs() throws RecognitionException {
		MethodArgsContext _localctx = new MethodArgsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_methodArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			methodArg();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(404);
				match(Comma);
				setState(405);
				methodArg();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MethodArgsNoAssignContext extends ParserRuleContext {
		public List<MethodArgDeclContext> methodArgDecl() {
			return getRuleContexts(MethodArgDeclContext.class);
		}
		public MethodArgDeclContext methodArgDecl(int i) {
			return getRuleContext(MethodArgDeclContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SourcePawnParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SourcePawnParser.Comma, i);
		}
		public MethodArgsNoAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgsNoAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterMethodArgsNoAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitMethodArgsNoAssign(this);
		}
	}

	public final MethodArgsNoAssignContext methodArgsNoAssign() throws RecognitionException {
		MethodArgsNoAssignContext _localctx = new MethodArgsNoAssignContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_methodArgsNoAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			methodArgDecl();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(412);
				match(Comma);
				setState(413);
				methodArgDecl();
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MethodArgDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode Const() { return getToken(SourcePawnParser.Const, 0); }
		public TerminalNode LBrack() { return getToken(SourcePawnParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(SourcePawnParser.RBrack, 0); }
		public TerminalNode And() { return getToken(SourcePawnParser.And, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(SourcePawnParser.Ellipsis, 0); }
		public MethodArgDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterMethodArgDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitMethodArgDecl(this);
		}
	}

	public final MethodArgDeclContext methodArgDecl() throws RecognitionException {
		MethodArgDeclContext _localctx = new MethodArgDeclContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodArgDecl);
		int _la;
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(419);
					match(Const);
					}
				}

				setState(422);
				type();
				setState(423);
				symbol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(425);
					match(Const);
					}
				}

				setState(428);
				type();
				setState(429);
				match(LBrack);
				setState(430);
				match(RBrack);
				setState(431);
				symbol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(433);
					match(Const);
					}
				}

				setState(436);
				type();
				setState(437);
				match(And);
				setState(438);
				symbol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(440);
					match(Const);
					}
				}

				setState(443);
				type();
				setState(444);
				symbol();
				setState(445);
				match(LBrack);
				setState(446);
				expr(0);
				setState(447);
				match(RBrack);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(449);
					match(Const);
					}
				}

				setState(452);
				type();
				setState(453);
				match(Ellipsis);
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

	public static class MethodArgAssigmentContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(SourcePawnParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MethodArgAssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgAssigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterMethodArgAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitMethodArgAssigment(this);
		}
	}

	public final MethodArgAssigmentContext methodArgAssigment() throws RecognitionException {
		MethodArgAssigmentContext _localctx = new MethodArgAssigmentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_methodArgAssigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(Assign);
			setState(458);
			expr(0);
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

	public static class MethodArgContext extends ParserRuleContext {
		public MethodArgDeclContext methodArgDecl() {
			return getRuleContext(MethodArgDeclContext.class,0);
		}
		public MethodArgAssigmentContext methodArgAssigment() {
			return getRuleContext(MethodArgAssigmentContext.class,0);
		}
		public MethodArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterMethodArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitMethodArg(this);
		}
	}

	public final MethodArgContext methodArg() throws RecognitionException {
		MethodArgContext _localctx = new MethodArgContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			methodArgDecl();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(461);
				methodArgAssigment();
				}
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

	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(SourcePawnParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SourcePawnParser.RBrace, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SourcePawnParserListener ) ((SourcePawnParserListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(LBrace);
			setState(465);
			match(RBrace);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001l\u01d4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001F\b\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"J\b\u0001\n\u0001\f\u0001M\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"Q\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003Y\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003^\b\u0003\n\u0003\f\u0003a\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003f\b\u0003\u0001\u0003\u0003\u0003i\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003m\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003r\b\u0003\n\u0003\f\u0003u\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003|\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0083"+
		"\b\u0003\n\u0003\f\u0003\u0086\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u008b\b\u0003\u0001\u0003\u0003\u0003\u008e\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0092\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u0098\b\u0003\n\u0003\f\u0003\u009b\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u00a5\b\u0003\n\u0003\f\u0003\u00a8"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00ac\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00b7\b\u0005\u0001\u0005\u0003\u0005"+
		"\u00ba\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00c4\b\u0005\u0001\u0005"+
		"\u0003\u0005\u00c7\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00d5\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0004\u0006\u00d9\b\u0006\u000b\u0006\f\u0006\u00da\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00e4\b\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00e9\b\b\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0003\n\u00ef\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00fc\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0105\b\u000e\n\u000e\f\u000e\u0108"+
		"\t\u000e\u0003\u000e\u010a\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u011b\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u0135\b\u000f\n\u000f\f\u000f\u0138"+
		"\t\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u0147\b\u0013\n\u0013\f\u0013\u014a\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u014e\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0154\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0158\b\u0014\u0003\u0014\u015a\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0160\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0169\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u016d\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0174\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0178\b\u0017\u0001"+
		"\u0018\u0003\u0018\u017b\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0180\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0185"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u018f\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0197"+
		"\b\u001a\n\u001a\f\u001a\u019a\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0005\u001b\u019f\b\u001b\n\u001b\f\u001b\u01a2\t\u001b\u0001\u001c\u0003"+
		"\u001c\u01a5\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01ab\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u01b3\b\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01ba\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01c3\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01c8"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u01cf\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0000"+
		"\u0001\u001e \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\n\u0006\u0000\t\n\u000e"+
		"\u000e\u0018\u0018\u001c\u001c\u001e\u001e33\u0002\u0000TT\\\\\u0001\u0000"+
		"UW\u0001\u0000ST\u0001\u0000FH\u0001\u0000XZ\u0001\u0000KN\u0001\u0000"+
		"OP\u0001\u0000\u0001\u0005\u0002\u0000;E]]\u0200\u0000@\u0001\u0000\u0000"+
		"\u0000\u0002B\u0001\u0000\u0000\u0000\u0004R\u0001\u0000\u0000\u0000\u0006"+
		"\u00ab\u0001\u0000\u0000\u0000\b\u00ad\u0001\u0000\u0000\u0000\n\u00d4"+
		"\u0001\u0000\u0000\u0000\f\u00d8\u0001\u0000\u0000\u0000\u000e\u00e3\u0001"+
		"\u0000\u0000\u0000\u0010\u00e8\u0001\u0000\u0000\u0000\u0012\u00ea\u0001"+
		"\u0000\u0000\u0000\u0014\u00ee\u0001\u0000\u0000\u0000\u0016\u00f0\u0001"+
		"\u0000\u0000\u0000\u0018\u00f2\u0001\u0000\u0000\u0000\u001a\u00fb\u0001"+
		"\u0000\u0000\u0000\u001c\u0109\u0001\u0000\u0000\u0000\u001e\u011a\u0001"+
		"\u0000\u0000\u0000 \u0139\u0001\u0000\u0000\u0000\"\u013b\u0001\u0000"+
		"\u0000\u0000$\u013d\u0001\u0000\u0000\u0000&\u0142\u0001\u0000\u0000\u0000"+
		"(\u0159\u0001\u0000\u0000\u0000*\u015b\u0001\u0000\u0000\u0000,\u0163"+
		"\u0001\u0000\u0000\u0000.\u016e\u0001\u0000\u0000\u00000\u017a\u0001\u0000"+
		"\u0000\u00002\u0189\u0001\u0000\u0000\u00004\u0193\u0001\u0000\u0000\u0000"+
		"6\u019b\u0001\u0000\u0000\u00008\u01c7\u0001\u0000\u0000\u0000:\u01c9"+
		"\u0001\u0000\u0000\u0000<\u01cc\u0001\u0000\u0000\u0000>\u01d0\u0001\u0000"+
		"\u0000\u0000@A\u0005&\u0000\u0000A\u0001\u0001\u0000\u0000\u0000BC\u0005"+
		"\u001f\u0000\u0000CE\u0003\u0012\t\u0000DF\u0003\u0004\u0002\u0000ED\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"GK\u00059\u0000\u0000HJ\u0003\u0006\u0003\u0000IH\u0001\u0000\u0000\u0000"+
		"JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NP\u0005:\u0000"+
		"\u0000OQ\u0005b\u0000\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000Q\u0003\u0001\u0000\u0000\u0000RS\u0005M\u0000\u0000ST\u0003\u0012"+
		"\t\u0000T\u0005\u0001\u0000\u0000\u0000UV\u0003\u0000\u0000\u0000VX\u0005"+
		" \u0000\u0000WY\u0005[\u0000\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0003\u0012\t\u0000[_\u00055"+
		"\u0000\u0000\\^\u00034\u001a\u0000]\\\u0001\u0000\u0000\u0000^a\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000be\u00056\u0000\u0000"+
		"cd\u0005]\u0000\u0000df\u0003\u0012\t\u0000ec\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000gi\u0005b\u0000\u0000"+
		"hg\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u00ac\u0001\u0000"+
		"\u0000\u0000jl\u0003\u0000\u0000\u0000km\u0005[\u0000\u0000lk\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0003"+
		"\u0012\t\u0000os\u00055\u0000\u0000pr\u00034\u001a\u0000qp\u0001\u0000"+
		"\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"vw\u00056\u0000\u0000wx\u0003>\u001f\u0000x\u00ac\u0001\u0000\u0000\u0000"+
		"y{\u0003\u0000\u0000\u0000z|\u0005)\u0000\u0000{z\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005 \u0000\u0000"+
		"~\u007f\u0003\u0014\n\u0000\u007f\u0080\u0003\u0012\t\u0000\u0080\u0084"+
		"\u00055\u0000\u0000\u0081\u0083\u00034\u001a\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u00056\u0000"+
		"\u0000\u0088\u0089\u0005]\u0000\u0000\u0089\u008b\u0003\u0012\t\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008e\u0005b\u0000\u0000\u008d"+
		"\u008c\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e"+
		"\u00ac\u0001\u0000\u0000\u0000\u008f\u0091\u0003\u0000\u0000\u0000\u0090"+
		"\u0092\u0005)\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0003\u0014\n\u0000\u0094\u0095\u0003\u0012\t\u0000\u0095\u0099\u0005"+
		"5\u0000\u0000\u0096\u0098\u00034\u001a\u0000\u0097\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009d\u00056\u0000\u0000"+
		"\u009d\u009e\u0003>\u001f\u0000\u009e\u00ac\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0005%\u0000\u0000\u00a0\u00a1\u0003\u0014\n\u0000\u00a1\u00a2"+
		"\u0003\u0012\t\u0000\u00a2\u00a6\u00059\u0000\u0000\u00a3\u00a5\u0003"+
		"\b\u0004\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0005:\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000"+
		"\u0000\u00abU\u0001\u0000\u0000\u0000\u00abj\u0001\u0000\u0000\u0000\u00ab"+
		"y\u0001\u0000\u0000\u0000\u00ab\u008f\u0001\u0000\u0000\u0000\u00ab\u009f"+
		"\u0001\u0000\u0000\u0000\u00ac\u0007\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0003\u0000\u0000\u0000\u00ae\u00af\u0003\n\u0005\u0000\u00af\t\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0005 \u0000\u0000\u00b1\u00b2\u0003\u0012"+
		"\t\u0000\u00b2\u00b3\u00055\u0000\u0000\u00b3\u00b6\u00056\u0000\u0000"+
		"\u00b4\u00b5\u0005]\u0000\u0000\u00b5\u00b7\u0003\u0012\t\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b8\u00ba\u0005b\u0000\u0000\u00b9\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00d5"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005 \u0000\u0000\u00bc\u00bd\u0003"+
		"\u0012\t\u0000\u00bd\u00be\u00055\u0000\u0000\u00be\u00bf\u0003\u0014"+
		"\n\u0000\u00bf\u00c0\u0003\u0012\t\u0000\u00c0\u00c3\u00056\u0000\u0000"+
		"\u00c1\u00c2\u0005]\u0000\u0000\u00c2\u00c4\u0003\u0012\t\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c7\u0005b\u0000\u0000\u00c6\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003\u0012\t\u0000\u00c9\u00ca\u0005"+
		"5\u0000\u0000\u00ca\u00cb\u00056\u0000\u0000\u00cb\u00cc\u0003>\u001f"+
		"\u0000\u00cc\u00d5\u0001\u0000\u0000\u0000\u00cd\u00ce\u0003\u0012\t\u0000"+
		"\u00ce\u00cf\u00055\u0000\u0000\u00cf\u00d0\u0003\u0014\n\u0000\u00d0"+
		"\u00d1\u0003\u0012\t\u0000\u00d1\u00d2\u00056\u0000\u0000\u00d2\u00d3"+
		"\u0003>\u001f\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00b0\u0001"+
		"\u0000\u0000\u0000\u00d4\u00bb\u0001\u0000\u0000\u0000\u00d4\u00c8\u0001"+
		"\u0000\u0000\u0000\u00d4\u00cd\u0001\u0000\u0000\u0000\u00d5\u000b\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d9\u0003\u000e\u0007\u0000\u00d7\u00d9\u0003"+
		"\u0010\b\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0005\u0000\u0000\u0001\u00dd\r\u0001\u0000\u0000"+
		"\u0000\u00de\u00e4\u0003$\u0012\u0000\u00df\u00e4\u0003&\u0013\u0000\u00e0"+
		"\u00e4\u0003,\u0016\u0000\u00e1\u00e4\u0003.\u0017\u0000\u00e2\u00e4\u0003"+
		"\u0002\u0001\u0000\u00e3\u00de\u0001\u0000\u0000\u0000\u00e3\u00df\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u000f\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e9\u00030\u0018\u0000\u00e6\u00e9\u00032\u0019"+
		"\u0000\u00e7\u00e9\u0005b\u0000\u0000\u00e8\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e9\u0011\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005l\u0000\u0000\u00eb"+
		"\u0013\u0001\u0000\u0000\u0000\u00ec\u00ef\u0003\u0016\u000b\u0000\u00ed"+
		"\u00ef\u0003\u0012\t\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ef\u0015\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0007\u0000\u0000\u0000\u00f1\u0017\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0003\u001e\u000f\u0000\u00f3\u00f4\u0005^\u0000\u0000\u00f4\u00f5\u0003"+
		"\u001e\u000f\u0000\u00f5\u0019\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005"+
		"5\u0000\u0000\u00f7\u00f8\u0003\u001a\r\u0000\u00f8\u00f9\u00056\u0000"+
		"\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00fc\u0003\u0012\t\u0000"+
		"\u00fb\u00f6\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fc\u001b\u0001\u0000\u0000\u0000\u00fd\u00fe\u00055\u0000\u0000\u00fe"+
		"\u00ff\u0003\u001c\u000e\u0000\u00ff\u0100\u00056\u0000\u0000\u0100\u010a"+
		"\u0001\u0000\u0000\u0000\u0101\u0106\u0003\u0012\t\u0000\u0102\u0103\u0005"+
		"7\u0000\u0000\u0103\u0105\u00058\u0000\u0000\u0104\u0102\u0001\u0000\u0000"+
		"\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000"+
		"\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u00fd\u0001\u0000\u0000"+
		"\u0000\u0109\u0101\u0001\u0000\u0000\u0000\u010a\u001d\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0006\u000f\uffff\uffff\u0000\u010c\u010d\u0005(\u0000"+
		"\u0000\u010d\u011b\u0003\u001c\u000e\u0000\u010e\u010f\u0007\u0001\u0000"+
		"\u0000\u010f\u011b\u0003\u001e\u000f\f\u0110\u0111\u0003\u0012\t\u0000"+
		"\u0111\u0112\u0003\"\u0011\u0000\u0112\u0113\u0003\u001e\u000f\u0004\u0113"+
		"\u011b\u0001\u0000\u0000\u0000\u0114\u0115\u00055\u0000\u0000\u0115\u0116"+
		"\u0003\u001e\u000f\u0000\u0116\u0117\u00056\u0000\u0000\u0117\u011b\u0001"+
		"\u0000\u0000\u0000\u0118\u011b\u0003 \u0010\u0000\u0119\u011b\u0003\u0012"+
		"\t\u0000\u011a\u010b\u0001\u0000\u0000\u0000\u011a\u010e\u0001\u0000\u0000"+
		"\u0000\u011a\u0110\u0001\u0000\u0000\u0000\u011a\u0114\u0001\u0000\u0000"+
		"\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u0119\u0001\u0000\u0000"+
		"\u0000\u011b\u0136\u0001\u0000\u0000\u0000\u011c\u011d\n\u000b\u0000\u0000"+
		"\u011d\u011e\u0007\u0002\u0000\u0000\u011e\u0135\u0003\u001e\u000f\f\u011f"+
		"\u0120\n\n\u0000\u0000\u0120\u0121\u0007\u0003\u0000\u0000\u0121\u0135"+
		"\u0003\u001e\u000f\u000b\u0122\u0123\n\t\u0000\u0000\u0123\u0124\u0007"+
		"\u0004\u0000\u0000\u0124\u0135\u0003\u001e\u000f\n\u0125\u0126\n\b\u0000"+
		"\u0000\u0126\u0127\u0007\u0005\u0000\u0000\u0127\u0135\u0003\u001e\u000f"+
		"\t\u0128\u0129\n\u0007\u0000\u0000\u0129\u012a\u0007\u0006\u0000\u0000"+
		"\u012a\u0135\u0003\u001e\u000f\b\u012b\u012c\n\u0006\u0000\u0000\u012c"+
		"\u012d\u0007\u0007\u0000\u0000\u012d\u0135\u0003\u001e\u000f\u0007\u012e"+
		"\u012f\n\u0005\u0000\u0000\u012f\u0130\u0005_\u0000\u0000\u0130\u0131"+
		"\u0003\u001e\u000f\u0000\u0131\u0132\u0005b\u0000\u0000\u0132\u0133\u0003"+
		"\u001e\u000f\u0006\u0133\u0135\u0001\u0000\u0000\u0000\u0134\u011c\u0001"+
		"\u0000\u0000\u0000\u0134\u011f\u0001\u0000\u0000\u0000\u0134\u0122\u0001"+
		"\u0000\u0000\u0000\u0134\u0125\u0001\u0000\u0000\u0000\u0134\u0128\u0001"+
		"\u0000\u0000\u0000\u0134\u012b\u0001\u0000\u0000\u0000\u0134\u012e\u0001"+
		"\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u001f\u0001"+
		"\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013a\u0007"+
		"\b\u0000\u0000\u013a!\u0001\u0000\u0000\u0000\u013b\u013c\u0007\t\u0000"+
		"\u0000\u013c#\u0001\u0000\u0000\u0000\u013d\u013e\u00050\u0000\u0000\u013e"+
		"\u013f\u0003\u0012\t\u0000\u013f\u0140\u0005]\u0000\u0000\u0140\u0141"+
		"\u0003(\u0014\u0000\u0141%\u0001\u0000\u0000\u0000\u0142\u0143\u00051"+
		"\u0000\u0000\u0143\u0144\u0003\u0012\t\u0000\u0144\u0148\u00059\u0000"+
		"\u0000\u0145\u0147\u0003(\u0014\u0000\u0146\u0145\u0001\u0000\u0000\u0000"+
		"\u0147\u014a\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014b\u0001\u0000\u0000\u0000"+
		"\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u014d\u0005:\u0000\u0000\u014c"+
		"\u014e\u0005b\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0001\u0000\u0000\u0000\u014e\'\u0001\u0000\u0000\u0000\u014f\u0150\u0005"+
		"5\u0000\u0000\u0150\u0151\u0003*\u0015\u0000\u0151\u0153\u00056\u0000"+
		"\u0000\u0152\u0154\u0005b\u0000\u0000\u0153\u0152\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u015a\u0001\u0000\u0000\u0000"+
		"\u0155\u0157\u0003*\u0015\u0000\u0156\u0158\u0005b\u0000\u0000\u0157\u0156"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015a"+
		"\u0001\u0000\u0000\u0000\u0159\u014f\u0001\u0000\u0000\u0000\u0159\u0155"+
		"\u0001\u0000\u0000\u0000\u015a)\u0001\u0000\u0000\u0000\u015b\u015c\u0005"+
		"\u001a\u0000\u0000\u015c\u015d\u0003\u0014\n\u0000\u015d\u015f\u00055"+
		"\u0000\u0000\u015e\u0160\u00036\u001b\u0000\u015f\u015e\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000"+
		"\u0000\u0161\u0162\u00056\u0000\u0000\u0162+\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0005 \u0000\u0000\u0164\u0165\u0003\u0014\n\u0000\u0165\u0166"+
		"\u0003\u0012\t\u0000\u0166\u0168\u00055\u0000\u0000\u0167\u0169\u0003"+
		"4\u001a\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000"+
		"\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016c\u00056\u0000"+
		"\u0000\u016b\u016d\u0005b\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000"+
		"\u016c\u016d\u0001\u0000\u0000\u0000\u016d-\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u0005\u0019\u0000\u0000\u016f\u0170\u0003\u0014\n\u0000\u0170\u0171"+
		"\u0003\u0012\t\u0000\u0171\u0173\u00055\u0000\u0000\u0172\u0174\u0003"+
		"4\u001a\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0177\u00056\u0000"+
		"\u0000\u0176\u0178\u0005b\u0000\u0000\u0177\u0176\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0001\u0000\u0000\u0000\u0178/\u0001\u0000\u0000\u0000\u0179"+
		"\u017b\u0005+\u0000\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017a\u017b"+
		"\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017f"+
		"\u0003\u0014\n\u0000\u017d\u017e\u00057\u0000\u0000\u017e\u0180\u0005"+
		"8\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0003\u0012"+
		"\t\u0000\u0182\u0184\u00055\u0000\u0000\u0183\u0185\u00034\u001a\u0000"+
		"\u0184\u0183\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000"+
		"\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u00056\u0000\u0000\u0187"+
		"\u0188\u0003>\u001f\u0000\u01881\u0001\u0000\u0000\u0000\u0189\u018a\u0005"+
		"&\u0000\u0000\u018a\u018b\u0003\u0014\n\u0000\u018b\u018c\u0003\u0012"+
		"\t\u0000\u018c\u018e\u00055\u0000\u0000\u018d\u018f\u00034\u001a\u0000"+
		"\u018e\u018d\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u00056\u0000\u0000\u0191"+
		"\u0192\u0003>\u001f\u0000\u01923\u0001\u0000\u0000\u0000\u0193\u0198\u0003"+
		"<\u001e\u0000\u0194\u0195\u0005^\u0000\u0000\u0195\u0197\u0003<\u001e"+
		"\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000"+
		"\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000"+
		"\u0000\u01995\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000"+
		"\u019b\u01a0\u00038\u001c\u0000\u019c\u019d\u0005^\u0000\u0000\u019d\u019f"+
		"\u00038\u001c\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019f\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a17\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a5\u0005\u000f\u0000\u0000\u01a4\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a7\u0003\u0014\n\u0000\u01a7\u01a8\u0003\u0012\t"+
		"\u0000\u01a8\u01c8\u0001\u0000\u0000\u0000\u01a9\u01ab\u0005\u000f\u0000"+
		"\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0003\u0014\n\u0000"+
		"\u01ad\u01ae\u00057\u0000\u0000\u01ae\u01af\u00058\u0000\u0000\u01af\u01b0"+
		"\u0003\u0012\t\u0000\u01b0\u01c8\u0001\u0000\u0000\u0000\u01b1\u01b3\u0005"+
		"\u000f\u0000\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b5\u0003"+
		"\u0014\n\u0000\u01b5\u01b6\u0005X\u0000\u0000\u01b6\u01b7\u0003\u0012"+
		"\t\u0000\u01b7\u01c8\u0001\u0000\u0000\u0000\u01b8\u01ba\u0005\u000f\u0000"+
		"\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bc\u0003\u0014\n\u0000"+
		"\u01bc\u01bd\u0003\u0012\t\u0000\u01bd\u01be\u00057\u0000\u0000\u01be"+
		"\u01bf\u0003\u001e\u000f\u0000\u01bf\u01c0\u00058\u0000\u0000\u01c0\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c3\u0005\u000f\u0000\u0000\u01c2\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c4\u01c5\u0003\u0014\n\u0000\u01c5\u01c6\u0005"+
		"c\u0000\u0000\u01c6\u01c8\u0001\u0000\u0000\u0000\u01c7\u01a4\u0001\u0000"+
		"\u0000\u0000\u01c7\u01aa\u0001\u0000\u0000\u0000\u01c7\u01b2\u0001\u0000"+
		"\u0000\u0000\u01c7\u01b9\u0001\u0000\u0000\u0000\u01c7\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c89\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005]\u0000\u0000"+
		"\u01ca\u01cb\u0003\u001e\u000f\u0000\u01cb;\u0001\u0000\u0000\u0000\u01cc"+
		"\u01ce\u00038\u001c\u0000\u01cd\u01cf\u0003:\u001d\u0000\u01ce\u01cd\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf=\u0001\u0000"+
		"\u0000\u0000\u01d0\u01d1\u00059\u0000\u0000\u01d1\u01d2\u0005:\u0000\u0000"+
		"\u01d2?\u0001\u0000\u0000\u00008EKPX_ehls{\u0084\u008a\u008d\u0091\u0099"+
		"\u00a6\u00ab\u00b6\u00b9\u00c3\u00c6\u00d4\u00d8\u00da\u00e3\u00e8\u00ee"+
		"\u00fb\u0106\u0109\u011a\u0134\u0136\u0148\u014d\u0153\u0157\u0159\u015f"+
		"\u0168\u016c\u0173\u0177\u017a\u017f\u0184\u018e\u0198\u01a0\u01a4\u01aa"+
		"\u01b2\u01b9\u01c2\u01c7\u01ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}