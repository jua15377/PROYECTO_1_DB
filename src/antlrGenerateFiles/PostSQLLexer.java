// Generated from PostSQL.g4 by ANTLR 4.7.1
package antlrGenerateFiles;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PostSQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, COLON=23, PRIMARY=24, 
		KEY=25, FOREIGN=26, CONSTRAINT=27, REFERENCES=28, FROM=29, CHECK=30, ALTER=31, 
		RENAME=32, TO=33, ADD=34, COLUMN=35, INSERT_INTO=36, VALUES=37, UPDATE=38, 
		SET=39, DELETE=40, WHERE=41, ORDER_BY=42, ASC=43, DESC=44, INT=45, CHAR=46, 
		BOOLEAN=47, AND=48, OR=49, NOT=50, SELECT=51, ID=52, NUM=53, Char=54, 
		WS=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "COLON", "PRIMARY", "KEY", 
		"FOREIGN", "CONSTRAINT", "REFERENCES", "FROM", "CHECK", "ALTER", "RENAME", 
		"TO", "ADD", "COLUMN", "INSERT_INTO", "VALUES", "UPDATE", "SET", "DELETE", 
		"WHERE", "ORDER_BY", "ASC", "DESC", "INT", "CHAR", "BOOLEAN", "AND", "OR", 
		"NOT", "SELECT", "LETTER", "DIGIT", "ID", "NUM", "Char", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'CREATE'", "'DATABASE'", "'DROP'", "'SHOW'", "'TABLE'", 
		"'USE'", "'FUCK'", "'('", "')'", "'COLUMNS'", "'PK_'", "','", "'FK_'", 
		"'CH_'", "'<'", "'>'", "'<='", "'>='", "'<>'", "'='", "'*'", "':'", "'PRIMARY'", 
		"'KEY'", "'FOREIGN'", "'CONSTRAINT'", "'REFERENCES'", "'FROM'", "'CHECK'", 
		"'ALTER'", "'RENAME'", "'TO'", "'ADD'", "'COLUMN'", "'INSERT INTO'", "'VALUES'", 
		"'UPDATE'", "'SET'", "'DELETE'", "'WHERE'", "'ORDER BY'", "'ASC'", "'DESC'", 
		"'INT'", "'CHAR'", "'BOOLEAN'", "'AND'", "'OR'", "'NOT'", "'SELECT'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "COLON", 
		"PRIMARY", "KEY", "FOREIGN", "CONSTRAINT", "REFERENCES", "FROM", "CHECK", 
		"ALTER", "RENAME", "TO", "ADD", "COLUMN", "INSERT_INTO", "VALUES", "UPDATE", 
		"SET", "DELETE", "WHERE", "ORDER_BY", "ASC", "DESC", "INT", "CHAR", "BOOLEAN", 
		"AND", "OR", "NOT", "SELECT", "ID", "NUM", "Char", "WS"
	};
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


	public PostSQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PostSQL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0199\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$"+
		"\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&"+
		"\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3"+
		".\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\7\67\u0185\n\67\f\67"+
		"\16\67\u0188\13\67\38\38\78\u018c\n8\f8\168\u018f\138\39\39\3:\6:\u0194"+
		"\n:\r:\16:\u0195\3:\3:\2\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\2k\2m\66o\67q8s9\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\2"+
		"\u019a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7~\3\2\2\2\t\u0087\3\2\2\2"+
		"\13\u008c\3\2\2\2\r\u0091\3\2\2\2\17\u0097\3\2\2\2\21\u009b\3\2\2\2\23"+
		"\u00a0\3\2\2\2\25\u00a2\3\2\2\2\27\u00a4\3\2\2\2\31\u00ac\3\2\2\2\33\u00b0"+
		"\3\2\2\2\35\u00b2\3\2\2\2\37\u00b6\3\2\2\2!\u00ba\3\2\2\2#\u00bc\3\2\2"+
		"\2%\u00be\3\2\2\2\'\u00c1\3\2\2\2)\u00c4\3\2\2\2+\u00c7\3\2\2\2-\u00c9"+
		"\3\2\2\2/\u00cb\3\2\2\2\61\u00cd\3\2\2\2\63\u00d5\3\2\2\2\65\u00d9\3\2"+
		"\2\2\67\u00e1\3\2\2\29\u00ec\3\2\2\2;\u00f7\3\2\2\2=\u00fc\3\2\2\2?\u0102"+
		"\3\2\2\2A\u0108\3\2\2\2C\u010f\3\2\2\2E\u0112\3\2\2\2G\u0116\3\2\2\2I"+
		"\u011d\3\2\2\2K\u0129\3\2\2\2M\u0130\3\2\2\2O\u0137\3\2\2\2Q\u013b\3\2"+
		"\2\2S\u0142\3\2\2\2U\u0148\3\2\2\2W\u0151\3\2\2\2Y\u0155\3\2\2\2[\u015a"+
		"\3\2\2\2]\u015e\3\2\2\2_\u0163\3\2\2\2a\u016b\3\2\2\2c\u016f\3\2\2\2e"+
		"\u0172\3\2\2\2g\u0176\3\2\2\2i\u017d\3\2\2\2k\u017f\3\2\2\2m\u0181\3\2"+
		"\2\2o\u0189\3\2\2\2q\u0190\3\2\2\2s\u0193\3\2\2\2uv\7=\2\2v\4\3\2\2\2"+
		"wx\7E\2\2xy\7T\2\2yz\7G\2\2z{\7C\2\2{|\7V\2\2|}\7G\2\2}\6\3\2\2\2~\177"+
		"\7F\2\2\177\u0080\7C\2\2\u0080\u0081\7V\2\2\u0081\u0082\7C\2\2\u0082\u0083"+
		"\7D\2\2\u0083\u0084\7C\2\2\u0084\u0085\7U\2\2\u0085\u0086\7G\2\2\u0086"+
		"\b\3\2\2\2\u0087\u0088\7F\2\2\u0088\u0089\7T\2\2\u0089\u008a\7Q\2\2\u008a"+
		"\u008b\7R\2\2\u008b\n\3\2\2\2\u008c\u008d\7U\2\2\u008d\u008e\7J\2\2\u008e"+
		"\u008f\7Q\2\2\u008f\u0090\7Y\2\2\u0090\f\3\2\2\2\u0091\u0092\7V\2\2\u0092"+
		"\u0093\7C\2\2\u0093\u0094\7D\2\2\u0094\u0095\7N\2\2\u0095\u0096\7G\2\2"+
		"\u0096\16\3\2\2\2\u0097\u0098\7W\2\2\u0098\u0099\7U\2\2\u0099\u009a\7"+
		"G\2\2\u009a\20\3\2\2\2\u009b\u009c\7H\2\2\u009c\u009d\7W\2\2\u009d\u009e"+
		"\7E\2\2\u009e\u009f\7M\2\2\u009f\22\3\2\2\2\u00a0\u00a1\7*\2\2\u00a1\24"+
		"\3\2\2\2\u00a2\u00a3\7+\2\2\u00a3\26\3\2\2\2\u00a4\u00a5\7E\2\2\u00a5"+
		"\u00a6\7Q\2\2\u00a6\u00a7\7N\2\2\u00a7\u00a8\7W\2\2\u00a8\u00a9\7O\2\2"+
		"\u00a9\u00aa\7P\2\2\u00aa\u00ab\7U\2\2\u00ab\30\3\2\2\2\u00ac\u00ad\7"+
		"R\2\2\u00ad\u00ae\7M\2\2\u00ae\u00af\7a\2\2\u00af\32\3\2\2\2\u00b0\u00b1"+
		"\7.\2\2\u00b1\34\3\2\2\2\u00b2\u00b3\7H\2\2\u00b3\u00b4\7M\2\2\u00b4\u00b5"+
		"\7a\2\2\u00b5\36\3\2\2\2\u00b6\u00b7\7E\2\2\u00b7\u00b8\7J\2\2\u00b8\u00b9"+
		"\7a\2\2\u00b9 \3\2\2\2\u00ba\u00bb\7>\2\2\u00bb\"\3\2\2\2\u00bc\u00bd"+
		"\7@\2\2\u00bd$\3\2\2\2\u00be\u00bf\7>\2\2\u00bf\u00c0\7?\2\2\u00c0&\3"+
		"\2\2\2\u00c1\u00c2\7@\2\2\u00c2\u00c3\7?\2\2\u00c3(\3\2\2\2\u00c4\u00c5"+
		"\7>\2\2\u00c5\u00c6\7@\2\2\u00c6*\3\2\2\2\u00c7\u00c8\7?\2\2\u00c8,\3"+
		"\2\2\2\u00c9\u00ca\7,\2\2\u00ca.\3\2\2\2\u00cb\u00cc\7<\2\2\u00cc\60\3"+
		"\2\2\2\u00cd\u00ce\7R\2\2\u00ce\u00cf\7T\2\2\u00cf\u00d0\7K\2\2\u00d0"+
		"\u00d1\7O\2\2\u00d1\u00d2\7C\2\2\u00d2\u00d3\7T\2\2\u00d3\u00d4\7[\2\2"+
		"\u00d4\62\3\2\2\2\u00d5\u00d6\7M\2\2\u00d6\u00d7\7G\2\2\u00d7\u00d8\7"+
		"[\2\2\u00d8\64\3\2\2\2\u00d9\u00da\7H\2\2\u00da\u00db\7Q\2\2\u00db\u00dc"+
		"\7T\2\2\u00dc\u00dd\7G\2\2\u00dd\u00de\7K\2\2\u00de\u00df\7I\2\2\u00df"+
		"\u00e0\7P\2\2\u00e0\66\3\2\2\2\u00e1\u00e2\7E\2\2\u00e2\u00e3\7Q\2\2\u00e3"+
		"\u00e4\7P\2\2\u00e4\u00e5\7U\2\2\u00e5\u00e6\7V\2\2\u00e6\u00e7\7T\2\2"+
		"\u00e7\u00e8\7C\2\2\u00e8\u00e9\7K\2\2\u00e9\u00ea\7P\2\2\u00ea\u00eb"+
		"\7V\2\2\u00eb8\3\2\2\2\u00ec\u00ed\7T\2\2\u00ed\u00ee\7G\2\2\u00ee\u00ef"+
		"\7H\2\2\u00ef\u00f0\7G\2\2\u00f0\u00f1\7T\2\2\u00f1\u00f2\7G\2\2\u00f2"+
		"\u00f3\7P\2\2\u00f3\u00f4\7E\2\2\u00f4\u00f5\7G\2\2\u00f5\u00f6\7U\2\2"+
		"\u00f6:\3\2\2\2\u00f7\u00f8\7H\2\2\u00f8\u00f9\7T\2\2\u00f9\u00fa\7Q\2"+
		"\2\u00fa\u00fb\7O\2\2\u00fb<\3\2\2\2\u00fc\u00fd\7E\2\2\u00fd\u00fe\7"+
		"J\2\2\u00fe\u00ff\7G\2\2\u00ff\u0100\7E\2\2\u0100\u0101\7M\2\2\u0101>"+
		"\3\2\2\2\u0102\u0103\7C\2\2\u0103\u0104\7N\2\2\u0104\u0105\7V\2\2\u0105"+
		"\u0106\7G\2\2\u0106\u0107\7T\2\2\u0107@\3\2\2\2\u0108\u0109\7T\2\2\u0109"+
		"\u010a\7G\2\2\u010a\u010b\7P\2\2\u010b\u010c\7C\2\2\u010c\u010d\7O\2\2"+
		"\u010d\u010e\7G\2\2\u010eB\3\2\2\2\u010f\u0110\7V\2\2\u0110\u0111\7Q\2"+
		"\2\u0111D\3\2\2\2\u0112\u0113\7C\2\2\u0113\u0114\7F\2\2\u0114\u0115\7"+
		"F\2\2\u0115F\3\2\2\2\u0116\u0117\7E\2\2\u0117\u0118\7Q\2\2\u0118\u0119"+
		"\7N\2\2\u0119\u011a\7W\2\2\u011a\u011b\7O\2\2\u011b\u011c\7P\2\2\u011c"+
		"H\3\2\2\2\u011d\u011e\7K\2\2\u011e\u011f\7P\2\2\u011f\u0120\7U\2\2\u0120"+
		"\u0121\7G\2\2\u0121\u0122\7T\2\2\u0122\u0123\7V\2\2\u0123\u0124\7\"\2"+
		"\2\u0124\u0125\7K\2\2\u0125\u0126\7P\2\2\u0126\u0127\7V\2\2\u0127\u0128"+
		"\7Q\2\2\u0128J\3\2\2\2\u0129\u012a\7X\2\2\u012a\u012b\7C\2\2\u012b\u012c"+
		"\7N\2\2\u012c\u012d\7W\2\2\u012d\u012e\7G\2\2\u012e\u012f\7U\2\2\u012f"+
		"L\3\2\2\2\u0130\u0131\7W\2\2\u0131\u0132\7R\2\2\u0132\u0133\7F\2\2\u0133"+
		"\u0134\7C\2\2\u0134\u0135\7V\2\2\u0135\u0136\7G\2\2\u0136N\3\2\2\2\u0137"+
		"\u0138\7U\2\2\u0138\u0139\7G\2\2\u0139\u013a\7V\2\2\u013aP\3\2\2\2\u013b"+
		"\u013c\7F\2\2\u013c\u013d\7G\2\2\u013d\u013e\7N\2\2\u013e\u013f\7G\2\2"+
		"\u013f\u0140\7V\2\2\u0140\u0141\7G\2\2\u0141R\3\2\2\2\u0142\u0143\7Y\2"+
		"\2\u0143\u0144\7J\2\2\u0144\u0145\7G\2\2\u0145\u0146\7T\2\2\u0146\u0147"+
		"\7G\2\2\u0147T\3\2\2\2\u0148\u0149\7Q\2\2\u0149\u014a\7T\2\2\u014a\u014b"+
		"\7F\2\2\u014b\u014c\7G\2\2\u014c\u014d\7T\2\2\u014d\u014e\7\"\2\2\u014e"+
		"\u014f\7D\2\2\u014f\u0150\7[\2\2\u0150V\3\2\2\2\u0151\u0152\7C\2\2\u0152"+
		"\u0153\7U\2\2\u0153\u0154\7E\2\2\u0154X\3\2\2\2\u0155\u0156\7F\2\2\u0156"+
		"\u0157\7G\2\2\u0157\u0158\7U\2\2\u0158\u0159\7E\2\2\u0159Z\3\2\2\2\u015a"+
		"\u015b\7K\2\2\u015b\u015c\7P\2\2\u015c\u015d\7V\2\2\u015d\\\3\2\2\2\u015e"+
		"\u015f\7E\2\2\u015f\u0160\7J\2\2\u0160\u0161\7C\2\2\u0161\u0162\7T\2\2"+
		"\u0162^\3\2\2\2\u0163\u0164\7D\2\2\u0164\u0165\7Q\2\2\u0165\u0166\7Q\2"+
		"\2\u0166\u0167\7N\2\2\u0167\u0168\7G\2\2\u0168\u0169\7C\2\2\u0169\u016a"+
		"\7P\2\2\u016a`\3\2\2\2\u016b\u016c\7C\2\2\u016c\u016d\7P\2\2\u016d\u016e"+
		"\7F\2\2\u016eb\3\2\2\2\u016f\u0170\7Q\2\2\u0170\u0171\7T\2\2\u0171d\3"+
		"\2\2\2\u0172\u0173\7P\2\2\u0173\u0174\7Q\2\2\u0174\u0175\7V\2\2\u0175"+
		"f\3\2\2\2\u0176\u0177\7U\2\2\u0177\u0178\7G\2\2\u0178\u0179\7N\2\2\u0179"+
		"\u017a\7G\2\2\u017a\u017b\7E\2\2\u017b\u017c\7V\2\2\u017ch\3\2\2\2\u017d"+
		"\u017e\t\2\2\2\u017ej\3\2\2\2\u017f\u0180\4\62;\2\u0180l\3\2\2\2\u0181"+
		"\u0186\5i\65\2\u0182\u0185\5i\65\2\u0183\u0185\5k\66\2\u0184\u0182\3\2"+
		"\2\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187n\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018d\5k\66\2"+
		"\u018a\u018c\5k\66\2\u018b\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018ep\3\2\2\2\u018f\u018d\3\2\2\2\u0190"+
		"\u0191\5i\65\2\u0191r\3\2\2\2\u0192\u0194\t\3\2\2\u0193\u0192\3\2\2\2"+
		"\u0194\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197"+
		"\3\2\2\2\u0197\u0198\b:\2\2\u0198t\3\2\2\2\7\2\u0184\u0186\u018d\u0195"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}