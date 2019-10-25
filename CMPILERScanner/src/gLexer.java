// Generated from C:/Users/Santi/Desktop/COMPILE/CMPILERScanner\g.g4 by ANTLR 4.7.2
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
		ELSE=6, ELSEIF=7, FOR=8, INTEGER=9, FLOATING_POINT=10, CHARACTER=11, STRING=12, 
		BOOLEAN=13, VOID=14, FUNCTION=15, CALL=16, PRINT=17, TRUE=18, FALSE=19, 
		IDENTIFIER=20, LBRACKET=21, RBRACKET=22, LPARENTHESIS=23, RPARENTHESIS=24, 
		LBRACE=25, RBRACE=26, COMMA=27, SEMICOLON=28, DOT=29, QUOTE_S=30, QUOTE_D=31, 
		PLUS_PLUS=32, MINUS_MINUS=33, PLUS=34, MINUS=35, MUL=36, DIV=37, MOD=38, 
		EQUALS=39, PLUS_EQUALS=40, MIN_EQUALS=41, MUL_EQUALS=42, DIV_EQUALS=43, 
		LESS_THAN=44, LESS_THAN_EQUALS=45, GREATER_THAN=46, GREATER_THAN_EQUALS=47, 
		EQUALS_EQUALS=48, NOT_EQUALS=49, AND=50, OR=51, NOT=52, DIGIT=53, LETTER=54, 
		WS=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CHAR_LITERAL", "STRING_LITERAL", "INT_LITERAL", "FLOAT_LITERAL", "IF", 
			"ELSE", "ELSEIF", "FOR", "INTEGER", "FLOATING_POINT", "CHARACTER", "STRING", 
			"BOOLEAN", "VOID", "FUNCTION", "CALL", "PRINT", "TRUE", "FALSE", "IDENTIFIER", 
			"LBRACKET", "RBRACKET", "LPARENTHESIS", "RPARENTHESIS", "LBRACE", "RBRACE", 
			"COMMA", "SEMICOLON", "DOT", "QUOTE_S", "QUOTE_D", "PLUS_PLUS", "MINUS_MINUS", 
			"PLUS", "MINUS", "MUL", "DIV", "MOD", "EQUALS", "PLUS_EQUALS", "MIN_EQUALS", 
			"MUL_EQUALS", "DIV_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", "GREATER_THAN", 
			"GREATER_THAN_EQUALS", "EQUALS_EQUALS", "NOT_EQUALS", "AND", "OR", "NOT", 
			"DIGIT", "LETTER", "LetterorDigit", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'IF'", "'ELSE'", "'ELSEIF'", "'FOR'", 
			"'INT '", "'FLOAT '", "'CHAR '", "'STRING '", "'BOOLEAN '", "'VOID '", 
			"'FUNCTION '", "'CALL '", "'PRINT '", "'TRUE'", "'FALSE'", null, "'['", 
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
			"IF", "ELSE", "ELSEIF", "FOR", "INTEGER", "FLOATING_POINT", "CHARACTER", 
			"STRING", "BOOLEAN", "VOID", "FUNCTION", "CALL", "PRINT", "TRUE", "FALSE", 
			"IDENTIFIER", "LBRACKET", "RBRACKET", "LPARENTHESIS", "RPARENTHESIS", 
			"LBRACE", "RBRACE", "COMMA", "SEMICOLON", "DOT", "QUOTE_S", "QUOTE_D", 
			"PLUS_PLUS", "MINUS_MINUS", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EQUALS", 
			"PLUS_EQUALS", "MIN_EQUALS", "MUL_EQUALS", "DIV_EQUALS", "LESS_THAN", 
			"LESS_THAN_EQUALS", "GREATER_THAN", "GREATER_THAN_EQUALS", "EQUALS_EQUALS", 
			"NOT_EQUALS", "AND", "OR", "NOT", "DIGIT", "LETTER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0158\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\7\3z\n\3\f\3\16\3}\13\3\3\3\3\3\3\4\5\4\u0082\n\4\3\4\6\4\u0085\n\4\r"+
		"\4\16\4\u0086\3\5\5\5\u008a\n\5\3\5\6\5\u008d\n\5\r\5\16\5\u008e\3\5\3"+
		"\5\6\5\u0093\n\5\r\5\16\5\u0094\5\5\u0097\n\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\7\25\u00f9\n\25\f\25\16\25\u00fc\13\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3"+
		")\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\60\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\67\3\67\38\38\58\u0150\n8\39\69\u0153\n9\r9\169\u0154\39\3"+
		"9\2\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66"+
		"k\67m8o\2q9\3\2\6\3\2$$\3\2\62;\6\2&&C\\aac|\5\2\13\f\17\17\"\"\2\u0160"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2q\3\2\2\2\3s\3\2\2\2\5w\3\2\2\2\7\u0081\3\2\2\2\t\u0089\3\2\2\2\13"+
		"\u0098\3\2\2\2\r\u009b\3\2\2\2\17\u00a0\3\2\2\2\21\u00a7\3\2\2\2\23\u00ab"+
		"\3\2\2\2\25\u00b0\3\2\2\2\27\u00b7\3\2\2\2\31\u00bd\3\2\2\2\33\u00c5\3"+
		"\2\2\2\35\u00ce\3\2\2\2\37\u00d4\3\2\2\2!\u00de\3\2\2\2#\u00e4\3\2\2\2"+
		"%\u00eb\3\2\2\2\'\u00f0\3\2\2\2)\u00f6\3\2\2\2+\u00fd\3\2\2\2-\u00ff\3"+
		"\2\2\2/\u0101\3\2\2\2\61\u0103\3\2\2\2\63\u0105\3\2\2\2\65\u0107\3\2\2"+
		"\2\67\u0109\3\2\2\29\u010b\3\2\2\2;\u010d\3\2\2\2=\u010f\3\2\2\2?\u0111"+
		"\3\2\2\2A\u0113\3\2\2\2C\u0116\3\2\2\2E\u0119\3\2\2\2G\u011b\3\2\2\2I"+
		"\u011d\3\2\2\2K\u011f\3\2\2\2M\u0121\3\2\2\2O\u0123\3\2\2\2Q\u0125\3\2"+
		"\2\2S\u0128\3\2\2\2U\u012b\3\2\2\2W\u012e\3\2\2\2Y\u0131\3\2\2\2[\u0133"+
		"\3\2\2\2]\u0136\3\2\2\2_\u0138\3\2\2\2a\u013b\3\2\2\2c\u013e\3\2\2\2e"+
		"\u0141\3\2\2\2g\u0144\3\2\2\2i\u0147\3\2\2\2k\u0149\3\2\2\2m\u014b\3\2"+
		"\2\2o\u014f\3\2\2\2q\u0152\3\2\2\2st\5=\37\2tu\13\2\2\2uv\5=\37\2v\4\3"+
		"\2\2\2w{\5? \2xz\n\2\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2"+
		"\2\2}{\3\2\2\2~\177\5? \2\177\6\3\2\2\2\u0080\u0082\5G$\2\u0081\u0080"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0085\5k\66\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\b\3\2\2\2\u0088\u008a\5G$\2\u0089\u0088\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u008d\5k\66\2\u008c\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0096\3\2"+
		"\2\2\u0090\u0092\5;\36\2\u0091\u0093\5k\66\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2"+
		"\2\2\u0096\u0090\3\2\2\2\u0096\u0097\3\2\2\2\u0097\n\3\2\2\2\u0098\u0099"+
		"\7K\2\2\u0099\u009a\7H\2\2\u009a\f\3\2\2\2\u009b\u009c\7G\2\2\u009c\u009d"+
		"\7N\2\2\u009d\u009e\7U\2\2\u009e\u009f\7G\2\2\u009f\16\3\2\2\2\u00a0\u00a1"+
		"\7G\2\2\u00a1\u00a2\7N\2\2\u00a2\u00a3\7U\2\2\u00a3\u00a4\7G\2\2\u00a4"+
		"\u00a5\7K\2\2\u00a5\u00a6\7H\2\2\u00a6\20\3\2\2\2\u00a7\u00a8\7H\2\2\u00a8"+
		"\u00a9\7Q\2\2\u00a9\u00aa\7T\2\2\u00aa\22\3\2\2\2\u00ab\u00ac\7K\2\2\u00ac"+
		"\u00ad\7P\2\2\u00ad\u00ae\7V\2\2\u00ae\u00af\7\"\2\2\u00af\24\3\2\2\2"+
		"\u00b0\u00b1\7H\2\2\u00b1\u00b2\7N\2\2\u00b2\u00b3\7Q\2\2\u00b3\u00b4"+
		"\7C\2\2\u00b4\u00b5\7V\2\2\u00b5\u00b6\7\"\2\2\u00b6\26\3\2\2\2\u00b7"+
		"\u00b8\7E\2\2\u00b8\u00b9\7J\2\2\u00b9\u00ba\7C\2\2\u00ba\u00bb\7T\2\2"+
		"\u00bb\u00bc\7\"\2\2\u00bc\30\3\2\2\2\u00bd\u00be\7U\2\2\u00be\u00bf\7"+
		"V\2\2\u00bf\u00c0\7T\2\2\u00c0\u00c1\7K\2\2\u00c1\u00c2\7P\2\2\u00c2\u00c3"+
		"\7I\2\2\u00c3\u00c4\7\"\2\2\u00c4\32\3\2\2\2\u00c5\u00c6\7D\2\2\u00c6"+
		"\u00c7\7Q\2\2\u00c7\u00c8\7Q\2\2\u00c8\u00c9\7N\2\2\u00c9\u00ca\7G\2\2"+
		"\u00ca\u00cb\7C\2\2\u00cb\u00cc\7P\2\2\u00cc\u00cd\7\"\2\2\u00cd\34\3"+
		"\2\2\2\u00ce\u00cf\7X\2\2\u00cf\u00d0\7Q\2\2\u00d0\u00d1\7K\2\2\u00d1"+
		"\u00d2\7F\2\2\u00d2\u00d3\7\"\2\2\u00d3\36\3\2\2\2\u00d4\u00d5\7H\2\2"+
		"\u00d5\u00d6\7W\2\2\u00d6\u00d7\7P\2\2\u00d7\u00d8\7E\2\2\u00d8\u00d9"+
		"\7V\2\2\u00d9\u00da\7K\2\2\u00da\u00db\7Q\2\2\u00db\u00dc\7P\2\2\u00dc"+
		"\u00dd\7\"\2\2\u00dd \3\2\2\2\u00de\u00df\7E\2\2\u00df\u00e0\7C\2\2\u00e0"+
		"\u00e1\7N\2\2\u00e1\u00e2\7N\2\2\u00e2\u00e3\7\"\2\2\u00e3\"\3\2\2\2\u00e4"+
		"\u00e5\7R\2\2\u00e5\u00e6\7T\2\2\u00e6\u00e7\7K\2\2\u00e7\u00e8\7P\2\2"+
		"\u00e8\u00e9\7V\2\2\u00e9\u00ea\7\"\2\2\u00ea$\3\2\2\2\u00eb\u00ec\7V"+
		"\2\2\u00ec\u00ed\7T\2\2\u00ed\u00ee\7W\2\2\u00ee\u00ef\7G\2\2\u00ef&\3"+
		"\2\2\2\u00f0\u00f1\7H\2\2\u00f1\u00f2\7C\2\2\u00f2\u00f3\7N\2\2\u00f3"+
		"\u00f4\7U\2\2\u00f4\u00f5\7G\2\2\u00f5(\3\2\2\2\u00f6\u00fa\5m\67\2\u00f7"+
		"\u00f9\5o8\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2"+
		"\2\u00fa\u00fb\3\2\2\2\u00fb*\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe"+
		"\7]\2\2\u00fe,\3\2\2\2\u00ff\u0100\7_\2\2\u0100.\3\2\2\2\u0101\u0102\7"+
		"*\2\2\u0102\60\3\2\2\2\u0103\u0104\7+\2\2\u0104\62\3\2\2\2\u0105\u0106"+
		"\7}\2\2\u0106\64\3\2\2\2\u0107\u0108\7\177\2\2\u0108\66\3\2\2\2\u0109"+
		"\u010a\7.\2\2\u010a8\3\2\2\2\u010b\u010c\7=\2\2\u010c:\3\2\2\2\u010d\u010e"+
		"\7\60\2\2\u010e<\3\2\2\2\u010f\u0110\7)\2\2\u0110>\3\2\2\2\u0111\u0112"+
		"\7$\2\2\u0112@\3\2\2\2\u0113\u0114\7-\2\2\u0114\u0115\7-\2\2\u0115B\3"+
		"\2\2\2\u0116\u0117\7/\2\2\u0117\u0118\7/\2\2\u0118D\3\2\2\2\u0119\u011a"+
		"\7-\2\2\u011aF\3\2\2\2\u011b\u011c\7/\2\2\u011cH\3\2\2\2\u011d\u011e\7"+
		",\2\2\u011eJ\3\2\2\2\u011f\u0120\7\61\2\2\u0120L\3\2\2\2\u0121\u0122\7"+
		"\'\2\2\u0122N\3\2\2\2\u0123\u0124\7?\2\2\u0124P\3\2\2\2\u0125\u0126\7"+
		"-\2\2\u0126\u0127\7?\2\2\u0127R\3\2\2\2\u0128\u0129\7/\2\2\u0129\u012a"+
		"\7?\2\2\u012aT\3\2\2\2\u012b\u012c\7,\2\2\u012c\u012d\7?\2\2\u012dV\3"+
		"\2\2\2\u012e\u012f\7\61\2\2\u012f\u0130\7?\2\2\u0130X\3\2\2\2\u0131\u0132"+
		"\7>\2\2\u0132Z\3\2\2\2\u0133\u0134\7>\2\2\u0134\u0135\7?\2\2\u0135\\\3"+
		"\2\2\2\u0136\u0137\7@\2\2\u0137^\3\2\2\2\u0138\u0139\7@\2\2\u0139\u013a"+
		"\7?\2\2\u013a`\3\2\2\2\u013b\u013c\7?\2\2\u013c\u013d\7?\2\2\u013db\3"+
		"\2\2\2\u013e\u013f\7#\2\2\u013f\u0140\7?\2\2\u0140d\3\2\2\2\u0141\u0142"+
		"\7(\2\2\u0142\u0143\7(\2\2\u0143f\3\2\2\2\u0144\u0145\7~\2\2\u0145\u0146"+
		"\7~\2\2\u0146h\3\2\2\2\u0147\u0148\7#\2\2\u0148j\3\2\2\2\u0149\u014a\t"+
		"\3\2\2\u014al\3\2\2\2\u014b\u014c\t\4\2\2\u014cn\3\2\2\2\u014d\u0150\5"+
		"k\66\2\u014e\u0150\5m\67\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150"+
		"p\3\2\2\2\u0151\u0153\t\5\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2"+
		"\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157"+
		"\b9\2\2\u0157r\3\2\2\2\r\2{\u0081\u0086\u0089\u008e\u0094\u0096\u00fa"+
		"\u014f\u0154\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}