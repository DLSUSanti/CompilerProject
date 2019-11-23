import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Map;

public class LoopStatement {

    public Map<String, Value> tempmemory;

    public LoopStatement(ParseTree ctx){
        customVisitor visitor = new customVisitor();
        visitor.visit(ctx);
    }
}
