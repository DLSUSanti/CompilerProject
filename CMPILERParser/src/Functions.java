import org.antlr.v4.runtime.tree.ParseTree;

public class Functions {

    private  ParseTree ctx;
    private String returnType;

    public Functions(ParseTree ctx, String returnType){
        this.ctx = ctx;
        this.returnType = returnType;
    }

    public Value visitFunction(){
        customVisitor visitor = new customVisitor();
        return visitor.visit(ctx);
    }

    public String getReturnType() {
        return returnType;
    }
}
