import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import java.util.*;

public class Test {
	public static void main(String[] args) throws Exception {
		CharStream input = new ANTLRFileStream(args[0]);
		simpleLexer lex = new simpleLexer(input);
		TokenRewriteStream tokens = new TokenRewriteStream(lex);
		simpleParser parser = new simpleParser(tokens);
		parser.setTreeAdaptor(new MyAdaptor());
		simpleParser.simple_return r = parser.simple();
		if ( r.tree!=null ) {
			System.out.println(((Tree)r.tree).toStringTree());
			System.out.println(r.tree.getText());
			((CommonTree)r.tree).sanityCheckParentAndChildIndexes();
		}
	}
}

