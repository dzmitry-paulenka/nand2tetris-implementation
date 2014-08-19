// Generated from D:/Work/!GitHub/nand2tetris-implementation/Chapter-06/Assembler/src/main/java/com/dpaulenk/nand2tetris/assembler\Assembler.g4 by ANTLR 4.4.1-dev
package com.dpaulenk.nand2tetris.assembler.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__25=1, T__24=2, T__23=3, T__22=4, T__21=5, T__20=6, T__19=7, T__18=8, 
		T__17=9, T__16=10, T__15=11, T__14=12, T__13=13, T__12=14, T__11=15, T__10=16, 
		T__9=17, T__8=18, T__7=19, T__6=20, T__5=21, T__4=22, T__3=23, T__2=24, 
		T__1=25, T__0=26, NEWLINE=27, SYMBOL=28, NUMBER=29, COMMENTS=30, WS=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'"
	};
	public static final String[] ruleNames = {
		"T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", 
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "NEWLINE", "SYMBOL", "NUMBER", "COMMENTS", "WS"
	};


	public AssemblerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Assembler.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u00ab\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\6\34\u008a\n\34\r\34\16"+
		"\34\u008b\3\35\3\35\7\35\u0090\n\35\f\35\16\35\u0093\13\35\3\36\6\36\u0096"+
		"\n\36\r\36\16\36\u0097\3\37\3\37\3\37\3\37\7\37\u009e\n\37\f\37\16\37"+
		"\u00a1\13\37\3\37\3\37\3 \6 \u00a6\n \r \16 \u00a7\3 \3 \3\u009f\2!\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!\3\2\7\4\2\f\f\17\17\t\2&&\60\60<<C\\^^aac|\t\2&&\60\60\62<C\\^^aa"+
		"c|\3\2\62;\4\2\13\13\"\"\u00af\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5"+
		"C\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rM\3\2\2\2\17P\3\2\2\2\21"+
		"T\3\2\2\2\23W\3\2\2\2\25Y\3\2\2\2\27]\3\2\2\2\31_\3\2\2\2\33c\3\2\2\2"+
		"\35f\3\2\2\2\37h\3\2\2\2!l\3\2\2\2#n\3\2\2\2%p\3\2\2\2\'r\3\2\2\2)v\3"+
		"\2\2\2+x\3\2\2\2-z\3\2\2\2/~\3\2\2\2\61\u0080\3\2\2\2\63\u0084\3\2\2\2"+
		"\65\u0086\3\2\2\2\67\u0089\3\2\2\29\u008d\3\2\2\2;\u0095\3\2\2\2=\u0099"+
		"\3\2\2\2?\u00a5\3\2\2\2AB\7(\2\2B\4\3\2\2\2CD\7/\2\2D\6\3\2\2\2EF\7*\2"+
		"\2F\b\3\2\2\2GH\7C\2\2H\n\3\2\2\2IJ\7C\2\2JK\7O\2\2KL\7F\2\2L\f\3\2\2"+
		"\2MN\7O\2\2NO\7F\2\2O\16\3\2\2\2PQ\7L\2\2QR\7N\2\2RS\7G\2\2S\20\3\2\2"+
		"\2TU\7C\2\2UV\7F\2\2V\22\3\2\2\2WX\7\62\2\2X\24\3\2\2\2YZ\7L\2\2Z[\7I"+
		"\2\2[\\\7G\2\2\\\26\3\2\2\2]^\7O\2\2^\30\3\2\2\2_`\7L\2\2`a\7G\2\2ab\7"+
		"S\2\2b\32\3\2\2\2cd\7C\2\2de\7O\2\2e\34\3\2\2\2fg\7+\2\2g\36\3\2\2\2h"+
		"i\7L\2\2ij\7N\2\2jk\7V\2\2k \3\2\2\2lm\7F\2\2m\"\3\2\2\2no\7-\2\2o$\3"+
		"\2\2\2pq\7B\2\2q&\3\2\2\2rs\7L\2\2st\7O\2\2tu\7R\2\2u(\3\2\2\2vw\7?\2"+
		"\2w*\3\2\2\2xy\7=\2\2y,\3\2\2\2z{\7L\2\2{|\7P\2\2|}\7G\2\2}.\3\2\2\2~"+
		"\177\7\63\2\2\177\60\3\2\2\2\u0080\u0081\7L\2\2\u0081\u0082\7I\2\2\u0082"+
		"\u0083\7V\2\2\u0083\62\3\2\2\2\u0084\u0085\7~\2\2\u0085\64\3\2\2\2\u0086"+
		"\u0087\7#\2\2\u0087\66\3\2\2\2\u0088\u008a\t\2\2\2\u0089\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c8\3"+
		"\2\2\2\u008d\u0091\t\3\2\2\u008e\u0090\t\4\2\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092:\3\2\2\2"+
		"\u0093\u0091\3\2\2\2\u0094\u0096\t\5\2\2\u0095\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098<\3\2\2\2\u0099"+
		"\u009a\7\61\2\2\u009a\u009b\7\61\2\2\u009b\u009f\3\2\2\2\u009c\u009e\13"+
		"\2\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u00a0\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\5\67"+
		"\34\2\u00a3>\3\2\2\2\u00a4\u00a6\t\6\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\b \2\2\u00aa@\3\2\2\2\b\2\u008b\u0091\u0097\u009f\u00a7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}