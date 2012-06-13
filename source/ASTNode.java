import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
public class ASTNode extends CommonTree {
	public ASTNode(Token t) {super(t); token=t;}
	public ASTNode(int i) { this(new CommonToken(i,"ASTNode"));}               
    public ASTNode(ASTNode node) { super(node); }
	public Tree dupNode() { return new ASTNode(this); } 
    public String toString() { return token.getText()+"<ASTNode>";}
}
