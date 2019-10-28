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
		SCAN=20, MAIN=21, RETURN=22, TRUE=23, FALSE=24, PUBLIC=25, PRIVATE=26, 
		STATIC=27, INSTANTIATED=28, PROTECTED=29, GLOBAL=30, IDENTIFIER=31, LBRACKET=32, 
		RBRACKET=33, LPARENTHESIS=34, RPARENTHESIS=35, LBRACE=36, RBRACE=37, COMMA=38, 
		SEMICOLON=39, DOT=40, QUOTE_S=41, QUOTE_D=42, PLUS_PLUS=43, MINUS_MINUS=44, 
		PLUS=45, MINUS=46, MUL=47, DIV=48, MOD=49, EQUALS=50, PLUS_EQUALS=51, 
		MIN_EQUALS=52, MUL_EQUALS=53, DIV_EQUALS=54, LESS_THAN=55, LESS_THAN_EQUALS=56, 
		GREATER_THAN=57, GREATER_THAN_EQUALS=58, EQUALS_EQUALS=59, NOT_EQUALS=60, 
		AND=61, OR=62, NOT=63, DIGIT=64, LETTER=65, WS=66;
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
			"SCAN", "MAIN", "RETURN", "TRUE", "FALSE", "PUBLIC", "PRIVATE", "STATIC", 
			"INSTANTIATED", "PROTECTED", "GLOBAL", "IDENTIFIER", "LBRACKET", "RBRACKET", 
			"LPARENTHESIS", "RPARENTHESIS", "LBRACE", "RBRACE", "COMMA", "SEMICOLON", 
			"DOT", "QUOTE_S", "QUOTE_D", "PLUS_PLUS", "MINUS_MINUS", "PLUS", "MINUS", 
			"MUL", "DIV", "MOD", "EQUALS", "PLUS_EQUALS", "MIN_EQUALS", "MUL_EQUALS", 
			"DIV_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", "GREATER_THAN", "GREATER_THAN_EQUALS", 
			"EQUALS_EQUALS", "NOT_EQUALS", "AND", "OR", "NOT", "DIGIT", "LETTER", 
			"LetterorDigit", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u01dc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\3\3\3\7\3"+
		"\u0090\n\3\f\3\16\3\u0093\13\3\3\3\3\3\3\4\5\4\u0098\n\4\3\4\6\4\u009b"+
		"\n\4\r\4\16\4\u009c\3\5\5\5\u00a0\n\5\3\5\6\5\u00a3\n\5\r\5\16\5\u00a4"+
		"\3\5\3\5\6\5\u00a9\n\5\r\5\16\5\u00aa\5\5\u00ad\n\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \7 \u017d\n \f \16 \u0180"+
		"\13 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\3"+
		"8\39\39\39\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3"+
		"A\3A\3B\3B\3C\3C\5C\u01d4\nC\3D\6D\u01d7\nD\rD\16D\u01d8\3D\3D\2\2E\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085\2\u0087D\3\2\6\3\2$$\3\2\62;\6"+
		"\2&&C\\aac|\5\2\13\f\17\17\"\"\2\u01e4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0087\3\2\2\2\3\u0089\3\2\2\2\5\u008d"+
		"\3\2\2\2\7\u0097\3\2\2\2\t\u009f\3\2\2\2\13\u00ae\3\2\2\2\r\u00b1\3\2"+
		"\2\2\17\u00b7\3\2\2\2\21\u00c0\3\2\2\2\23\u00c5\3\2\2\2\25\u00d0\3\2\2"+
		"\2\27\u00d6\3\2\2\2\31\u00de\3\2\2\2\33\u00e8\3\2\2\2\35\u00f0\3\2\2\2"+
		"\37\u00f5\3\2\2\2!\u00fe\3\2\2\2#\u0104\3\2\2\2%\u010e\3\2\2\2\'\u0115"+
		"\3\2\2\2)\u011e\3\2\2\2+\u0126\3\2\2\2-\u0130\3\2\2\2/\u0138\3\2\2\2\61"+
		"\u013d\3\2\2\2\63\u0142\3\2\2\2\65\u014c\3\2\2\2\67\u0154\3\2\2\29\u015e"+
		"\3\2\2\2;\u0169\3\2\2\2=\u0172\3\2\2\2?\u017a\3\2\2\2A\u0181\3\2\2\2C"+
		"\u0183\3\2\2\2E\u0185\3\2\2\2G\u0187\3\2\2\2I\u0189\3\2\2\2K\u018b\3\2"+
		"\2\2M\u018d\3\2\2\2O\u018f\3\2\2\2Q\u0191\3\2\2\2S\u0193\3\2\2\2U\u0195"+
		"\3\2\2\2W\u0197\3\2\2\2Y\u019a\3\2\2\2[\u019d\3\2\2\2]\u019f\3\2\2\2_"+
		"\u01a1\3\2\2\2a\u01a3\3\2\2\2c\u01a5\3\2\2\2e\u01a7\3\2\2\2g\u01a9\3\2"+
		"\2\2i\u01ac\3\2\2\2k\u01af\3\2\2\2m\u01b2\3\2\2\2o\u01b5\3\2\2\2q\u01b7"+
		"\3\2\2\2s\u01ba\3\2\2\2u\u01bc\3\2\2\2w\u01bf\3\2\2\2y\u01c2\3\2\2\2{"+
		"\u01c5\3\2\2\2}\u01c8\3\2\2\2\177\u01cb\3\2\2\2\u0081\u01cd\3\2\2\2\u0083"+
		"\u01cf\3\2\2\2\u0085\u01d3\3\2\2\2\u0087\u01d6\3\2\2\2\u0089\u008a\5S"+
		"*\2\u008a\u008b\13\2\2\2\u008b\u008c\5S*\2\u008c\4\3\2\2\2\u008d\u0091"+
		"\5U+\2\u008e\u0090\n\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0094\u0095\5U+\2\u0095\6\3\2\2\2\u0096\u0098\5]/\2\u0097\u0096\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u009b\5\u0081A\2"+
		"\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\b\3\2\2\2\u009e\u00a0\5]/\2\u009f\u009e\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u00a3\5\u0081A\2\u00a2\u00a1\3\2\2"+
		"\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00ac"+
		"\3\2\2\2\u00a6\u00a8\5Q)\2\u00a7\u00a9\5\u0081A\2\u00a8\u00a7\3\2\2\2"+
		"\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad"+
		"\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\n\3\2\2\2\u00ae"+
		"\u00af\7u\2\2\u00af\u00b0\7k\2\2\u00b0\f\3\2\2\2\u00b1\u00b2\7c\2\2\u00b2"+
		"\u00b3\7w\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7g\2\2"+
		"\u00b6\16\3\2\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7"+
		"v\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7\"\2\2\u00bd"+
		"\u00be\7u\2\2\u00be\u00bf\7k\2\2\u00bf\20\3\2\2\2\u00c0\u00c1\7r\2\2\u00c1"+
		"\u00c2\7q\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7t\2\2\u00c4\22\3\2\2\2\u00c5"+
		"\u00c6\7v\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7f\2\2"+
		"\u00c9\u00ca\7k\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7\"\2\2\u00cc\u00cd"+
		"\7s\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf\7g\2\2\u00cf\24\3\2\2\2\u00d0\u00d1"+
		"\7h\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7t\2\2\u00d4"+
		"\u00d5\7g\2\2\u00d5\26\3\2\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7q\2\2\u00d8"+
		"\u00d9\7o\2\2\u00d9\u00da\7d\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7g\2\2"+
		"\u00dc\u00dd\7\"\2\2\u00dd\30\3\2\2\2\u00de\u00df\7f\2\2\u00df\u00e0\7"+
		"g\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7o\2\2\u00e3\u00e4"+
		"\7c\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7\"\2\2\u00e7"+
		"\32\3\2\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7v\2\2\u00eb"+
		"\u00ec\7v\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7\"\2"+
		"\2\u00ef\34\3\2\2\2\u00f0\u00f1\7o\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3"+
		"\7v\2\2\u00f3\u00f4\7\"\2\2\u00f4\36\3\2\2\2\u00f5\u00f6\7d\2\2\u00f6"+
		"\u00f7\7q\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7g\2\2"+
		"\u00fa\u00fb\7g\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7\"\2\2\u00fd \3\2"+
		"\2\2\u00fe\u00ff\7x\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7f\2\2\u0101\u0102"+
		"\7g\2\2\u0102\u0103\7\"\2\2\u0103\"\3\2\2\2\u0104\u0105\7h\2\2\u0105\u0106"+
		"\7q\2\2\u0106\u0107\7p\2\2\u0107\u0108\7e\2\2\u0108\u0109\7v\2\2\u0109"+
		"\u010a\7k\2\2\u010a\u010b\7q\2\2\u010b\u010c\7p\2\2\u010c\u010d\7\"\2"+
		"\2\u010d$\3\2\2\2\u010e\u010f\7c\2\2\u010f\u0110\7r\2\2\u0110\u0111\7"+
		"r\2\2\u0111\u0112\7g\2\2\u0112\u0113\7n\2\2\u0113\u0114\7\"\2\2\u0114"+
		"&\3\2\2\2\u0115\u0116\7k\2\2\u0116\u0117\7o\2\2\u0117\u0118\7r\2\2\u0118"+
		"\u0119\7t\2\2\u0119\u011a\7k\2\2\u011a\u011b\7o\2\2\u011b\u011c\7g\2\2"+
		"\u011c\u011d\7t\2\2\u011d(\3\2\2\2\u011e\u011f\7c\2\2\u011f\u0120\7p\2"+
		"\2\u0120\u0121\7c\2\2\u0121\u0122\7n\2\2\u0122\u0123\7{\2\2\u0123\u0124"+
		"\7u\2\2\u0124\u0125\7g\2\2\u0125*\3\2\2\2\u0126\u0127\7g\2\2\u0127\u0128"+
		"\7u\2\2\u0128\u0129\7u\2\2\u0129\u012a\7g\2\2\u012a\u012b\7p\2\2\u012b"+
		"\u012c\7v\2\2\u012c\u012d\7k\2\2\u012d\u012e\7g\2\2\u012e\u012f\7n\2\2"+
		"\u012f,\3\2\2\2\u0130\u0131\7t\2\2\u0131\u0132\7c\2\2\u0132\u0133\7r\2"+
		"\2\u0133\u0134\7r\2\2\u0134\u0135\7g\2\2\u0135\u0136\7n\2\2\u0136\u0137"+
		"\7\"\2\2\u0137.\3\2\2\2\u0138\u0139\7x\2\2\u0139\u013a\7t\2\2\u013a\u013b"+
		"\7c\2\2\u013b\u013c\7k\2\2\u013c\60\3\2\2\2\u013d\u013e\7h\2\2\u013e\u013f"+
		"\7c\2\2\u013f\u0140\7w\2\2\u0140\u0141\7z\2\2\u0141\62\3\2\2\2\u0142\u0143"+
		"\7r\2\2\u0143\u0144\7w\2\2\u0144\u0145\7d\2\2\u0145\u0146\7n\2\2\u0146"+
		"\u0147\7k\2\2\u0147\u0148\7s\2\2\u0148\u0149\7w\2\2\u0149\u014a\7g\2\2"+
		"\u014a\u014b\7\"\2\2\u014b\64\3\2\2\2\u014c\u014d\7r\2\2\u014d\u014e\7"+
		"t\2\2\u014e\u014f\7k\2\2\u014f\u0150\7x\2\2\u0150\u0151\7g\2\2\u0151\u0152"+
		"\7g\2\2\u0152\u0153\7\"\2\2\u0153\66\3\2\2\2\u0154\u0155\7u\2\2\u0155"+
		"\u0156\7v\2\2\u0156\u0157\7c\2\2\u0157\u0158\7v\2\2\u0158\u0159\7k\2\2"+
		"\u0159\u015a\7s\2\2\u015a\u015b\7w\2\2\u015b\u015c\7g\2\2\u015c\u015d"+
		"\7\"\2\2\u015d8\3\2\2\2\u015e\u015f\7k\2\2\u015f\u0160\7p\2\2\u0160\u0161"+
		"\7u\2\2\u0161\u0162\7v\2\2\u0162\u0163\7c\2\2\u0163\u0164\7p\2\2\u0164"+
		"\u0165\7e\2\2\u0165\u0166\7k\2\2\u0166\u0167\7g\2\2\u0167\u0168\7\"\2"+
		"\2\u0168:\3\2\2\2\u0169\u016a\7r\2\2\u016a\u016b\7t\2\2\u016b\u016c\7"+
		"q\2\2\u016c\u016d\7v\2\2\u016d\u016e\7g\2\2\u016e\u016f\7i\2\2\u016f\u0170"+
		"\7g\2\2\u0170\u0171\7\"\2\2\u0171<\3\2\2\2\u0172\u0173\7i\2\2\u0173\u0174"+
		"\7n\2\2\u0174\u0175\7q\2\2\u0175\u0176\7d\2\2\u0176\u0177\7c\2\2\u0177"+
		"\u0178\7n\2\2\u0178\u0179\7\"\2\2\u0179>\3\2\2\2\u017a\u017e\5\u0083B"+
		"\2\u017b\u017d\5\u0085C\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f@\3\2\2\2\u0180\u017e\3\2\2\2"+
		"\u0181\u0182\7]\2\2\u0182B\3\2\2\2\u0183\u0184\7_\2\2\u0184D\3\2\2\2\u0185"+
		"\u0186\7*\2\2\u0186F\3\2\2\2\u0187\u0188\7+\2\2\u0188H\3\2\2\2\u0189\u018a"+
		"\7}\2\2\u018aJ\3\2\2\2\u018b\u018c\7\177\2\2\u018cL\3\2\2\2\u018d\u018e"+
		"\7.\2\2\u018eN\3\2\2\2\u018f\u0190\7=\2\2\u0190P\3\2\2\2\u0191\u0192\7"+
		"\60\2\2\u0192R\3\2\2\2\u0193\u0194\7)\2\2\u0194T\3\2\2\2\u0195\u0196\7"+
		"$\2\2\u0196V\3\2\2\2\u0197\u0198\7-\2\2\u0198\u0199\7-\2\2\u0199X\3\2"+
		"\2\2\u019a\u019b\7/\2\2\u019b\u019c\7/\2\2\u019cZ\3\2\2\2\u019d\u019e"+
		"\7-\2\2\u019e\\\3\2\2\2\u019f\u01a0\7/\2\2\u01a0^\3\2\2\2\u01a1\u01a2"+
		"\7,\2\2\u01a2`\3\2\2\2\u01a3\u01a4\7\61\2\2\u01a4b\3\2\2\2\u01a5\u01a6"+
		"\7\'\2\2\u01a6d\3\2\2\2\u01a7\u01a8\7?\2\2\u01a8f\3\2\2\2\u01a9\u01aa"+
		"\7-\2\2\u01aa\u01ab\7?\2\2\u01abh\3\2\2\2\u01ac\u01ad\7/\2\2\u01ad\u01ae"+
		"\7?\2\2\u01aej\3\2\2\2\u01af\u01b0\7,\2\2\u01b0\u01b1\7?\2\2\u01b1l\3"+
		"\2\2\2\u01b2\u01b3\7\61\2\2\u01b3\u01b4\7?\2\2\u01b4n\3\2\2\2\u01b5\u01b6"+
		"\7>\2\2\u01b6p\3\2\2\2\u01b7\u01b8\7>\2\2\u01b8\u01b9\7?\2\2\u01b9r\3"+
		"\2\2\2\u01ba\u01bb\7@\2\2\u01bbt\3\2\2\2\u01bc\u01bd\7@\2\2\u01bd\u01be"+
		"\7?\2\2\u01bev\3\2\2\2\u01bf\u01c0\7?\2\2\u01c0\u01c1\7?\2\2\u01c1x\3"+
		"\2\2\2\u01c2\u01c3\7#\2\2\u01c3\u01c4\7?\2\2\u01c4z\3\2\2\2\u01c5\u01c6"+
		"\7(\2\2\u01c6\u01c7\7(\2\2\u01c7|\3\2\2\2\u01c8\u01c9\7~\2\2\u01c9\u01ca"+
		"\7~\2\2\u01ca~\3\2\2\2\u01cb\u01cc\7#\2\2\u01cc\u0080\3\2\2\2\u01cd\u01ce"+
		"\t\3\2\2\u01ce\u0082\3\2\2\2\u01cf\u01d0\t\4\2\2\u01d0\u0084\3\2\2\2\u01d1"+
		"\u01d4\5\u0081A\2\u01d2\u01d4\5\u0083B\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2"+
		"\3\2\2\2\u01d4\u0086\3\2\2\2\u01d5\u01d7\t\5\2\2\u01d6\u01d5\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2"+
		"\2\2\u01da\u01db\bD\2\2\u01db\u0088\3\2\2\2\r\2\u0091\u0097\u009c\u009f"+
		"\u00a4\u00aa\u00ac\u017e\u01d3\u01d8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}