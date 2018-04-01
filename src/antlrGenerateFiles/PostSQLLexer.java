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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		COLON=25, PRIMARY=26, KEY=27, FOREIGN=28, CONSTRAINT=29, REFERENCES=30, 
		FROM=31, CHECK=32, ALTER=33, RENAME=34, TO=35, ADD=36, COLUMN=37, INSERT_INTO=38, 
		VALUES=39, UPDATE=40, SET=41, DELETE=42, WHERE=43, ORDER_BY=44, ASC=45, 
		DESC=46, INT=47, CHAR=48, BOOLEAN=49, AND=50, OR=51, NOT=52, SELECT=53, 
		ID=54, NUM=55, Char=56, WS=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "COLON", 
		"PRIMARY", "KEY", "FOREIGN", "CONSTRAINT", "REFERENCES", "FROM", "CHECK", 
		"ALTER", "RENAME", "TO", "ADD", "COLUMN", "INSERT_INTO", "VALUES", "UPDATE", 
		"SET", "DELETE", "WHERE", "ORDER_BY", "ASC", "DESC", "INT", "CHAR", "BOOLEAN", 
		"AND", "OR", "NOT", "SELECT", "LETTER", "DIGIT", "ID", "NUM", "Char", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'-v'", "'CREATE'", "'DATABASE'", "'DROP'", "'SHOW'", "'DATABASES'", 
		"'TABLE'", "'USE'", "'FUCK'", "'('", "')'", "'COLUMNS'", "'PK_'", "','", 
		"'FK_'", "'CH_'", "'<'", "'>'", "'<='", "'>='", "'<>'", "'='", "'*'", 
		"':'", "'PRIMARY'", "'KEY'", "'FOREIGN'", "'CONSTRAINT'", "'REFERENCES'", 
		"'FROM'", "'CHECK'", "'ALTER'", "'RENAME'", "'TO'", "'ADD'", "'COLUMN'", 
		"'INSERT INTO'", "'VALUES'", "'UPDATE'", "'SET'", "'DELETE'", "'WHERE'", 
		"'ORDER BY'", "'ASC'", "'DESC'", "'INT'", "'CHAR'", "'BOOLEAN'", "'AND'", 
		"'OR'", "'NOT'", "'SELECT'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "COLON", "PRIMARY", "KEY", "FOREIGN", "CONSTRAINT", "REFERENCES", 
		"FROM", "CHECK", "ALTER", "RENAME", "TO", "ADD", "COLUMN", "INSERT_INTO", 
		"VALUES", "UPDATE", "SET", "DELETE", "WHERE", "ORDER_BY", "ASC", "DESC", 
		"INT", "CHAR", "BOOLEAN", "AND", "OR", "NOT", "SELECT", "ID", "NUM", "Char", 
		"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u01aa\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3("+
		"\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,"+
		"\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\38\38\39\39\39\79\u0196\n9\f9\16"+
		"9\u0199\139\3:\3:\7:\u019d\n:\f:\16:\u01a0\13:\3;\3;\3<\6<\u01a5\n<\r"+
		"<\16<\u01a6\3<\3<\2\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m\2o\2q8s9u:w;\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\2\u01ab"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5{\3\2\2\2\7~\3\2\2\2\t"+
		"\u0085\3\2\2\2\13\u008e\3\2\2\2\r\u0093\3\2\2\2\17\u0098\3\2\2\2\21\u00a2"+
		"\3\2\2\2\23\u00a8\3\2\2\2\25\u00ac\3\2\2\2\27\u00b1\3\2\2\2\31\u00b3\3"+
		"\2\2\2\33\u00b5\3\2\2\2\35\u00bd\3\2\2\2\37\u00c1\3\2\2\2!\u00c3\3\2\2"+
		"\2#\u00c7\3\2\2\2%\u00cb\3\2\2\2\'\u00cd\3\2\2\2)\u00cf\3\2\2\2+\u00d2"+
		"\3\2\2\2-\u00d5\3\2\2\2/\u00d8\3\2\2\2\61\u00da\3\2\2\2\63\u00dc\3\2\2"+
		"\2\65\u00de\3\2\2\2\67\u00e6\3\2\2\29\u00ea\3\2\2\2;\u00f2\3\2\2\2=\u00fd"+
		"\3\2\2\2?\u0108\3\2\2\2A\u010d\3\2\2\2C\u0113\3\2\2\2E\u0119\3\2\2\2G"+
		"\u0120\3\2\2\2I\u0123\3\2\2\2K\u0127\3\2\2\2M\u012e\3\2\2\2O\u013a\3\2"+
		"\2\2Q\u0141\3\2\2\2S\u0148\3\2\2\2U\u014c\3\2\2\2W\u0153\3\2\2\2Y\u0159"+
		"\3\2\2\2[\u0162\3\2\2\2]\u0166\3\2\2\2_\u016b\3\2\2\2a\u016f\3\2\2\2c"+
		"\u0174\3\2\2\2e\u017c\3\2\2\2g\u0180\3\2\2\2i\u0183\3\2\2\2k\u0187\3\2"+
		"\2\2m\u018e\3\2\2\2o\u0190\3\2\2\2q\u0192\3\2\2\2s\u019a\3\2\2\2u\u01a1"+
		"\3\2\2\2w\u01a4\3\2\2\2yz\7=\2\2z\4\3\2\2\2{|\7/\2\2|}\7x\2\2}\6\3\2\2"+
		"\2~\177\7E\2\2\177\u0080\7T\2\2\u0080\u0081\7G\2\2\u0081\u0082\7C\2\2"+
		"\u0082\u0083\7V\2\2\u0083\u0084\7G\2\2\u0084\b\3\2\2\2\u0085\u0086\7F"+
		"\2\2\u0086\u0087\7C\2\2\u0087\u0088\7V\2\2\u0088\u0089\7C\2\2\u0089\u008a"+
		"\7D\2\2\u008a\u008b\7C\2\2\u008b\u008c\7U\2\2\u008c\u008d\7G\2\2\u008d"+
		"\n\3\2\2\2\u008e\u008f\7F\2\2\u008f\u0090\7T\2\2\u0090\u0091\7Q\2\2\u0091"+
		"\u0092\7R\2\2\u0092\f\3\2\2\2\u0093\u0094\7U\2\2\u0094\u0095\7J\2\2\u0095"+
		"\u0096\7Q\2\2\u0096\u0097\7Y\2\2\u0097\16\3\2\2\2\u0098\u0099\7F\2\2\u0099"+
		"\u009a\7C\2\2\u009a\u009b\7V\2\2\u009b\u009c\7C\2\2\u009c\u009d\7D\2\2"+
		"\u009d\u009e\7C\2\2\u009e\u009f\7U\2\2\u009f\u00a0\7G\2\2\u00a0\u00a1"+
		"\7U\2\2\u00a1\20\3\2\2\2\u00a2\u00a3\7V\2\2\u00a3\u00a4\7C\2\2\u00a4\u00a5"+
		"\7D\2\2\u00a5\u00a6\7N\2\2\u00a6\u00a7\7G\2\2\u00a7\22\3\2\2\2\u00a8\u00a9"+
		"\7W\2\2\u00a9\u00aa\7U\2\2\u00aa\u00ab\7G\2\2\u00ab\24\3\2\2\2\u00ac\u00ad"+
		"\7H\2\2\u00ad\u00ae\7W\2\2\u00ae\u00af\7E\2\2\u00af\u00b0\7M\2\2\u00b0"+
		"\26\3\2\2\2\u00b1\u00b2\7*\2\2\u00b2\30\3\2\2\2\u00b3\u00b4\7+\2\2\u00b4"+
		"\32\3\2\2\2\u00b5\u00b6\7E\2\2\u00b6\u00b7\7Q\2\2\u00b7\u00b8\7N\2\2\u00b8"+
		"\u00b9\7W\2\2\u00b9\u00ba\7O\2\2\u00ba\u00bb\7P\2\2\u00bb\u00bc\7U\2\2"+
		"\u00bc\34\3\2\2\2\u00bd\u00be\7R\2\2\u00be\u00bf\7M\2\2\u00bf\u00c0\7"+
		"a\2\2\u00c0\36\3\2\2\2\u00c1\u00c2\7.\2\2\u00c2 \3\2\2\2\u00c3\u00c4\7"+
		"H\2\2\u00c4\u00c5\7M\2\2\u00c5\u00c6\7a\2\2\u00c6\"\3\2\2\2\u00c7\u00c8"+
		"\7E\2\2\u00c8\u00c9\7J\2\2\u00c9\u00ca\7a\2\2\u00ca$\3\2\2\2\u00cb\u00cc"+
		"\7>\2\2\u00cc&\3\2\2\2\u00cd\u00ce\7@\2\2\u00ce(\3\2\2\2\u00cf\u00d0\7"+
		">\2\2\u00d0\u00d1\7?\2\2\u00d1*\3\2\2\2\u00d2\u00d3\7@\2\2\u00d3\u00d4"+
		"\7?\2\2\u00d4,\3\2\2\2\u00d5\u00d6\7>\2\2\u00d6\u00d7\7@\2\2\u00d7.\3"+
		"\2\2\2\u00d8\u00d9\7?\2\2\u00d9\60\3\2\2\2\u00da\u00db\7,\2\2\u00db\62"+
		"\3\2\2\2\u00dc\u00dd\7<\2\2\u00dd\64\3\2\2\2\u00de\u00df\7R\2\2\u00df"+
		"\u00e0\7T\2\2\u00e0\u00e1\7K\2\2\u00e1\u00e2\7O\2\2\u00e2\u00e3\7C\2\2"+
		"\u00e3\u00e4\7T\2\2\u00e4\u00e5\7[\2\2\u00e5\66\3\2\2\2\u00e6\u00e7\7"+
		"M\2\2\u00e7\u00e8\7G\2\2\u00e8\u00e9\7[\2\2\u00e98\3\2\2\2\u00ea\u00eb"+
		"\7H\2\2\u00eb\u00ec\7Q\2\2\u00ec\u00ed\7T\2\2\u00ed\u00ee\7G\2\2\u00ee"+
		"\u00ef\7K\2\2\u00ef\u00f0\7I\2\2\u00f0\u00f1\7P\2\2\u00f1:\3\2\2\2\u00f2"+
		"\u00f3\7E\2\2\u00f3\u00f4\7Q\2\2\u00f4\u00f5\7P\2\2\u00f5\u00f6\7U\2\2"+
		"\u00f6\u00f7\7V\2\2\u00f7\u00f8\7T\2\2\u00f8\u00f9\7C\2\2\u00f9\u00fa"+
		"\7K\2\2\u00fa\u00fb\7P\2\2\u00fb\u00fc\7V\2\2\u00fc<\3\2\2\2\u00fd\u00fe"+
		"\7T\2\2\u00fe\u00ff\7G\2\2\u00ff\u0100\7H\2\2\u0100\u0101\7G\2\2\u0101"+
		"\u0102\7T\2\2\u0102\u0103\7G\2\2\u0103\u0104\7P\2\2\u0104\u0105\7E\2\2"+
		"\u0105\u0106\7G\2\2\u0106\u0107\7U\2\2\u0107>\3\2\2\2\u0108\u0109\7H\2"+
		"\2\u0109\u010a\7T\2\2\u010a\u010b\7Q\2\2\u010b\u010c\7O\2\2\u010c@\3\2"+
		"\2\2\u010d\u010e\7E\2\2\u010e\u010f\7J\2\2\u010f\u0110\7G\2\2\u0110\u0111"+
		"\7E\2\2\u0111\u0112\7M\2\2\u0112B\3\2\2\2\u0113\u0114\7C\2\2\u0114\u0115"+
		"\7N\2\2\u0115\u0116\7V\2\2\u0116\u0117\7G\2\2\u0117\u0118\7T\2\2\u0118"+
		"D\3\2\2\2\u0119\u011a\7T\2\2\u011a\u011b\7G\2\2\u011b\u011c\7P\2\2\u011c"+
		"\u011d\7C\2\2\u011d\u011e\7O\2\2\u011e\u011f\7G\2\2\u011fF\3\2\2\2\u0120"+
		"\u0121\7V\2\2\u0121\u0122\7Q\2\2\u0122H\3\2\2\2\u0123\u0124\7C\2\2\u0124"+
		"\u0125\7F\2\2\u0125\u0126\7F\2\2\u0126J\3\2\2\2\u0127\u0128\7E\2\2\u0128"+
		"\u0129\7Q\2\2\u0129\u012a\7N\2\2\u012a\u012b\7W\2\2\u012b\u012c\7O\2\2"+
		"\u012c\u012d\7P\2\2\u012dL\3\2\2\2\u012e\u012f\7K\2\2\u012f\u0130\7P\2"+
		"\2\u0130\u0131\7U\2\2\u0131\u0132\7G\2\2\u0132\u0133\7T\2\2\u0133\u0134"+
		"\7V\2\2\u0134\u0135\7\"\2\2\u0135\u0136\7K\2\2\u0136\u0137\7P\2\2\u0137"+
		"\u0138\7V\2\2\u0138\u0139\7Q\2\2\u0139N\3\2\2\2\u013a\u013b\7X\2\2\u013b"+
		"\u013c\7C\2\2\u013c\u013d\7N\2\2\u013d\u013e\7W\2\2\u013e\u013f\7G\2\2"+
		"\u013f\u0140\7U\2\2\u0140P\3\2\2\2\u0141\u0142\7W\2\2\u0142\u0143\7R\2"+
		"\2\u0143\u0144\7F\2\2\u0144\u0145\7C\2\2\u0145\u0146\7V\2\2\u0146\u0147"+
		"\7G\2\2\u0147R\3\2\2\2\u0148\u0149\7U\2\2\u0149\u014a\7G\2\2\u014a\u014b"+
		"\7V\2\2\u014bT\3\2\2\2\u014c\u014d\7F\2\2\u014d\u014e\7G\2\2\u014e\u014f"+
		"\7N\2\2\u014f\u0150\7G\2\2\u0150\u0151\7V\2\2\u0151\u0152\7G\2\2\u0152"+
		"V\3\2\2\2\u0153\u0154\7Y\2\2\u0154\u0155\7J\2\2\u0155\u0156\7G\2\2\u0156"+
		"\u0157\7T\2\2\u0157\u0158\7G\2\2\u0158X\3\2\2\2\u0159\u015a\7Q\2\2\u015a"+
		"\u015b\7T\2\2\u015b\u015c\7F\2\2\u015c\u015d\7G\2\2\u015d\u015e\7T\2\2"+
		"\u015e\u015f\7\"\2\2\u015f\u0160\7D\2\2\u0160\u0161\7[\2\2\u0161Z\3\2"+
		"\2\2\u0162\u0163\7C\2\2\u0163\u0164\7U\2\2\u0164\u0165\7E\2\2\u0165\\"+
		"\3\2\2\2\u0166\u0167\7F\2\2\u0167\u0168\7G\2\2\u0168\u0169\7U\2\2\u0169"+
		"\u016a\7E\2\2\u016a^\3\2\2\2\u016b\u016c\7K\2\2\u016c\u016d\7P\2\2\u016d"+
		"\u016e\7V\2\2\u016e`\3\2\2\2\u016f\u0170\7E\2\2\u0170\u0171\7J\2\2\u0171"+
		"\u0172\7C\2\2\u0172\u0173\7T\2\2\u0173b\3\2\2\2\u0174\u0175\7D\2\2\u0175"+
		"\u0176\7Q\2\2\u0176\u0177\7Q\2\2\u0177\u0178\7N\2\2\u0178\u0179\7G\2\2"+
		"\u0179\u017a\7C\2\2\u017a\u017b\7P\2\2\u017bd\3\2\2\2\u017c\u017d\7C\2"+
		"\2\u017d\u017e\7P\2\2\u017e\u017f\7F\2\2\u017ff\3\2\2\2\u0180\u0181\7"+
		"Q\2\2\u0181\u0182\7T\2\2\u0182h\3\2\2\2\u0183\u0184\7P\2\2\u0184\u0185"+
		"\7Q\2\2\u0185\u0186\7V\2\2\u0186j\3\2\2\2\u0187\u0188\7U\2\2\u0188\u0189"+
		"\7G\2\2\u0189\u018a\7N\2\2\u018a\u018b\7G\2\2\u018b\u018c\7E\2\2\u018c"+
		"\u018d\7V\2\2\u018dl\3\2\2\2\u018e\u018f\t\2\2\2\u018fn\3\2\2\2\u0190"+
		"\u0191\4\62;\2\u0191p\3\2\2\2\u0192\u0197\5m\67\2\u0193\u0196\5m\67\2"+
		"\u0194\u0196\5o8\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196\u0199"+
		"\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198r\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u019a\u019e\5o8\2\u019b\u019d\5o8\2\u019c\u019b\3\2\2\2"+
		"\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019ft\3"+
		"\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\5m\67\2\u01a2v\3\2\2\2\u01a3\u01a5"+
		"\t\3\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\b<\2\2\u01a9x\3\2\2\2\7"+
		"\2\u0195\u0197\u019e\u01a6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}