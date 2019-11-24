// Generated from C:/Users/Santi/Desktop/pain/CompilerProjectUpdated/CmpilerParser\g.g4 by ANTLR 4.7.2
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
		RULE_arrval = 14, RULE_chardeclaration = 15, RULE_chararrdeclaration = 16, 
		RULE_assignment = 17, RULE_arrayassignment = 18, RULE_index = 19, RULE_condition = 20, 
		RULE_ifstatement = 21, RULE_elseifstatement = 22, RULE_elsestatement = 23, 
		RULE_loop = 24, RULE_loopfor = 25, RULE_loopwhile = 26, RULE_loopdowhile = 27, 
		RULE_operation = 28, RULE_opr = 29, RULE_addopr = 30, RULE_multopr = 31, 
		RULE_terminalopr = 32, RULE_shortopr = 33, RULE_print = 34, RULE_printblock = 35, 
		RULE_stringcontent = 36, RULE_scan = 37, RULE_nestedcondition = 38, RULE_booleanexp = 39, 
		RULE_logic = 40, RULE_relation = 41, RULE_booleanvalue = 42, RULE_vararrname = 43, 
		RULE_identifier = 44, RULE_charliteral = 45, RULE_stringliteral = 46, 
		RULE_intliteral = 47, RULE_floatliteral = 48, RULE_block = 49, RULE_statement = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "function", "call", "returnstatement", "globaldelcaration", 
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
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBAL) {
				{
				{
				setState(102);
				globaldelcaration();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(108);
				function();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			main();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(115);
				function();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
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
			setState(123);
			match(MAIN);
			setState(124);
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
			setState(126);
			match(FUNCTION);
			setState(127);
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
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(128);
				match(LBRACKET);
				setState(129);
				match(RBRACKET);
				}
			}

			setState(132);
			identifier();
			setState(133);
			match(LPARENTHESIS);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << BOOLEAN))) != 0)) {
				{
				setState(134);
				declaration();
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(135);
					match(COMMA);
					setState(136);
					declaration();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(144);
			match(RPARENTHESIS);
			setState(145);
			match(LBRACE);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << BOOLEAN) | (1L << CALL) | (1L << PRINT) | (1L << SCAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(146);
				statement();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(152);
				returnstatement();
				}
			}

			setState(155);
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
			setState(157);
			match(CALL);
			setState(158);
			identifier();
			setState(159);
			match(LPARENTHESIS);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CALL) | (1L << IDENTIFIER) | (1L << LPARENTHESIS))) != 0)) {
				{
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(160);
					identifier();
					}
					break;
				case 2:
					{
					setState(161);
					opr();
					}
					break;
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(164);
					match(COMMA);
					setState(167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(165);
						identifier();
						}
						break;
					case 2:
						{
						setState(166);
						opr();
						}
						break;
					}
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(176);
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
			setState(178);
			match(RETURN);
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(179);
				identifier();
				}
				break;
			case 2:
				{
				setState(180);
				intliteral();
				}
				break;
			case 3:
				{
				setState(181);
				floatliteral();
				}
				break;
			case 4:
				{
				setState(182);
				charliteral();
				}
				break;
			case 5:
				{
				setState(183);
				stringliteral();
				}
				break;
			case 6:
				{
				setState(184);
				booleanexp();
				}
				break;
			case 7:
				{
				setState(185);
				opr();
				}
				break;
			}
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
			setState(190);
			match(GLOBAL);
			setState(191);
			declaration();
			setState(192);
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
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				singledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
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
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				intdeclaration();
				}
				break;
			case FLOATING_POINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				floatdeclaration();
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				chardeclaration();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
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
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				intarrdeclaration();
				}
				break;
			case FLOATING_POINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				floatarrdeclaration();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
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
			setState(209);
			match(BOOLEAN);
			setState(210);
			((BooleandeclarationContext)_localctx).id = identifier();
			{
			setState(211);
			match(EQUALS);
			setState(212);
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
		enterRule(_localctx, 20, RULE_intdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(INTEGER);
			setState(215);
			((IntdeclarationContext)_localctx).id = identifier();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(216);
				match(EQUALS);
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(217);
					opr();
					}
					break;
				case 2:
					{
					setState(218);
					call();
					}
					break;
				case 3:
					{
					setState(219);
					identifier();
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LBRACKET) {
						{
						setState(220);
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
		enterRule(_localctx, 22, RULE_intarrdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(INTEGER);
			setState(228);
			vararrname();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(229);
				match(EQUALS);
				setState(230);
				match(LBRACE);
				setState(231);
				arrval();
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(232);
					match(COMMA);
					setState(233);
					arrval();
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
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
		enterRule(_localctx, 24, RULE_floatdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(FLOATING_POINT);
			setState(244);
			((FloatdeclarationContext)_localctx).id = identifier();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(245);
				match(EQUALS);
				setState(252);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(246);
					opr();
					}
					break;
				case 2:
					{
					setState(247);
					call();
					}
					break;
				case 3:
					{
					setState(248);
					identifier();
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LBRACKET) {
						{
						setState(249);
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
		enterRule(_localctx, 26, RULE_floatarrdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(FLOATING_POINT);
			setState(257);
			vararrname();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(258);
				match(EQUALS);
				setState(259);
				match(LBRACE);
				setState(260);
				arrval();
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(261);
					match(COMMA);
					setState(262);
					arrval();
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(268);
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
		enterRule(_localctx, 28, RULE_arrval);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				opr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
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
		enterRule(_localctx, 30, RULE_chardeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(CHARACTER);
			setState(278);
			((ChardeclarationContext)_localctx).id = identifier();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(279);
				match(EQUALS);
				setState(283);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR_LITERAL:
					{
					setState(280);
					charliteral();
					}
					break;
				case CALL:
					{
					setState(281);
					call();
					}
					break;
				case IDENTIFIER:
					{
					setState(282);
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
		enterRule(_localctx, 32, RULE_chararrdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(STRING);
			setState(288);
			((ChararrdeclarationContext)_localctx).id = identifier();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(289);
				match(EQUALS);
				setState(293);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
					{
					setState(290);
					stringliteral();
					}
					break;
				case CALL:
					{
					setState(291);
					call();
					}
					break;
				case IDENTIFIER:
					{
					setState(292);
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
		enterRule(_localctx, 34, RULE_assignment);
		int _la;
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(297);
				((AssignmentContext)_localctx).id = identifier();
				setState(298);
				match(EQUALS);
				setState(308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(299);
					charliteral();
					}
					break;
				case 2:
					{
					setState(300);
					stringliteral();
					}
					break;
				case 3:
					{
					setState(301);
					identifier();
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LBRACKET) {
						{
						setState(302);
						index();
						}
					}

					}
					break;
				case 4:
					{
					setState(305);
					opr();
					}
					break;
				case 5:
					{
					setState(306);
					booleanexp();
					}
					break;
				case 6:
					{
					setState(307);
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
				setState(310);
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
		enterRule(_localctx, 36, RULE_arrayassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			((ArrayassignmentContext)_localctx).id = identifier();
			setState(314);
			index();
			setState(315);
			match(EQUALS);
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(316);
				opr();
				}
				break;
			case 2:
				{
				setState(317);
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
		enterRule(_localctx, 38, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(LBRACKET);
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(321);
				identifier();
				}
				break;
			case INT_LITERAL:
				{
				setState(322);
				intliteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(325);
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
		enterRule(_localctx, 40, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
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
		enterRule(_localctx, 42, RULE_ifstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(IF);
			setState(330);
			nestedcondition();
			setState(331);
			((IfstatementContext)_localctx).start = block();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(332);
				elseifstatement();
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(338);
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
		enterRule(_localctx, 44, RULE_elseifstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(ELSEIF);
			setState(342);
			nestedcondition();
			setState(343);
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
		enterRule(_localctx, 46, RULE_elsestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(ELSE);
			setState(346);
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
		enterRule(_localctx, 48, RULE_loop);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				loopfor();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				loopwhile();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
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
		enterRule(_localctx, 50, RULE_loopfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(FOR);
			setState(354);
			match(LPARENTHESIS);
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(355);
				assignment();
				}
				break;
			case INTEGER:
				{
				setState(356);
				intdeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(359);
			match(SEMICOLON);
			setState(360);
			booleanexp();
			setState(361);
			match(SEMICOLON);
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(362);
				operation();
				}
				break;
			case 2:
				{
				setState(363);
				assignment();
				}
				break;
			}
			setState(366);
			match(RPARENTHESIS);
			setState(367);
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
		enterRule(_localctx, 52, RULE_loopwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(WHILE);
			setState(370);
			nestedcondition();
			setState(371);
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
		enterRule(_localctx, 54, RULE_loopdowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(DO);
			setState(374);
			block();
			setState(375);
			match(WHILE);
			setState(376);
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
		enterRule(_localctx, 56, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			identifier();
			setState(379);
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
		enterRule(_localctx, 58, RULE_opr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_addopr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(384);
			multopr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(392);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new AddoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addopr);
						setState(386);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(387);
						((AddoprContext)_localctx).op = match(PLUS);
						setState(388);
						multopr(0);
						}
						break;
					case 2:
						{
						_localctx = new AddoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addopr);
						setState(389);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(390);
						((AddoprContext)_localctx).op = match(MINUS);
						setState(391);
						multopr(0);
						}
						break;
					}
					} 
				}
				setState(396);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_multopr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(398);
			terminalopr();
			}
			_ctx.stop = _input.LT(-1);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(409);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new MultoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multopr);
						setState(400);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(401);
						((MultoprContext)_localctx).op = match(MUL);
						setState(402);
						terminalopr();
						}
						break;
					case 2:
						{
						_localctx = new MultoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multopr);
						setState(403);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(404);
						((MultoprContext)_localctx).op = match(DIV);
						setState(405);
						terminalopr();
						}
						break;
					case 3:
						{
						_localctx = new MultoprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multopr);
						setState(406);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(407);
						((MultoprContext)_localctx).op = match(MOD);
						setState(408);
						terminalopr();
						}
						break;
					}
					} 
				}
				setState(413);
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
		enterRule(_localctx, 64, RULE_terminalopr);
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				identifier();
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				intliteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				floatliteral();
				}
				break;
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				match(LPARENTHESIS);
				setState(418);
				opr();
				setState(419);
				match(RPARENTHESIS);
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 5);
				{
				setState(421);
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
		enterRule(_localctx, 66, RULE_shortopr);
		int _la;
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(PLUS_PLUS);
				}
				break;
			case MINUS_MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(MINUS_MINUS);
				}
				break;
			case PLUS_EQUALS:
			case MIN_EQUALS:
			case MUL_EQUALS:
			case DIV_EQUALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_EQUALS) | (1L << MIN_EQUALS) | (1L << MUL_EQUALS) | (1L << DIV_EQUALS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(427);
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
		enterRule(_localctx, 68, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(PRINT);
			setState(431);
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
		enterRule(_localctx, 70, RULE_printblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(LPARENTHESIS);
			setState(434);
			stringcontent();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(435);
				match(PLUS);
				setState(436);
				stringcontent();
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 72, RULE_stringcontent);
		try {
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				stringliteral();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
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
		enterRule(_localctx, 74, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(SCAN);
			setState(449);
			match(LPARENTHESIS);
			setState(450);
			stringliteral();
			setState(451);
			match(COMMA);
			setState(452);
			identifier();
			setState(453);
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
		enterRule(_localctx, 76, RULE_nestedcondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(LPARENTHESIS);
			setState(456);
			booleanexp();
			setState(457);
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
		enterRule(_localctx, 78, RULE_booleanexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_logic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(462);
			relation();
			}
			_ctx.stop = _input.LT(-1);
			setState(469);
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
					setState(464);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(465);
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
					setState(466);
					relation();
					}
					} 
				}
				setState(471);
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
		enterRule(_localctx, 82, RULE_relation);
		int _la;
		try {
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				booleanvalue();
				setState(473);
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
				setState(474);
				booleanvalue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				booleanvalue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(477);
				match(LPARENTHESIS);
				setState(478);
				booleanexp();
				setState(479);
				match(RPARENTHESIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(481);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(482);
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
		enterRule(_localctx, 84, RULE_booleanvalue);
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				opr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
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
		enterRule(_localctx, 86, RULE_vararrname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			identifier();
			setState(490);
			match(LBRACKET);
			setState(491);
			intliteral();
			setState(492);
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
		enterRule(_localctx, 88, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
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
		enterRule(_localctx, 90, RULE_charliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
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
		enterRule(_localctx, 92, RULE_stringliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
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
		enterRule(_localctx, 94, RULE_intliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
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
		enterRule(_localctx, 96, RULE_floatliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
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
		enterRule(_localctx, 98, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(LBRACE);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << CHARACTER) | (1L << STRING) | (1L << BOOLEAN) | (1L << CALL) | (1L << PRINT) | (1L << SCAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(505);
				statement();
				}
				}
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(511);
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
		enterRule(_localctx, 100, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(513);
				declaration();
				}
				break;
			case 2:
				{
				setState(514);
				assignment();
				}
				break;
			case 3:
				{
				setState(515);
				condition();
				}
				break;
			case 4:
				{
				setState(516);
				loop();
				}
				break;
			case 5:
				{
				setState(517);
				operation();
				}
				break;
			case 6:
				{
				setState(518);
				call();
				}
				break;
			case 7:
				{
				setState(519);
				print();
				}
				break;
			case 8:
				{
				setState(520);
				scan();
				}
				break;
			}
			setState(523);
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
		case 30:
			return addopr_sempred((AddoprContext)_localctx, predIndex);
		case 31:
			return multopr_sempred((MultoprContext)_localctx, predIndex);
		case 40:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u0210\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\7\2j\n\2\f\2\16\2m\13\2\3\2\7\2p\n\2\f\2\16\2s\13\2\3\2\3\2\7"+
		"\2w\n\2\f\2\16\2z\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u0085\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4\u008c\n\4\f\4\16\4\u008f\13\4\5\4\u0091\n\4"+
		"\3\4\3\4\3\4\7\4\u0096\n\4\f\4\16\4\u0099\13\4\3\4\5\4\u009c\n\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\5\5\u00a5\n\5\3\5\3\5\3\5\5\5\u00aa\n\5\7\5\u00ac"+
		"\n\5\f\5\16\5\u00af\13\5\5\5\u00b1\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u00bd\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u00c7\n\b\3"+
		"\t\3\t\3\t\3\t\5\t\u00cd\n\t\3\n\3\n\3\n\5\n\u00d2\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e0\n\f\5\f\u00e2\n\f\5\f"+
		"\u00e4\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ed\n\r\f\r\16\r\u00f0\13"+
		"\r\3\r\3\r\5\r\u00f4\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00fd"+
		"\n\16\5\16\u00ff\n\16\5\16\u0101\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\7\17\u010a\n\17\f\17\16\17\u010d\13\17\3\17\3\17\5\17\u0111\n\17\3"+
		"\20\3\20\3\20\5\20\u0116\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u011e"+
		"\n\21\5\21\u0120\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0128\n\22\5"+
		"\22\u012a\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0132\n\23\3\23\3\23"+
		"\3\23\5\23\u0137\n\23\3\23\5\23\u013a\n\23\3\24\3\24\3\24\3\24\3\24\5"+
		"\24\u0141\n\24\3\25\3\25\3\25\5\25\u0146\n\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\7\27\u0150\n\27\f\27\16\27\u0153\13\27\3\27\5\27\u0156"+
		"\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u0162\n\32"+
		"\3\33\3\33\3\33\3\33\5\33\u0168\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u016f"+
		"\n\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u018b\n \f \16 \u018e"+
		"\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u019c\n!\f!\16!\u019f\13!"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01a9\n\"\3#\3#\3#\3#\5#\u01af\n"+
		"#\3$\3$\3$\3%\3%\3%\3%\7%\u01b8\n%\f%\16%\u01bb\13%\3%\3%\3&\3&\5&\u01c1"+
		"\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\7"+
		"*\u01d6\n*\f*\16*\u01d9\13*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01e6"+
		"\n+\3,\3,\5,\u01ea\n,\3-\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\7\63\u01fd\n\63\f\63\16\63\u0200\13\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u020c\n\64\3\64\3\64\3\64"+
		"\2\5>@R\65\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdf\2\6\4\2\r\20\22\22\3\2\658\3\2?@\3\29>\2\u0232"+
		"\2k\3\2\2\2\4}\3\2\2\2\6\u0080\3\2\2\2\b\u009f\3\2\2\2\n\u00b4\3\2\2\2"+
		"\f\u00c0\3\2\2\2\16\u00c6\3\2\2\2\20\u00cc\3\2\2\2\22\u00d1\3\2\2\2\24"+
		"\u00d3\3\2\2\2\26\u00d8\3\2\2\2\30\u00e5\3\2\2\2\32\u00f5\3\2\2\2\34\u0102"+
		"\3\2\2\2\36\u0115\3\2\2\2 \u0117\3\2\2\2\"\u0121\3\2\2\2$\u0139\3\2\2"+
		"\2&\u013b\3\2\2\2(\u0142\3\2\2\2*\u0149\3\2\2\2,\u014b\3\2\2\2.\u0157"+
		"\3\2\2\2\60\u015b\3\2\2\2\62\u0161\3\2\2\2\64\u0163\3\2\2\2\66\u0173\3"+
		"\2\2\28\u0177\3\2\2\2:\u017c\3\2\2\2<\u017f\3\2\2\2>\u0181\3\2\2\2@\u018f"+
		"\3\2\2\2B\u01a8\3\2\2\2D\u01ae\3\2\2\2F\u01b0\3\2\2\2H\u01b3\3\2\2\2J"+
		"\u01c0\3\2\2\2L\u01c2\3\2\2\2N\u01c9\3\2\2\2P\u01cd\3\2\2\2R\u01cf\3\2"+
		"\2\2T\u01e5\3\2\2\2V\u01e9\3\2\2\2X\u01eb\3\2\2\2Z\u01f0\3\2\2\2\\\u01f2"+
		"\3\2\2\2^\u01f4\3\2\2\2`\u01f6\3\2\2\2b\u01f8\3\2\2\2d\u01fa\3\2\2\2f"+
		"\u020b\3\2\2\2hj\5\f\7\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lq\3\2"+
		"\2\2mk\3\2\2\2np\5\6\4\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2"+
		"\2\2sq\3\2\2\2tx\5\4\3\2uw\5\6\4\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2"+
		"\2\2y{\3\2\2\2zx\3\2\2\2{|\7\2\2\3|\3\3\2\2\2}~\7\27\2\2~\177\5d\63\2"+
		"\177\5\3\2\2\2\u0080\u0081\7\23\2\2\u0081\u0084\t\2\2\2\u0082\u0083\7"+
		"\"\2\2\u0083\u0085\7#\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\5Z.\2\u0087\u0090\7$\2\2\u0088\u008d\5\16\b"+
		"\2\u0089\u008a\7(\2\2\u008a\u008c\5\16\b\2\u008b\u0089\3\2\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0088\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0093\7%\2\2\u0093\u0097\7&\2\2\u0094\u0096\5f\64\2\u0095\u0094"+
		"\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c\5\n\6\2\u009b\u009a\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\'\2\2\u009e"+
		"\7\3\2\2\2\u009f\u00a0\7\24\2\2\u00a0\u00a1\5Z.\2\u00a1\u00b0\7$\2\2\u00a2"+
		"\u00a5\5Z.\2\u00a3\u00a5\5<\37\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2"+
		"\2\u00a5\u00ad\3\2\2\2\u00a6\u00a9\7(\2\2\u00a7\u00aa\5Z.\2\u00a8\u00aa"+
		"\5<\37\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab"+
		"\u00a6\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00a4\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7%\2\2\u00b3\t\3\2\2\2"+
		"\u00b4\u00bc\7\30\2\2\u00b5\u00bd\5Z.\2\u00b6\u00bd\5`\61\2\u00b7\u00bd"+
		"\5b\62\2\u00b8\u00bd\5\\/\2\u00b9\u00bd\5^\60\2\u00ba\u00bd\5P)\2\u00bb"+
		"\u00bd\5<\37\2\u00bc\u00b5\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b7\3\2"+
		"\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7)\2\2\u00bf\13\3\2\2\2"+
		"\u00c0\u00c1\7 \2\2\u00c1\u00c2\5\16\b\2\u00c2\u00c3\7)\2\2\u00c3\r\3"+
		"\2\2\2\u00c4\u00c7\5\20\t\2\u00c5\u00c7\5\22\n\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\17\3\2\2\2\u00c8\u00cd\5\26\f\2\u00c9\u00cd\5\32"+
		"\16\2\u00ca\u00cd\5 \21\2\u00cb\u00cd\5\24\13\2\u00cc\u00c8\3\2\2\2\u00cc"+
		"\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\21\3\2\2"+
		"\2\u00ce\u00d2\5\30\r\2\u00cf\u00d2\5\34\17\2\u00d0\u00d2\5\"\22\2\u00d1"+
		"\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\23\3\2\2"+
		"\2\u00d3\u00d4\7\21\2\2\u00d4\u00d5\5Z.\2\u00d5\u00d6\7\64\2\2\u00d6\u00d7"+
		"\5P)\2\u00d7\25\3\2\2\2\u00d8\u00d9\7\r\2\2\u00d9\u00e3\5Z.\2\u00da\u00e1"+
		"\7\64\2\2\u00db\u00e2\5<\37\2\u00dc\u00e2\5\b\5\2\u00dd\u00df\5Z.\2\u00de"+
		"\u00e0\5(\25\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2"+
		"\2\2\u00e1\u00db\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\27\3\2\2"+
		"\2\u00e5\u00e6\7\r\2\2\u00e6\u00f3\5X-\2\u00e7\u00e8\7\64\2\2\u00e8\u00e9"+
		"\7&\2\2\u00e9\u00ee\5\36\20\2\u00ea\u00eb\7(\2\2\u00eb\u00ed\5\36\20\2"+
		"\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\'\2\2\u00f2"+
		"\u00f4\3\2\2\2\u00f3\u00e7\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\31\3\2\2"+
		"\2\u00f5\u00f6\7\16\2\2\u00f6\u0100\5Z.\2\u00f7\u00fe\7\64\2\2\u00f8\u00ff"+
		"\5<\37\2\u00f9\u00ff\5\b\5\2\u00fa\u00fc\5Z.\2\u00fb\u00fd\5(\25\2\u00fc"+
		"\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f8\3\2"+
		"\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fa\3\2\2\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u00f7\3\2\2\2\u0100\u0101\3\2\2\2\u0101\33\3\2\2\2\u0102\u0103\7\16\2"+
		"\2\u0103\u0110\5X-\2\u0104\u0105\7\64\2\2\u0105\u0106\7&\2\2\u0106\u010b"+
		"\5\36\20\2\u0107\u0108\7(\2\2\u0108\u010a\5\36\20\2\u0109\u0107\3\2\2"+
		"\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7\'\2\2\u010f\u0111\3\2\2\2\u0110"+
		"\u0104\3\2\2\2\u0110\u0111\3\2\2\2\u0111\35\3\2\2\2\u0112\u0116\5<\37"+
		"\2\u0113\u0116\5\b\5\2\u0114\u0116\5Z.\2\u0115\u0112\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0115\u0114\3\2\2\2\u0116\37\3\2\2\2\u0117\u0118\7\17\2\2\u0118"+
		"\u011f\5Z.\2\u0119\u011d\7\64\2\2\u011a\u011e\5\\/\2\u011b\u011e\5\b\5"+
		"\2\u011c\u011e\5Z.\2\u011d\u011a\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c"+
		"\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u0119\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"!\3\2\2\2\u0121\u0122\7\20\2\2\u0122\u0129\5Z.\2\u0123\u0127\7\64\2\2"+
		"\u0124\u0128\5^\60\2\u0125\u0128\5\b\5\2\u0126\u0128\5Z.\2\u0127\u0124"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u012a\3\2\2\2\u0129"+
		"\u0123\3\2\2\2\u0129\u012a\3\2\2\2\u012a#\3\2\2\2\u012b\u012c\5Z.\2\u012c"+
		"\u0136\7\64\2\2\u012d\u0137\5\\/\2\u012e\u0137\5^\60\2\u012f\u0131\5Z"+
		".\2\u0130\u0132\5(\25\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0137\3\2\2\2\u0133\u0137\5<\37\2\u0134\u0137\5P)\2\u0135\u0137\5\b\5"+
		"\2\u0136\u012d\3\2\2\2\u0136\u012e\3\2\2\2\u0136\u012f\3\2\2\2\u0136\u0133"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138"+
		"\u013a\5&\24\2\u0139\u012b\3\2\2\2\u0139\u0138\3\2\2\2\u013a%\3\2\2\2"+
		"\u013b\u013c\5Z.\2\u013c\u013d\5(\25\2\u013d\u0140\7\64\2\2\u013e\u0141"+
		"\5<\37\2\u013f\u0141\5Z.\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141"+
		"\'\3\2\2\2\u0142\u0145\7\"\2\2\u0143\u0146\5Z.\2\u0144\u0146\5`\61\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7#"+
		"\2\2\u0148)\3\2\2\2\u0149\u014a\5,\27\2\u014a+\3\2\2\2\u014b\u014c\7\7"+
		"\2\2\u014c\u014d\5N(\2\u014d\u0151\5d\63\2\u014e\u0150\5.\30\2\u014f\u014e"+
		"\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0156\5\60\31\2\u0155\u0154\3"+
		"\2\2\2\u0155\u0156\3\2\2\2\u0156-\3\2\2\2\u0157\u0158\7\t\2\2\u0158\u0159"+
		"\5N(\2\u0159\u015a\5d\63\2\u015a/\3\2\2\2\u015b\u015c\7\b\2\2\u015c\u015d"+
		"\5d\63\2\u015d\61\3\2\2\2\u015e\u0162\5\64\33\2\u015f\u0162\5\66\34\2"+
		"\u0160\u0162\58\35\2\u0161\u015e\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0160"+
		"\3\2\2\2\u0162\63\3\2\2\2\u0163\u0164\7\n\2\2\u0164\u0167\7$\2\2\u0165"+
		"\u0168\5$\23\2\u0166\u0168\5\26\f\2\u0167\u0165\3\2\2\2\u0167\u0166\3"+
		"\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\7)\2\2\u016a\u016b\5P)\2\u016b"+
		"\u016e\7)\2\2\u016c\u016f\5:\36\2\u016d\u016f\5$\23\2\u016e\u016c\3\2"+
		"\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7%\2\2\u0171"+
		"\u0172\5d\63\2\u0172\65\3\2\2\2\u0173\u0174\7\13\2\2\u0174\u0175\5N(\2"+
		"\u0175\u0176\5d\63\2\u0176\67\3\2\2\2\u0177\u0178\7\f\2\2\u0178\u0179"+
		"\5d\63\2\u0179\u017a\7\13\2\2\u017a\u017b\5N(\2\u017b9\3\2\2\2\u017c\u017d"+
		"\5Z.\2\u017d\u017e\5D#\2\u017e;\3\2\2\2\u017f\u0180\5> \2\u0180=\3\2\2"+
		"\2\u0181\u0182\b \1\2\u0182\u0183\5@!\2\u0183\u018c\3\2\2\2\u0184\u0185"+
		"\f\5\2\2\u0185\u0186\7/\2\2\u0186\u018b\5@!\2\u0187\u0188\f\4\2\2\u0188"+
		"\u0189\7\60\2\2\u0189\u018b\5@!\2\u018a\u0184\3\2\2\2\u018a\u0187\3\2"+
		"\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"?\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\b!\1\2\u0190\u0191\5B\"\2\u0191"+
		"\u019d\3\2\2\2\u0192\u0193\f\6\2\2\u0193\u0194\7\61\2\2\u0194\u019c\5"+
		"B\"\2\u0195\u0196\f\5\2\2\u0196\u0197\7\62\2\2\u0197\u019c\5B\"\2\u0198"+
		"\u0199\f\4\2\2\u0199\u019a\7\63\2\2\u019a\u019c\5B\"\2\u019b\u0192\3\2"+
		"\2\2\u019b\u0195\3\2\2\2\u019b\u0198\3\2\2\2\u019c\u019f\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019eA\3\2\2\2\u019f\u019d\3\2\2\2"+
		"\u01a0\u01a9\5Z.\2\u01a1\u01a9\5`\61\2\u01a2\u01a9\5b\62\2\u01a3\u01a4"+
		"\7$\2\2\u01a4\u01a5\5<\37\2\u01a5\u01a6\7%\2\2\u01a6\u01a9\3\2\2\2\u01a7"+
		"\u01a9\5\b\5\2\u01a8\u01a0\3\2\2\2\u01a8\u01a1\3\2\2\2\u01a8\u01a2\3\2"+
		"\2\2\u01a8\u01a3\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9C\3\2\2\2\u01aa\u01af"+
		"\7-\2\2\u01ab\u01af\7.\2\2\u01ac\u01ad\t\3\2\2\u01ad\u01af\7\5\2\2\u01ae"+
		"\u01aa\3\2\2\2\u01ae\u01ab\3\2\2\2\u01ae\u01ac\3\2\2\2\u01afE\3\2\2\2"+
		"\u01b0\u01b1\7\25\2\2\u01b1\u01b2\5H%\2\u01b2G\3\2\2\2\u01b3\u01b4\7$"+
		"\2\2\u01b4\u01b9\5J&\2\u01b5\u01b6\7/\2\2\u01b6\u01b8\5J&\2\u01b7\u01b5"+
		"\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\7%\2\2\u01bdI\3\2\2\2\u01be"+
		"\u01c1\5^\60\2\u01bf\u01c1\5Z.\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2"+
		"\2\u01c1K\3\2\2\2\u01c2\u01c3\7\26\2\2\u01c3\u01c4\7$\2\2\u01c4\u01c5"+
		"\5^\60\2\u01c5\u01c6\7(\2\2\u01c6\u01c7\5Z.\2\u01c7\u01c8\7%\2\2\u01c8"+
		"M\3\2\2\2\u01c9\u01ca\7$\2\2\u01ca\u01cb\5P)\2\u01cb\u01cc\7%\2\2\u01cc"+
		"O\3\2\2\2\u01cd\u01ce\5R*\2\u01ceQ\3\2\2\2\u01cf\u01d0\b*\1\2\u01d0\u01d1"+
		"\5T+\2\u01d1\u01d7\3\2\2\2\u01d2\u01d3\f\4\2\2\u01d3\u01d4\t\4\2\2\u01d4"+
		"\u01d6\5T+\2\u01d5\u01d2\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2"+
		"\2\u01d7\u01d8\3\2\2\2\u01d8S\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01db"+
		"\5V,\2\u01db\u01dc\t\5\2\2\u01dc\u01dd\5V,\2\u01dd\u01e6\3\2\2\2\u01de"+
		"\u01e6\5V,\2\u01df\u01e0\7$\2\2\u01e0\u01e1\5P)\2\u01e1\u01e2\7%\2\2\u01e2"+
		"\u01e6\3\2\2\2\u01e3\u01e6\7\31\2\2\u01e4\u01e6\7\32\2\2\u01e5\u01da\3"+
		"\2\2\2\u01e5\u01de\3\2\2\2\u01e5\u01df\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5"+
		"\u01e4\3\2\2\2\u01e6U\3\2\2\2\u01e7\u01ea\5<\37\2\u01e8\u01ea\5Z.\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01e8\3\2\2\2\u01eaW\3\2\2\2\u01eb\u01ec\5Z.\2\u01ec"+
		"\u01ed\7\"\2\2\u01ed\u01ee\5`\61\2\u01ee\u01ef\7#\2\2\u01efY\3\2\2\2\u01f0"+
		"\u01f1\7!\2\2\u01f1[\3\2\2\2\u01f2\u01f3\7\3\2\2\u01f3]\3\2\2\2\u01f4"+
		"\u01f5\7\4\2\2\u01f5_\3\2\2\2\u01f6\u01f7\7\5\2\2\u01f7a\3\2\2\2\u01f8"+
		"\u01f9\7\6\2\2\u01f9c\3\2\2\2\u01fa\u01fe\7&\2\2\u01fb\u01fd\5f\64\2\u01fc"+
		"\u01fb\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2"+
		"\2\2\u01ff\u0201\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0202\7\'\2\2\u0202"+
		"e\3\2\2\2\u0203\u020c\5\16\b\2\u0204\u020c\5$\23\2\u0205\u020c\5*\26\2"+
		"\u0206\u020c\5\62\32\2\u0207\u020c\5:\36\2\u0208\u020c\5\b\5\2\u0209\u020c"+
		"\5F$\2\u020a\u020c\5L\'\2\u020b\u0203\3\2\2\2\u020b\u0204\3\2\2\2\u020b"+
		"\u0205\3\2\2\2\u020b\u0206\3\2\2\2\u020b\u0207\3\2\2\2\u020b\u0208\3\2"+
		"\2\2\u020b\u0209\3\2\2\2\u020b\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020e\7)\2\2\u020eg\3\2\2\28kqx\u0084\u008d\u0090\u0097\u009b\u00a4\u00a9"+
		"\u00ad\u00b0\u00bc\u00c6\u00cc\u00d1\u00df\u00e1\u00e3\u00ee\u00f3\u00fc"+
		"\u00fe\u0100\u010b\u0110\u0115\u011d\u011f\u0127\u0129\u0131\u0136\u0139"+
		"\u0140\u0145\u0151\u0155\u0161\u0167\u016e\u018a\u018c\u019b\u019d\u01a8"+
		"\u01ae\u01b9\u01c0\u01d7\u01e5\u01e9\u01fe\u020b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}