import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Functions {

    public  ParseTree ctxParams;
    public ParseTree ctxBlock;
    public String returnType;
    public HashMap<String, Value> memory;
    private Value returnvalue;
    private mainInterface frame;

    public Functions(ParseTree ctxParams, ParseTree ctxBlock, String returnType, mainInterface frame){
        this.frame = frame;
        this.ctxParams = ctxParams;
        this.ctxBlock = ctxBlock;
        this.returnType = returnType;
        returnvalue = null;
        //System.out.println(ctxParams.getText().substring(1, ctxParams.getText().length()-1));

        customVisitor visitor = new customVisitor(frame);
        visitor.visit(this.ctxParams);
        memory = visitor.getMemory();
    }

    public void execute(ArrayList<Value> passedParameters, Map<String, Functions> functionsMap){
        String data[] = ctxParams.getText().substring(1, ctxParams.getText().length()-1).split(",");
        if(!data[0].equals("")){
            for(int i=0; i<data.length; i++){
                String decTokens[] = data[i].split(" ");
                String parameterID = decTokens[1];
                //System.out.println(parameterID);

                if(passedParameters.get(i).datatype.equals("double")){
                    Value val = passedParameters.get(i);
                    if(memory.get(parameterID).datatype.equals("int")){
                        int newnum = passedParameters.get(i).asDouble().intValue();
                        memory.replace(parameterID,new Value(newnum, "int"));
                    }
                    else{
                        float newnum = passedParameters.get(i).asDouble().floatValue();
                        memory.replace(parameterID,new Value(newnum, "float"));
                    }
                }
                else{
                    memory.replace(parameterID, passedParameters.get(i));
                }
            }
        }


        customVisitor visitor = new customVisitor(memory, functionsMap, frame);
        visitor.visit(ctxBlock);
        returnvalue = visitor.getReturnvalue();
    }

    public Value getReturnValue(){
        return returnvalue;
    }
}
