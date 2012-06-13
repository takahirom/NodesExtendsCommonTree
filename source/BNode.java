import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
public class BNode extends ASTNode {

	public	BNode(Token t){
		super(t);
	}

	public BNode(int integer){
	 this(new CommonToken(integer,"BNode"));   
	}

	public String toString() { return token.getText()+"<BNode>";}

}
