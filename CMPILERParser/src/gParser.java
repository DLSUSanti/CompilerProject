// Generated from C:/Users/Amec Go/Desktop/CompilerProjectNewFunctions/CompilerProjectUpdated/CmpilerParser\g.g4 by ANTLR 4.7.2
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
		RULE_program = 0, RULE_main = 1, RULE_function = 2, RULE_functionvoidblock = 3, 
		RULE_functionreturnblock = 4, RULE_functionparameters = 5, RULE_call = 6, 
		RULE_callparameter = 7, RULE_returnstatement = 8, RULE_globaldelcaration = 9, 
		RULE_declaration = 10, RULE_singledeclaration = 11, RULE_arraydeclaration = 12, 
		RULE_booleandeclaration = 13, RULE_intdeclaration = 14, RULE_intarrdeclaration = 15, 
		RULE_floatdeclaration = 16, RULE_floatarrdeclaration = 17, RULE_arrval = 18, 
		RULE_chardeclaration = 19, RULE_chararrdeclaration = 20, RULE_assignment = 21, 
		RULE_arrayassignment = 22, RULE_index = 23, RULE_condition = 24, RULE_ifstatement = 25, 
		RULE_elseifstatement = 26, RULE_elsestatement = 27, RULE_loop = 28, RULE_loopfor = 29, 
		RULE_loopwhile = 30, RULE_loopdowhile = 31, RULE_operation = 32, RULE_opr = 33, 
		RULE_addopr = 34, RULE_multopr = 35, RULE_terminalopr = 36, RULE_shortopr = 37, 
		RULE_print = 38, RULE_printblock = 39, RULE_stringcontent = 40, RULE_scan = 41, 
		RULE_nestedcondition = 42, RULE_booleanexp = 43, RULE_logic = 44, RULE_relation = 45, 
		RULE_booleanvalue = 46, RULE_vararrname = 47, RULE_identifier = 48, RULE_charliteral = 49, 
		RULE_stringliteral = 50, RULE_intliteral = 51, RULE_floatliteral = 52, 
		RULE_block = 53, RULE_statement = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "function", "functionvoidblock", "functionreturnblock", 
			"functionparameters", "call", "callparameter", "returnstatement", "globaldelcaration", 
			"declaration", "singledeclaration", "arraydeclaration", "booleandeclaration", 
			"intdeclaration", "intarrdeclaration", "floatdeclaration", "floatarrdeclaration", 
			"arrval", "chardeclaration", "chararrdeclaration", "assignment", "arrayassignment", 
			"index", "condition", "ifstatement", "elseifstatement", "elsestatement", 
			"loop", "loopfor", "loopwhile", "loopdowhile", "operation", "opr", "addopr", 
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
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBAL) {
				{
				{
				setState(110);
				globaldelcaration();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(116);
				function();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			main();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(123);
				function();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
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
			setState(131);
			match(MAIN);
			setState(132);
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
		public FunctionparametersContext functionparameters() {
			return getRuleContext(FunctionparametersContext.class,0);
		}
		public FunctionreturnblockContext functionreturnblock() {
			return getRuleContext(FunctionreturnblockContext.class,0);
		}
		public FunctionvoidblockContext functionvoidblock() {
			return getRuleContext(FunctionvoidblockContext.class,0);
		}
		public TerminalNode VOID() { return getToken(gParser.VOID, 0); }
		public TerminalNode INTEGER() { return getToken(gParser.INTEGER, 0); }
		public TerminalNode FLOATING_POINT() { return getToken(gParser.FLOATING_POINT, 0); }
		public TerminalNode CHARACTER() { return getToken(gParser.CHARACTER, 0); }
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
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
			setState(134);
			match(FUNCTION);
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOATING_POINT:
			case CHARACTER:
			case STRING:
				{
				{
				setState(135);
				((FunctionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING))) != 0)) ) {
					((FunctionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(136);
				identifier();
				setState(137);
				functionparameters();
				setState(138);
				functionreturnblock();
				}
				}
				break;
			case VOID:
				{
				{
				setState(140);
				((FunctionContext)_localctx).op = match(VOID);
				setState(141);
				identifier();
				setState(142);
				functionparameters();
				setState(143);
				functionvoidblock();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionvoidblockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(gParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(gParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionvoidblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionvoidblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunctionvoidblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunctionvoidblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunctionvoidblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionvoidblockContext functionvoidblock() throws RecognitionException {
		FunctionvoidblockContext _localctx = new FunctionvoidblockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionvoidblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(LBRACE);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << BOOLEAN) | (1L << CALL) | (1L << PRINT) | (1L << SCAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(148);
				statement();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
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

	public static class FunctionreturnblockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(gParser.LBRACE, 0); }
		public ReturnstatementContext returnstatement() {
			return getRuleContext(ReturnstatementContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(gParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionreturnblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionreturnblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunctionreturnblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunctionreturnblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunctionreturnblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionreturnblockContext functionreturnblock() throws RecognitionException {
		FunctionreturnblockContext _localctx = new FunctionreturnblockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionreturnblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(LBRACE);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << BOOLEAN) | (1L << CALL) | (1L << PRINT) | (1L << SCAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(157);
				statement();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			returnstatement();
			setState(164);
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

	public static class FunctionparametersContext extends ParserRuleContext {
		public TerminalNode LPARENTHESIS() { return getToken(gParser.LPARENTHESIS, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(gParser.RPARENTHESIS, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public FunctionparametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionparameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunctionparameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunctionparameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunctionparameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionparametersContext functionparameters() throws RecognitionException {
		FunctionparametersContext _localctx = new FunctionparametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionparameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(LPARENTHESIS);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << BOOLEAN))) != 0)) {
				{
				setState(167);
				declaration();
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(168);
					match(COMMA);
					setState(169);
					declaration();
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(177);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(gParser.CALL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPARENTHESIS() { return getToken(gParser.LPARENTHESIS, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(gParser.RPARENTHESIS, 0); }
		public List<CallparameterContext> callparameter() {
			return getRuleContexts(CallparameterContext.class);
		}
		public CallparameterContext callparameter(int i) {
			return getRuleContext(CallparameterContext.class,i);
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
		enterRule(_localctx, 12, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(CALL);
			setState(180);
			identifier();
			setState(181);
			match(LPARENTHESIS);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CALL) | (1L << IDENTIFIER) | (1L << LPARENTHESIS))) != 0)) {
				{
				setState(182);
				callparameter();
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(183);
					match(COMMA);
					setState(184);
					callparameter();
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(192);
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

	public static class CallparameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public CallparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCallparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCallparameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCallparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallparameterContext callparameter() throws RecognitionException {
		CallparameterContext _localctx = new CallparameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_callparameter);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				opr();
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

	public static class ReturnstatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(gParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 16, RULE_returnstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(RETURN);
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(199);
				identifier();
				}
				break;
			case 2:
				{
				setState(200);
				charliteral();
				}
				break;
			case 3:
				{
				setState(201);
				stringliteral();
				}
				break;
			case 4:
				{
				setState(202);
				opr();
				}
				break;
			}
			setState(205);
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
		enterRule(_localctx, 18, RULE_globaldelcaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(GLOBAL);
			setState(208);
			declaration();
			setState(209);
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
		enterRule(_localctx, 20, RULE_declaration);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				singledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
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
		enterRule(_localctx, 22, RULE_singledeclaration);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				intdeclaration();
				}
				break;
			case FLOATING_POINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				floatdeclaration();
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				chardeclaration();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
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
		enterRule(_localctx, 24, RULE_arraydeclaration);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				intarrdeclaration();
				}
				break;
			case FLOATING_POINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				floatarrdeclaration();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
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
		enterRule(_localctx, 26, RULE_booleandeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(BOOLEAN);
			setState(227);
			((BooleandeclarationContext)_localctx).id = identifier();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(228);
				match(EQUALS);
				setState(229);
				((BooleandeclarationContext)_localctx).val = booleanexp();
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
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
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
		enterRule(_localctx, 28, RULE_intdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(INTEGER);
			setState(233);
			((IntdeclarationContext)_localctx).id = identifier();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(234);
				match(EQUALS);
				setState(241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(235);
					opr();
					}
					break;
				case 2:
					{
					setState(236);
					call();
					}
					break;
				case 3:
					{
					setState(237);
					identifier();
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LBRACKET) {
						{
						setState(238);
						index();
						}
					}

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
		public List<ArrvalContext> arrval() {
			return getRuleContexts(ArrvalContext.class);
		}
		public ArrvalContext arrval(int i) {
			return getRuleContext(ArrvalContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(gParser.RBRACE, 0); }
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
		enterRule(_localctx, 30, RULE_intarrdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(INTEGER);
			setState(246);
			vararrname();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(247);
				match(EQUALS);
				setState(248);
				match(LBRACE);
				setState(249);
				arrval();
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(250);
					match(COMMA);
					setState(251);
					arrval();
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
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
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
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
		enterRule(_localctx, 32, RULE_floatdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(FLOATING_POINT);
			setState(262);
			((FloatdeclarationContext)_localctx).id = identifier();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(263);
				match(EQUALS);
				setState(270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
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
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LBRACKET) {
						{
						setState(267);
						index();
						}
					}

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
		public List<ArrvalContext> arrval() {
			return getRuleContexts(ArrvalContext.class);
		}
		public ArrvalContext arrval(int i) {
			return getRuleContext(ArrvalContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(gParser.RBRACE, 0); }
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
		enterRule(_localctx, 34, RULE_floatarrdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(FLOATING_POINT);
			setState(275);
			vararrname();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(276);
				match(EQUALS);
				setState(277);
				match(LBRACE);
				setState(278);
				arrval();
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(279);
					match(COMMA);
					setState(280);
					arrval();
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(286);
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

	public static class ArrvalContext extends ParserRuleContext {
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterArrval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitArrval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitArrval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrvalContext arrval() throws RecognitionException {
		ArrvalContext _localctx = new ArrvalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrval);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				opr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
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
		enterRule(_localctx, 38, RULE_chardeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(CHARACTER);
			setState(296);
			((ChardeclarationContext)_localctx).id = identifier();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(297);
				match(EQUALS);
				setState(301);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR_LITERAL:
					{
					setState(298);
					charliteral();
					}
					break;
				case CALL:
					{
					setState(299);
					call();
					}
					break;
				case IDENTIFIER:
					{
					setState(300);
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
		enterRule(_localctx, 40, RULE_chararrdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(STRING);
			setState(306);
			((ChararrdeclarationContext)_localctx).id = identifier();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(307);
				match(EQUALS);
				setState(311);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
					{
					setState(308);
					stringliteral();
					}
					break;
				case CALL:
					{
					setState(309);
					call();
					}
					break;
				case IDENTIFIER:
					{
					setState(310);
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
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public ArrayassignmentContext arrayassignment() {
			return getRuleContext(ArrayassignmentContext.class,0);
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
		enterRule(_localctx, 42, RULE_assignment);
		int _la;
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(315);
				((AssignmentContext)_localctx).id = identifier();
				setState(316);
				match(EQUALS);
				setState(326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(317);
					charliteral();
					}
					break;
				case 2:
					{
					setState(318);
					stringliteral();
					}
					break;
				case 3:
					{
					setState(319);
					opr();
					}
					break;
				case 4:
					{
					setState(320);
					identifier();
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LBRACKET) {
						{
						setState(321);
						index();
						}
					}

					}
					break;
				case 5:
					{
					setState(324);
					booleanexp();
					}
					break;
				case 6:
					{
					setState(325);
					call();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				arrayassignment();
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

	public static class ArrayassignmentContext extends ParserRuleContext {
		public IdentifierContext id;
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
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
		public ArrayassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterArrayassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitArrayassignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitArrayassignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayassignmentContext arrayassignment() throws RecognitionException {
		ArrayassignmentContext _localctx = new ArrayassignmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrayassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			((ArrayassignmentContext)_localctx).id = identifier();
			setState(332);
			index();
			setState(333);
			match(EQUALS);
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(334);
				opr();
				}
				break;
			case 2:
				{
				setState(335);
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

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(gParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(gParser.RBRACKET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntliteralContext intliteral() {
			return getRuleContext(IntliteralContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(LBRACKET);
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(339);
				identifier();
				}
				break;
			case INT_LITERAL:
				{
				setState(340);
				intliteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(343);
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
		enterRule(_localctx, 48, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
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
		enterRule(_localctx, 50, RULE_ifstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(IF);
			setState(348);
			nestedcondition();
			setState(349);
			((IfstatementContext)_localctx).start = block();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(350);
				elseifstatement();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(356);
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
		enterRule(_localctx, 52, RULE_elseifstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(ELSEIF);
			setState(360);
			nestedcondition();
			setState(361);
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
		enterRule(_localctx, 54, RULE_elsestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(ELSE);
			setState(364);
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
		enterRule(_localctx, 56, RULE_loop);
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				loopfor();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				loopwhile();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
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
		public IntdeclarationContext intdeclaration() {
			return getRuleContext(IntdeclarationContext.class,0);
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
		enterRule(_localctx, 58, RULE_loopfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(FOR);
			setState(372);
			match(LPARENTHESIS);
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(373);
				assignment();
				}
				break;
			case INTEGER:
				{
				setState(374);
				intdeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(377);
			match(SEMICOLON);
			setState(378);
			booleanexp();
			setState(379);
			match(SEMICOLON);
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(380);
				operation();
				}
				break;
			case 2:
				{
				setState(381);
				assignment();
				}
				break;
			}
			setState(384);
			match(RPARENTHESIS);
			setState(385);
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
		enterRule(_localctx, 60, RULE_loopwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(WHILE);
			setState(388);
			nestedcondition();
			setState(389);
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
		enterRule(_localctx, 62, RULE_loopdowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(DO);
			setState(392);
			block();
			setState(393);
			match(WHILE);
			setState(394);
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
		enterRule(_localctx, 64, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			identifier();
			setState(397);
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
		enterRule(_localctx, 66, RULE_opr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_addopr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(402);
			multopr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(410);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new AddoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addopr);
						setState(404);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(405);
						((AddoprContext)_localctx).op = match(PLUS);
						setState(406);
						multopr(0);
						}
						break;
					case 2:
						{
						_localctx = new AddoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addopr);
						setState(407);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(408);
						((AddoprContext)_localctx).op = match(MINUS);
						setState(409);
						multopr(0);
						}
						break;
					}
					} 
				}
				setState(414);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_multopr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(416);
			terminalopr();
			}
			_ctx.stop = _input.LT(-1);
			setState(429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(427);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new MultoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multopr);
						setState(418);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(419);
						((MultoprContext)_localctx).op = match(MUL);
						setState(420);
						terminalopr();
						}
						break;
					case 2:
						{
						_localctx = new MultoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multopr);
						setState(421);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(422);
						((MultoprContext)_localctx).op = match(DIV);
						setState(423);
						terminalopr();
						}
						break;
					case 3:
						{
						_localctx = new MultoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multopr);
						setState(424);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(425);
						((MultoprContext)_localctx).op = match(MOD);
						setState(426);
						terminalopr();
						}
						break;
					}
					} 
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		enterRule(_localctx, 72, RULE_terminalopr);
		try {
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				identifier();
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				intliteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				floatliteral();
				}
				break;
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				match(LPARENTHESIS);
				setState(436);
				opr();
				setState(437);
				match(RPARENTHESIS);
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 5);
				{
				setState(439);
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
		enterRule(_localctx, 74, RULE_shortopr);
		int _la;
		try {
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				match(PLUS_PLUS);
				}
				break;
			case MINUS_MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				match(MINUS_MINUS);
				}
				break;
			case PLUS_EQUALS:
			case MIN_EQUALS:
			case MUL_EQUALS:
			case DIV_EQUALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_EQUALS) | (1L << MIN_EQUALS) | (1L << MUL_EQUALS) | (1L << DIV_EQUALS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(445);
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
		enterRule(_localctx, 76, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(PRINT);
			setState(449);
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
		enterRule(_localctx, 78, RULE_printblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(LPARENTHESIS);
			setState(452);
			stringcontent();
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(453);
				match(PLUS);
				setState(454);
				stringcontent();
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(460);
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
		enterRule(_localctx, 80, RULE_stringcontent);
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				stringliteral();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
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
		enterRule(_localctx, 82, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(SCAN);
			setState(467);
			match(LPARENTHESIS);
			setState(468);
			stringliteral();
			setState(469);
			match(COMMA);
			setState(470);
			identifier();
			setState(471);
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
		enterRule(_localctx, 84, RULE_nestedcondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(LPARENTHESIS);
			setState(474);
			booleanexp();
			setState(475);
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
		enterRule(_localctx, 86, RULE_booleanexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_logic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(480);
			relation();
			}
			_ctx.stop = _input.LT(-1);
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logic);
					setState(482);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(483);
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
					setState(484);
					relation();
					}
					} 
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 90, RULE_relation);
		int _la;
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				booleanvalue();
				setState(491);
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
				setState(492);
				booleanvalue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				booleanvalue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				match(LPARENTHESIS);
				setState(496);
				booleanexp();
				setState(497);
				match(RPARENTHESIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(499);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(500);
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
		enterRule(_localctx, 92, RULE_booleanvalue);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				opr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
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
		enterRule(_localctx, 94, RULE_vararrname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			identifier();
			setState(508);
			match(LBRACKET);
			setState(509);
			intliteral();
			setState(510);
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
		enterRule(_localctx, 96, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
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
		enterRule(_localctx, 98, RULE_charliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
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
		enterRule(_localctx, 100, RULE_stringliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
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
		enterRule(_localctx, 102, RULE_intliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
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
		enterRule(_localctx, 104, RULE_floatliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
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
		enterRule(_localctx, 106, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(LBRACE);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << BOOLEAN) | (1L << CALL) | (1L << PRINT) | (1L << SCAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(523);
				statement();
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529);
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
		enterRule(_localctx, 108, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(531);
				declaration();
				}
				break;
			case 2:
				{
				setState(532);
				assignment();
				}
				break;
			case 3:
				{
				setState(533);
				condition();
				}
				break;
			case 4:
				{
				setState(534);
				loop();
				}
				break;
			case 5:
				{
				setState(535);
				operation();
				}
				break;
			case 6:
				{
				setState(536);
				call();
				}
				break;
			case 7:
				{
				setState(537);
				print();
				}
				break;
			case 8:
				{
				setState(538);
				scan();
				}
				break;
			}
			setState(541);
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
		case 34:
			return addopr_sempred((AddoprContext)_localctx, predIndex);
		case 35:
			return multopr_sempred((MultoprContext)_localctx, predIndex);
		case 44:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u0222\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\7\2r\n\2\f\2\16\2u\13\2\3"+
		"\2\7\2x\n\2\f\2\16\2{\13\2\3\2\3\2\7\2\177\n\2\f\2\16\2\u0082\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0094"+
		"\n\4\3\5\3\5\7\5\u0098\n\5\f\5\16\5\u009b\13\5\3\5\3\5\3\6\3\6\7\6\u00a1"+
		"\n\6\f\6\16\6\u00a4\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00ad\n\7\f\7"+
		"\16\7\u00b0\13\7\5\7\u00b2\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00bc"+
		"\n\b\f\b\16\b\u00bf\13\b\5\b\u00c1\n\b\3\b\3\b\3\t\3\t\5\t\u00c7\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u00ce\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\5"+
		"\f\u00d8\n\f\3\r\3\r\3\r\3\r\5\r\u00de\n\r\3\16\3\16\3\16\5\16\u00e3\n"+
		"\16\3\17\3\17\3\17\3\17\5\17\u00e9\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00f2\n\20\5\20\u00f4\n\20\5\20\u00f6\n\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u00ff\n\21\f\21\16\21\u0102\13\21\3\21\3\21\5"+
		"\21\u0106\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u010f\n\22\5\22"+
		"\u0111\n\22\5\22\u0113\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u011c"+
		"\n\23\f\23\16\23\u011f\13\23\3\23\3\23\5\23\u0123\n\23\3\24\3\24\3\24"+
		"\5\24\u0128\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0130\n\25\5\25\u0132"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u013a\n\26\5\26\u013c\n\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0145\n\27\3\27\3\27\5\27\u0149"+
		"\n\27\3\27\5\27\u014c\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u0153\n\30\3"+
		"\31\3\31\3\31\5\31\u0158\n\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\7\33\u0162\n\33\f\33\16\33\u0165\13\33\3\33\5\33\u0168\n\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\5\36\u0174\n\36\3\37\3\37\3\37"+
		"\3\37\5\37\u017a\n\37\3\37\3\37\3\37\3\37\3\37\5\37\u0181\n\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\7$\u019d\n$\f$\16$\u01a0\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\7%\u01ae\n%\f%\16%\u01b1\13%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01bb\n"+
		"&\3\'\3\'\3\'\3\'\5\'\u01c1\n\'\3(\3(\3(\3)\3)\3)\3)\7)\u01ca\n)\f)\16"+
		")\u01cd\13)\3)\3)\3*\3*\5*\u01d3\n*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3"+
		"-\3-\3.\3.\3.\3.\3.\3.\7.\u01e8\n.\f.\16.\u01eb\13.\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\5/\u01f8\n/\3\60\3\60\5\60\u01fc\n\60\3\61\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\7"+
		"\67\u020f\n\67\f\67\16\67\u0212\13\67\3\67\3\67\38\38\38\38\38\38\38\3"+
		"8\58\u021e\n8\38\38\38\2\5FHZ9\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2\6\3\2\r\20\3\2\65"+
		"8\3\2?@\3\29>\2\u023d\2s\3\2\2\2\4\u0085\3\2\2\2\6\u0088\3\2\2\2\b\u0095"+
		"\3\2\2\2\n\u009e\3\2\2\2\f\u00a8\3\2\2\2\16\u00b5\3\2\2\2\20\u00c6\3\2"+
		"\2\2\22\u00c8\3\2\2\2\24\u00d1\3\2\2\2\26\u00d7\3\2\2\2\30\u00dd\3\2\2"+
		"\2\32\u00e2\3\2\2\2\34\u00e4\3\2\2\2\36\u00ea\3\2\2\2 \u00f7\3\2\2\2\""+
		"\u0107\3\2\2\2$\u0114\3\2\2\2&\u0127\3\2\2\2(\u0129\3\2\2\2*\u0133\3\2"+
		"\2\2,\u014b\3\2\2\2.\u014d\3\2\2\2\60\u0154\3\2\2\2\62\u015b\3\2\2\2\64"+
		"\u015d\3\2\2\2\66\u0169\3\2\2\28\u016d\3\2\2\2:\u0173\3\2\2\2<\u0175\3"+
		"\2\2\2>\u0185\3\2\2\2@\u0189\3\2\2\2B\u018e\3\2\2\2D\u0191\3\2\2\2F\u0193"+
		"\3\2\2\2H\u01a1\3\2\2\2J\u01ba\3\2\2\2L\u01c0\3\2\2\2N\u01c2\3\2\2\2P"+
		"\u01c5\3\2\2\2R\u01d2\3\2\2\2T\u01d4\3\2\2\2V\u01db\3\2\2\2X\u01df\3\2"+
		"\2\2Z\u01e1\3\2\2\2\\\u01f7\3\2\2\2^\u01fb\3\2\2\2`\u01fd\3\2\2\2b\u0202"+
		"\3\2\2\2d\u0204\3\2\2\2f\u0206\3\2\2\2h\u0208\3\2\2\2j\u020a\3\2\2\2l"+
		"\u020c\3\2\2\2n\u021d\3\2\2\2pr\5\24\13\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2"+
		"\2st\3\2\2\2ty\3\2\2\2us\3\2\2\2vx\5\6\4\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2"+
		"\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|\u0080\5\4\3\2}\177\5\6\4\2~}\3\2\2\2"+
		"\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\2\2\3\u0084\3\3\2\2\2\u0085\u0086"+
		"\7\27\2\2\u0086\u0087\5l\67\2\u0087\5\3\2\2\2\u0088\u0093\7\23\2\2\u0089"+
		"\u008a\t\2\2\2\u008a\u008b\5b\62\2\u008b\u008c\5\f\7\2\u008c\u008d\5\n"+
		"\6\2\u008d\u0094\3\2\2\2\u008e\u008f\7\22\2\2\u008f\u0090\5b\62\2\u0090"+
		"\u0091\5\f\7\2\u0091\u0092\5\b\5\2\u0092\u0094\3\2\2\2\u0093\u0089\3\2"+
		"\2\2\u0093\u008e\3\2\2\2\u0094\7\3\2\2\2\u0095\u0099\7&\2\2\u0096\u0098"+
		"\5n8\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\'"+
		"\2\2\u009d\t\3\2\2\2\u009e\u00a2\7&\2\2\u009f\u00a1\5n8\2\u00a0\u009f"+
		"\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\5\22\n\2\u00a6\u00a7\7"+
		"\'\2\2\u00a7\13\3\2\2\2\u00a8\u00b1\7$\2\2\u00a9\u00ae\5\26\f\2\u00aa"+
		"\u00ab\7(\2\2\u00ab\u00ad\5\26\f\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b4\7%\2\2\u00b4\r\3\2\2\2\u00b5\u00b6\7\24\2\2\u00b6\u00b7"+
		"\5b\62\2\u00b7\u00c0\7$\2\2\u00b8\u00bd\5\20\t\2\u00b9\u00ba\7(\2\2\u00ba"+
		"\u00bc\5\20\t\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3"+
		"\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00b8\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7%"+
		"\2\2\u00c3\17\3\2\2\2\u00c4\u00c7\5b\62\2\u00c5\u00c7\5D#\2\u00c6\u00c4"+
		"\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\21\3\2\2\2\u00c8\u00cd\7\30\2\2\u00c9"+
		"\u00ce\5b\62\2\u00ca\u00ce\5d\63\2\u00cb\u00ce\5f\64\2\u00cc\u00ce\5D"+
		"#\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7)\2\2\u00d0\23\3\2\2\2"+
		"\u00d1\u00d2\7 \2\2\u00d2\u00d3\5\26\f\2\u00d3\u00d4\7)\2\2\u00d4\25\3"+
		"\2\2\2\u00d5\u00d8\5\30\r\2\u00d6\u00d8\5\32\16\2\u00d7\u00d5\3\2\2\2"+
		"\u00d7\u00d6\3\2\2\2\u00d8\27\3\2\2\2\u00d9\u00de\5\36\20\2\u00da\u00de"+
		"\5\"\22\2\u00db\u00de\5(\25\2\u00dc\u00de\5\34\17\2\u00dd\u00d9\3\2\2"+
		"\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\31"+
		"\3\2\2\2\u00df\u00e3\5 \21\2\u00e0\u00e3\5$\23\2\u00e1\u00e3\5*\26\2\u00e2"+
		"\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\33\3\2\2"+
		"\2\u00e4\u00e5\7\21\2\2\u00e5\u00e8\5b\62\2\u00e6\u00e7\7\64\2\2\u00e7"+
		"\u00e9\5X-\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\35\3\2\2\2"+
		"\u00ea\u00eb\7\r\2\2\u00eb\u00f5\5b\62\2\u00ec\u00f3\7\64\2\2\u00ed\u00f4"+
		"\5D#\2\u00ee\u00f4\5\16\b\2\u00ef\u00f1\5b\62\2\u00f0\u00f2\5\60\31\2"+
		"\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00ed"+
		"\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00ec\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\37\3\2\2\2\u00f7\u00f8\7\r\2"+
		"\2\u00f8\u0105\5`\61\2\u00f9\u00fa\7\64\2\2\u00fa\u00fb\7&\2\2\u00fb\u0100"+
		"\5&\24\2\u00fc\u00fd\7(\2\2\u00fd\u00ff\5&\24\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7\'\2\2\u0104\u0106\3\2\2\2\u0105"+
		"\u00f9\3\2\2\2\u0105\u0106\3\2\2\2\u0106!\3\2\2\2\u0107\u0108\7\16\2\2"+
		"\u0108\u0112\5b\62\2\u0109\u0110\7\64\2\2\u010a\u0111\5D#\2\u010b\u0111"+
		"\5\16\b\2\u010c\u010e\5b\62\2\u010d\u010f\5\60\31\2\u010e\u010d\3\2\2"+
		"\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010a\3\2\2\2\u0110\u010b"+
		"\3\2\2\2\u0110\u010c\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0109\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113#\3\2\2\2\u0114\u0115\7\16\2\2\u0115\u0122\5`\61\2"+
		"\u0116\u0117\7\64\2\2\u0117\u0118\7&\2\2\u0118\u011d\5&\24\2\u0119\u011a"+
		"\7(\2\2\u011a\u011c\5&\24\2\u011b\u0119\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u0120\u0121\7\'\2\2\u0121\u0123\3\2\2\2\u0122\u0116\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123%\3\2\2\2\u0124\u0128\5D#\2\u0125\u0128\5\16\b\2\u0126"+
		"\u0128\5b\62\2\u0127\u0124\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2"+
		"\2\2\u0128\'\3\2\2\2\u0129\u012a\7\17\2\2\u012a\u0131\5b\62\2\u012b\u012f"+
		"\7\64\2\2\u012c\u0130\5d\63\2\u012d\u0130\5\16\b\2\u012e\u0130\5b\62\2"+
		"\u012f\u012c\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0132"+
		"\3\2\2\2\u0131\u012b\3\2\2\2\u0131\u0132\3\2\2\2\u0132)\3\2\2\2\u0133"+
		"\u0134\7\20\2\2\u0134\u013b\5b\62\2\u0135\u0139\7\64\2\2\u0136\u013a\5"+
		"f\64\2\u0137\u013a\5\16\b\2\u0138\u013a\5b\62\2\u0139\u0136\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0135\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c+\3\2\2\2\u013d\u013e\5b\62\2\u013e\u0148"+
		"\7\64\2\2\u013f\u0149\5d\63\2\u0140\u0149\5f\64\2\u0141\u0149\5D#\2\u0142"+
		"\u0144\5b\62\2\u0143\u0145\5\60\31\2\u0144\u0143\3\2\2\2\u0144\u0145\3"+
		"\2\2\2\u0145\u0149\3\2\2\2\u0146\u0149\5X-\2\u0147\u0149\5\16\b\2\u0148"+
		"\u013f\3\2\2\2\u0148\u0140\3\2\2\2\u0148\u0141\3\2\2\2\u0148\u0142\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a"+
		"\u014c\5.\30\2\u014b\u013d\3\2\2\2\u014b\u014a\3\2\2\2\u014c-\3\2\2\2"+
		"\u014d\u014e\5b\62\2\u014e\u014f\5\60\31\2\u014f\u0152\7\64\2\2\u0150"+
		"\u0153\5D#\2\u0151\u0153\5b\62\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2"+
		"\2\u0153/\3\2\2\2\u0154\u0157\7\"\2\2\u0155\u0158\5b\62\2\u0156\u0158"+
		"\5h\65\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\7#\2\2\u015a\61\3\2\2\2\u015b\u015c\5\64\33\2\u015c\63\3\2\2\2"+
		"\u015d\u015e\7\7\2\2\u015e\u015f\5V,\2\u015f\u0163\5l\67\2\u0160\u0162"+
		"\5\66\34\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2"+
		"\u0163\u0164\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0168"+
		"\58\35\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\65\3\2\2\2\u0169"+
		"\u016a\7\t\2\2\u016a\u016b\5V,\2\u016b\u016c\5l\67\2\u016c\67\3\2\2\2"+
		"\u016d\u016e\7\b\2\2\u016e\u016f\5l\67\2\u016f9\3\2\2\2\u0170\u0174\5"+
		"<\37\2\u0171\u0174\5> \2\u0172\u0174\5@!\2\u0173\u0170\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0173\u0172\3\2\2\2\u0174;\3\2\2\2\u0175\u0176\7\n\2\2\u0176"+
		"\u0179\7$\2\2\u0177\u017a\5,\27\2\u0178\u017a\5\36\20\2\u0179\u0177\3"+
		"\2\2\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\7)\2\2\u017c"+
		"\u017d\5X-\2\u017d\u0180\7)\2\2\u017e\u0181\5B\"\2\u017f\u0181\5,\27\2"+
		"\u0180\u017e\3\2\2\2\u0180\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183"+
		"\7%\2\2\u0183\u0184\5l\67\2\u0184=\3\2\2\2\u0185\u0186\7\13\2\2\u0186"+
		"\u0187\5V,\2\u0187\u0188\5l\67\2\u0188?\3\2\2\2\u0189\u018a\7\f\2\2\u018a"+
		"\u018b\5l\67\2\u018b\u018c\7\13\2\2\u018c\u018d\5V,\2\u018dA\3\2\2\2\u018e"+
		"\u018f\5b\62\2\u018f\u0190\5L\'\2\u0190C\3\2\2\2\u0191\u0192\5F$\2\u0192"+
		"E\3\2\2\2\u0193\u0194\b$\1\2\u0194\u0195\5H%\2\u0195\u019e\3\2\2\2\u0196"+
		"\u0197\f\5\2\2\u0197\u0198\7/\2\2\u0198\u019d\5H%\2\u0199\u019a\f\4\2"+
		"\2\u019a\u019b\7\60\2\2\u019b\u019d\5H%\2\u019c\u0196\3\2\2\2\u019c\u0199"+
		"\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"G\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\b%\1\2\u01a2\u01a3\5J&\2\u01a3"+
		"\u01af\3\2\2\2\u01a4\u01a5\f\6\2\2\u01a5\u01a6\7\61\2\2\u01a6\u01ae\5"+
		"J&\2\u01a7\u01a8\f\5\2\2\u01a8\u01a9\7\62\2\2\u01a9\u01ae\5J&\2\u01aa"+
		"\u01ab\f\4\2\2\u01ab\u01ac\7\63\2\2\u01ac\u01ae\5J&\2\u01ad\u01a4\3\2"+
		"\2\2\u01ad\u01a7\3\2\2\2\u01ad\u01aa\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af"+
		"\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0I\3\2\2\2\u01b1\u01af\3\2\2\2"+
		"\u01b2\u01bb\5b\62\2\u01b3\u01bb\5h\65\2\u01b4\u01bb\5j\66\2\u01b5\u01b6"+
		"\7$\2\2\u01b6\u01b7\5D#\2\u01b7\u01b8\7%\2\2\u01b8\u01bb\3\2\2\2\u01b9"+
		"\u01bb\5\16\b\2\u01ba\u01b2\3\2\2\2\u01ba\u01b3\3\2\2\2\u01ba\u01b4\3"+
		"\2\2\2\u01ba\u01b5\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bbK\3\2\2\2\u01bc\u01c1"+
		"\7-\2\2\u01bd\u01c1\7.\2\2\u01be\u01bf\t\3\2\2\u01bf\u01c1\7\5\2\2\u01c0"+
		"\u01bc\3\2\2\2\u01c0\u01bd\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1M\3\2\2\2"+
		"\u01c2\u01c3\7\25\2\2\u01c3\u01c4\5P)\2\u01c4O\3\2\2\2\u01c5\u01c6\7$"+
		"\2\2\u01c6\u01cb\5R*\2\u01c7\u01c8\7/\2\2\u01c8\u01ca\5R*\2\u01c9\u01c7"+
		"\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01ce\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01cf\7%\2\2\u01cfQ\3\2\2\2\u01d0"+
		"\u01d3\5f\64\2\u01d1\u01d3\5b\62\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2"+
		"\2\2\u01d3S\3\2\2\2\u01d4\u01d5\7\26\2\2\u01d5\u01d6\7$\2\2\u01d6\u01d7"+
		"\5f\64\2\u01d7\u01d8\7(\2\2\u01d8\u01d9\5b\62\2\u01d9\u01da\7%\2\2\u01da"+
		"U\3\2\2\2\u01db\u01dc\7$\2\2\u01dc\u01dd\5X-\2\u01dd\u01de\7%\2\2\u01de"+
		"W\3\2\2\2\u01df\u01e0\5Z.\2\u01e0Y\3\2\2\2\u01e1\u01e2\b.\1\2\u01e2\u01e3"+
		"\5\\/\2\u01e3\u01e9\3\2\2\2\u01e4\u01e5\f\4\2\2\u01e5\u01e6\t\4\2\2\u01e6"+
		"\u01e8\5\\/\2\u01e7\u01e4\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2"+
		"\2\2\u01e9\u01ea\3\2\2\2\u01ea[\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed"+
		"\5^\60\2\u01ed\u01ee\t\5\2\2\u01ee\u01ef\5^\60\2\u01ef\u01f8\3\2\2\2\u01f0"+
		"\u01f8\5^\60\2\u01f1\u01f2\7$\2\2\u01f2\u01f3\5X-\2\u01f3\u01f4\7%\2\2"+
		"\u01f4\u01f8\3\2\2\2\u01f5\u01f8\7\31\2\2\u01f6\u01f8\7\32\2\2\u01f7\u01ec"+
		"\3\2\2\2\u01f7\u01f0\3\2\2\2\u01f7\u01f1\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7"+
		"\u01f6\3\2\2\2\u01f8]\3\2\2\2\u01f9\u01fc\5D#\2\u01fa\u01fc\5b\62\2\u01fb"+
		"\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc_\3\2\2\2\u01fd\u01fe\5b\62\2"+
		"\u01fe\u01ff\7\"\2\2\u01ff\u0200\5h\65\2\u0200\u0201\7#\2\2\u0201a\3\2"+
		"\2\2\u0202\u0203\7!\2\2\u0203c\3\2\2\2\u0204\u0205\7\3\2\2\u0205e\3\2"+
		"\2\2\u0206\u0207\7\4\2\2\u0207g\3\2\2\2\u0208\u0209\7\5\2\2\u0209i\3\2"+
		"\2\2\u020a\u020b\7\6\2\2\u020bk\3\2\2\2\u020c\u0210\7&\2\2\u020d\u020f"+
		"\5n8\2\u020e\u020d\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0214\7\'"+
		"\2\2\u0214m\3\2\2\2\u0215\u021e\5\26\f\2\u0216\u021e\5,\27\2\u0217\u021e"+
		"\5\62\32\2\u0218\u021e\5:\36\2\u0219\u021e\5B\"\2\u021a\u021e\5\16\b\2"+
		"\u021b\u021e\5N(\2\u021c\u021e\5T+\2\u021d\u0215\3\2\2\2\u021d\u0216\3"+
		"\2\2\2\u021d\u0217\3\2\2\2\u021d\u0218\3\2\2\2\u021d\u0219\3\2\2\2\u021d"+
		"\u021a\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021c\3\2\2\2\u021e\u021f\3\2"+
		"\2\2\u021f\u0220\7)\2\2\u0220o\3\2\2\28sy\u0080\u0093\u0099\u00a2\u00ae"+
		"\u00b1\u00bd\u00c0\u00c6\u00cd\u00d7\u00dd\u00e2\u00e8\u00f1\u00f3\u00f5"+
		"\u0100\u0105\u010e\u0110\u0112\u011d\u0122\u0127\u012f\u0131\u0139\u013b"+
		"\u0144\u0148\u014b\u0152\u0157\u0163\u0167\u0173\u0179\u0180\u019c\u019e"+
		"\u01ad\u01af\u01ba\u01c0\u01cb\u01d2\u01e9\u01f7\u01fb\u0210\u021d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}