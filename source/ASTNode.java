import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
public class ASTNode extends CommonTree {
	public ASTNode(Token t) {super(t); token=t;}                 // for 'B'<ASTNode>

	public ASTNode(int i) { this(new CommonToken(i,"ASTNode"));}               
	
    public ASTNode(ASTNode node) { super(node); }             // for dupNode
    public Tree dupNode() { return new ASTNode(this); } // for dup'ing type
    public String toString() { return token.getText()+"<ASTNode>";}
}
