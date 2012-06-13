import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
public class AbcNode extends ASTNode {

	public	AbcNode(Token t){
		super(t);
	}

	public AbcNode(int integer){
	 this(new CommonToken(integer,"AbcNode"));   
	}

	public String toString() { return token.getText()+"<AbcNode>";}

}
