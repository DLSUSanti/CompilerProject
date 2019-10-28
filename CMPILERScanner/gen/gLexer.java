// Generated from /Users/lorenzoavancena/IdeaProjects/Scannertry/g.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CHAR_LITERAL=1, STRING_LITERAL=2, INT_LITERAL=3, FLOAT_LITERAL=4, IF=5, 
		ELSE=6, ELSEIF=7, FOR=8, WHILE=9, DO=10, INTEGER=11, FLOATING_POINT=12, 
		CHARACTER=13, STRING=14, BOOLEAN=15, VOID=16, FUNCTION=17, CALL=18, PRINT=19, 
		MAIN=20, RETURN=21, TRUE=22, FALSE=23, PUBLIC=24, PRIVATE=25, STATIC=26, 
		INSTANTIATED=27, PROTECTED=28, GLOBAL=29, IDENTIFIER=30, LBRACKET=31, 
		RBRACKET=32, LPARENTHESIS=33, RPARENTHESIS=34, LBRACE=35, RBRACE=36, COMMA=37, 
		SEMICOLON=38, DOT=39, QUOTE_S=40, QUOTE_D=41, PLUS_PLUS=42, MINUS_MINUS=43, 
		PLUS=44, MINUS=45, MUL=46, DIV=47, MOD=48, EQUALS=49, PLUS_EQUALS=50, 
		MIN_EQUALS=51, MUL_EQUALS=52, DIV_EQUALS=53, LESS_THAN=54, LESS_THAN_EQUALS=55, 
		GREATER_THAN=56, GREATER_THAN_EQUALS=57, EQUALS_EQUALS=58, NOT_EQUALS=59, 
		AND=60, OR=61, NOT=62, DIGIT=63, LETTER=64, WS=65;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CHAR_LITERAL", "STRING_LITERAL", "INT_LITERAL", "FLOAT_LITERAL", "IF", 
			"ELSE", "ELSEIF", "FOR", "WHILE", "DO", "INTEGER", "FLOATING_POINT", 
			"CHARACTER", "STRING", "BOOLEAN", "VOID", "FUNCTION", "CALL", "PRINT", 
			"MAIN", "RETURN", "TRUE", "FALSE", "PUBLIC", "PRIVATE", "STATIC", "INSTANTIATED", 
			"PROTECTED", "GLOBAL", "IDENTIFIER", "LBRACKET", "RBRACKET", "LPARENTHESIS", 
			"RPARENTHESIS", "LBRACE", "RBRACE", "COMMA", "SEMICOLON", "DOT", "QUOTE_S", 
			"QUOTE_D", "PLUS_PLUS", "MINUS_MINUS", "PLUS", "MINUS", "MUL", "DIV", 
			"MOD", "EQUALS", "PLUS_EQUALS", "MIN_EQUALS", "MUL_EQUALS", "DIV_EQUALS", 
			"LESS_THAN", "LESS_THAN_EQUALS", "GREATER_THAN", "GREATER_THAN_EQUALS", 
			"EQUALS_EQUALS", "NOT_EQUALS", "AND", "OR", "NOT", "DIGIT", "LETTER", 
			"LetterorDigit", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'si'", "'autre'", "'autre si'", "'pour'", 
			"'tandis que'", "'faire'", "'nombre '", "'decimale '", "'lettre '", "'mot '", 
			"'booleen '", "'vide '", "'fonction '", "'appel '", "'imprimer '", "'essentiel'", 
			"'rappel '", "'vrai'", "'faux'", "'publique '", "'privee '", "'statique '", 
			"'instancie '", "'protege '", "'global '", null, "'['", "']'", "'('", 
			"')'", "'{'", "'}'", "','", "';'", "'.'", "'''", "'\"'", "'++'", "'--'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CHAR_LITERAL", "STRING_LITERAL", "INT_LITERAL", "FLOAT_LITERAL", 
			"IF", "ELSE", "ELSEIF", "FOR", "WHILE", "DO", "INTEGER", "FLOATING_POINT", 
			"CHARACTER", "STRING", "BOOLEAN", "VOID", "FUNCTION", "CALL", "PRINT", 
			"MAIN", "RETURN", "TRUE", "FALSE", "PUBLIC", "PRIVATE", "STATIC", "INSTANTIATED", 
			"PROTECTED", "GLOBAL", "IDENTIFIER", "LBRACKET", "RBRACKET", "LPARENTHESIS", 
			"RPARENTHESIS", "LBRACE", "RBRACE", "COMMA", "SEMICOLON", "DOT", "QUOTE_S", 
			"QUOTE_D", "PLUS_PLUS", "MINUS_MINUS", "PLUS", "MINUS", "MUL", "DIV", 
			"MOD", "EQUALS", "PLUS_EQUALS", "MIN_EQUALS", "MUL_EQUALS", "DIV_EQUALS", 
			"LESS_THAN", "LESS_THAN_EQUALS", "GREATER_THAN", "GREATER_THAN_EQUALS", 
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


	public gLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u01d3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\3\3\3\7\3\u008e"+
		"\n\3\f\3\16\3\u0091\13\3\3\3\3\3\3\4\5\4\u0096\n\4\3\4\6\4\u0099\n\4\r"+
		"\4\16\4\u009a\3\5\5\5\u009e\n\5\3\5\6\5\u00a1\n\5\r\5\16\5\u00a2\3\5\3"+
		"\5\6\5\u00a7\n\5\r\5\16\5\u00a8\5\5\u00ab\n\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\7\37\u0174\n\37\f\37\16\37\u0177\13\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\38\38\38\39\39\3:\3:\3:"+
		"\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\5B\u01cb"+
		"\nB\3C\6C\u01ce\nC\rC\16C\u01cf\3C\3C\2\2D\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083\2\u0085C\3\2\5\3\2\62;\6\2&&C\\aac|\5\2\13\f\17\17\"\"\2\u01db"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0085\3\2\2\2\3\u0087"+
		"\3\2\2\2\5\u008b\3\2\2\2\7\u0095\3\2\2\2\t\u009d\3\2\2\2\13\u00ac\3\2"+
		"\2\2\r\u00af\3\2\2\2\17\u00b5\3\2\2\2\21\u00be\3\2\2\2\23\u00c3\3\2\2"+
		"\2\25\u00ce\3\2\2\2\27\u00d4\3\2\2\2\31\u00dc\3\2\2\2\33\u00e6\3\2\2\2"+
		"\35\u00ee\3\2\2\2\37\u00f3\3\2\2\2!\u00fc\3\2\2\2#\u0102\3\2\2\2%\u010c"+
		"\3\2\2\2\'\u0113\3\2\2\2)\u011d\3\2\2\2+\u0127\3\2\2\2-\u012f\3\2\2\2"+
		"/\u0134\3\2\2\2\61\u0139\3\2\2\2\63\u0143\3\2\2\2\65\u014b\3\2\2\2\67"+
		"\u0155\3\2\2\29\u0160\3\2\2\2;\u0169\3\2\2\2=\u0171\3\2\2\2?\u0178\3\2"+
		"\2\2A\u017a\3\2\2\2C\u017c\3\2\2\2E\u017e\3\2\2\2G\u0180\3\2\2\2I\u0182"+
		"\3\2\2\2K\u0184\3\2\2\2M\u0186\3\2\2\2O\u0188\3\2\2\2Q\u018a\3\2\2\2S"+
		"\u018c\3\2\2\2U\u018e\3\2\2\2W\u0191\3\2\2\2Y\u0194\3\2\2\2[\u0196\3\2"+
		"\2\2]\u0198\3\2\2\2_\u019a\3\2\2\2a\u019c\3\2\2\2c\u019e\3\2\2\2e\u01a0"+
		"\3\2\2\2g\u01a3\3\2\2\2i\u01a6\3\2\2\2k\u01a9\3\2\2\2m\u01ac\3\2\2\2o"+
		"\u01ae\3\2\2\2q\u01b1\3\2\2\2s\u01b3\3\2\2\2u\u01b6\3\2\2\2w\u01b9\3\2"+
		"\2\2y\u01bc\3\2\2\2{\u01bf\3\2\2\2}\u01c2\3\2\2\2\177\u01c4\3\2\2\2\u0081"+
		"\u01c6\3\2\2\2\u0083\u01ca\3\2\2\2\u0085\u01cd\3\2\2\2\u0087\u0088\5Q"+
		")\2\u0088\u0089\13\2\2\2\u0089\u008a\5Q)\2\u008a\4\3\2\2\2\u008b\u008f"+
		"\5S*\2\u008c\u008e\13\2\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0092\u0093\5S*\2\u0093\6\3\2\2\2\u0094\u0096\5[.\2\u0095\u0094\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0099\5\177@\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\b\3\2\2\2\u009c\u009e\5[.\2\u009d\u009c\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u00a1\5\177@\2\u00a0\u009f\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00aa"+
		"\3\2\2\2\u00a4\u00a6\5O(\2\u00a5\u00a7\5\177@\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2"+
		"\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\n\3\2\2\2\u00ac\u00ad"+
		"\7u\2\2\u00ad\u00ae\7k\2\2\u00ae\f\3\2\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1"+
		"\7w\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7g\2\2\u00b4"+
		"\16\3\2\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7v\2\2\u00b8"+
		"\u00b9\7t\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7\"\2\2\u00bb\u00bc\7u\2"+
		"\2\u00bc\u00bd\7k\2\2\u00bd\20\3\2\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0"+
		"\7q\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7t\2\2\u00c2\22\3\2\2\2\u00c3\u00c4"+
		"\7v\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7f\2\2\u00c7"+
		"\u00c8\7k\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7\"\2\2\u00ca\u00cb\7s\2"+
		"\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7g\2\2\u00cd\24\3\2\2\2\u00ce\u00cf"+
		"\7h\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7t\2\2\u00d2"+
		"\u00d3\7g\2\2\u00d3\26\3\2\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7q\2\2\u00d6"+
		"\u00d7\7o\2\2\u00d7\u00d8\7d\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7g\2\2"+
		"\u00da\u00db\7\"\2\2\u00db\30\3\2\2\2\u00dc\u00dd\7f\2\2\u00dd\u00de\7"+
		"g\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7o\2\2\u00e1\u00e2"+
		"\7c\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7\"\2\2\u00e5"+
		"\32\3\2\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7v\2\2\u00e9"+
		"\u00ea\7v\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7\"\2"+
		"\2\u00ed\34\3\2\2\2\u00ee\u00ef\7o\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1"+
		"\7v\2\2\u00f1\u00f2\7\"\2\2\u00f2\36\3\2\2\2\u00f3\u00f4\7d\2\2\u00f4"+
		"\u00f5\7q\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7g\2\2"+
		"\u00f8\u00f9\7g\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7\"\2\2\u00fb \3\2"+
		"\2\2\u00fc\u00fd\7x\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7f\2\2\u00ff\u0100"+
		"\7g\2\2\u0100\u0101\7\"\2\2\u0101\"\3\2\2\2\u0102\u0103\7h\2\2\u0103\u0104"+
		"\7q\2\2\u0104\u0105\7p\2\2\u0105\u0106\7e\2\2\u0106\u0107\7v\2\2\u0107"+
		"\u0108\7k\2\2\u0108\u0109\7q\2\2\u0109\u010a\7p\2\2\u010a\u010b\7\"\2"+
		"\2\u010b$\3\2\2\2\u010c\u010d\7c\2\2\u010d\u010e\7r\2\2\u010e\u010f\7"+
		"r\2\2\u010f\u0110\7g\2\2\u0110\u0111\7n\2\2\u0111\u0112\7\"\2\2\u0112"+
		"&\3\2\2\2\u0113\u0114\7k\2\2\u0114\u0115\7o\2\2\u0115\u0116\7r\2\2\u0116"+
		"\u0117\7t\2\2\u0117\u0118\7k\2\2\u0118\u0119\7o\2\2\u0119\u011a\7g\2\2"+
		"\u011a\u011b\7t\2\2\u011b\u011c\7\"\2\2\u011c(\3\2\2\2\u011d\u011e\7g"+
		"\2\2\u011e\u011f\7u\2\2\u011f\u0120\7u\2\2\u0120\u0121\7g\2\2\u0121\u0122"+
		"\7p\2\2\u0122\u0123\7v\2\2\u0123\u0124\7k\2\2\u0124\u0125\7g\2\2\u0125"+
		"\u0126\7n\2\2\u0126*\3\2\2\2\u0127\u0128\7t\2\2\u0128\u0129\7c\2\2\u0129"+
		"\u012a\7r\2\2\u012a\u012b\7r\2\2\u012b\u012c\7g\2\2\u012c\u012d\7n\2\2"+
		"\u012d\u012e\7\"\2\2\u012e,\3\2\2\2\u012f\u0130\7x\2\2\u0130\u0131\7t"+
		"\2\2\u0131\u0132\7c\2\2\u0132\u0133\7k\2\2\u0133.\3\2\2\2\u0134\u0135"+
		"\7h\2\2\u0135\u0136\7c\2\2\u0136\u0137\7w\2\2\u0137\u0138\7z\2\2\u0138"+
		"\60\3\2\2\2\u0139\u013a\7r\2\2\u013a\u013b\7w\2\2\u013b\u013c\7d\2\2\u013c"+
		"\u013d\7n\2\2\u013d\u013e\7k\2\2\u013e\u013f\7s\2\2\u013f\u0140\7w\2\2"+
		"\u0140\u0141\7g\2\2\u0141\u0142\7\"\2\2\u0142\62\3\2\2\2\u0143\u0144\7"+
		"r\2\2\u0144\u0145\7t\2\2\u0145\u0146\7k\2\2\u0146\u0147\7x\2\2\u0147\u0148"+
		"\7g\2\2\u0148\u0149\7g\2\2\u0149\u014a\7\"\2\2\u014a\64\3\2\2\2\u014b"+
		"\u014c\7u\2\2\u014c\u014d\7v\2\2\u014d\u014e\7c\2\2\u014e\u014f\7v\2\2"+
		"\u014f\u0150\7k\2\2\u0150\u0151\7s\2\2\u0151\u0152\7w\2\2\u0152\u0153"+
		"\7g\2\2\u0153\u0154\7\"\2\2\u0154\66\3\2\2\2\u0155\u0156\7k\2\2\u0156"+
		"\u0157\7p\2\2\u0157\u0158\7u\2\2\u0158\u0159\7v\2\2\u0159\u015a\7c\2\2"+
		"\u015a\u015b\7p\2\2\u015b\u015c\7e\2\2\u015c\u015d\7k\2\2\u015d\u015e"+
		"\7g\2\2\u015e\u015f\7\"\2\2\u015f8\3\2\2\2\u0160\u0161\7r\2\2\u0161\u0162"+
		"\7t\2\2\u0162\u0163\7q\2\2\u0163\u0164\7v\2\2\u0164\u0165\7g\2\2\u0165"+
		"\u0166\7i\2\2\u0166\u0167\7g\2\2\u0167\u0168\7\"\2\2\u0168:\3\2\2\2\u0169"+
		"\u016a\7i\2\2\u016a\u016b\7n\2\2\u016b\u016c\7q\2\2\u016c\u016d\7d\2\2"+
		"\u016d\u016e\7c\2\2\u016e\u016f\7n\2\2\u016f\u0170\7\"\2\2\u0170<\3\2"+
		"\2\2\u0171\u0175\5\u0081A\2\u0172\u0174\5\u0083B\2\u0173\u0172\3\2\2\2"+
		"\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176>\3"+
		"\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\7]\2\2\u0179@\3\2\2\2\u017a\u017b"+
		"\7_\2\2\u017bB\3\2\2\2\u017c\u017d\7*\2\2\u017dD\3\2\2\2\u017e\u017f\7"+
		"+\2\2\u017fF\3\2\2\2\u0180\u0181\7}\2\2\u0181H\3\2\2\2\u0182\u0183\7\177"+
		"\2\2\u0183J\3\2\2\2\u0184\u0185\7.\2\2\u0185L\3\2\2\2\u0186\u0187\7=\2"+
		"\2\u0187N\3\2\2\2\u0188\u0189\7\60\2\2\u0189P\3\2\2\2\u018a\u018b\7)\2"+
		"\2\u018bR\3\2\2\2\u018c\u018d\7$\2\2\u018dT\3\2\2\2\u018e\u018f\7-\2\2"+
		"\u018f\u0190\7-\2\2\u0190V\3\2\2\2\u0191\u0192\7/\2\2\u0192\u0193\7/\2"+
		"\2\u0193X\3\2\2\2\u0194\u0195\7-\2\2\u0195Z\3\2\2\2\u0196\u0197\7/\2\2"+
		"\u0197\\\3\2\2\2\u0198\u0199\7,\2\2\u0199^\3\2\2\2\u019a\u019b\7\61\2"+
		"\2\u019b`\3\2\2\2\u019c\u019d\7\'\2\2\u019db\3\2\2\2\u019e\u019f\7?\2"+
		"\2\u019fd\3\2\2\2\u01a0\u01a1\7-\2\2\u01a1\u01a2\7?\2\2\u01a2f\3\2\2\2"+
		"\u01a3\u01a4\7/\2\2\u01a4\u01a5\7?\2\2\u01a5h\3\2\2\2\u01a6\u01a7\7,\2"+
		"\2\u01a7\u01a8\7?\2\2\u01a8j\3\2\2\2\u01a9\u01aa\7\61\2\2\u01aa\u01ab"+
		"\7?\2\2\u01abl\3\2\2\2\u01ac\u01ad\7>\2\2\u01adn\3\2\2\2\u01ae\u01af\7"+
		">\2\2\u01af\u01b0\7?\2\2\u01b0p\3\2\2\2\u01b1\u01b2\7@\2\2\u01b2r\3\2"+
		"\2\2\u01b3\u01b4\7@\2\2\u01b4\u01b5\7?\2\2\u01b5t\3\2\2\2\u01b6\u01b7"+
		"\7?\2\2\u01b7\u01b8\7?\2\2\u01b8v\3\2\2\2\u01b9\u01ba\7#\2\2\u01ba\u01bb"+
		"\7?\2\2\u01bbx\3\2\2\2\u01bc\u01bd\7(\2\2\u01bd\u01be\7(\2\2\u01bez\3"+
		"\2\2\2\u01bf\u01c0\7~\2\2\u01c0\u01c1\7~\2\2\u01c1|\3\2\2\2\u01c2\u01c3"+
		"\7#\2\2\u01c3~\3\2\2\2\u01c4\u01c5\t\2\2\2\u01c5\u0080\3\2\2\2\u01c6\u01c7"+
		"\t\3\2\2\u01c7\u0082\3\2\2\2\u01c8\u01cb\5\177@\2\u01c9\u01cb\5\u0081"+
		"A\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb\u0084\3\2\2\2\u01cc"+
		"\u01ce\t\4\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01cd\3\2"+
		"\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\bC\2\2\u01d2"+
		"\u0086\3\2\2\2\r\2\u008f\u0095\u009a\u009d\u00a2\u00a8\u00aa\u0175\u01ca"+
		"\u01cf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}