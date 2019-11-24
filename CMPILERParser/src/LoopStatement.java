import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LoopStatement {

    public LoopStatement(ParseTree ctx, Map<String, Value> memory, Map<String, Function> functionMap, customVisitor context){
        HashMap<String, Value> tempMemory = new HashMap<>();
        for(Map.Entry mapElement : memory.entrySet()){

            String key = (String)mapElement.getKey();
            //System.out.println(key);
            Value val = memory.get(key);
            tempMemory.put(key, val);
        }

        customVisitor visitor = new customVisitor(tempMemory, functionMap);
        //System.out.println(ctx.getText());
        visitor.visit(ctx);

        HashMap<String, Value> sourcememory = visitor.getMemory();
        HashMap<String, Value> comparememory = context.getMemory();

        tempMemory = visitor.getMemory();

        //System.out.println("Global memory");
        for(Map.Entry mapElement : tempMemory.entrySet()){
            String key = (String)mapElement.getKey();
            //System.out.println(key);
        }

       // System.out.println("Local Memory");
        for(Map.Entry mapElement : sourcememory.entrySet()){
            String key = (String)mapElement.getKey();
            //System.out.println(key);
            if(comparememory.get(key)!=null){
                Value val = sourcememory.get(key);
                comparememory.replace(key, val);
            }
        }

        //System.out.println(tempMemory.get("num").asInt());
        context.storeMemory(comparememory);
    }
}
