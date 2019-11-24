import java.util.HashMap;
import java.util.Map;

public class Function {

    public Map<String, Value> localMemory;

    public Function(){
        localMemory  = new HashMap<String, Value>();
    }

    public void addVar(String s, Value v){
        localMemory.put(s,v);
    }

    public Value getVar(String s){
        return localMemory.get(s);
    }
}
