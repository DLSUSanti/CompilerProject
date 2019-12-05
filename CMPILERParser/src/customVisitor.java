
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class customVisitor extends gBaseVisitor<Value>{

    private HashMap<String, Value> memory;
    public Map<String, Functions> functionMap;
    public Value returnvalue;
    private mainInterface frame;
    // its not working as its supposed to work
    private boolean noBugsFound = true;

    public customVisitor(mainInterface frame){
        this.frame = frame;
        memory = new HashMap<>();
        functionMap = new HashMap<>();
        returnvalue = null;
    }

    public customVisitor(HashMap<String, Value> memory, Map<String, Functions> functionMap, mainInterface frame){
        this.frame = frame;
        this.memory = memory;
        this.functionMap = functionMap;
        returnvalue = null;
    }

    public void storeMemory(HashMap<String, Value> memory){
        this.memory = memory;
    }

    public HashMap<String,Value> getMemory(){
        return memory;
    }

    public Value getReturnvalue() {
        return returnvalue;
    }

    @Override
    public Value visitFunction(gParser.FunctionContext ctx) {
        System.out.println("Visited Function -> " + ctx.getText());
        Functions func = null;
        if(ctx.functionreturnblock()!=null){
            // ERROR MESSAGE
            System.out.println("Function | op: " + ctx.op.getText());
            System.out.println("Function | identifier: " + ctx.identifier().IDENTIFIER());
//            System.err.println("Function | functionparameters: " + ctx.functionparameters().RPARENTHESIS());
            System.out.println("Function | functionreturnblock: " + ctx.functionreturnblock());

//            System.out.println("Function | functionreturnblock | statement: " + ctx.functionreturnblock().statement());
//            System.out.println("Function | functionreturnblock | returnstatement: " + ctx.functionreturnblock().returnstatement());
//            System.out.println("Function | functionreturnblock | LBRACE: " + ctx.functionreturnblock().LBRACE());
//            System.out.println("Function | functionreturnblock | RBRACE: " + ctx.functionreturnblock().RBRACE());

            if(ctx.functionreturnblock().LBRACE().getText().contains("missing")) {
                frame.getjTextPaneDebug().append("In line " + ctx.functionreturnblock().LBRACE().getSymbol().getLine() + ": Cannot find bracket left bracket \n");
                noBugsFound = false;
            }
            if(ctx.functionreturnblock().RBRACE().getText().contains("missing")) {
                frame.getjTextPaneDebug().append("In line " + ctx.functionreturnblock().RBRACE().getSymbol().getLine() + ": Cannot find bracket right bracket \n");
                noBugsFound = false;
            }

            if(noBugsFound)
                func = new Functions(ctx.functionparameters(), ctx.functionreturnblock(), ctx.op.getText(), frame);
        }
        else {
            // ERRORMESSAGE
//            System.out.println("Function | VOID: " + ctx.VOID());
            if (ctx.VOID() == null) {
                frame.getjTextPaneDebug().append("In line " + ctx.FUNCTION().getSymbol().getLine() + ": Missing variable \n");
                noBugsFound = false;
            }
//            System.out.println("Function | identifier: " + ctx.identifier().IDENTIFIER());
            if (ctx.identifier().IDENTIFIER().getText().contains("missing")) {
                frame.getjTextPaneDebug().append("In line " + ctx.FUNCTION().getSymbol().getLine() + ":Missing identifier \n");
                noBugsFound = false;
            }
//            System.out.println("Function | functionparameters: " + ctx.functionparameters());
//            System.out.println("Function | functionvoidblock: " + ctx.functionvoidblock());
//            System.out.println("Function | functionvoidblock LBRACE: " + ctx.functionvoidblock().LBRACE());
//            System.out.println("Function | functionvoidblock RBRACE: " + ctx.functionvoidblock().RBRACE());

            if (ctx.functionvoidblock().LBRACE().getText().contains("missing")) {
                frame.getjTextPaneDebug().append("In line " + ctx.functionvoidblock().LBRACE().getSymbol().getLine() + ": Cannot find bracket left bracket \n");
                noBugsFound = false;
            }
            if (ctx.functionvoidblock().RBRACE().getText().contains("missing")) {
                frame.getjTextPaneDebug().append("In line " + ctx.functionvoidblock().RBRACE().getSymbol().getLine() + ": Cannot find bracket right bracket \n");
                noBugsFound = false;
            }
            if (noBugsFound) {
                if (ctx.VOID() != null || ctx.functionparameters() != null)
                    func = new Functions(ctx.functionparameters(), ctx.functionvoidblock(), ctx.op.getText(), frame);
            }
        }
        if(noBugsFound) {
            Functions check = functionMap.get(ctx.identifier().getText());
            if (check != null) {
                functionMap.replace(ctx.identifier().getText(), func);
                //System.out.println("Function Replaced");
            } else {
                functionMap.put(ctx.identifier().getText(), func);
                //System.out.println("Function Stored");
            }
        }
        return null;
    }

    @Override
    public Value visitCall(gParser.CallContext ctx) {
        System.out.println("Visited Call -> " + ctx.getText());

        Functions func = functionMap.get(ctx.identifier().getText());
        if (func != null) {
            //System.out.println("Function called");
            Functions execfunc = new Functions(func.ctxParams, func.ctxBlock, func.returnType, frame);
            ArrayList<Value> parameters = new ArrayList<>();
            int i = 0;
            //System.out.println("Storing values");
            while (ctx.callparameter(i) != null) {
                Value val;
                if (ctx.callparameter(i).identifier() != null) {
                    val = memory.get(ctx.callparameter(i).identifier().getText());
                } else {
                    Double raw = visit(ctx.callparameter(i).opr()).asDouble();
                    val = new Value(raw, "double");
                }
                parameters.add(val);
                i++;
            }
            //System.out.println("executing");
            execfunc.execute(parameters, functionMap);
            returnvalue = execfunc.getReturnValue();
            //System.out.println("finished");
        } else {
            frame.getjTextPaneDebug().append("In line " + ctx.CALL().getSymbol().getLine() + ": Function does not exist \n");
            System.err.println("In line " + ctx.CALL().getSymbol().getLine() + ": Function does not exist");
            noBugsFound = false;
        }
        return null;
    }

    @Override
    public Value visitReturnstatement(gParser.ReturnstatementContext ctx) {
        System.out.println("Return Statement: " + ctx.getText());
        if(ctx.SEMICOLON()==null) {
            frame.getjTextPaneDebug().append("In line " + ctx.RETURN().getSymbol().getLine() + ": Cannot find semicolon \n");
            noBugsFound = false;
        }

        if(ctx.identifier()!=null){
            System.out.println("Return Statement | identifier: " + ctx.identifier().getText());
            String split[] = ctx.getText().split(";|\\s+");
            if(!split[1].equals(ctx.identifier().getText())){
//                System.out.println("SPLIT{1}: " + split[1]);
//                System.out.println("CTX: " + ctx.identifier().getText());
                frame.getjTextPaneDebug().append("In line " + ctx.RETURN().getSymbol().getLine() + ": Cannot find identifier \n");
                noBugsFound = false;
            }
            if(memory.get(ctx.identifier().getText())!=null){
                returnvalue = memory.get(ctx.identifier().getText());
            }
        }
        else if(ctx.charliteral()!=null){
            System.out.println("Return Statement | charliteral: " + ctx.charliteral().getText());
            String split[] = ctx.getText().split(";|\\s+");
            if(!split[1].equals(ctx.charliteral().getText())){
//                System.out.println("SPLIT{1}: " + split[1]);
//                System.out.println(" CTX: " + ctx.declaration().getText());
                frame.getjTextPaneDebug().append("In line " + ctx.RETURN().getSymbol().getLine() + ": Cannot find char \n");
                noBugsFound = false;
            }
            returnvalue = new Value(ctx.charliteral().getText(), "char");
        }
        else if(ctx.stringliteral()!=null){
            System.out.println("Return Statement | stringliteral: " + ctx.stringliteral().getText());
            String split[] = ctx.getText().split(";|\\s+");
            if(!split[1].equals(ctx.stringliteral().getText())){
//                System.out.println("SPLIT{1}: " + split[1]);
//                System.out.println(" CTX: " + ctx.declaration().getText());
                frame.getjTextPaneDebug().append("In line " + ctx.RETURN().getSymbol().getLine() + ": Cannot find string \n");
                noBugsFound = false;
            }
            returnvalue = new Value(ctx.stringliteral().getText(), "string");
        }
        else if(ctx.opr()!=null){
            System.out.println("Return Statement | opr: " + ctx.opr().getText());
            String split[] = ctx.getText().split(";|\\s+");
            if(!split[1].equals(ctx.opr().getText())){
//                System.out.println("SPLIT{1}: " + split[1]);
//                System.out.println("CTX: " + ctx.opr().getText());
                frame.getjTextPaneDebug().append("In line " + ctx.RETURN().getSymbol().getLine() + ": Cannot find operation\n    Suggested: " + ctx.opr().getText() +"\n");
                noBugsFound = false;
            }
            returnvalue = this.visit(ctx.opr());
        }
        else{
            System.err.println("Error returning value");
            frame.getjTextPaneDebug().append("Error returning value \n");
            noBugsFound = false;
        }
        return null;
    }

    //declarations (add call statements)
    @Override
    public Value visitIntdeclaration(gParser.IntdeclarationContext ctx) {
//        System.out.println("Visited Int Declaration -> " + ctx.getText());
//        System.out.println("IntDeclaration | INTEGER: " + ctx.INTEGER());
//        System.out.println("IntDeclaration | IDENTIFIER: " + ctx.id.IDENTIFIER());

        Value storevalue;
        Value checkvalue = memory.get(ctx.id.getText());
        if(checkvalue == null){
            if(ctx.opr()!=null){
                Double raw = visit(ctx.opr()).asDouble();
                int result = raw.intValue();
                storevalue = new Value(result, "int");
                memory.put(ctx.id.getText(), storevalue);
                //System.out.println("Assigning an operation to int with value " + result);
            }
            else if(ctx.identifier(1)!=null){
                //System.out.println("Assigning an identifier to int");
                if(ctx.index()==null){
                    Value check2 = memory.get(ctx.identifier(1).getText());
                    if(check2 == null){
                        System.err.println("Variable " + ctx.identifier(1).getText() + " has not been declared");
                        frame.getjTextPaneDebug().append("Variable '" + ctx.identifier(1).getText() + "' has not been declared \n");
                        noBugsFound = false;
                    }
                    else {
                        if(check2.datatype.equals(checkvalue.datatype)){
                            memory.put(ctx.id.getText(), check2);
                        }
                        else {
                            System.err.println("Mismatching data types");
                            frame.getjTextPaneDebug().append("Mismatching data types \n");
                            noBugsFound = false;
                        }
                    }
                }
                else{
                    Value check2 = memory.get(ctx.identifier(1).getText());
                    if(check2 == null){
                        System.err.println("Variable " + ctx.identifier(1).getText() + " has not been declared");
                        frame.getjTextPaneDebug().append("Variable '" + ctx.identifier(1).getText() + "' has not been declared \n");
                        noBugsFound = false;
                    }
                    else {
                        int index;
                        if(ctx.index().intliteral()!=null){
                            index = Integer.parseInt(ctx.index().intliteral().getText());
                        }
                        else{
                            Value val = memory.get(ctx.index().identifier().getText());
                            index = val.asInt();
                        }

                        if(check2.datatype.equals("intarray")){
                            int arr[] = check2.asIntArray();
                            int num = arr[index];
                            Value newval = new Value(num, "int");
                            memory.put(ctx.id.getText(), newval);
                        }
                        else {
                            System.err.println("Mismatching data types");
                            frame.getjTextPaneDebug().append("Mismatching data types \n");
                            noBugsFound = false;
                        }
                    }
                }
            }
            else{
                storevalue = new Value(0, "int");
                memory.put(ctx.id.getText(), storevalue);
                //System.out.println("Assigning default value to int");
            }
        }
        else{
            System.err.println("Variable " + ctx.id.getText() + " already exists");
            frame.getjTextPaneDebug().append("Variable '" + ctx.id.getText() + "' already exists \n");
            noBugsFound = false;
        }
        return null;
    }

    @Override
    public Value visitFloatdeclaration(gParser.FloatdeclarationContext ctx) {
        //System.out.println("Visited Float Declaration -> " + ctx.getText());
        Value storevalue;
        Value checkvalue = memory.get(ctx.id.getText());
        if(checkvalue == null){
            if(ctx.opr()!=null){
                Double raw = visit(ctx.opr()).asDouble();
                float result = raw.floatValue();
                storevalue = new Value(result, "float");
                memory.put(ctx.id.getText(), storevalue);
                //System.out.println("Assigning an operation to float" + result);
            }
            else if(ctx.identifier(1)!=null){
                //System.out.println("Assigning an identifier to float");
                if(ctx.index()==null){
                    Value check2 = memory.get(ctx.identifier(1).getText());
                    if(check2 == null){
                        System.err.println("Variable " + ctx.identifier(1).getText() + " has not been declared");
                        frame.getjTextPaneDebug().append("Variable '" + ctx.identifier(1).getText() + "' has not been declared \n");
                        noBugsFound = false;
                    }
                    else {
                        if(check2.datatype.equals(checkvalue.datatype)){
                            memory.replace(ctx.id.getText(), check2);
                        }
                        else {
                            System.err.println("Mismatching data types");
                            frame.getjTextPaneDebug().append("Mismatching data types \n");
                            noBugsFound = false;
                        }
                    }
                }
                else{
                    Value check2 = memory.get(ctx.identifier(1).getText());
                    if(check2 == null){
                        System.err.println("Variable " + ctx.identifier(1).getText() + " has not been declared");
                        frame.getjTextPaneDebug().append("Variable '" + ctx.identifier(1).getText() + "' has not been declared \n");
                        noBugsFound = false;
                    }
                    else {
                        int index;
                        if(ctx.index().intliteral()!=null){
                            index = Integer.parseInt(ctx.index().intliteral().getText());
                        }
                        else{
                            Value val = memory.get(ctx.index().identifier().getText());
                            index = val.asInt();
                        }

                        if(check2.datatype.equals("floatarray")){
                            float arr[] = check2.asFloatArray();
                            float num = arr[index];
                            Value newval = new Value(num, "float");
                            memory.put(ctx.id.getText(), newval);
                        }
                        else {
                            System.err.println("Mismatching data types");
                            frame.getjTextPaneDebug().append("Mismatching data types \n");
                            noBugsFound = false;
                        }
                    }
                }
            }
            else{
                storevalue = new Value(0, "float");
                memory.put(ctx.id.getText(), storevalue);
                //System.out.println("Assigning default value to float");
            }
        }
        else{
            System.err.println("Variable " + ctx.id.getText() + " already exists");
            frame.getjTextPaneDebug().append("Variable '" + ctx.id.getText() + "' already exists \n");
            noBugsFound = false;
        }
        return null;
    }

    @Override
    public Value visitIntarrdeclaration(gParser.IntarrdeclarationContext ctx) {
        //int array
        Value storevalue;
        Value checkvalue = memory.get(ctx.vararrname().identifier().getText());
        if(checkvalue == null){
            int size = Integer.parseInt(ctx.vararrname().intliteral().getText());
            int[] storearray = new int[size];
            int i = 0;
            while (i<size){
                if(ctx.arrval(i)!=null){
                    //System.out.println(ctx.arrval(i).getText());
                    if(ctx.arrval(i).opr()!=null){
                        Double raw = visit(ctx.arrval(i).opr()).asDouble();
                        int result = raw.intValue();
                        storearray[i] = result;
                    }
                    else if(ctx.arrval(i).identifier()!=null){
                        Value check2 = memory.get(ctx.arrval(i).identifier().getText());
                        if(check2 == null){
                            System.err.println("Variable '" + ctx.arrval(i).identifier().getText() + "' has not been declared");
                            frame.getjTextPaneDebug().append("Variable '" + ctx.arrval(i).identifier().getText() + "' has not been declared \n");
                            noBugsFound = false;
                        }
                        else {
                            if(check2.datatype.equals("int")){
                                storearray[i] = check2.asInt();
                            }
                            else {
                                System.err.println("Mismatching data types");
                                frame.getjTextPaneDebug().append("Mismatching data types \n");
                                noBugsFound = false;
                            }
                        }
                    }
                    else{
                        System.out.println("Int array assignment error");
                        frame.getjTextPaneDebug().append("Int array assignment error \n");
                        noBugsFound = false;
                    }
                }
                else{
                    storearray[i] = 0;
                }
                i++;
            }
            storevalue = new Value(storearray, "intarray");
            memory.put(ctx.vararrname().identifier().getText(), storevalue);
        }
        else{
            System.err.println("Variable '" + ctx.vararrname().identifier().getText() + "' already exists");
            frame.getjTextPaneDebug().append("Variable '" + ctx.vararrname().identifier().getText() + "' already exists \n");
            noBugsFound = false;
        }
        return null;
    }

    @Override
    public Value visitFloatarrdeclaration(gParser.FloatarrdeclarationContext ctx) {
        //float array
        Value storevalue;
        Value checkvalue = memory.get(ctx.vararrname().identifier().getText());
        if(checkvalue == null){
            int size = Integer.parseInt(ctx.vararrname().intliteral().getText());
            float[] storearray = new float[size];
            int i = 0;
            while (i<size){
                if(ctx.arrval(i)!=null){
                    //System.out.println(ctx.arrval(i).getText());
                    if(ctx.arrval(i).opr()!=null){
                        Double raw = visit(ctx.arrval(i).opr()).asDouble();
                        float result = raw.intValue();
                        storearray[i] = result;
                    }
                    else if(ctx.arrval(i).identifier()!=null){
                        Value check2 = memory.get(ctx.arrval(i).identifier().getText());
                        if(check2 == null){
                            System.err.println("Variable '" + ctx.arrval(i).identifier().getText() + "' has not been declared");
                            frame.getjTextPaneDebug().append("Variable '" + ctx.arrval(i).identifier().getText() + "' has not been declared\n");
                            noBugsFound = false;
                        }
                        else {
                            if(check2.datatype.equals("float")){
                                storearray[i] = check2.asFloat();
                            }
                            else {
                                System.err.println("Mismatching data types");
                                frame.getjTextPaneDebug().append("Mismatching data types\n");
                                noBugsFound = false;
                            }
                        }
                    }
                    else{
                        System.err.println("Float array assignment error");
                        frame.getjTextPaneDebug().append("Float array assignment error \n");
                        noBugsFound = false;
                    }
                }
                else{
                    storearray[i] = 0;
                }
                i++;
            }
            storevalue = new Value(storearray, "floatarray");
            memory.put(ctx.vararrname().identifier().getText(), storevalue);
        }
        else{
            System.err.println("Variable '" + ctx.vararrname().identifier().getText() + "' already exists");
            frame.getjTextPaneDebug().append("Variable '" + ctx.vararrname().identifier().getText() + "' already exists \n");
            noBugsFound = false;
        }
        return null;
    }

    @Override
    public Value visitChardeclaration(gParser.ChardeclarationContext ctx) {
        //System.out.println("Visited Char Declaration -> " + ctx.getText());
        Value storevalue;
        Value checkvalue = memory.get(ctx.id.getText());
        if(checkvalue == null){
            if(ctx.charliteral()!=null){
                //System.out.println("Assigning " + ctx.charliteral().getText() + " to char");
                storevalue = new Value(ctx.charliteral().getText(), "char");
                memory.put(ctx.id.getText(), storevalue);
            }
            else if(ctx.identifier(1)!=null){
                //System.out.println("Assigning an identifier to char");
                Value check2 = memory.get(ctx.identifier(1).getText());
                if(check2 == null){
                    System.err.println("Variable '" + ctx.identifier(1).getText() + "' has not been declared");
                    frame.getjTextPaneDebug().append("Variable '" + ctx.identifier(1).getText() + "' has not been declared \n");
                    noBugsFound = false;
                }
                else {
                    if(check2.datatype.equals(checkvalue.datatype)){
                        memory.replace(ctx.id.getText(), check2);
                    }
                    else {
                        System.err.println("Mismatching data types");
                        frame.getjTextPaneDebug().append("Mismatching data types");
                        noBugsFound = false;
                    }
                }
            }
            else if(ctx.call()!=null){
                //System.out.println("Assigning a call to char");
                this.visit(ctx.call());
                if(returnvalue.datatype.equals("char")){
                    memory.put(ctx.id.getText(), returnvalue);
                }
            }
            else{
                storevalue = new Value("\'\'", "char");
                memory.put(ctx.id.getText(), storevalue);
                //System.out.println("Assigning default value to char");
            }
        }
        else{
            System.err.println("Variable '" + ctx.id.getText() + "' already exists");
            frame.getjTextPaneDebug().append("Variable '" + ctx.id.getText() + "' already exists \n");
            noBugsFound = false;
        }
        return null;
    }

    @Override
    public Value visitChararrdeclaration(gParser.ChararrdeclarationContext ctx) {
        //System.out.println("Visited String Declaration -> " + ctx.getText());
        Value storevalue;
        Value checkvalue = memory.get(ctx.id.getText());
        if(checkvalue == null){
            if(ctx.stringliteral()!=null){
                //System.out.println("Assigning " + ctx.stringliteral().getText() + " to string");
                storevalue = new Value(ctx.stringliteral().getText(), "string");
                memory.put(ctx.id.getText(), storevalue);
            }
            else if(ctx.identifier(1)!=null){
                //System.out.println("Assigning an identifier to string");
                Value check2 = memory.get(ctx.identifier(1).getText());
                if(check2 == null){
                    System.err.println("Variable " + ctx.identifier(1).getText() + " has not been declared");
                    frame.getjTextPaneDebug().append("Variable '" + ctx.identifier(1).getText() + "' has not been declared \n");
                    noBugsFound = false;
                }
                else {
                    if(check2.datatype.equals(checkvalue.datatype)){
                        memory.replace(ctx.id.getText(), check2);
                    }
                    else {
                        System.err.println("Mismatching data types");
                        frame.getjTextPaneDebug().append("Mismatching data types \n");
                        noBugsFound = false;
                    }
                }
            }
            else if(ctx.call()!=null){
                //System.out.println("Assigning a call to string");
                this.visit(ctx.call());
                if(returnvalue.datatype.equals("string")){
                    memory.put(ctx.id.getText(), returnvalue);
                }
            }
            else{
                storevalue = new Value("\"\"", "string");
                memory.put(ctx.id.getText(), storevalue);
                //System.out.println("Assigning default value to string");
            }
        }
        else{
            System.err.println("Variable '" + ctx.id.getText() + "' already exists");
            frame.getjTextPaneDebug().append("Variable '" + ctx.id.getText() + "' already exists \n");
            noBugsFound = false;
        }
        return null;
    }

    @Override
    public Value visitBooleandeclaration(gParser.BooleandeclarationContext ctx) {
        //System.out.println("Visited Boolean Declaration -> " + ctx.getText());
        Value storevalue;
        Value checkvalue = memory.get(ctx.id.getText());
        if(checkvalue == null){
            if(ctx.val==null){
                storevalue = new Value(true, "boolean");
                memory.put(ctx.id.getText(), storevalue);
                //System.out.println("Variable " + ctx.id.getText() + " added to memory with default value (true)");
            }
            else{
                //boolean value
                storevalue = this.visit(ctx.booleanexp());
                memory.put(ctx.id.getText(), storevalue);
            }
        }
        else{
            System.err.println("Variable '" + ctx.id.getText() + "' already exists");
            frame.getjTextPaneDebug().append("Variable '" + ctx.id.getText() + "' already exists \n");
            noBugsFound = false;
        }
        return null;
    }

    //Math
    @Override
    public Value visitOpr(gParser.OprContext ctx) {
        return this.visit(ctx.addopr());
    }

    @Override
    public Value visitAddopr(gParser.AddoprContext ctx) {
        Value left, right;
        if(ctx.addopr()!=null){
            Value result;
            Double compute;
            left = this.visit(ctx.addopr());
            right = this.visit(ctx.multopr());
            if(ctx.op.getType() == gParser.PLUS){
                compute = left.asDouble() + right.asDouble();
            }
            else if(ctx.op.getType() == gParser.MINUS){
                compute = left.asDouble() - right.asDouble();
            }
            else{
                System.err.println("Add/Subtract error occurred");
                frame.getjTextPaneDebug().append("Add/Subtract error occurred \n");
                compute = 0d;
                noBugsFound = false;
            }
            result = new Value(compute, "double");
            return result;
        }
        else{
            return this.visit(ctx.multopr());
        }
    }

    @Override
    public Value visitMultopr(gParser.MultoprContext ctx) {
        Value left, right;
        if(ctx.multopr()!=null){
            Value result;
            Double compute;
            left = this.visit(ctx.multopr());
            right = this.visit(ctx.terminalopr());
            if(ctx.op.getType() == gParser.MUL){
                compute = left.asDouble() * right.asDouble();
            }
            else if(ctx.op.getType() == gParser.DIV){
                compute = left.asDouble() / right.asDouble();
            }
            else if(ctx.op.getType() == gParser.MOD){
                compute = left.asDouble() % right.asDouble();
            }
            else{
                System.err.println("Multiply/Divide error occurred");
                frame.getjTextPaneDebug().append("Multiply/Divide error occurred \n");
                compute = 0d;
                noBugsFound = false;
            }
            result = new Value(compute, "double");
            return result;
        }
        else{
            return this.visit(ctx.terminalopr());
        }
    }

    @Override
    public Value visitTerminalopr(gParser.TerminaloprContext ctx) {
        Value mathvalue;
        if(ctx.identifier() != null){
            //System.out.println("Equation contains identifier");
            Value checkvalue = memory.get(ctx.identifier().getText());
            if(checkvalue!=null){
                if(checkvalue.datatype.equals("int")){
                    mathvalue = new Value(Double.valueOf(checkvalue.asInt()),"double");
                }
                else if(checkvalue.datatype.equals("float")){
                    mathvalue = new Value(Double.valueOf(checkvalue.asFloat()),"double");
                }
                else{
                    System.err.println("Cannot identify datatype for variable " + ctx.identifier().getText());
                    mathvalue = new Value(0, "double");
                }
            }
            else{
                System.err.println("Cannot get user input for variable '" + ctx.identifier().getText() + "' (variable does not exist)");
                frame.getjTextPaneDebug().append("Cannot get user input for variable '" + ctx.identifier().getText() + "' (variable does not exist) \n");
                mathvalue = new Value(0, "double");
                noBugsFound = false;
            }
            return mathvalue;
        }
        else if(ctx.intliteral() != null){
            double d = Double.parseDouble(ctx.intliteral().getText());
            mathvalue = new Value(d, "double");
            return mathvalue;
        }
        else if(ctx.floatliteral() != null){
            double d = Double.parseDouble(ctx.floatliteral().getText());
            mathvalue = new Value(d, "double");
            return mathvalue;
        }
        else if(ctx.call() != null){
            //System.out.println("Equation contains call");
            this.visit(ctx.call());
            if(returnvalue.datatype.equals("int")){
                mathvalue = new Value(Double.valueOf(returnvalue.asInt()), "double");
            }
            else if(returnvalue.datatype.equals("float")){
                mathvalue = new Value(Double.valueOf(returnvalue.asFloat()), "double");
            }
            else{
                mathvalue = new Value(returnvalue.asDouble(), "double");
            }
            return mathvalue;
        }
        else if(ctx.opr() != null){
            return this.visit(ctx.opr());
        }
        else{
            //System.out.println("Cannot identify value");
            mathvalue = new Value(0, "double");
            return mathvalue;
        }
    }

    @Override
    public Value visitOperation(gParser.OperationContext ctx) {
        Value check = memory.get(ctx.identifier().getText());
        if(check == null){
            System.err.println("Variable '" + ctx.identifier().getText() + "' has not been declared");
            frame.getjTextPaneDebug().append("Variable '" + ctx.identifier().getText() + "' has not been declared \n");
            noBugsFound = false;
        }
        else {
            if(check.datatype.equals("int")){
                int before = check.asInt();
                int after;
                //System.out.println(ctx.shortopr().getText());
                if(ctx.shortopr().getText().equals("++")){
                    after = before + 1;

                }
                else if(ctx.shortopr().getText().equals("--")){
                    after = before - 1;
                }
                else{
                    String data[] = ctx.shortopr().getText().split("=");
                    int second = Integer.parseInt(data[1]);
                    if(data[0].equals("+")){
                        after = before + second;
                    }else if(data[0].equals("-")){
                        after = before - second;
                    }else if(data[0].equals("*")){
                        after = before * second;
                    }else if(data[0].equals("/")){
                        after = before / second;
                    }else{
                        after = 0;
                    }
                }
                Value storevalue = new Value(after, "int");
                memory.replace(ctx.identifier().getText(), storevalue);
            }
            else {
                System.err.println("Not an int data type");
                frame.getjTextPaneDebug().append("'" + ctx.identifier().getText() + "'is not an int data type \n");
                noBugsFound = false;
            }
        }

        return null;
    }

    //Booleans
    @Override
    public Value visitBooleanexp(gParser.BooleanexpContext ctx) {
        return this.visit(ctx.logic());
    }

    @Override
    public Value visitLogic(gParser.LogicContext ctx) {
        if(ctx.logic()!=null){
            Value left = this.visit(ctx.logic());
            Value right = this.visit(ctx.relation());
            Value returnvalue;
            if(ctx.log.getType() == gParser.AND){
                Boolean x = left.asBoolean() && right.asBoolean();
                returnvalue = new Value(x, "boolean");
            }
            else if(ctx.log.getType() == gParser.OR){
                Boolean x = left.asBoolean() || right.asBoolean();
                returnvalue = new Value(x, "boolean");
            }
            else{
                returnvalue = new Value(false, "boolean");
            }
            return returnvalue;
        }
        else {
            return this.visit(ctx.relation());
        }
    }

    @Override
    public Value visitRelation(gParser.RelationContext ctx) {
        if(ctx.booleanvalue(1)!=null){
            Value left = this.visit(ctx.booleanvalue(0));
            Value right = this.visit(ctx.booleanvalue(1));
            Value returnvalue;
            if(ctx.rel.getType()==gParser.EQUALS_EQUALS){
                if(left.asDouble().compareTo(right.asDouble())==0){
                    returnvalue = new Value(true, "boolean");
                }
                else{
                    returnvalue = new Value(false, "boolean");
                }
            }
            else if(ctx.rel.getType()==gParser.NOT_EQUALS){
                if(left.asDouble().compareTo(right.asDouble())!=0){
                    returnvalue = new Value(true, "boolean");
                }
                else{
                    returnvalue = new Value(false, "boolean");
                }
            }
            else if(ctx.rel.getType()==gParser.LESS_THAN){
                if(left.asDouble().compareTo(right.asDouble())<0){
                    returnvalue = new Value(true, "boolean");
                }
                else{
                    returnvalue = new Value(false, "boolean");
                }
            }
            else if(ctx.rel.getType()==gParser.LESS_THAN_EQUALS){
                if(left.asDouble().compareTo(right.asDouble())<=0){
                    returnvalue = new Value(true, "boolean");
                }
                else{
                    returnvalue = new Value(false, "boolean");
                }
            }
            else if(ctx.rel.getType()==gParser.GREATER_THAN){
                if(left.asDouble().compareTo(right.asDouble())>0){
                    returnvalue = new Value(true, "boolean");
                }
                else{
                    returnvalue = new Value(false, "boolean");
                }
            }
            else if(ctx.rel.getType()==gParser.GREATER_THAN_EQUALS){
                if(left.asDouble().compareTo(right.asDouble())>=0){
                    returnvalue = new Value(true, "boolean");
                }
                else{
                    returnvalue = new Value(false, "boolean");
                }
            }
            else{
                returnvalue = new Value(false, "boolean");
            }
            return returnvalue;
        }
        else if(ctx.booleanvalue(0)!=null){
            return this.visit(ctx.booleanvalue(0));
        }
        else if(ctx.booleanexp()!= null){
            return this.visit(ctx.booleanexp());
        }
        else{
            Value literal;
            if(ctx.getText().equals("vrai")){
                literal = new Value(true, "boolean");
            }
            else{
                literal = new Value(false, "boolean");
            }
            return literal;
        }
    }

    @Override
    public Value visitBooleanvalue(gParser.BooleanvalueContext ctx) {
        if(ctx.opr()!=null){
            return this.visit(ctx.opr());
        }
        else if(ctx.identifier()!=null){

            Value checkvalue = memory.get(ctx.identifier().getText());
            Value returnvalue;
            if(checkvalue == null){
                System.err.println("Variable '" + ctx.identifier().getText() + "' does not exist");
                frame.getjTextPaneDebug().append("Variable '" + ctx.identifier().getText() + "' does not exist \n");
                returnvalue = new Value(0d, "double");
                noBugsFound = false;
            }
            else{
                if(checkvalue.datatype.equals("int")){
                    returnvalue = new Value(Double.valueOf(checkvalue.asInt()), "double");
                    System.out.println(returnvalue.asDouble() + " " + returnvalue.datatype);
                }
                else if(checkvalue.datatype.equals("float")){
                    returnvalue = new Value(Double.valueOf(checkvalue.asFloat()), "double");
                    System.out.println(returnvalue.asDouble() + " " + returnvalue.datatype);

                }
                else{
                    System.err.println("Cannot parse variable '" + ctx.identifier().getText() + "'\n");
                    frame.getjTextPaneDebug().append("Cannot parse variable '" + ctx.identifier().getText() + "'\n");
                    returnvalue = new Value(0d, "double");
                    noBugsFound = false;
                }
            }
            return returnvalue;
        }
        else{
            return new Value(0d, "double");
        }
    }

    //Condition
    @Override
    public Value visitIfstatement(gParser.IfstatementContext ctx) {
        Boolean doElse = true;
        Boolean ifcondition = this.visit(ctx.nestedcondition().booleanexp()).asBoolean();
        if(ifcondition){
            this.visit(ctx.start);
            return null;
        }

        int i = 0;
        while(ctx.elseifstatement(i)!=null){
            //do
            Boolean elseifcondition = this.visit(ctx.elseifstatement(i).nestedcondition().booleanexp()).asBoolean();
            if(elseifcondition){
                this.visit(ctx.elseifstatement(i).middle);
                return null;
            }
            i++;
        }
        if(ctx.elsestatement()!=null){
            //do
            this.visit(ctx.elsestatement().end);
        }
        return null;
    }

    //Loops
    @Override
    public Value visitLoop(gParser.LoopContext ctx) {
        System.out.println("Loop | While: " + ctx.loopwhile());
        System.out.println("Loop | DoWhile: " + ctx.loopdowhile());
        System.out.println("Loop | For: " + ctx.loopfor());
        if(ctx.loopwhile()!=null){
            if(ctx.loopwhile().nestedcondition().LPARENTHESIS().getText().contains("missing") || ctx.loopwhile().nestedcondition().RPARENTHESIS().getText().contains("missing")
                || ctx.loopwhile().nestedcondition().RPARENTHESIS() == null || ctx.loopwhile().nestedcondition().RPARENTHESIS() == null ) {
               frame.getjTextPaneDebug().append("In line " + ctx.loopwhile().WHILE().getSymbol().getLine() + " : Cannot find parenthesis \n");
               noBugsFound = false;
            }

            System.out.println("LoopWhile | block: " + ctx.loopwhile().block());
            //while
            //System.out.println("while loop");
            System.out.println("LoopWhile | booleanExp: " + this.visit(ctx.loopwhile().nestedcondition().booleanexp()).asBoolean());
            if(!this.visit(ctx.loopwhile().nestedcondition().booleanexp()).asBoolean()) {
                frame.getjTextPaneDebug().append("In line " + ctx.loopwhile().WHILE().getSymbol().getLine() + " : No expression found \n");
                noBugsFound = false;
            } else {
                while (this.visit(ctx.loopwhile().nestedcondition().booleanexp()).asBoolean()) {
                    new LoopStatement(ctx.loopwhile().block(), memory, functionMap, customVisitor.this, frame);
                }
            }
            return null;
        }
        else if(ctx.loopdowhile()!=null){
            do{
                new LoopStatement(ctx.loopdowhile().block(), memory, functionMap, customVisitor.this, frame);
            }while(this.visit(ctx.loopdowhile().nestedcondition().booleanexp()).asBoolean());
            //do-while
        }
        else if(ctx.loopfor()!=null){
            // ERROR CHECKING
            System.out.println("LoopFor | For: " + ctx.loopfor().getText());
//            System.out.println("LoopFor | LPARE: " +ctx.loopfor().LPARENTHESIS());
//            System.out.println("LoopFor | RPARE: " +ctx.loopfor().RPARENTHESIS());
            if(ctx.loopfor().RPARENTHESIS() == null || ctx.loopfor().RPARENTHESIS().getText().contains("missing") || ctx.loopfor().LPARENTHESIS().getText().contains("missing")){
                frame.getjTextPaneDebug().append("In line " + ctx.loopfor().FOR().getSymbol().getLine() + " : Cannot find parenthesis \n");
                noBugsFound = false;
            }
            System.out.println("LoopFor | SEMI: " +ctx.loopfor().SEMICOLON().size());
            if(ctx.loopfor().SEMICOLON().size() != 2) {
                frame.getjTextPaneDebug().append("In line " + ctx.loopfor().FOR().getSymbol().getLine() + " : There should be only 2 semicolons \n");
                noBugsFound = false;
            }

            System.out.println("LoopFor | IntDeclaration: " + ctx.loopfor().intdeclaration());
            System.out.println("LoopFor | Assignment: " + ctx.loopfor().assignment());
            if(ctx.loopfor().intdeclaration() == null && ctx.loopfor().assignment(0).isEmpty()){
                frame.getjTextPaneDebug().append("In line " + ctx.loopfor().FOR().getSymbol().getLine() + ": Cannot find declaration/ assignment operator");
            } else {
                //for loop
                //declaration
                if (ctx.loopfor().intdeclaration() != null) {
                    this.visit(ctx.loopfor().intdeclaration());
                } else {
                    this.visit(ctx.loopfor().assignment(0));
                }
            }

//            System.out.println("LoopWhile | booleanExp: " + this.visit(ctx.loopwhile().nestedcondition().booleanexp()).asBoolean());
            if(!this.visit(ctx.loopfor().booleanexp()).asBoolean()) {
                frame.getjTextPaneDebug().append("In line " + ctx.loopfor().FOR().getSymbol().getLine() + " : No expression found \n");
                noBugsFound = false;
            } else if (ctx.loopfor().operation() == null) {
                frame.getjTextPaneDebug().append("In line " + ctx.loopfor().FOR().getSymbol().getLine() + " : Cannot find assignment statement \n");
                noBugsFound = false;
            } else {
                //increment
                while (this.visit(ctx.loopfor().booleanexp()).asBoolean() ) {
                    new LoopStatement(ctx.loopfor().block(), memory, functionMap, customVisitor.this, frame);
                    if (ctx.loopfor().operation() != null) {
                        this.visit(ctx.loopfor().operation());
                    }
                }
            }
        }
        return null;
    }

    //Assignment
    @Override
    public Value visitAssignment(gParser.AssignmentContext ctx) {
        //System.out.println("Visited Assignment -> " + ctx.getText());
        Value storevalue;
        if(ctx.arrayassignment()!=null){
            return this.visit(ctx.arrayassignment());
        }
        Value checkvalue = memory.get(ctx.id.getText());
        if(checkvalue == null){
            System.err.println("Variable " + ctx.id.getText() + " has not been declared");
            frame.getjTextPaneDebug().append("Variable '" + ctx.id.getText() + "' has not been declared \n");
            noBugsFound = false;
        }
        else{
            if(ctx.charliteral() != null){
                //System.out.println("charliteral");
                if(checkvalue.datatype.equals("char")){
                    storevalue = new Value(ctx.charliteral(), "char");
                    memory.replace(ctx.id.getText(), storevalue);
                }
                else {
                    System.err.println("Type mismatch");
                    frame.getjTextPaneDebug().append("Type mismatch \n");
                    noBugsFound = false;
                }

            }
            else if(ctx.stringliteral() != null) {
                //System.out.println("stringliteral");
                if(checkvalue.datatype.equals("char")){
                    storevalue = new Value(ctx.stringliteral(), "string");
                    memory.replace(ctx.id.getText(), storevalue);
                }
                else {
                    System.err.println("Type mismatch");
                    frame.getjTextPaneDebug().append("Type mismatch \n");
                }
            }
            else if(ctx.opr() != null){
                //System.out.println("operation");
                if(checkvalue.datatype.equals("int")){
                    Double raw = visit(ctx.opr()).asDouble();
                    int result = raw.intValue();
                    storevalue = new Value(result, "int");
                    memory.replace(ctx.id.getText(), storevalue);
                    //System.out.println("Assigning int " + result + " to variable " + ctx.id.getText());
                }
                else if(checkvalue.datatype.equals("float")){
                    Double raw = visit(ctx.opr()).asDouble();
                    float result = raw.floatValue();
                    storevalue = new Value(result, "float");
                    memory.replace(ctx.id.getText(), storevalue);
                    //System.out.println("Assigning float " + result + " to variable " + ctx.id.getText());
                }
                else{
                    System.err.println("Type mismatch");
                    frame.getjTextPaneDebug().append("Type mismatch \n");
                }
            }
            else if(ctx.identifier(1) != null){
                //System.out.println("identifier");
                if(ctx.index()==null){
                    Value check2 = memory.get(ctx.identifier(1).getText());
                    if(check2 == null){
                        System.err.println("Variable '" + ctx.identifier(1).getText() + "' has not been declared");
                        frame.getjTextPaneDebug().append("Variable '" + ctx.identifier(1).getText() + "' has not been declared \n");
                        noBugsFound = false;
                    }
                    else {
                        if(check2.datatype.equals(checkvalue.datatype)){
                            memory.replace(ctx.id.getText(), check2);
                        }
                        else {
                            System.err.println("Mismatching data types");
                            frame.getjTextPaneDebug().append("Type mismatch \n");
                            noBugsFound = false;
                        }
                    }
                }
                else{
                    Value check2 = memory.get(ctx.identifier(1).getText());
                    if(check2 == null){
                        System.err.println("Variable '" + ctx.identifier(1).getText() + "' has not been declared");
                        frame.getjTextPaneDebug().append("Variable '" + ctx.identifier(1).getText() + "' has not been declared \n");
                        noBugsFound = false;
                    }
                    else {
                        //assign code
                        if(checkvalue.datatype.equals("int")){
                            int index;
                            if(ctx.index().intliteral()!=null){
                                index = Integer.parseInt(ctx.index().intliteral().getText());
                            }
                            else{
                                Value val = memory.get(ctx.index().identifier().getText());
                                index = val.asInt();
                            }

                            if(check2.datatype.equals("intarray")){
                                int arr[] = check2.asIntArray();
                                int num = arr[index];
                                Value newval = new Value(num, "int");
                                memory.replace(ctx.id.getText(), newval);
                            }
                            else {
                                System.err.println("Mismatching data types");
                                frame.getjTextPaneDebug().append("Type mismatch \n");
                                noBugsFound = false;
                            }
                        }
                        else{
                            int index;
                            if(ctx.index().intliteral()!=null){
                                index = Integer.parseInt(ctx.index().intliteral().getText());
                            }
                            else{
                                Value val = memory.get(ctx.index().identifier().getText());
                                index = val.asInt();
                            }

                            if(check2.datatype.equals("floatarray")){
                                float arr[] = check2.asFloatArray();
                                float num = arr[index];
                                Value newval = new Value(num, "float");
                                memory.replace(ctx.id.getText(), newval);
                            }
                            else {
                                System.err.println("Mismatching data types");
                                frame.getjTextPaneDebug().append("Type mismatch \n");
                                noBugsFound = false;
                            }
                        }
                    }
                }
            }
            else if(ctx.call() != null){
                //System.out.println("call");
                this.visit(ctx.call());
                if(checkvalue.datatype.equals("char") && returnvalue.datatype.equals("char")){
                    memory.replace(ctx.id.getText(), returnvalue);
                }
                else if(checkvalue.datatype.equals("String") && returnvalue.datatype.equals("string")){
                    memory.replace(ctx.id.getText(), returnvalue);
                }
            }
        }
        return null;
    }

    @Override
    public Value visitArrayassignment(gParser.ArrayassignmentContext ctx) {
        Value storevalue;
        Value checkvalue = memory.get(ctx.id.getText());
        if(checkvalue == null){
            System.err.println("Variable '" + ctx.id.getText() + "' has not been declared");
            frame.getjTextPaneDebug().append("Variable '" + ctx.id.getText() + "' has not been declared \n");
            noBugsFound = false;
        }
        else {
            int index;
            if(ctx.index().intliteral()!=null){
                index = Integer.parseInt(ctx.index().intliteral().getText());
            }
            else{
                Value val = memory.get(ctx.index().identifier().getText());
                index = val.asInt();
            }

            if(ctx.opr()!=null){
                if(checkvalue.datatype.equals("intarray")){
                    int arr[] = checkvalue.asIntArray();
                    Double raw = visit(ctx.opr()).asDouble();
                    int result = raw.intValue();
                    arr[index] = result;
                    Value val = new Value(arr, "intarray");
                    memory.replace(ctx.id.getText(), val);
                }
                else if(checkvalue.datatype.equals("floatarray")){
                    float arr[] = checkvalue.asFloatArray();
                    Double raw = visit(ctx.opr()).asDouble();
                    float result = raw.floatValue();
                    arr[index] = result;
                    Value val = new Value(arr, "floatarray");
                    memory.replace(ctx.id.getText(), val);
                }
                else{
                    System.err.println("Type mismatch");
                }
            }
            else if(ctx.identifier(1)!=null){
                Value check2 = memory.get(ctx.identifier(1).getText());
                if(check2 == null){
                    System.err.println("Variable '" + ctx.identifier(1).getText() + "' has not been declared");
                    frame.getjTextPaneDebug().append("Variable '" + ctx.identifier(1).getText() + "' has not been declared \n");
                    noBugsFound = false;
                }
                else {
                    if(checkvalue.datatype.equals("intarray")){
                        int arr[] = checkvalue.asIntArray();
                        int result = 0;
                        if(check2.datatype.equals("int")){
                            result = check2.asInt();
                        }
                        arr[index] = result;
                        Value val = new Value(arr, "intarray");
                        memory.replace(ctx.id.getText(), val);
                    }
                    else if(checkvalue.datatype.equals("floatarray")){
                        float arr[] = checkvalue.asFloatArray();
                        float result = 0;
                        if(check2.datatype.equals("float")){
                            result = check2.asFloat();
                        }
                        if(check2.datatype.equals("int")){
                            result = check2.asInt();
                        }
                        arr[index] = result;
                        Value val = new Value(arr, "floatarray");
                        memory.replace(ctx.id.getText(), val);
                    }
                    else{
                        System.err.println("Type mismatch");
                        frame.getjTextPaneDebug().append("Type mismatch \n");
                        noBugsFound = false;
                    }
                }
            }
            else{
                System.err.println("an array error occurred");
                frame.getjTextPaneDebug().append("an array error occurred \n");
                noBugsFound = false;
            }
        }
        return null;
    }

    //scan and print
    @Override
    public Value visitScan(gParser.ScanContext ctx) {

            Value checkvalue = memory.get(ctx.identifier().getText());

            if (checkvalue != null) {
                System.out.print(ctx.stringliteral().getText().substring(1, ctx.stringliteral().getText().length() - 1));
                frame.getjTextPaneDebug().append(ctx.stringliteral().getText().substring(1, ctx.stringliteral().getText().length() - 1));
                String assignvalue = "";

                synchronized (frame.runningthread) {
                    try {
                        frame.runningthread.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //Scanner sc =new Scanner(System.in);
                //assignvalue = sc.next();

                assignvalue = frame.getjTextPaneInput().getText().trim();
                frame.getjTextPaneInput().setText("");

                Value newvalue;
                if (checkvalue.datatype.equals("int")) {
                    newvalue = new Value(Integer.parseInt(assignvalue), "int");
                    memory.replace(ctx.identifier().getText(), newvalue);
                    //System.out.println("Stored" + newvalue);
                } else if (checkvalue.datatype.equals("float")) {
                    newvalue = new Value(Float.parseFloat(assignvalue), "float");
                    memory.replace(ctx.identifier().getText(), newvalue);
                } else if (checkvalue.datatype.equals("char")) {
                    newvalue = new Value('\'' + assignvalue + '\'', "char");
                    memory.replace(ctx.identifier().getText(), newvalue);
                } else if (checkvalue.datatype.equals("string")) {
                    newvalue = new Value('"' + assignvalue + '"', "string");
                    memory.replace(ctx.identifier().getText(), newvalue);
                } else if (checkvalue.datatype.equals("boolean")) {
                    newvalue = new Value(assignvalue, "boolean");
                    memory.replace(ctx.identifier().getText(), newvalue);
                } else {
                    System.err.println("Cannot identify datatype for variable " + ctx.identifier().getText());
                    frame.getjTextPaneDebug().append("Cannot identify datatype for variable '" + ctx.identifier().getText() + "'\n");
                    noBugsFound = false;
                }
            } else {
                System.err.println("Cannot get user input for variable " + ctx.identifier().getText() + " (variable does not exist)");
                frame.getjTextPaneDebug().append("Cannot get user input for variable '" + ctx.identifier().getText() + "' (variable does not exist) \n");
                noBugsFound = false;
            }
//        }
        return null;
    }

    @Override
    public Value visitPrint(gParser.PrintContext ctx) {
        System.out.println("Print: " +ctx.getText());
        System.out.println("Print | Printblock | RPAR: " + ctx.printblock().RPARENTHESIS());
        System.out.println("Print | Printblock | LPAR: " + ctx.printblock().LPARENTHESIS());
        if(ctx.printblock().RPARENTHESIS().getText().contains("missing") || ctx.printblock().LPARENTHESIS().getText().contains("missing"))
            frame.getjTextPaneDebug().append("In Line " + ctx.PRINT().getSymbol().getLine() + ": Missing brace\n");
        boolean index = true;
        try{
            String split[] = ctx.getText().split("\\(|\\)");
            System.err.println("Split: " + split[1]);
            if(split[1].substring(split[1].length()-1).equals("+")) {
                frame.getjTextPaneDebug().append("In Line " + ctx.PRINT().getSymbol().getLine() + ": Missing string \n");
                noBugsFound = false;
                index = false;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            frame.getjTextPaneDebug().append("In Line " + ctx.PRINT().getSymbol().getLine() + ": Missing string \n");
            index = false;
        }

        if(index == true) {
            int i = 0;
            while (ctx.printblock().stringcontent(i) != null) {
                if (ctx.printblock().stringcontent(i).stringliteral() != null) {
                    if (ctx.printblock().stringcontent(i).stringliteral().getText().equals("\"nextline\"")) {
                        System.out.println();
                        frame.getjTextPaneDebug().append("\n");
                    } else {
                        String printstring = ctx.printblock().stringcontent(i).stringliteral().getText();
                        System.out.print(printstring.substring(1, printstring.length() - 1));
                        frame.getjTextPaneDebug().append(printstring.substring(1, printstring.length() - 1));
                    }
                } else {
                    String identifier = ctx.printblock().stringcontent(i).identifier().getText();
                    Value checkvalue = memory.get(identifier);

                    if (checkvalue != null) {
                        if (checkvalue.datatype.equals("int")) {
                            System.out.print(checkvalue.asInt());
                            frame.getjTextPaneDebug().append(Integer.toString(checkvalue.asInt()));
                        } else if (checkvalue.datatype.equals("float")) {
                            System.out.print(checkvalue.asFloat());
                            frame.getjTextPaneDebug().append(Float.toString(checkvalue.asFloat()));
                        } else if (checkvalue.datatype.equals("char")) {
                            System.out.print(checkvalue.asString().substring(1, checkvalue.asString().length() - 1));
                            frame.getjTextPaneDebug().append(checkvalue.asString().substring(1, checkvalue.asString().length() - 1));
                        } else if (checkvalue.datatype.equals("string")) {
                            System.out.print(checkvalue.asString().substring(1, checkvalue.asString().length() - 1));
                            frame.getjTextPaneDebug().append(checkvalue.asString().substring(1, checkvalue.asString().length() - 1));
                        } else if (checkvalue.datatype.equals("boolean")) {
                            System.out.print(checkvalue.asBoolean());
                            frame.getjTextPaneDebug().append(Boolean.toString(checkvalue.asBoolean()));
                        } else {
                            System.err.println("Cannot identify datatype for variable " + identifier);
                            frame.getjTextPaneDebug().append("Cannot identify datatype for variable '" + identifier + "'\n");
                            noBugsFound = false;
                        }
                    } else {
                        System.err.println("Cannot get user input for variable " + identifier + " (variable does not exist)");
                        frame.getjTextPaneDebug().append("Cannot get user input for variable '" + identifier + "' (variable does not exist) \n");
                        noBugsFound = false;
                    }
                }
                i++;
            }
        }
        //System.out.println();
        //System.out.println(i);
        return null;
    }

    @Override
    public Value visitProgram(gParser.ProgramContext ctx) {
        System.out.println("Program: " + ctx.getText());
//        System.out.println("Program: " + ctx.globaldelcaration());
//        System.out.println("Program: " + ctx.function());
//        System.out.println("Program: " + ctx.main());
//        System.out.println("Program: " + ctx.function());
        if(ctx.globaldelcaration() == null || ctx.function() == null || ctx.main() == null) {
            frame.getjTextPaneDebug().append("Mismatch declaration expecting {'fonction ', 'essentiel', 'global '} \n");
            noBugsFound = false;
        }
        return visitChildren(ctx);
    }

    @Override
    public Value visitMain(gParser.MainContext ctx) {
        if(ctx.MAIN() == null) {
            frame.getjTextPaneDebug().append("Mismatch declaration expecting {'fonction ', 'essentiel'} \n");
            noBugsFound = false;
        }
        return visitChildren(ctx);
    }

    @Override
    public Value visitFunctionvoidblock(gParser.FunctionvoidblockContext ctx) {
        System.out.println("FunctionVoidBlock | Statement: " + ctx.statement());
        return visitChildren(ctx);
    }

    @Override
    public Value visitFunctionreturnblock(gParser.FunctionreturnblockContext ctx) {
        System.out.println("FunctionVoidBlock | Statement: " + ctx.statement());
        return visitChildren(ctx);
    }

    @Override
    public Value visitFunctionparameters(gParser.FunctionparametersContext ctx) {
        System.out.println("FunctionParameters | LPAREN: " + ctx.LPARENTHESIS());
        System.out.println("FunctionParameters | RPAREN: " + ctx.RPARENTHESIS());
        if(ctx.LPARENTHESIS() == null && ctx.RPARENTHESIS() == null) {
            frame.getjTextPaneDebug().append("Missing parenthesis \n");
            noBugsFound = false;
        }
        if(ctx.LPARENTHESIS().getText().contains("missing")|| ctx.RPARENTHESIS() == null) {
            frame.getjTextPaneDebug().append("Missing parenthesis \n");
            noBugsFound = false;
        }
        // TODO: NOT WORKING PROPERLY for FUNCTION PARAMETERS ONLY BEING CALLED IN CALL PARAMETERS TOO >:(
        System.out.println("FunctionParameters | declaration: " + ctx.declaration(0));
//        if(ctx.declaration(0) == null)
//            frame.getjTextPaneDebug().append("Cannot find declaration in " + ctx.getText() + "\n");
//        System.out.println("FunctionParameters | COMMA: " + ctx.COMMA());
//        System.out.println("FunctionParameters | declaration: " + ctx.declaration(1));


        return visitChildren(ctx);
    }

    @Override
    public Value visitCallparameter(gParser.CallparameterContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitGlobaldelcaration(gParser.GlobaldelcarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitDeclaration(gParser.DeclarationContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Value visitSingledeclaration(gParser.SingledeclarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitArraydeclaration(gParser.ArraydeclarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitArrval(gParser.ArrvalContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitIndex(gParser.IndexContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitCondition(gParser.ConditionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitElseifstatement(gParser.ElseifstatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitElsestatement(gParser.ElsestatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    // TODO: SKEEPY
    public Value visitLoopfor(gParser.LoopforContext ctx) {
//        System.out.println("LoopFor | LPAR: " + ctx.LPARENTHESIS());
//        System.out.println("LoopFor | RPAR: " + ctx.RPARENTHESIS());
//        if(ctx.LPARENTHESIS() == null || ctx.RPARENTHESIS() == null)
//            frame.getjTextPaneDebug().append("In line " + ctx.FOR().getSymbol().getLine() +" : Missing parenthesis \n");
//        System.out.println("LoopFor | RPAR: " + ctx.RPARENTHESIS());
//        if(ctx.LPARENTHESIS() == null || ctx.RPARENTHESIS() == null)
            frame.getjTextPaneDebug().append("In line " + ctx.FOR().getSymbol().getLine() +" : Missing parenthesis \n");
        return visitChildren(ctx);
    }

    @Override
    public Value visitLoopwhile(gParser.LoopwhileContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitLoopdowhile(gParser.LoopdowhileContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitShortopr(gParser.ShortoprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitPrintblock(gParser.PrintblockContext ctx) {
        System.out.println("PrintBlock: " + ctx.getText());
//        System.out.println("PrintBlock | LPAR: " + ctx.LPARENTHESIS());
//        System.out.println("PrintBlock | stringcontent: " + ctx.stringcontent());
//        System.out.println("PrintBlock | LPAR: " + ctx.LPARENTHESIS());
//        System.out.println("PrintBlock | LPAR: " + ctx.LPARENTHESIS());
//        System.out.println("PrintBlock | LPAR: " + ctx.LPARENTHESIS());
        return visitChildren(ctx);
    }

    @Override
    public Value visitStringcontent(gParser.StringcontentContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitNestedcondition(gParser.NestedconditionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitVararrname(gParser.VararrnameContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitIdentifier(gParser.IdentifierContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Value visitCharliteral(gParser.CharliteralContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitStringliteral(gParser.StringliteralContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitIntliteral(gParser.IntliteralContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitFloatliteral(gParser.FloatliteralContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitBlock(gParser.BlockContext ctx) {
        System.out.println("Block: " + ctx.getText());
//        System.out.println("Block | LBRACE: " + ctx.LBRACE());
//        System.out.println("Block | RBRACE: " + ctx.RBRACE());
        if(ctx.RBRACE().getText().contains("missing") || ctx.LBRACE().getText().contains("missing")) {
            System.out.println("Missing brace");
            frame.getjTextPaneDebug().append("Missing brace \n");
            noBugsFound = false;
        }
        System.out.println("Block | statement: " +ctx.statement());
        if(ctx.statement().isEmpty()) {
            System.out.println("Empty Statement");
            frame.getjTextPaneDebug().append("Empty Statement \n");
            noBugsFound = false;
        }
        return visitChildren(ctx);
    }

    @Override
    public Value visitStatement(gParser.StatementContext ctx) {
        System.out.println("Statement: " + ctx.getText());
//        System.out.println("Statement | Declaration: " + ctx.declaration());
        if (ctx.declaration() != null) {
            String split[] = ctx.getText().split(";|<missing");
            if (!split[0].equals(ctx.declaration().getText())) {
                System.out.println("SPLIT{0}: " + split[0]);
                System.out.println(" CTX: " + ctx.declaration().getText());
                frame.getjTextPaneDebug().append("Cannot identify the syntax '" + ctx.getText() + "'\n    Suggested: '" + ctx.declaration().getText() + ";'\n");
                noBugsFound = false;
            }
        }
//        System.out.println("Statement | Assignment: " + ctx.assignment());
        if(ctx.assignment() != null) {
            String split[] = ctx.getText().split(";|<missing");
            if (!split[0].equals(ctx.assignment().getText())) {
//                System.out.println("SPLIT{0}: " + split[0]);
//                System.out.println(" CTX: " + ctx.declaration().getText());
                frame.getjTextPaneDebug().append("Cannot identify the syntax '" + ctx.getText() + "'\n    Suggested: '" + ctx.assignment().getText() + ";'\n");
                noBugsFound = false;
            }
        }
//        System.out.println("Statement | Condition: " + ctx.condition());
        if(ctx.condition() != null) {
            String split[] = ctx.getText().split(";|<missing");
            if (!split[0].equals(ctx.condition().getText())) {
//                System.out.println("SPLIT{0}: " + split[0]);
//                System.out.println(" CTX: " + ctx.declaration().getText());
                frame.getjTextPaneDebug().append("Cannot identify the syntax '" + ctx.getText() + "'\n    Suggested: '" + ctx.condition().getText() + ";'\n");
                noBugsFound = false;
            }
        }
//        System.out.println("Statement | Loop: " + ctx.loop());
        if(ctx.loop() != null) {
            if(ctx.getText().contains("missing")) {
                String split[] = ctx.getText().split("<missing");
                if (!split[0].substring(0, split[0].length()).equals(ctx.loop().getText())) {
                    System.out.println("Statement: " + split[0].substring(0, split[0].length()));
                    System.out.println(" Loop: " + ctx.loop().getText());
                    frame.getjTextPaneDebug().append("Cannot identify the syntax '" + split[0] + "'\n    Suggested: '" + ctx.loop().getText() + ";'\n");
                    noBugsFound = false;
                }
            } else {
                if (!ctx.getText().substring(0, ctx.getText().length() - 1).equals(ctx.loop().getText())) {
                    System.out.println("Statement: " + ctx.getText().substring(0, ctx.getText().length() - 1));
                    System.out.println(" Loop: " + ctx.loop().getText());
                    frame.getjTextPaneDebug().append("Cannot identify the syntax '" + ctx.getText().substring(0, ctx.getText().length() - 1) + "'\n    Suggested: '" + ctx.loop().getText() + ";'\n");
                    noBugsFound = false;
                }
            }
        }
//        System.out.println("Statement | Operation: " + ctx.operation());
        if(ctx.operation() != null) {
            String split[] = ctx.getText().split(";|<missing");
            if (!split[0].equals(ctx.operation().getText())) {
//                System.out.println("SPLIT{0}: " + split[0]);
//                System.out.println(" CTX: " + ctx.operation().getText());
                frame.getjTextPaneDebug().append("Cannot identify the syntax '" + ctx.getText() + "'\n    Suggested: '" + ctx.operation().getText() + ";'\n");
                noBugsFound = false;
            }
        }
//        System.out.println("Statement | Call: " + ctx.call());
        if(ctx.call() != null){
            System.out.println("Call | IDENTIFIER: " + ctx.call().identifier().IDENTIFIER());
            System.out.println("Call | LPAR: " + ctx.call().LPARENTHESIS());
            System.out.println("Call | RPAR: " + ctx.call().RPARENTHESIS());
            System.out.println("Call | callparameter: " + ctx.call().callparameter());
            if(ctx.call().RPARENTHESIS() == null || ctx.call().LPARENTHESIS() == null) {
                frame.getjTextPaneDebug().append("In Line " + ctx.call().CALL().getSymbol().getLine() + ": Missing Parenthesis");
                noBugsFound = false;
            }
            if(ctx.call().LPARENTHESIS().getText().contains("missing") || ctx.call().RPARENTHESIS().getText().contains("missing")) {
                frame.getjTextPaneDebug().append("In Line " + ctx.call().CALL().getSymbol().getLine() + ": Missing Parenthesis");
                noBugsFound = false;
            }
            String split[] = ctx.getText().split(";|<missing");
            if (!split[0].equals(ctx.call().getText())) {
                System.out.println("SPLIT{0}: " + split[0]);
                System.out.println(" CTX: " + ctx.call().getText());
                frame.getjTextPaneDebug().append("Cannot identify the syntax '" + ctx.getText() + "'\n    Suggested: '" + ctx.call().getText() + ";'\n");
                noBugsFound = false;
            }
        }
//        System.out.println("Statement | Print: " + ctx.print());
        if(ctx.print() != null) {
            String split[] = ctx.getText().split(";|<missing");
            if (!split[0].equals(ctx.print().getText())) {
//                System.out.println("SPLIT{0}: " + split[0]);
//                System.out.println(" CTX: " + ctx.declaration().getText());
                frame.getjTextPaneDebug().append("In line " + ctx.print().PRINT().getSymbol().getLine() + ": Cannot identify the syntax '" + ctx.getText() + "'\n    Suggested: '" + ctx.print().getText() + ";'\n");
                noBugsFound = false;
            }
        }
//        System.out.println("Statement | Scan: " + ctx.scan());
        if(ctx.scan() != null){
            if(ctx.scan().LPARENTHESIS().getText().contains("missing")|| ctx.scan().RPARENTHESIS().getText().contains("missing")){
                frame.getjTextPaneDebug().append("In line" + ctx.scan().SCAN().getSymbol().getLine() + " : Cannot find parenthesis \n");
                noBugsFound = false;
            }
            if(ctx.scan().COMMA().getText().contains("missing")){
                frame.getjTextPaneDebug().append("In Line " + ctx.scan().SCAN().getSymbol().getLine() + " : Cannot find comma \n");
                noBugsFound = false;
            }
            String split[] = ctx.getText().split(";|<missing");
            if (!split[0].equals(ctx.scan().getText())) {
//                System.out.println("SPLIT{0}: " + split[0]);
//                System.out.println(" CTX: " + ctx.declaration().getText());
                frame.getjTextPaneDebug().append("In line " + ctx.scan().SCAN().getSymbol().getLine() + ": Cannot identify the syntax '" + ctx.getText() + "'\n    Suggested: '" + ctx.scan().getText() + ";'\n");
                noBugsFound = false;
            }
        }

        try {
            System.out.println("Statement | SEMICOLON: " + ctx.SEMICOLON());
            if (ctx.SEMICOLON().getText().contains("missing")) {
                String split[] = ctx.getText().split("<missing");
                frame.getjTextPaneDebug().append("Missing semicolon in '" + split[0] + "'\n");
                noBugsFound = false;
            }
        } catch (NullPointerException e) {
            System.out.println("Cannot identify the function \n");
            frame.getjTextPaneDebug().append("Cannot identify the function\n");
            noBugsFound = false;
        }
        return visitChildren(ctx);
    }
}
