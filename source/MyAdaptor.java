import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;



class MyAdaptor extends CommonTreeAdaptor{
	public MyAdaptor(){
		super();
	}
    public Object create(Token token) {
        return new ASTNode(token);
    }
    
}
