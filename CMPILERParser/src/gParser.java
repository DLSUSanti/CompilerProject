// Generated from D:/GitHub/CompilerProject/CMPILERParser\g.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CHAR_LITERAL=1, STRING_LITERAL=2, INT_LITERAL=3, FLOAT_LITERAL=4, IF=5, 
		ELSE=6, ELSEIF=7, FOR=8, WHILE=9, DO=10, INTEGER=11, FLOATING_POINT=12, 
		CHARACTER=13, STRING=14, BOOLEAN=15, VOID=16, FUNCTION=17, CALL=18, PRINT=19, 
		SCAN=20, MAIN=21, RETURN=22, TRUE=23, FALSE=24, PUBLIC=25, PRIVATE=26, 
		STATIC=27, INSTANTIATED=28, PROTECTED=29, GLOBAL=30, IDENTIFIER=31, LBRACKET=32, 
		RBRACKET=33, LPARENTHESIS=34, RPARENTHESIS=35, LBRACE=36, RBRACE=37, COMMA=38, 
		SEMICOLON=39, DOT=40, QUOTE_S=41, QUOTE_D=42, PLUS_PLUS=43, MINUS_MINUS=44, 
		PLUS=45, MINUS=46, MUL=47, DIV=48, MOD=49, EQUALS=50, PLUS_EQUALS=51, 
		MIN_EQUALS=52, MUL_EQUALS=53, DIV_EQUALS=54, LESS_THAN=55, LESS_THAN_EQUALS=56, 
		GREATER_THAN=57, GREATER_THAN_EQUALS=58, EQUALS_EQUALS=59, NOT_EQUALS=60, 
		AND=61, OR=62, NOT=63, DIGIT=64, LETTER=65, WS=66;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_function = 2, RULE_call = 3, RULE_returnstatement = 4, 
		RULE_globaldelcaration = 5, RULE_declaration = 6, RULE_singledeclaration = 7, 
		RULE_arraydeclaration = 8, RULE_booleandeclaration = 9, RULE_intdeclaration = 10, 
		RULE_intarrdeclaration = 11, RULE_floatdeclaration = 12, RULE_floatarrdeclaration = 13, 
		RULE_chardeclaration = 14, RULE_chararrdeclaration = 15, RULE_forcedintdec = 16, 
		RULE_assignment = 17, RULE_condition = 18, RULE_ifstatement = 19, RULE_elseifstatement = 20, 
		RULE_elsestatement = 21, RULE_loop = 22, RULE_loopfor = 23, RULE_loopwhile = 24, 
		RULE_loopdowhile = 25, RULE_operation = 26, RULE_opr = 27, RULE_addopr = 28, 
		RULE_multopr = 29, RULE_terminalopr = 30, RULE_shortopr = 31, RULE_print = 32, 
		RULE_printblock = 33, RULE_stringcontent = 34, RULE_scan = 35, RULE_nestedcondition = 36, 
		RULE_booleanexp = 37, RULE_logic = 38, RULE_relation = 39, RULE_booleanvalue = 40, 
		RULE_vararrname = 41, RULE_identifier = 42, RULE_charliteral = 43, RULE_stringliteral = 44, 
		RULE_intliteral = 45, RULE_floatliteral = 46, RULE_block = 47, RULE_statement = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "function", "call", "returnstatement", "globaldelcaration", 
			"declaration", "singledeclaration", "arraydeclaration", "booleandeclaration", 
			"intdeclaration", "intarrdeclaration", "floatdeclaration", "floatarrdeclaration", 
			"chardeclaration", "chararrdeclaration", "forcedintdec", "assignment", 
			"condition", "ifstatement", "elseifstatement", "elsestatement", "loop", 
			"loopfor", "loopwhile", "loopdowhile", "operation", "opr", "addopr", 
			"multopr", "terminalopr", "shortopr", "print", "printblock", "stringcontent", 
			"scan", "nestedcondition", "booleanexp", "logic", "relation", "booleanvalue", 
			"vararrname", "identifier", "charliteral", "stringliteral", "intliteral", 
			"floatliteral", "block", "statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'si'", "'autre'", "'autre si'", "'pour'", 
			"'tandis que'", "'faire'", "'nombre '", "'decimale '", "'lettre '", "'mot '", 
			"'booleen '", "'vide '", "'fonction '", "'appel '", "'imprimer'", "'analyse'", 
			"'essentiel'", "'rappel '", "'vrai'", "'faux'", "'publique '", "'privee '", 
			"'statique '", "'instancie '", "'protege '", "'global '", null, "'['", 
			"']'", "'('", "')'", "'{'", "'}'", "','", "';'", "'.'", "'''", "'\"'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", 
			"'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CHAR_LITERAL", "STRING_LITERAL", "INT_LITERAL", "FLOAT_LITERAL", 
			"IF", "ELSE", "ELSEIF", "FOR", "WHILE", "DO", "INTEGER", "FLOATING_POINT", 
			"CHARACTER", "STRING", "BOOLEAN", "VOID", "FUNCTION", "CALL", "PRINT", 
			"SCAN", "MAIN", "RETURN", "TRUE", "FALSE", "PUBLIC", "PRIVATE", "STATIC", 
			"INSTANTIATED", "PROTECTED", "GLOBAL", "IDENTIFIER", "LBRACKET", "RBRACKET", 
			"LPARENTHESIS", "RPARENTHESIS", "LBRACE", "RBRACE", "COMMA", "SEMICOLON", 
			"DOT", "QUOTE_S", "QUOTE_D", "PLUS_PLUS", "MINUS_MINUS", "PLUS", "MINUS", 
			"MUL", "DIV", "MOD", "EQUALS", "PLUS_EQUALS", "MIN_EQUALS", "MUL_EQUALS", 
			"DIV_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", "GREATER_THAN", "GREATER_THAN_EQUALS", 
			"EQUALS_EQUALS", "NOT_EQUALS", "AND", "OR", "NOT", "DIGIT", "LETTER", 
			"WS"
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
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(gParser.EOF, 0); }
		public List<GlobaldelcarationContext> globaldelcaration() {
			return getRuleContexts(GlobaldelcarationContext.class);
		}
		public GlobaldelcarationContext globaldelcaration(int i) {
			return getRuleContext(GlobaldelcarationContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBAL) {
				{
				{
				setState(98);
				globaldelcaration();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(104);
				function();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			main();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(111);
				function();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(gParser.MAIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(MAIN);
			setState(120);
			block();
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

	public static class FunctionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode FUNCTION() { return getToken(gParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPARENTHESIS() { return getToken(gParser.LPARENTHESIS, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(gParser.RPARENTHESIS, 0); }
		public TerminalNode LBRACE() { return getToken(gParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(gParser.RBRACE, 0); }
		public TerminalNode INTEGER() { return getToken(gParser.INTEGER, 0); }
		public TerminalNode FLOATING_POINT() { return getToken(gParser.FLOATING_POINT, 0); }
		public TerminalNode CHARACTER() { return getToken(gParser.CHARACTER, 0); }
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public TerminalNode VOID() { return getToken(gParser.VOID, 0); }
		public TerminalNode LBRACKET() { return getToken(gParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(gParser.RBRACKET, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnstatementContext returnstatement() {
			return getRuleContext(ReturnstatementContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(FUNCTION);
			setState(123);
			((FunctionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << VOID))) != 0)) ) {
				((FunctionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(124);
				match(LBRACKET);
				setState(125);
				match(RBRACKET);
				}
			}

			setState(128);
			identifier();
			setState(129);
			match(LPARENTHESIS);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << BOOLEAN))) != 0)) {
				{
				setState(130);
				declaration();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(131);
					match(COMMA);
					setState(132);
					declaration();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(140);
			match(RPARENTHESIS);
			setState(141);
			match(LBRACE);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << BOOLEAN) | (1L << CALL) | (1L << PRINT) | (1L << SCAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(142);
				statement();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(148);
				returnstatement();
				}
			}

			setState(151);
			match(RBRACE);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(gParser.CALL, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPARENTHESIS() { return getToken(gParser.LPARENTHESIS, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(gParser.RPARENTHESIS, 0); }
		public List<OprContext> opr() {
			return getRuleContexts(OprContext.class);
		}
		public OprContext opr(int i) {
			return getRuleContext(OprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(CALL);
			setState(154);
			identifier();
			setState(155);
			match(LPARENTHESIS);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CALL) | (1L << IDENTIFIER) | (1L << LPARENTHESIS))) != 0)) {
				{
				setState(158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(156);
					identifier();
					}
					break;
				case 2:
					{
					setState(157);
					opr();
					}
					break;
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(160);
					match(COMMA);
					setState(163);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(161);
						identifier();
						}
						break;
					case 2:
						{
						setState(162);
						opr();
						}
						break;
					}
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(172);
			match(RPARENTHESIS);
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

	public static class ReturnstatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(gParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntliteralContext intliteral() {
			return getRuleContext(IntliteralContext.class,0);
		}
		public FloatliteralContext floatliteral() {
			return getRuleContext(FloatliteralContext.class,0);
		}
		public CharliteralContext charliteral() {
			return getRuleContext(CharliteralContext.class,0);
		}
		public StringliteralContext stringliteral() {
			return getRuleContext(StringliteralContext.class,0);
		}
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public ReturnstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterReturnstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitReturnstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitReturnstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstatementContext returnstatement() throws RecognitionException {
		ReturnstatementContext _localctx = new ReturnstatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(RETURN);
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(175);
				identifier();
				}
				break;
			case 2:
				{
				setState(176);
				intliteral();
				}
				break;
			case 3:
				{
				setState(177);
				floatliteral();
				}
				break;
			case 4:
				{
				setState(178);
				charliteral();
				}
				break;
			case 5:
				{
				setState(179);
				stringliteral();
				}
				break;
			case 6:
				{
				setState(180);
				booleanexp();
				}
				break;
			case 7:
				{
				setState(181);
				opr();
				}
				break;
			}
			setState(184);
			match(SEMICOLON);
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

	public static class GlobaldelcarationContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(gParser.GLOBAL, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public GlobaldelcarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globaldelcaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterGlobaldelcaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitGlobaldelcaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitGlobaldelcaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobaldelcarationContext globaldelcaration() throws RecognitionException {
		GlobaldelcarationContext _localctx = new GlobaldelcarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_globaldelcaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(GLOBAL);
			setState(187);
			declaration();
			setState(188);
			match(SEMICOLON);
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
		public SingledeclarationContext singledeclaration() {
			return getRuleContext(SingledeclarationContext.class,0);
		}
		public ArraydeclarationContext arraydeclaration() {
			return getRuleContext(ArraydeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				singledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				arraydeclaration();
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

	public static class SingledeclarationContext extends ParserRuleContext {
		public IntdeclarationContext intdeclaration() {
			return getRuleContext(IntdeclarationContext.class,0);
		}
		public FloatdeclarationContext floatdeclaration() {
			return getRuleContext(FloatdeclarationContext.class,0);
		}
		public ChardeclarationContext chardeclaration() {
			return getRuleContext(ChardeclarationContext.class,0);
		}
		public BooleandeclarationContext booleandeclaration() {
			return getRuleContext(BooleandeclarationContext.class,0);
		}
		public SingledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSingledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSingledeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSingledeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingledeclarationContext singledeclaration() throws RecognitionException {
		SingledeclarationContext _localctx = new SingledeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_singledeclaration);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				intdeclaration();
				}
				break;
			case FLOATING_POINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				floatdeclaration();
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				chardeclaration();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				booleandeclaration();
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

	public static class ArraydeclarationContext extends ParserRuleContext {
		public IntarrdeclarationContext intarrdeclaration() {
			return getRuleContext(IntarrdeclarationContext.class,0);
		}
		public FloatarrdeclarationContext floatarrdeclaration() {
			return getRuleContext(FloatarrdeclarationContext.class,0);
		}
		public ChararrdeclarationContext chararrdeclaration() {
			return getRuleContext(ChararrdeclarationContext.class,0);
		}
		public ArraydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraydeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterArraydeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitArraydeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitArraydeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraydeclarationContext arraydeclaration() throws RecognitionException {
		ArraydeclarationContext _localctx = new ArraydeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arraydeclaration);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				intarrdeclaration();
				}
				break;
			case FLOATING_POINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				floatarrdeclaration();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				chararrdeclaration();
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

	public static class BooleandeclarationContext extends ParserRuleContext {
		public IdentifierContext id;
		public BooleanexpContext val;
		public TerminalNode BOOLEAN() { return getToken(gParser.BOOLEAN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(gParser.EQUALS, 0); }
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public BooleandeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleandeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBooleandeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBooleandeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBooleandeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleandeclarationContext booleandeclaration() throws RecognitionException {
		BooleandeclarationContext _localctx = new BooleandeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_booleandeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(BOOLEAN);
			setState(206);
			((BooleandeclarationContext)_localctx).id = identifier();
			{
			setState(207);
			match(EQUALS);
			setState(208);
			((BooleandeclarationContext)_localctx).val = booleanexp();
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

	public static class IntdeclarationContext extends ParserRuleContext {
		public IdentifierContext id;
		public TerminalNode INTEGER() { return getToken(gParser.INTEGER, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(gParser.EQUALS, 0); }
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public IntdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIntdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIntdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIntdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntdeclarationContext intdeclaration() throws RecognitionException {
		IntdeclarationContext _localctx = new IntdeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_intdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(INTEGER);
			setState(211);
			((IntdeclarationContext)_localctx).id = identifier();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(212);
				match(EQUALS);
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(213);
					opr();
					}
					break;
				case 2:
					{
					setState(214);
					call();
					}
					break;
				case 3:
					{
					setState(215);
					identifier();
					}
					break;
				}
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

	public static class IntarrdeclarationContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(gParser.INTEGER, 0); }
		public VararrnameContext vararrname() {
			return getRuleContext(VararrnameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(gParser.EQUALS, 0); }
		public TerminalNode LBRACE() { return getToken(gParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(gParser.RBRACE, 0); }
		public List<OprContext> opr() {
			return getRuleContexts(OprContext.class);
		}
		public OprContext opr(int i) {
			return getRuleContext(OprContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public IntarrdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intarrdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIntarrdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIntarrdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIntarrdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntarrdeclarationContext intarrdeclaration() throws RecognitionException {
		IntarrdeclarationContext _localctx = new IntarrdeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_intarrdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(INTEGER);
			setState(221);
			vararrname();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(222);
				match(EQUALS);
				setState(223);
				match(LBRACE);
				setState(227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(224);
					opr();
					}
					break;
				case 2:
					{
					setState(225);
					call();
					}
					break;
				case 3:
					{
					setState(226);
					identifier();
					}
					break;
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(229);
					match(COMMA);
					setState(233);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(230);
						opr();
						}
						break;
					case 2:
						{
						setState(231);
						call();
						}
						break;
					case 3:
						{
						setState(232);
						identifier();
						}
						break;
					}
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
				match(RBRACE);
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

	public static class FloatdeclarationContext extends ParserRuleContext {
		public IdentifierContext id;
		public TerminalNode FLOATING_POINT() { return getToken(gParser.FLOATING_POINT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(gParser.EQUALS, 0); }
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public FloatdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFloatdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFloatdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFloatdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatdeclarationContext floatdeclaration() throws RecognitionException {
		FloatdeclarationContext _localctx = new FloatdeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_floatdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(FLOATING_POINT);
			setState(245);
			((FloatdeclarationContext)_localctx).id = identifier();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(246);
				match(EQUALS);
				setState(250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(247);
					opr();
					}
					break;
				case 2:
					{
					setState(248);
					call();
					}
					break;
				case 3:
					{
					setState(249);
					identifier();
					}
					break;
				}
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

	public static class FloatarrdeclarationContext extends ParserRuleContext {
		public TerminalNode FLOATING_POINT() { return getToken(gParser.FLOATING_POINT, 0); }
		public VararrnameContext vararrname() {
			return getRuleContext(VararrnameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(gParser.EQUALS, 0); }
		public TerminalNode LBRACE() { return getToken(gParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(gParser.RBRACE, 0); }
		public List<OprContext> opr() {
			return getRuleContexts(OprContext.class);
		}
		public OprContext opr(int i) {
			return getRuleContext(OprContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public FloatarrdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatarrdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFloatarrdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFloatarrdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFloatarrdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatarrdeclarationContext floatarrdeclaration() throws RecognitionException {
		FloatarrdeclarationContext _localctx = new FloatarrdeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_floatarrdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(FLOATING_POINT);
			setState(255);
			vararrname();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(256);
				match(EQUALS);
				setState(257);
				match(LBRACE);
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(258);
					opr();
					}
					break;
				case 2:
					{
					setState(259);
					call();
					}
					break;
				case 3:
					{
					setState(260);
					identifier();
					}
					break;
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(263);
					match(COMMA);
					setState(267);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(264);
						opr();
						}
						break;
					case 2:
						{
						setState(265);
						call();
						}
						break;
					case 3:
						{
						setState(266);
						identifier();
						}
						break;
					}
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(274);
				match(RBRACE);
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

	public static class ChardeclarationContext extends ParserRuleContext {
		public IdentifierContext id;
		public TerminalNode CHARACTER() { return getToken(gParser.CHARACTER, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(gParser.EQUALS, 0); }
		public CharliteralContext charliteral() {
			return getRuleContext(CharliteralContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ChardeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterChardeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitChardeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitChardeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChardeclarationContext chardeclaration() throws RecognitionException {
		ChardeclarationContext _localctx = new ChardeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_chardeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(CHARACTER);
			setState(279);
			((ChardeclarationContext)_localctx).id = identifier();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(280);
				match(EQUALS);
				setState(284);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR_LITERAL:
					{
					setState(281);
					charliteral();
					}
					break;
				case CALL:
					{
					setState(282);
					call();
					}
					break;
				case IDENTIFIER:
					{
					setState(283);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class ChararrdeclarationContext extends ParserRuleContext {
		public IdentifierContext id;
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(gParser.EQUALS, 0); }
		public StringliteralContext stringliteral() {
			return getRuleContext(StringliteralContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ChararrdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chararrdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterChararrdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitChararrdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitChararrdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChararrdeclarationContext chararrdeclaration() throws RecognitionException {
		ChararrdeclarationContext _localctx = new ChararrdeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_chararrdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(STRING);
			setState(289);
			((ChararrdeclarationContext)_localctx).id = identifier();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(290);
				match(EQUALS);
				setState(294);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
					{
					setState(291);
					stringliteral();
					}
					break;
				case CALL:
					{
					setState(292);
					call();
					}
					break;
				case IDENTIFIER:
					{
					setState(293);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class ForcedintdecContext extends ParserRuleContext {
		public IdentifierContext id;
		public TerminalNode INTEGER() { return getToken(gParser.INTEGER, 0); }
		public TerminalNode EQUALS() { return getToken(gParser.EQUALS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ForcedintdecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forcedintdec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterForcedintdec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitForcedintdec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitForcedintdec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForcedintdecContext forcedintdec() throws RecognitionException {
		ForcedintdecContext _localctx = new ForcedintdecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forcedintdec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(INTEGER);
			setState(299);
			((ForcedintdecContext)_localctx).id = identifier();
			setState(300);
			match(EQUALS);
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(301);
				opr();
				}
				break;
			case 2:
				{
				setState(302);
				call();
				}
				break;
			case 3:
				{
				setState(303);
				identifier();
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

	public static class AssignmentContext extends ParserRuleContext {
		public IdentifierContext id;
		public TerminalNode EQUALS() { return getToken(gParser.EQUALS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public CharliteralContext charliteral() {
			return getRuleContext(CharliteralContext.class,0);
		}
		public StringliteralContext stringliteral() {
			return getRuleContext(StringliteralContext.class,0);
		}
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			((AssignmentContext)_localctx).id = identifier();
			setState(307);
			match(EQUALS);
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(308);
				charliteral();
				}
				break;
			case 2:
				{
				setState(309);
				stringliteral();
				}
				break;
			case 3:
				{
				setState(310);
				identifier();
				}
				break;
			case 4:
				{
				setState(311);
				opr();
				}
				break;
			case 5:
				{
				setState(312);
				booleanexp();
				}
				break;
			case 6:
				{
				setState(313);
				call();
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

	public static class ConditionContext extends ParserRuleContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			ifstatement();
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

	public static class IfstatementContext extends ParserRuleContext {
		public BlockContext start;
		public TerminalNode IF() { return getToken(gParser.IF, 0); }
		public NestedconditionContext nestedcondition() {
			return getRuleContext(NestedconditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ElseifstatementContext> elseifstatement() {
			return getRuleContexts(ElseifstatementContext.class);
		}
		public ElseifstatementContext elseifstatement(int i) {
			return getRuleContext(ElseifstatementContext.class,i);
		}
		public ElsestatementContext elsestatement() {
			return getRuleContext(ElsestatementContext.class,0);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(IF);
			setState(319);
			nestedcondition();
			setState(320);
			((IfstatementContext)_localctx).start = block();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(321);
				elseifstatement();
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(327);
				elsestatement();
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

	public static class ElseifstatementContext extends ParserRuleContext {
		public BlockContext middle;
		public TerminalNode ELSEIF() { return getToken(gParser.ELSEIF, 0); }
		public NestedconditionContext nestedcondition() {
			return getRuleContext(NestedconditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseifstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterElseifstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitElseifstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitElseifstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifstatementContext elseifstatement() throws RecognitionException {
		ElseifstatementContext _localctx = new ElseifstatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseifstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(ELSEIF);
			setState(331);
			nestedcondition();
			setState(332);
			((ElseifstatementContext)_localctx).middle = block();
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

	public static class ElsestatementContext extends ParserRuleContext {
		public BlockContext end;
		public TerminalNode ELSE() { return getToken(gParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElsestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterElsestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitElsestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitElsestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsestatementContext elsestatement() throws RecognitionException {
		ElsestatementContext _localctx = new ElsestatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elsestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(ELSE);
			setState(335);
			((ElsestatementContext)_localctx).end = block();
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

	public static class LoopContext extends ParserRuleContext {
		public LoopforContext loopfor() {
			return getRuleContext(LoopforContext.class,0);
		}
		public LoopwhileContext loopwhile() {
			return getRuleContext(LoopwhileContext.class,0);
		}
		public LoopdowhileContext loopdowhile() {
			return getRuleContext(LoopdowhileContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_loop);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				loopfor();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				loopwhile();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				loopdowhile();
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

	public static class LoopforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(gParser.FOR, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(gParser.LPARENTHESIS, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(gParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(gParser.SEMICOLON, i);
		}
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(gParser.RPARENTHESIS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ForcedintdecContext forcedintdec() {
			return getRuleContext(ForcedintdecContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public LoopforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLoopfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLoopfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLoopfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopforContext loopfor() throws RecognitionException {
		LoopforContext _localctx = new LoopforContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_loopfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(FOR);
			setState(343);
			match(LPARENTHESIS);
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(344);
				assignment();
				}
				break;
			case INTEGER:
				{
				setState(345);
				forcedintdec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(348);
			match(SEMICOLON);
			setState(349);
			booleanexp();
			setState(350);
			match(SEMICOLON);
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(351);
				operation();
				}
				break;
			case 2:
				{
				setState(352);
				assignment();
				}
				break;
			}
			setState(355);
			match(RPARENTHESIS);
			setState(356);
			block();
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

	public static class LoopwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(gParser.WHILE, 0); }
		public NestedconditionContext nestedcondition() {
			return getRuleContext(NestedconditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLoopwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLoopwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLoopwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopwhileContext loopwhile() throws RecognitionException {
		LoopwhileContext _localctx = new LoopwhileContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_loopwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(WHILE);
			setState(359);
			nestedcondition();
			setState(360);
			block();
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

	public static class LoopdowhileContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(gParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(gParser.WHILE, 0); }
		public NestedconditionContext nestedcondition() {
			return getRuleContext(NestedconditionContext.class,0);
		}
		public LoopdowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopdowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLoopdowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLoopdowhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLoopdowhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopdowhileContext loopdowhile() throws RecognitionException {
		LoopdowhileContext _localctx = new LoopdowhileContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_loopdowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(DO);
			setState(363);
			block();
			setState(364);
			match(WHILE);
			setState(365);
			nestedcondition();
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

	public static class OperationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShortoprContext shortopr() {
			return getRuleContext(ShortoprContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			identifier();
			setState(368);
			shortopr();
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

	public static class OprContext extends ParserRuleContext {
		public AddoprContext addopr() {
			return getRuleContext(AddoprContext.class,0);
		}
		public OprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitOpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OprContext opr() throws RecognitionException {
		OprContext _localctx = new OprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_opr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			addopr(0);
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

	public static class AddoprContext extends ParserRuleContext {
		public Token op;
		public MultoprContext multopr() {
			return getRuleContext(MultoprContext.class,0);
		}
		public AddoprContext addopr() {
			return getRuleContext(AddoprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(gParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(gParser.MINUS, 0); }
		public AddoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAddopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAddopr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAddopr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddoprContext addopr() throws RecognitionException {
		return addopr(0);
	}

	private AddoprContext addopr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddoprContext _localctx = new AddoprContext(_ctx, _parentState);
		AddoprContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_addopr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(373);
			multopr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(381);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new AddoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addopr);
						setState(375);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(376);
						((AddoprContext)_localctx).op = match(PLUS);
						setState(377);
						multopr(0);
						}
						break;
					case 2:
						{
						_localctx = new AddoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addopr);
						setState(378);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(379);
						((AddoprContext)_localctx).op = match(MINUS);
						setState(380);
						multopr(0);
						}
						break;
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class MultoprContext extends ParserRuleContext {
		public Token op;
		public TerminaloprContext terminalopr() {
			return getRuleContext(TerminaloprContext.class,0);
		}
		public MultoprContext multopr() {
			return getRuleContext(MultoprContext.class,0);
		}
		public TerminalNode MUL() { return getToken(gParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(gParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(gParser.MOD, 0); }
		public MultoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMultopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMultopr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMultopr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultoprContext multopr() throws RecognitionException {
		return multopr(0);
	}

	private MultoprContext multopr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultoprContext _localctx = new MultoprContext(_ctx, _parentState);
		MultoprContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_multopr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(387);
			terminalopr();
			}
			_ctx.stop = _input.LT(-1);
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(398);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new MultoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multopr);
						setState(389);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(390);
						((MultoprContext)_localctx).op = match(MUL);
						setState(391);
						terminalopr();
						}
						break;
					case 2:
						{
						_localctx = new MultoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multopr);
						setState(392);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(393);
						((MultoprContext)_localctx).op = match(DIV);
						setState(394);
						terminalopr();
						}
						break;
					case 3:
						{
						_localctx = new MultoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multopr);
						setState(395);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(396);
						((MultoprContext)_localctx).op = match(MOD);
						setState(397);
						terminalopr();
						}
						break;
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class TerminaloprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntliteralContext intliteral() {
			return getRuleContext(IntliteralContext.class,0);
		}
		public FloatliteralContext floatliteral() {
			return getRuleContext(FloatliteralContext.class,0);
		}
		public TerminalNode LPARENTHESIS() { return getToken(gParser.LPARENTHESIS, 0); }
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(gParser.RPARENTHESIS, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminaloprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminalopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTerminalopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTerminalopr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTerminalopr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminaloprContext terminalopr() throws RecognitionException {
		TerminaloprContext _localctx = new TerminaloprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_terminalopr);
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				identifier();
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				intliteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				floatliteral();
				}
				break;
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 4);
				{
				setState(406);
				match(LPARENTHESIS);
				setState(407);
				opr();
				setState(408);
				match(RPARENTHESIS);
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 5);
				{
				setState(410);
				call();
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

	public static class ShortoprContext extends ParserRuleContext {
		public TerminalNode PLUS_PLUS() { return getToken(gParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(gParser.MINUS_MINUS, 0); }
		public TerminalNode INT_LITERAL() { return getToken(gParser.INT_LITERAL, 0); }
		public TerminalNode PLUS_EQUALS() { return getToken(gParser.PLUS_EQUALS, 0); }
		public TerminalNode MIN_EQUALS() { return getToken(gParser.MIN_EQUALS, 0); }
		public TerminalNode MUL_EQUALS() { return getToken(gParser.MUL_EQUALS, 0); }
		public TerminalNode DIV_EQUALS() { return getToken(gParser.DIV_EQUALS, 0); }
		public ShortoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterShortopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitShortopr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitShortopr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortoprContext shortopr() throws RecognitionException {
		ShortoprContext _localctx = new ShortoprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_shortopr);
		int _la;
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(PLUS_PLUS);
				}
				break;
			case MINUS_MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				match(MINUS_MINUS);
				}
				break;
			case PLUS_EQUALS:
			case MIN_EQUALS:
			case MUL_EQUALS:
			case DIV_EQUALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_EQUALS) | (1L << MIN_EQUALS) | (1L << MUL_EQUALS) | (1L << DIV_EQUALS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(416);
				match(INT_LITERAL);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(gParser.PRINT, 0); }
		public PrintblockContext printblock() {
			return getRuleContext(PrintblockContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(PRINT);
			setState(420);
			printblock();
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

	public static class PrintblockContext extends ParserRuleContext {
		public TerminalNode LPARENTHESIS() { return getToken(gParser.LPARENTHESIS, 0); }
		public List<StringcontentContext> stringcontent() {
			return getRuleContexts(StringcontentContext.class);
		}
		public StringcontentContext stringcontent(int i) {
			return getRuleContext(StringcontentContext.class,i);
		}
		public TerminalNode RPARENTHESIS() { return getToken(gParser.RPARENTHESIS, 0); }
		public List<TerminalNode> PLUS() { return getTokens(gParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(gParser.PLUS, i);
		}
		public PrintblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPrintblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPrintblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPrintblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintblockContext printblock() throws RecognitionException {
		PrintblockContext _localctx = new PrintblockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_printblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(LPARENTHESIS);
			setState(423);
			stringcontent();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(424);
				match(PLUS);
				setState(425);
				stringcontent();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
			match(RPARENTHESIS);
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

	public static class StringcontentContext extends ParserRuleContext {
		public StringliteralContext stringliteral() {
			return getRuleContext(StringliteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringcontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringcontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStringcontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStringcontent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStringcontent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringcontentContext stringcontent() throws RecognitionException {
		StringcontentContext _localctx = new StringcontentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_stringcontent);
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				stringliteral();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				identifier();
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

	public static class ScanContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(gParser.SCAN, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(gParser.LPARENTHESIS, 0); }
		public StringliteralContext stringliteral() {
			return getRuleContext(StringliteralContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(gParser.COMMA, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(gParser.RPARENTHESIS, 0); }
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitScan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitScan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(SCAN);
			setState(438);
			match(LPARENTHESIS);
			setState(439);
			stringliteral();
			setState(440);
			match(COMMA);
			setState(441);
			identifier();
			setState(442);
			match(RPARENTHESIS);
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

	public static class NestedconditionContext extends ParserRuleContext {
		public TerminalNode LPARENTHESIS() { return getToken(gParser.LPARENTHESIS, 0); }
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(gParser.RPARENTHESIS, 0); }
		public NestedconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedcondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNestedcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNestedcondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNestedcondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedconditionContext nestedcondition() throws RecognitionException {
		NestedconditionContext _localctx = new NestedconditionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_nestedcondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(LPARENTHESIS);
			setState(445);
			booleanexp();
			setState(446);
			match(RPARENTHESIS);
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

	public static class BooleanexpContext extends ParserRuleContext {
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public BooleanexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBooleanexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBooleanexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBooleanexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanexpContext booleanexp() throws RecognitionException {
		BooleanexpContext _localctx = new BooleanexpContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_booleanexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			logic(0);
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

	public static class LogicContext extends ParserRuleContext {
		public Token log;
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public TerminalNode AND() { return getToken(gParser.AND, 0); }
		public TerminalNode OR() { return getToken(gParser.OR, 0); }
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		return logic(0);
	}

	private LogicContext logic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicContext _localctx = new LogicContext(_ctx, _parentState);
		LogicContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_logic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(451);
			relation();
			}
			_ctx.stop = _input.LT(-1);
			setState(458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logic);
					setState(453);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(454);
					((LogicContext)_localctx).log = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((LogicContext)_localctx).log = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(455);
					relation();
					}
					} 
				}
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public static class RelationContext extends ParserRuleContext {
		public Token rel;
		public List<BooleanvalueContext> booleanvalue() {
			return getRuleContexts(BooleanvalueContext.class);
		}
		public BooleanvalueContext booleanvalue(int i) {
			return getRuleContext(BooleanvalueContext.class,i);
		}
		public TerminalNode EQUALS_EQUALS() { return getToken(gParser.EQUALS_EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(gParser.NOT_EQUALS, 0); }
		public TerminalNode LESS_THAN_EQUALS() { return getToken(gParser.LESS_THAN_EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(gParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN_EQUALS() { return getToken(gParser.GREATER_THAN_EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(gParser.GREATER_THAN, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(gParser.LPARENTHESIS, 0); }
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(gParser.RPARENTHESIS, 0); }
		public TerminalNode TRUE() { return getToken(gParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(gParser.FALSE, 0); }
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_relation);
		int _la;
		try {
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				booleanvalue();
				setState(462);
				((RelationContext)_localctx).rel = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << LESS_THAN_EQUALS) | (1L << GREATER_THAN) | (1L << GREATER_THAN_EQUALS) | (1L << EQUALS_EQUALS) | (1L << NOT_EQUALS))) != 0)) ) {
					((RelationContext)_localctx).rel = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(463);
				booleanvalue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				booleanvalue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				match(LPARENTHESIS);
				setState(467);
				booleanexp();
				setState(468);
				match(RPARENTHESIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(471);
				match(FALSE);
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

	public static class BooleanvalueContext extends ParserRuleContext {
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BooleanvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBooleanvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBooleanvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBooleanvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanvalueContext booleanvalue() throws RecognitionException {
		BooleanvalueContext _localctx = new BooleanvalueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_booleanvalue);
		try {
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				opr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				identifier();
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

	public static class VararrnameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(gParser.LBRACKET, 0); }
		public IntliteralContext intliteral() {
			return getRuleContext(IntliteralContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(gParser.RBRACKET, 0); }
		public VararrnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vararrname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterVararrname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitVararrname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitVararrname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VararrnameContext vararrname() throws RecognitionException {
		VararrnameContext _localctx = new VararrnameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_vararrname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			identifier();
			setState(479);
			match(LBRACKET);
			setState(480);
			intliteral();
			setState(481);
			match(RBRACKET);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(IDENTIFIER);
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

	public static class CharliteralContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(gParser.CHAR_LITERAL, 0); }
		public CharliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCharliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCharliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCharliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharliteralContext charliteral() throws RecognitionException {
		CharliteralContext _localctx = new CharliteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_charliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(CHAR_LITERAL);
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

	public static class StringliteralContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(gParser.STRING_LITERAL, 0); }
		public StringliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStringliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStringliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStringliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringliteralContext stringliteral() throws RecognitionException {
		StringliteralContext _localctx = new StringliteralContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_stringliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(STRING_LITERAL);
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

	public static class IntliteralContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(gParser.INT_LITERAL, 0); }
		public IntliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIntliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIntliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIntliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntliteralContext intliteral() throws RecognitionException {
		IntliteralContext _localctx = new IntliteralContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_intliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(INT_LITERAL);
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

	public static class FloatliteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(gParser.FLOAT_LITERAL, 0); }
		public FloatliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFloatliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFloatliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFloatliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatliteralContext floatliteral() throws RecognitionException {
		FloatliteralContext _localctx = new FloatliteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_floatliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(FLOAT_LITERAL);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(gParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(gParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(LBRACE);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << BOOLEAN) | (1L << CALL) | (1L << PRINT) | (1L << SCAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(494);
				statement();
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(500);
			match(RBRACE);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(502);
				declaration();
				}
				break;
			case 2:
				{
				setState(503);
				assignment();
				}
				break;
			case 3:
				{
				setState(504);
				condition();
				}
				break;
			case 4:
				{
				setState(505);
				loop();
				}
				break;
			case 5:
				{
				setState(506);
				operation();
				}
				break;
			case 6:
				{
				setState(507);
				call();
				}
				break;
			case 7:
				{
				setState(508);
				print();
				}
				break;
			case 8:
				{
				setState(509);
				scan();
				}
				break;
			}
			setState(512);
			match(SEMICOLON);
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
		case 28:
			return addopr_sempred((AddoprContext)_localctx, predIndex);
		case 29:
			return multopr_sempred((MultoprContext)_localctx, predIndex);
		case 38:
			return logic_sempred((LogicContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean addopr_sempred(AddoprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multopr_sempred(MultoprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logic_sempred(LogicContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u0205\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\7\2f\n\2\f\2"+
		"\16\2i\13\2\3\2\7\2l\n\2\f\2\16\2o\13\2\3\2\3\2\7\2s\n\2\f\2\16\2v\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u0081\n\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4\u0088\n\4\f\4\16\4\u008b\13\4\5\4\u008d\n\4\3\4\3\4\3\4\7\4\u0092"+
		"\n\4\f\4\16\4\u0095\13\4\3\4\5\4\u0098\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u00a1\n\5\3\5\3\5\3\5\5\5\u00a6\n\5\7\5\u00a8\n\5\f\5\16\5\u00ab"+
		"\13\5\5\5\u00ad\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b9"+
		"\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u00c3\n\b\3\t\3\t\3\t\3\t\5\t"+
		"\u00c9\n\t\3\n\3\n\3\n\5\n\u00ce\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00db\n\f\5\f\u00dd\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00e6\n\r\3\r\3\r\3\r\3\r\5\r\u00ec\n\r\7\r\u00ee\n\r\f\r\16\r"+
		"\u00f1\13\r\3\r\3\r\5\r\u00f5\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00fd"+
		"\n\16\5\16\u00ff\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0108\n"+
		"\17\3\17\3\17\3\17\3\17\5\17\u010e\n\17\7\17\u0110\n\17\f\17\16\17\u0113"+
		"\13\17\3\17\3\17\5\17\u0117\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u011f"+
		"\n\20\5\20\u0121\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0129\n\21\5"+
		"\21\u012b\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0133\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u013d\n\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\7\25\u0145\n\25\f\25\16\25\u0148\13\25\3\25\5\25\u014b\n\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u0157\n\30\3\31\3\31"+
		"\3\31\3\31\5\31\u015d\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u0164\n\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0180"+
		"\n\36\f\36\16\36\u0183\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\7\37\u0191\n\37\f\37\16\37\u0194\13\37\3 \3 \3 \3 "+
		"\3 \3 \3 \3 \5 \u019e\n \3!\3!\3!\3!\5!\u01a4\n!\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\7#\u01ad\n#\f#\16#\u01b0\13#\3#\3#\3$\3$\5$\u01b6\n$\3%\3%\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\7(\u01cb\n(\f(\16(\u01ce"+
		"\13(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01db\n)\3*\3*\5*\u01df\n*\3"+
		"+\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\7\61\u01f2\n"+
		"\61\f\61\16\61\u01f5\13\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\5\62\u0201\n\62\3\62\3\62\3\62\2\5:<N\63\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\6\4\2\r"+
		"\20\22\22\3\2\658\3\2?@\3\29>\2\u022b\2g\3\2\2\2\4y\3\2\2\2\6|\3\2\2\2"+
		"\b\u009b\3\2\2\2\n\u00b0\3\2\2\2\f\u00bc\3\2\2\2\16\u00c2\3\2\2\2\20\u00c8"+
		"\3\2\2\2\22\u00cd\3\2\2\2\24\u00cf\3\2\2\2\26\u00d4\3\2\2\2\30\u00de\3"+
		"\2\2\2\32\u00f6\3\2\2\2\34\u0100\3\2\2\2\36\u0118\3\2\2\2 \u0122\3\2\2"+
		"\2\"\u012c\3\2\2\2$\u0134\3\2\2\2&\u013e\3\2\2\2(\u0140\3\2\2\2*\u014c"+
		"\3\2\2\2,\u0150\3\2\2\2.\u0156\3\2\2\2\60\u0158\3\2\2\2\62\u0168\3\2\2"+
		"\2\64\u016c\3\2\2\2\66\u0171\3\2\2\28\u0174\3\2\2\2:\u0176\3\2\2\2<\u0184"+
		"\3\2\2\2>\u019d\3\2\2\2@\u01a3\3\2\2\2B\u01a5\3\2\2\2D\u01a8\3\2\2\2F"+
		"\u01b5\3\2\2\2H\u01b7\3\2\2\2J\u01be\3\2\2\2L\u01c2\3\2\2\2N\u01c4\3\2"+
		"\2\2P\u01da\3\2\2\2R\u01de\3\2\2\2T\u01e0\3\2\2\2V\u01e5\3\2\2\2X\u01e7"+
		"\3\2\2\2Z\u01e9\3\2\2\2\\\u01eb\3\2\2\2^\u01ed\3\2\2\2`\u01ef\3\2\2\2"+
		"b\u0200\3\2\2\2df\5\f\7\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hm\3"+
		"\2\2\2ig\3\2\2\2jl\5\6\4\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3"+
		"\2\2\2om\3\2\2\2pt\5\4\3\2qs\5\6\4\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3"+
		"\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\2\2\3x\3\3\2\2\2yz\7\27\2\2z{\5`\61\2{"+
		"\5\3\2\2\2|}\7\23\2\2}\u0080\t\2\2\2~\177\7\"\2\2\177\u0081\7#\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\5V,\2\u0083"+
		"\u008c\7$\2\2\u0084\u0089\5\16\b\2\u0085\u0086\7(\2\2\u0086\u0088\5\16"+
		"\b\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0084\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7%\2\2\u008f"+
		"\u0093\7&\2\2\u0090\u0092\5b\62\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0098\5\n\6\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\'\2\2\u009a\7\3\2\2\2\u009b\u009c"+
		"\7\24\2\2\u009c\u009d\5V,\2\u009d\u00ac\7$\2\2\u009e\u00a1\5V,\2\u009f"+
		"\u00a1\58\35\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a9\3\2"+
		"\2\2\u00a2\u00a5\7(\2\2\u00a3\u00a6\5V,\2\u00a4\u00a6\58\35\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00a0\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\7%\2\2\u00af\t\3\2\2\2\u00b0\u00b8\7\30\2\2"+
		"\u00b1\u00b9\5V,\2\u00b2\u00b9\5\\/\2\u00b3\u00b9\5^\60\2\u00b4\u00b9"+
		"\5X-\2\u00b5\u00b9\5Z.\2\u00b6\u00b9\5L\'\2\u00b7\u00b9\58\35\2\u00b8"+
		"\u00b1\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2"+
		"\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\7)\2\2\u00bb\13\3\2\2\2\u00bc\u00bd\7 \2\2"+
		"\u00bd\u00be\5\16\b\2\u00be\u00bf\7)\2\2\u00bf\r\3\2\2\2\u00c0\u00c3\5"+
		"\20\t\2\u00c1\u00c3\5\22\n\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\17\3\2\2\2\u00c4\u00c9\5\26\f\2\u00c5\u00c9\5\32\16\2\u00c6\u00c9\5\36"+
		"\20\2\u00c7\u00c9\5\24\13\2\u00c8\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\21\3\2\2\2\u00ca\u00ce\5\30\r"+
		"\2\u00cb\u00ce\5\34\17\2\u00cc\u00ce\5 \21\2\u00cd\u00ca\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\23\3\2\2\2\u00cf\u00d0\7\21\2"+
		"\2\u00d0\u00d1\5V,\2\u00d1\u00d2\7\64\2\2\u00d2\u00d3\5L\'\2\u00d3\25"+
		"\3\2\2\2\u00d4\u00d5\7\r\2\2\u00d5\u00dc\5V,\2\u00d6\u00da\7\64\2\2\u00d7"+
		"\u00db\58\35\2\u00d8\u00db\5\b\5\2\u00d9\u00db\5V,\2\u00da\u00d7\3\2\2"+
		"\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d6"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\27\3\2\2\2\u00de\u00df\7\r\2\2\u00df"+
		"\u00f4\5T+\2\u00e0\u00e1\7\64\2\2\u00e1\u00e5\7&\2\2\u00e2\u00e6\58\35"+
		"\2\u00e3\u00e6\5\b\5\2\u00e4\u00e6\5V,\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00ef\3\2\2\2\u00e7\u00eb\7(\2\2\u00e8"+
		"\u00ec\58\35\2\u00e9\u00ec\5\b\5\2\u00ea\u00ec\5V,\2\u00eb\u00e8\3\2\2"+
		"\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00e7"+
		"\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\'\2\2\u00f3\u00f5\3\2"+
		"\2\2\u00f4\u00e0\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\31\3\2\2\2\u00f6\u00f7"+
		"\7\16\2\2\u00f7\u00fe\5V,\2\u00f8\u00fc\7\64\2\2\u00f9\u00fd\58\35\2\u00fa"+
		"\u00fd\5\b\5\2\u00fb\u00fd\5V,\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2\2"+
		"\2\u00fc\u00fb\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\33\3\2\2\2\u0100\u0101\7\16\2\2\u0101\u0116\5T+\2\u0102"+
		"\u0103\7\64\2\2\u0103\u0107\7&\2\2\u0104\u0108\58\35\2\u0105\u0108\5\b"+
		"\5\2\u0106\u0108\5V,\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106"+
		"\3\2\2\2\u0108\u0111\3\2\2\2\u0109\u010d\7(\2\2\u010a\u010e\58\35\2\u010b"+
		"\u010e\5\b\5\2\u010c\u010e\5V,\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2"+
		"\2\u010d\u010c\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u0109\3\2\2\2\u0110\u0113"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0115\7\'\2\2\u0115\u0117\3\2\2\2\u0116\u0102\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\35\3\2\2\2\u0118\u0119\7\17\2\2\u0119\u0120"+
		"\5V,\2\u011a\u011e\7\64\2\2\u011b\u011f\5X-\2\u011c\u011f\5\b\5\2\u011d"+
		"\u011f\5V,\2\u011e\u011b\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2"+
		"\2\u011f\u0121\3\2\2\2\u0120\u011a\3\2\2\2\u0120\u0121\3\2\2\2\u0121\37"+
		"\3\2\2\2\u0122\u0123\7\20\2\2\u0123\u012a\5V,\2\u0124\u0128\7\64\2\2\u0125"+
		"\u0129\5Z.\2\u0126\u0129\5\b\5\2\u0127\u0129\5V,\2\u0128\u0125\3\2\2\2"+
		"\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0124"+
		"\3\2\2\2\u012a\u012b\3\2\2\2\u012b!\3\2\2\2\u012c\u012d\7\r\2\2\u012d"+
		"\u012e\5V,\2\u012e\u0132\7\64\2\2\u012f\u0133\58\35\2\u0130\u0133\5\b"+
		"\5\2\u0131\u0133\5V,\2\u0132\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0131"+
		"\3\2\2\2\u0133#\3\2\2\2\u0134\u0135\5V,\2\u0135\u013c\7\64\2\2\u0136\u013d"+
		"\5X-\2\u0137\u013d\5Z.\2\u0138\u013d\5V,\2\u0139\u013d\58\35\2\u013a\u013d"+
		"\5L\'\2\u013b\u013d\5\b\5\2\u013c\u0136\3\2\2\2\u013c\u0137\3\2\2\2\u013c"+
		"\u0138\3\2\2\2\u013c\u0139\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2"+
		"\2\2\u013d%\3\2\2\2\u013e\u013f\5(\25\2\u013f\'\3\2\2\2\u0140\u0141\7"+
		"\7\2\2\u0141\u0142\5J&\2\u0142\u0146\5`\61\2\u0143\u0145\5*\26\2\u0144"+
		"\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014b\5,\27\2\u014a"+
		"\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b)\3\2\2\2\u014c\u014d\7\t\2\2"+
		"\u014d\u014e\5J&\2\u014e\u014f\5`\61\2\u014f+\3\2\2\2\u0150\u0151\7\b"+
		"\2\2\u0151\u0152\5`\61\2\u0152-\3\2\2\2\u0153\u0157\5\60\31\2\u0154\u0157"+
		"\5\62\32\2\u0155\u0157\5\64\33\2\u0156\u0153\3\2\2\2\u0156\u0154\3\2\2"+
		"\2\u0156\u0155\3\2\2\2\u0157/\3\2\2\2\u0158\u0159\7\n\2\2\u0159\u015c"+
		"\7$\2\2\u015a\u015d\5$\23\2\u015b\u015d\5\"\22\2\u015c\u015a\3\2\2\2\u015c"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\7)\2\2\u015f\u0160\5L\'"+
		"\2\u0160\u0163\7)\2\2\u0161\u0164\5\66\34\2\u0162\u0164\5$\23\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\7%"+
		"\2\2\u0166\u0167\5`\61\2\u0167\61\3\2\2\2\u0168\u0169\7\13\2\2\u0169\u016a"+
		"\5J&\2\u016a\u016b\5`\61\2\u016b\63\3\2\2\2\u016c\u016d\7\f\2\2\u016d"+
		"\u016e\5`\61\2\u016e\u016f\7\13\2\2\u016f\u0170\5J&\2\u0170\65\3\2\2\2"+
		"\u0171\u0172\5V,\2\u0172\u0173\5@!\2\u0173\67\3\2\2\2\u0174\u0175\5:\36"+
		"\2\u01759\3\2\2\2\u0176\u0177\b\36\1\2\u0177\u0178\5<\37\2\u0178\u0181"+
		"\3\2\2\2\u0179\u017a\f\5\2\2\u017a\u017b\7/\2\2\u017b\u0180\5<\37\2\u017c"+
		"\u017d\f\4\2\2\u017d\u017e\7\60\2\2\u017e\u0180\5<\37\2\u017f\u0179\3"+
		"\2\2\2\u017f\u017c\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182;\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\b\37\1\2"+
		"\u0185\u0186\5> \2\u0186\u0192\3\2\2\2\u0187\u0188\f\6\2\2\u0188\u0189"+
		"\7\61\2\2\u0189\u0191\5> \2\u018a\u018b\f\5\2\2\u018b\u018c\7\62\2\2\u018c"+
		"\u0191\5> \2\u018d\u018e\f\4\2\2\u018e\u018f\7\63\2\2\u018f\u0191\5> "+
		"\2\u0190\u0187\3\2\2\2\u0190\u018a\3\2\2\2\u0190\u018d\3\2\2\2\u0191\u0194"+
		"\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193=\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0195\u019e\5V,\2\u0196\u019e\5\\/\2\u0197\u019e\5^\60"+
		"\2\u0198\u0199\7$\2\2\u0199\u019a\58\35\2\u019a\u019b\7%\2\2\u019b\u019e"+
		"\3\2\2\2\u019c\u019e\5\b\5\2\u019d\u0195\3\2\2\2\u019d\u0196\3\2\2\2\u019d"+
		"\u0197\3\2\2\2\u019d\u0198\3\2\2\2\u019d\u019c\3\2\2\2\u019e?\3\2\2\2"+
		"\u019f\u01a4\7-\2\2\u01a0\u01a4\7.\2\2\u01a1\u01a2\t\3\2\2\u01a2\u01a4"+
		"\7\5\2\2\u01a3\u019f\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"A\3\2\2\2\u01a5\u01a6\7\25\2\2\u01a6\u01a7\5D#\2\u01a7C\3\2\2\2\u01a8"+
		"\u01a9\7$\2\2\u01a9\u01ae\5F$\2\u01aa\u01ab\7/\2\2\u01ab\u01ad\5F$\2\u01ac"+
		"\u01aa\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2"+
		"\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\7%\2\2\u01b2"+
		"E\3\2\2\2\u01b3\u01b6\5Z.\2\u01b4\u01b6\5V,\2\u01b5\u01b3\3\2\2\2\u01b5"+
		"\u01b4\3\2\2\2\u01b6G\3\2\2\2\u01b7\u01b8\7\26\2\2\u01b8\u01b9\7$\2\2"+
		"\u01b9\u01ba\5Z.\2\u01ba\u01bb\7(\2\2\u01bb\u01bc\5V,\2\u01bc\u01bd\7"+
		"%\2\2\u01bdI\3\2\2\2\u01be\u01bf\7$\2\2\u01bf\u01c0\5L\'\2\u01c0\u01c1"+
		"\7%\2\2\u01c1K\3\2\2\2\u01c2\u01c3\5N(\2\u01c3M\3\2\2\2\u01c4\u01c5\b"+
		"(\1\2\u01c5\u01c6\5P)\2\u01c6\u01cc\3\2\2\2\u01c7\u01c8\f\4\2\2\u01c8"+
		"\u01c9\t\4\2\2\u01c9\u01cb\5P)\2\u01ca\u01c7\3\2\2\2\u01cb\u01ce\3\2\2"+
		"\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cdO\3\2\2\2\u01ce\u01cc"+
		"\3\2\2\2\u01cf\u01d0\5R*\2\u01d0\u01d1\t\5\2\2\u01d1\u01d2\5R*\2\u01d2"+
		"\u01db\3\2\2\2\u01d3\u01db\5R*\2\u01d4\u01d5\7$\2\2\u01d5\u01d6\5L\'\2"+
		"\u01d6\u01d7\7%\2\2\u01d7\u01db\3\2\2\2\u01d8\u01db\7\31\2\2\u01d9\u01db"+
		"\7\32\2\2\u01da\u01cf\3\2\2\2\u01da\u01d3\3\2\2\2\u01da\u01d4\3\2\2\2"+
		"\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01dbQ\3\2\2\2\u01dc\u01df\5"+
		"8\35\2\u01dd\u01df\5V,\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2\2\u01df"+
		"S\3\2\2\2\u01e0\u01e1\5V,\2\u01e1\u01e2\7\"\2\2\u01e2\u01e3\5\\/\2\u01e3"+
		"\u01e4\7#\2\2\u01e4U\3\2\2\2\u01e5\u01e6\7!\2\2\u01e6W\3\2\2\2\u01e7\u01e8"+
		"\7\3\2\2\u01e8Y\3\2\2\2\u01e9\u01ea\7\4\2\2\u01ea[\3\2\2\2\u01eb\u01ec"+
		"\7\5\2\2\u01ec]\3\2\2\2\u01ed\u01ee\7\6\2\2\u01ee_\3\2\2\2\u01ef\u01f3"+
		"\7&\2\2\u01f0\u01f2\5b\62\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3"+
		"\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f3\3\2"+
		"\2\2\u01f6\u01f7\7\'\2\2\u01f7a\3\2\2\2\u01f8\u0201\5\16\b\2\u01f9\u0201"+
		"\5$\23\2\u01fa\u0201\5&\24\2\u01fb\u0201\5.\30\2\u01fc\u0201\5\66\34\2"+
		"\u01fd\u0201\5\b\5\2\u01fe\u0201\5B\"\2\u01ff\u0201\5H%\2\u0200\u01f8"+
		"\3\2\2\2\u0200\u01f9\3\2\2\2\u0200\u01fa\3\2\2\2\u0200\u01fb\3\2\2\2\u0200"+
		"\u01fc\3\2\2\2\u0200\u01fd\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u01ff\3\2"+
		"\2\2\u0201\u0202\3\2\2\2\u0202\u0203\7)\2\2\u0203c\3\2\2\2\66gmt\u0080"+
		"\u0089\u008c\u0093\u0097\u00a0\u00a5\u00a9\u00ac\u00b8\u00c2\u00c8\u00cd"+
		"\u00da\u00dc\u00e5\u00eb\u00ef\u00f4\u00fc\u00fe\u0107\u010d\u0111\u0116"+
		"\u011e\u0120\u0128\u012a\u0132\u013c\u0146\u014a\u0156\u015c\u0163\u017f"+
		"\u0181\u0190\u0192\u019d\u01a3\u01ae\u01b5\u01cc\u01da\u01de\u01f3\u0200";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}