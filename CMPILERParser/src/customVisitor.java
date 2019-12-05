import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class customVisitor extends gBaseVisitor<Value>{

    private HashMap<String, Value> memory;
    public Map<String, Functions> functionMap;
    public Value returnvalue;
    private mainInterface frame;

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
        boolean noErrorInFunction = true;
        System.out.println("Visited Function -> " + ctx.getText());
        Functions func = null;
        if(ctx.functionreturnblock()!=null){
            // ERROR MESSAGE - Using my instincts here not sure YET until tried with a function :)
            if (ctx.op.getText() == null) {
                frame.getjTextPaneDebug().append("In line " + ctx.FUNCTION().getSymbol().getLine() + ": Cannot find variable \n");
                noErrorInFunction = false;
            }
            try {
                if (ctx.identifier().IDENTIFIER().getText().contains("missing")) {
                    frame.getjTextPaneDebug().append("In line " + ctx.FUNCTION().getSymbol().getLine() + ": Cannot find function name \n");
                    noErrorInFunction = false;
                }
            } catch (NullPointerException e){}

            if(ctx.functionparameters().RPARENTHESIS() == null || ctx.functionparameters().LPARENTHESIS() == null) {
                frame.getjTextPaneDebug().append("In line " + ctx.FUNCTION().getSymbol().getLine() + ": Cannot find parenthesis \n");
                noErrorInFunction = false;
            }
            if(ctx.functionparameters().RPARENTHESIS().getText().contains("missing") || ctx.functionparameters().LPARENTHESIS().getText().contains("missing")) {
                frame.getjTextPaneDebug().append("In line " + ctx.FUNCTION().getSymbol().getLine() + ": Cannot find parenthesis \n");
                noErrorInFunction = false;
            }
            if(!ctx.functionparameters().declaration().isEmpty()) {
                String splitFunction[] = ctx.getText().split("\\(|\\)");
                System.err.println("Split: " + splitFunction[1]);
                if (splitFunction[1].substring(splitFunction[1].length() - 1).equals(",")) {
                    frame.getjTextPaneDebug().append("In Line " + ctx.FUNCTION().getSymbol().getLine() + ": Cannot find missing parameter \n");
                    noErrorInFunction = false;
                }
            }

            if (ctx.functionreturnblock().LBRACE().getText().contains("missing")) {
                frame.getjTextPaneDebug().append("In line " + ctx.functionreturnblock().LBRACE().getSymbol().getLine() + ": Cannot find bracket left bracket \n");
                noErrorInFunction = false;
            }
            if (ctx.functionreturnblock().RBRACE().getText().contains("missing")) {
                frame.getjTextPaneDebug().append("In line " + ctx.functionreturnblock().RBRACE().getSymbol().getLine() + ": Cannot find bracket right bracket \n");
                noErrorInFunction = false;
            }

            if(ctx.functionreturnblock().statement().isEmpty()) {
                frame.getjTextPaneDebug().append("In line " + ctx.functionreturnblock().RBRACE().getSymbol().getLine() + ": Empty Statement \n");
                noErrorInFunction = false;
            }

            if(ctx.functionreturnblock().returnstatement().opr() == null && ctx.functionreturnblock().returnstatement().identifier() == null
                && ctx.functionreturnblock().returnstatement().stringliteral() == null && ctx.functionreturnblock().returnstatement().charliteral() == null) {
                frame.getjTextPaneDebug().append("Empty return statement\n");
                noErrorInFunction = false;
            }

//            if(noErrorInFunction)
                func = new Functions(ctx.functionparameters(), ctx.functionreturnblock(), ctx.op.getText(), frame);
        }
        else {
            // ERRORMESSAGE
            if (ctx.VOID() == null) {
                frame.getjTextPaneDebug().append("In line " + ctx.FUNCTION().getSymbol().getLine() + ": Cannot find variable \n");
                noErrorInFunction = false;
            }
            try {
                if (ctx.identifier().IDENTIFIER().getText().contains("missing")) {
                    frame.getjTextPaneDebug().append("In line " + ctx.FUNCTION().getSymbol().getLine() + ": Cannot find function name \n");
                    noErrorInFunction = false;
                }
            } catch (NullPointerException e){}

            if(ctx.functionparameters().RPARENTHESIS() == null || ctx.functionparameters().LPARENTHESIS() == null) {
                frame.getjTextPaneDebug().append("In line " + ctx.FUNCTION().getSymbol().getLine() + ": Cannot find parenthesis \n");
                noErrorInFunction = false;
            }
            if(ctx.functionparameters().RPARENTHESIS().getText().contains("missing") || ctx.functionparameters().LPARENTHESIS().getText().contains("missing")) {
                frame.getjTextPaneDebug().append("In line " + ctx.FUNCTION().getSymbol().getLine() + ": Cannot find parenthesis \n");
                noErrorInFunction = false;
            }

            if(!ctx.functionparameters().declaration().isEmpty()) {
                String splitFunction[] = ctx.getText().split("\\(|\\)");
                System.err.println("Split: " + splitFunction[1]);
                if (splitFunction[1].substring(splitFunction[1].length() - 1).equals(",")) {
                    frame.getjTextPaneDebug().append("In Line " + ctx.FUNCTION().getSymbol().getLine() + ": Cannot find missing parameter \n");
                    noErrorInFunction = false;
                }
            }

            if (ctx.functionvoidblock().LBRACE().getText().contains("missing")) {
                frame.getjTextPaneDebug().append("In line " + ctx.functionvoidblock().LBRACE().getSymbol().getLine() + ": Cannot find bracket left bracket \n");
                noErrorInFunction = false;
            }
            if (ctx.functionvoidblock().RBRACE().getText().contains("missing")) {
                frame.getjTextPaneDebug().append("In line " + ctx.functionvoidblock().RBRACE().getSymbol().getLine() + ": Cannot find bracket right bracket \n");
                noErrorInFunction = false;
            }

            if(ctx.functionvoidblock().statement().isEmpty()){
                frame.getjTextPaneDebug().append("In line " + ctx.functionvoidblock().RBRACE().getSymbol().getLine() + ": Empty Statement \n");
                noErrorInFunction = false;
            }
            if (noErrorInFunction) {
                if (ctx.VOID() != null || ctx.functionparameters() != null)
                    func = new Functions(ctx.functionparameters(), ctx.functionvoidblock(), ctx.op.getText(), frame);
            }
        }
        if(noErrorInFunction) {
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
        boolean noErrorInCall = true;
//        System.out.println("Visited Call -> " + ctx.getText());
//        System.out.println("Call | identifier: " + ctx.identifier().IDENTIFIER());
        if(ctx.identifier().IDENTIFIER().getText().contains("missing")){
            frame.getjTextPaneDebug().append("In line " + ctx.CALL().getSymbol().getLine() + ": Function does not exist \n");
            System.err.println("In line " + ctx.CALL().getSymbol().getLine() + ": Function does not exist");
            noErrorInCall = false;
        }
//        System.out.println("Call | declaration: " + ctx.callparameter());
//        System.out.println("Call | COMMA: " + ctx.COMMA());
        if(!ctx.callparameter().isEmpty()) {
            String splitCall[] = ctx.getText().split("\\(|\\)");
            System.err.println("Split: " + splitCall[1]);
            if (splitCall[1].substring(splitCall[1].length() - 1).equals(",")) {
                frame.getjTextPaneDebug().append("In Line " + ctx.CALL().getSymbol().getLine() + ": Cannot find missing parameter \n");
                noErrorInCall = false;
            }
        }

        if(ctx.RPARENTHESIS() == null || ctx.LPARENTHESIS() == null) {
            frame.getjTextPaneDebug().append("In line " + ctx.CALL().getSymbol().getLine() + ": Missing Parenthesis");
            noErrorInCall = false;
        }
        if(ctx.LPARENTHESIS().getText().contains("missing") || ctx.RPARENTHESIS().getText().contains("missing")) {
            frame.getjTextPaneDebug().append("In line " + ctx.CALL().getSymbol().getLine() + ": Missing Parenthesis");
            noErrorInCall = false;
        }

        if(noErrorInCall) {
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
                // === Cant get called to "Fonction vide <FUNCTION NAME>(/*insert error*/ i)" === says arrayIndexOutOfBound when
                // theres error in the syntax of the supposed to be called function (message me kung di mo gets sinasabi ko hahah)
                // - Michiko

                //System.out.println("executing");
                execfunc.execute(parameters, functionMap);
                returnvalue = execfunc.getReturnValue();
                //System.out.println("finished");
            }
         }
        return null;
    }

    @Override
    public Value visitReturnstatement(gParser.ReturnstatementContext ctx) {
        System.out.println("|| Return Statement: " + ctx.getText());
        boolean noErrorInReturn = true;
        if(ctx.SEMICOLON()==null) {
            frame.getjTextPaneDebug().append("In line " + ctx.RETURN().getSymbol().getLine() + ": Cannot find semicolon \n");
            noErrorInReturn = false;
        }

        if(ctx.identifier()!=null){
            System.out.println("Return Statement | identifier: " + ctx.identifier().getText());
            String split[] = ctx.getText().split(";|\\s+");
            if(!split[1].equals(ctx.identifier().getText())){
                frame.getjTextPaneDebug().append("In line " + ctx.RETURN().getSymbol().getLine() + ": Cannot find identifier \n");
                noErrorInReturn = false;
            }
            if(noErrorInReturn) {
                if (memory.get(ctx.identifier().getText()) != null) {
                    returnvalue = memory.get(ctx.identifier().getText());
                }
            }
        }
        else if(ctx.charliteral()!=null){
            System.out.println("Return Statement | charliteral: " + ctx.charliteral().getText());
            String split[] = ctx.getText().split(";|\\s+");
            if(!split[1].equals(ctx.charliteral().getText())){
                frame.getjTextPaneDebug().append("In line " + ctx.RETURN().getSymbol().getLine() + ": Cannot find char \n");
                noErrorInReturn = false;
            }
            if(noErrorInReturn)
                returnvalue = new Value(ctx.charliteral().getText(), "char");
        }
        else if(ctx.stringliteral()!=null){
            System.out.println("Return Statement | stringliteral: " + ctx.stringliteral().getText());
            String split[] = ctx.getText().split(";|\\s+");
            if(!split[1].equals(ctx.stringliteral().getText())){
                frame.getjTextPaneDebug().append("In line " + ctx.RETURN().getSymbol().getLine() + ": Cannot find string \n");
                noErrorInReturn = false;
            }
            if(noErrorInReturn)
                returnvalue = new Value(ctx.stringliteral().getText(), "string");
        }
        else if(ctx.opr()!=null){
            System.out.println("Return Statement | opr: " + ctx.opr().getText());
            String split[] = ctx.getText().split(";|\\s+|()");
            if(!split[1].equals(ctx.opr().getText())){
                frame.getjTextPaneDebug().append("In line " + ctx.RETURN().getSymbol().getLine() + ": Cannot find operation\n    Suggested: " + ctx.opr().getText() +"\n");
                noErrorInReturn = false;
            }
            if(noErrorInReturn)
                returnvalue = this.visit(ctx.opr());
        }
        else{
            System.err.println("Error returning value");
            frame.getjTextPaneDebug().append("In line " + ctx.RETURN().getSymbol().getLine() + ": Cannot find returning value \n");
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
                    }
                    else {
                        if(check2.datatype.equals(checkvalue.datatype)){
                            memory.put(ctx.id.getText(), check2);
                        }
                        else {
                            System.err.println("Mismatching data types");
                            frame.getjTextPaneDebug().append("Mismatching data types \n");
                        }
                    }
                }
                else{
                    Value check2 = memory.get(ctx.identifier(1).getText());
                    if(check2 == null){
                        System.err.println("Variable " + ctx.identifier(1).getText() + " has not been declared");
                        frame.getjTextPaneDebug().append("Variable '" + ctx.identifier(1).getText() + "' has not been declared \n");
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
                    }
                    else {
                        if(check2.datatype.equals(checkvalue.datatype)){
                            memory.replace(ctx.id.getText(), check2);
                        }
                        else {
                            System.err.println("Mismatching data types");
                            frame.getjTextPaneDebug().append("Mismatching data types \n");
                        }
                    }
                }
                else{
                    Value check2 = memory.get(ctx.identifier(1).getText());
                    if(check2 == null){
                        System.err.println("Variable " + ctx.identifier(1).getText() + " has not been declared");
                        frame.getjTextPaneDebug().append("Variable '" + ctx.identifier(1).getText() + "' has not been declared \n");
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
                        }
                        else {
                            if(check2.datatype.equals("int")){
                                storearray[i] = check2.asInt();
                            }
                            else {
                                System.err.println("Mismatching data types");
                                frame.getjTextPaneDebug().append("Mismatching data types \n");
                            }
                        }
                    }
                    else{
                        System.out.println("Int array assignment error");
                        frame.getjTextPaneDebug().append("Int array assignment error \n");
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
                        }
                        else {
                            if(check2.datatype.equals("float")){
                                storearray[i] = check2.asFloat();
                            }
                            else {
                                System.err.println("Mismatching data types");
                                frame.getjTextPaneDebug().append("Mismatching data types\n");
                            }
                        }
                    }
                    else{
                        System.err.println("Float array assignment error");
                        frame.getjTextPaneDebug().append("Float array assignment error \n");
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
                }
                else {
                    if(check2.datatype.equals(checkvalue.datatype)){
                        memory.replace(ctx.id.getText(), check2);
                    }
                    else {
                        System.err.println("Mismatching data types");
                        frame.getjTextPaneDebug().append("Mismatching data types");
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
                }
                else {
                    if(check2.datatype.equals(checkvalue.datatype)){
                        memory.replace(ctx.id.getText(), check2);
                    }
                    else {
                        System.err.println("Mismatching data types");
                        frame.getjTextPaneDebug().append("Mismatching data types \n");
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
        boolean noErrorInIfStatements = true;
        Boolean doElse = true;
        Boolean ifcondition = false;

        // error checker for if statement
        if(ctx.nestedcondition().RPARENTHESIS() == null || ctx.nestedcondition().LPARENTHESIS() == null){
            frame.getjTextPaneDebug().append("In line " + ctx.IF().getSymbol().getLine() + ": Cannot find parenthesis \n");
            noErrorInIfStatements = false;
        }
        if(ctx.nestedcondition().RPARENTHESIS().getText().contains("missing") || ctx.nestedcondition().LPARENTHESIS().getText().contains("missing")){
            frame.getjTextPaneDebug().append("In line " + ctx.IF().getSymbol().getLine() + ": Cannot find parenthesis \n");
            noErrorInIfStatements = false;
        }

        try {
//            System.out.println("If | Boolean: " + ctx.nestedcondition().booleanexp().getText());
            String splitIf[] = ctx.nestedcondition().booleanexp().getText().split("<=|>=|!=|==|<|>");
//            System.out.println("Split[0]: " + splitIf[0]);
//            System.out.println("Split[1]: " + splitIf[1]);
            // if there is seen an extra symbol THIS IS NOT SAFE i need to use =!#%&'()*+,-./:;<=>?@[]^_`{|}~ idk how doeee
            if (splitIf[1].matches("[0-9]+")) {
                ifcondition = this.visit(ctx.nestedcondition().booleanexp()).asBoolean();
            } else {
                frame.getjTextPaneDebug().append("In line " + ctx.IF().getSymbol().getLine() + ": Cannot find expression \n");
                noErrorInIfStatements = false;
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            frame.getjTextPaneDebug().append("In line " + ctx.IF().getSymbol().getLine() + ": Cannot find expression \n");
            noErrorInIfStatements = false;
        }

        if(ctx.block().RBRACE() == null || ctx.block().LBRACE() == null){
            frame.getjTextPaneDebug().append("In line " + ctx.IF().getSymbol().getLine() + ": Cannot find brace \n");
            noErrorInIfStatements = false;
        }
        if(ctx.block().LBRACE().getText().contains("missing") || ctx.block().RBRACE().getText().contains("missing")){
            frame.getjTextPaneDebug().append("In line " + ctx.IF().getSymbol().getLine() + ": Cannot find brace \n");
            noErrorInIfStatements = false;
        }
        if(ctx.block().statement().isEmpty()){
            frame.getjTextPaneDebug().append("In line " + ctx.IF().getSymbol().getLine() + ": Empty statement in if statement\n");
            noErrorInIfStatements = false;
        }

        if(ifcondition){
            if(noErrorInIfStatements) {
                this.visit(ctx.start);
                return null;
            }
        }

        int i = 0;
        while (ctx.elseifstatement(i) != null) {
            if (ctx.elseifstatement(i).nestedcondition().RPARENTHESIS() == null || ctx.elseifstatement(i).nestedcondition().LPARENTHESIS() == null) {
                frame.getjTextPaneDebug().append("In line " + ctx.elseifstatement(i).ELSEIF().getSymbol().getLine() + ": Cannot find parenthesis \n");
                noErrorInIfStatements = false;
            }
            if (ctx.elseifstatement(i).nestedcondition().RPARENTHESIS().getText().contains("missing") || ctx.elseifstatement(i).nestedcondition().LPARENTHESIS().getText().contains("missing")) {
                frame.getjTextPaneDebug().append("In line " + ctx.elseifstatement(i).ELSEIF().getSymbol().getLine() + ": Cannot find parenthesis \n");
                noErrorInIfStatements = false;
            }

            try{
                String splitElseIf[] = ctx.elseifstatement(i).nestedcondition().booleanexp().getText().split("<=|>=|!=|==|<|>");
//                System.out.println("splitElseIf[0]: " + splitAgain[0]);
//                System.out.println("splitElseIf[1]: " + splitAgain[1]);
                if (!splitElseIf[1].matches("[0-9]+")) {
                    System.out.println("불타는 ~~~~ FIREEEE ~~~~");
                    frame.getjTextPaneDebug().append("In line " + ctx.elseifstatement(i).ELSEIF().getSymbol().getLine() + ": Cannot find expression \n");
                    noErrorInIfStatements = false;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                frame.getjTextPaneDebug().append("In line " + ctx.elseifstatement(i).ELSEIF().getSymbol().getLine() + ": Cannot find expression \n");
                noErrorInIfStatements = false;
            }

            if (ctx.elseifstatement(i).block().RBRACE() == null || ctx.elseifstatement(i).block().LBRACE() == null) {
                frame.getjTextPaneDebug().append("In line " + ctx.elseifstatement(i).ELSEIF().getSymbol().getLine() + ": Cannot find brace \n");
                noErrorInIfStatements = false;
            }
            if (ctx.elseifstatement(i).block().LBRACE().getText().contains("missing") || ctx.elseifstatement(i).block().RBRACE().getText().contains("missing")) {
                frame.getjTextPaneDebug().append("In line " + ctx.elseifstatement(i).ELSEIF().getSymbol().getLine() + ": Cannot find brace \n");
                noErrorInIfStatements = false;
            }
            if (ctx.elseifstatement(i).block().statement().isEmpty()) {
                frame.getjTextPaneDebug().append("In line " + ctx.elseifstatement(i).ELSEIF().getSymbol().getLine() + ": Empty statement in if else statement\n");
                noErrorInIfStatements = false;
            }
             if(noErrorInIfStatements){
                //do
                Boolean elseifcondition = this.visit(ctx.elseifstatement(i).nestedcondition().booleanexp()).asBoolean();
                if (elseifcondition) {
                    this.visit(ctx.elseifstatement(i).middle);
                    return null;
                }
            }
            i++;
        }

        if(ctx.elsestatement()!=null) {
            if(ctx.elsestatement().block().RBRACE() == null || ctx.elsestatement().block().LBRACE() == null){
                frame.getjTextPaneDebug().append("In line " + ctx.IF().getSymbol().getLine() + ": Cannot find brace \n");
                noErrorInIfStatements = false;
            }
            if(ctx.elsestatement().block().LBRACE().getText().contains("missing") || ctx.elsestatement().block().RBRACE().getText().contains("missing")){
                frame.getjTextPaneDebug().append("In line " + ctx.IF().getSymbol().getLine() + ": Cannot find brace \n");
                noErrorInIfStatements = false;
            }
            if(ctx.elsestatement().block().statement().isEmpty()){
                frame.getjTextPaneDebug().append("In line " + ctx.IF().getSymbol().getLine() + ": Empty statement in if statement\n");
                noErrorInIfStatements = false;
            }
            if(noErrorInIfStatements) {
                //do
                this.visit(ctx.elsestatement().end);
            }
        }
        return null;
    }

    //Loops
    @Override
    public Value visitLoop(gParser.LoopContext ctx) {
//        System.out.println("Loop | While: " + ctx.loopwhile());
//        System.out.println("Loop | DoWhile: " + ctx.loopdowhile());
//        System.out.println("Loop | For: " + ctx.loopfor());
        boolean noErrorInLoop = true;
        if(ctx.loopwhile()!=null){
            if(ctx.loopwhile().nestedcondition().RPARENTHESIS() == null || ctx.loopwhile().nestedcondition().RPARENTHESIS() == null){
                frame.getjTextPaneDebug().append("In line " + ctx.loopwhile().WHILE().getSymbol().getLine() + ": Cannot find parenthesis \n");
                noErrorInLoop = false;
            }
            if(ctx.loopwhile().nestedcondition().LPARENTHESIS().getText().contains("missing") || ctx.loopwhile().nestedcondition().RPARENTHESIS().getText().contains("missing")) {
               frame.getjTextPaneDebug().append("In line " + ctx.loopwhile().WHILE().getSymbol().getLine() + ": Cannot find parenthesis \n");
                noErrorInLoop = false;
            }

            if(ctx.loopwhile().block().RBRACE() == null || ctx.loopwhile().block().LBRACE() == null){
                frame.getjTextPaneDebug().append("In line " + ctx.loopwhile().WHILE().getSymbol().getLine() + ": Cannot find brace \n");
                noErrorInLoop = false;
            }
            if(ctx.loopwhile().block().LBRACE().getText().contains("missing") || ctx.loopwhile().block().RBRACE().getText().contains("missing")) {
                frame.getjTextPaneDebug().append("In line " + ctx.loopwhile().WHILE().getSymbol().getLine() + ": Cannot find brace \n");
                noErrorInLoop = false;
            }

            if(ctx.loopwhile().block().statement().isEmpty()){
                frame.getjTextPaneDebug().append("In line " + ctx.loopwhile().WHILE().getSymbol().getLine() + ": Empty statement in while loop \n");
                noErrorInLoop = false;
            }

            try {
                String splitWhile[] = ctx.loopwhile().nestedcondition().booleanexp().getText().split("<=|>=|!=|==|<|>");
                if (!splitWhile[1].matches("[0-9]+")) {
                    frame.getjTextPaneDebug().append("In line " + ctx.loopwhile().WHILE().getSymbol().getLine() + ": No expression found \n");
                    noErrorInLoop = false;
                } else {
                    //while
                    //System.out.println("while loop");
                    while (this.visit(ctx.loopwhile().nestedcondition().booleanexp()).asBoolean()) {
                        new LoopStatement(ctx.loopwhile().block(), memory, functionMap, customVisitor.this, frame);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                frame.getjTextPaneDebug().append("In line " + ctx.loopwhile().WHILE().getSymbol().getLine() + ": No expression found \n");
                noErrorInLoop = false;
            }
            return null;
        }
        else if(ctx.loopdowhile()!=null){
            if(ctx.loopdowhile().nestedcondition().RPARENTHESIS() == null || ctx.loopdowhile().nestedcondition().RPARENTHESIS() == null){
                frame.getjTextPaneDebug().append("In line " + ctx.loopdowhile().WHILE().getSymbol().getLine() + ": Cannot find parenthesis \n");
                noErrorInLoop = false;
            }
            if(ctx.loopdowhile().nestedcondition().LPARENTHESIS().getText().contains("missing") || ctx.loopdowhile().nestedcondition().RPARENTHESIS().getText().contains("missing")) {
                frame.getjTextPaneDebug().append("In line " + ctx.loopdowhile().WHILE().getSymbol().getLine() + ": Cannot find parenthesis \n");
                noErrorInLoop = false;
            }

            if(ctx.loopdowhile().block().LBRACE() == null || ctx.loopdowhile().block().RBRACE() == null){
                frame.getjTextPaneDebug().append("In line " + ctx.loopdowhile().WHILE().getSymbol().getLine() + ": Cannot find brace \n");
                noErrorInLoop = false;
            }
            if(ctx.loopdowhile().block().LBRACE().getText().contains("missing") || ctx.loopdowhile().block().RBRACE().getText().contains("missing")){
                frame.getjTextPaneDebug().append("In line " + ctx.loopdowhile().WHILE().getSymbol().getLine() + ": Cannot find brace \n");
                noErrorInLoop = false;
            }

            if(ctx.loopdowhile().block().statement().isEmpty()){
                frame.getjTextPaneDebug().append("In line " + ctx.loopdowhile().WHILE().getSymbol().getLine() + ": Empty statement in do while loop \n");
                noErrorInLoop = false;
            }

            try {
                String splitDoWhile[] = ctx.loopdowhile().nestedcondition().booleanexp().getText().split("<=|>=|!=|==|<|>");
                if (!splitDoWhile[1].matches("[0-9]+")) {
                    frame.getjTextPaneDebug().append("In line " + ctx.loopdowhile().WHILE().getSymbol().getLine() + ": No expression found \n");
                    noErrorInLoop = false;
                } else {
                    do {
                        new LoopStatement(ctx.loopdowhile().block(), memory, functionMap, customVisitor.this, frame);
                    } while (this.visit(ctx.loopdowhile().nestedcondition().booleanexp()).asBoolean());
                    //do-while
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                frame.getjTextPaneDebug().append("In line " + ctx.loopdowhile().WHILE().getSymbol().getLine() + ": No expression found \n");
                noErrorInLoop = false;
            }
        }
        else if(ctx.loopfor()!=null){
            // error checking for loop
            if(ctx.loopfor().RPARENTHESIS() == null || ctx.loopfor().LPARENTHESIS() == null){
                frame.getjTextPaneDebug().append("In line " + ctx.loopfor().FOR().getSymbol().getLine() + ": Cannot find parenthesis \n");
                noErrorInLoop = false;
            }
            if(ctx.loopfor().RPARENTHESIS().getText().contains("missing") || ctx.loopfor().LPARENTHESIS().getText().contains("missing")){
                frame.getjTextPaneDebug().append("In line " + ctx.loopfor().FOR().getSymbol().getLine() + ": Cannot find parenthesis \n");
                noErrorInLoop = false;
            }

//            System.out.println("LoopFor | SEMI: " +ctx.loopfor().SEMICOLON().size());
            if(ctx.loopfor().SEMICOLON().size() != 2) {
                frame.getjTextPaneDebug().append("In line " + ctx.loopfor().FOR().getSymbol().getLine() + ": There should be only 2 semicolons \n");
                noErrorInLoop = false;
            }

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

            if(ctx.loopfor().block().statement().isEmpty()){
                frame.getjTextPaneDebug().append("In line " + ctx.loopfor().FOR().getSymbol().getLine() + ": Empty statement in for loop \n");
                noErrorInLoop = false;
            }

            String splitFor[] = ctx.loopfor().booleanexp().getText().split("<=|>=|!=|==|<|>");
            if (!splitFor[1].matches("[0-9]+")) {
                frame.getjTextPaneDebug().append("In line " + ctx.loopfor().FOR().getSymbol().getLine() + ": No expression found \n");
                noErrorInLoop = false;
            } else if (ctx.loopfor().operation() == null) {
                frame.getjTextPaneDebug().append("In line " + ctx.loopfor().FOR().getSymbol().getLine() + ": Cannot find assignment statement \n");
                noErrorInLoop = false;
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
                    }
                    else {
                        if(check2.datatype.equals(checkvalue.datatype)){
                            memory.replace(ctx.id.getText(), check2);
                        }
                        else {
                            System.err.println("Mismatching data types");
                            frame.getjTextPaneDebug().append("Type mismatch \n");
                        }
                    }
                }
                else{
                    Value check2 = memory.get(ctx.identifier(1).getText());
                    if(check2 == null){
                        System.err.println("Variable '" + ctx.identifier(1).getText() + "' has not been declared");
                        frame.getjTextPaneDebug().append("Variable '" + ctx.identifier(1).getText() + "' has not been declared \n");
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
                    }
                }
            }
            else{
                System.err.println("an array error occurred");
                frame.getjTextPaneDebug().append("an array error occurred \n");
            }
        }
        return null;
    }

    //scan and print
    @Override
    public Value visitScan(gParser.ScanContext ctx) {
        boolean noErrorInScan = true;
        if(ctx.LPARENTHESIS().getText().contains("missing")|| ctx.RPARENTHESIS().getText().contains("missing")){
            frame.getjTextPaneDebug().append("In line " + ctx.SCAN().getSymbol().getLine() + ": Cannot find parenthesis \n");
            noErrorInScan = false;
        }
        if(ctx.COMMA().getText().contains("missing")){
            frame.getjTextPaneDebug().append("In line " + ctx.SCAN().getSymbol().getLine() + ": Cannot find comma \n");
            noErrorInScan = false;
        }

        if(ctx.stringliteral().STRING_LITERAL().getText().contains("missing")){
            frame.getjTextPaneDebug().append("In line " + ctx.SCAN().getSymbol().getLine() + ": Cannot find string literal \n");
            noErrorInScan = false;

        }

        if(ctx.identifier().IDENTIFIER().getText().contains("missing")){
            frame.getjTextPaneDebug().append("In line " + ctx.SCAN().getSymbol().getLine() + ": Cannot find identifier \n");
            noErrorInScan = false;
        }

        if(noErrorInScan) {
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
                }
            } else {
                System.err.println("Cannot get user input for variable " + ctx.identifier().getText() + " (variable does not exist)");
                frame.getjTextPaneDebug().append("Cannot get user input for variable '" + ctx.identifier().getText() + "' (variable does not exist) \n");
            }
        }
        return null;
    }

    @Override
    public Value visitPrint(gParser.PrintContext ctx) {
        boolean noErrorInPrint = true;
        System.out.println("Print: " +ctx.getText());
//        System.out.println("Print | Printblock | RPAR: " + ctx.printblock().RPARENTHESIS());
//        System.out.println("Print | Printblock | LPAR: " + ctx.printblock().LPARENTHESIS());
        if(ctx.printblock().RPARENTHESIS().getText().contains("missing") || ctx.printblock().LPARENTHESIS().getText().contains("missing")) {
            frame.getjTextPaneDebug().append("In Line " + ctx.PRINT().getSymbol().getLine() + ": Missing brace\n");
        }
        try{
            String split[] = ctx.getText().split("\\(|\\)");
            System.err.println("Split: " + split[1]);
            if(split[1].substring(split[1].length()-1).equals("+")) {
                frame.getjTextPaneDebug().append("In Line " + ctx.PRINT().getSymbol().getLine() + ": Missing string \n");
                noErrorInPrint = false;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            frame.getjTextPaneDebug().append("In Line " + ctx.PRINT().getSymbol().getLine() + ": Missing string \n");
            noErrorInPrint = false;
        }

        if(noErrorInPrint) {
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
                        }
                    } else {
                        System.err.println("Cannot get user input for variable " + identifier + " (variable does not exist)");
                        frame.getjTextPaneDebug().append("Cannot get user input for variable '" + identifier + "' (variable does not exist) \n");
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
//        System.out.println("Program: " + ctx.getText());
        if(ctx.globaldelcaration() == null || ctx.function() == null || ctx.main() == null)
            frame.getjTextPaneDebug().append("Mismatch declaration expecting {'fonction ', 'essentiel', 'global '} \n");

        return visitChildren(ctx);
    }

    @Override
    public Value visitMain(gParser.MainContext ctx) {
        if(ctx.MAIN() == null)
            frame.getjTextPaneDebug().append("Mismatch declaration expecting {'fonction ', 'essentiel'} \n");

        if(ctx.block().RBRACE() == null || ctx.block().LBRACE() == null)
            frame.getjTextPaneDebug().append("In line " + ctx.MAIN() + ": Cannot find brace \n");

        if(ctx.block().LBRACE().getText().contains("missing") || ctx.block().RBRACE().getText().contains("missing"))
            frame.getjTextPaneDebug().append("In line " + ctx.MAIN() + ": Cannot find brace \n");

        if(ctx.block().statement() == null)
            frame.getjTextPaneDebug().append("In line " + ctx.MAIN() + ": Cannot find statement \n");

        return visitChildren(ctx);
    }

    @Override
    public Value visitStatement(gParser.StatementContext ctx) {
        System.out.println("Statement: " + ctx.getText());
        boolean notStated = true;
//        System.out.println("Statement | Declaration: " + ctx.declaration());
        if (ctx.declaration() != null) {
            String split[] = ctx.getText().split(";|<missing");
            if (!split[0].equals(ctx.declaration().getText())) {
//                System.out.println("SPLIT{0}: " + split[0]);
//                System.out.println(" CTX: " + ctx.declaration().getText());
                frame.getjTextPaneDebug().append("Cannot identify the declaration statement '" + ctx.getText() + "'\n    Suggested: '" + ctx.declaration().getText() + ";'\n");
                notStated = false;
            }
        }
//        System.out.println("Statement | Assignment: " + ctx.assignment());
        if(ctx.assignment() != null) {
            String split[] = ctx.getText().split(";|<missing");
            if (!split[0].equals(ctx.assignment().getText())) {
//                System.out.println("SPLIT{0}: " + split[0]);
//                System.out.println(" CTX: " + ctx.declaration().getText());
                frame.getjTextPaneDebug().append("Cannot identify the assignment statement '" + ctx.getText() + "'\n    Suggested: '" + ctx.assignment().getText() + ";'\n");
                notStated = false;
            }
        }
//        System.out.println("Statement | Condition: " + ctx.condition());
        if(ctx.condition() != null) {
            if(ctx.getText().contains("missing")) {
                String split[] = ctx.getText().split("<missing");
                if (!split[0].substring(0, split[0].length()).equals(ctx.condition().getText())) {
//                    System.out.println("Statement: " + split[0].substring(0, split[0].length()));
//                    System.out.println(" Loop: " + ctx.condition().getText());
                    frame.getjTextPaneDebug().append("Cannot identify the condition statement '" + split[0] + "'\n    Suggested: '" + ctx.condition().getText() + ";'\n");
                    notStated = false;
                }
            } else {
                if (!ctx.getText().substring(0, ctx.getText().length() - 1).equals(ctx.condition().getText())) {
//                    System.out.println("Statement: " + ctx.getText().substring(0, ctx.getText().length() - 1));
//                    System.out.println(" Loop: " + ctx.condition().getText());
                    frame.getjTextPaneDebug().append("Cannot identify the condition statement '" + ctx.getText().substring(0, ctx.getText().length() - 1) + "'\n    Suggested: '" + ctx.condition().getText() + ";'\n");
                    notStated = false;
                }
            }
        }
//        System.out.println("Statement | Loop: " + ctx.loop());
        if(ctx.loop() != null) {
            if(ctx.getText().contains("missing")) {
                String split[] = ctx.getText().split("<missing");
                if (!split[0].substring(0, split[0].length()).equals(ctx.loop().getText())) {
//                    System.out.println("Statement: " + split[0].substring(0, split[0].length()));
//                    System.out.println(" Loop: " + ctx.loop().getText());
                    frame.getjTextPaneDebug().append("Cannot identify the loop statement '" + split[0] + "'\n    Suggested: '" + ctx.loop().getText() + ";'\n");
                    notStated = false;
                }
            } else {
                if (!ctx.getText().substring(0, ctx.getText().length() - 1).equals(ctx.loop().getText())) {
//                    System.out.println("Statement: " + ctx.getText().substring(0, ctx.getText().length() - 1));
//                    System.out.println(" Loop: " + ctx.loop().getText());
                    frame.getjTextPaneDebug().append("Cannot identify the loop statement '" + ctx.getText().substring(0, ctx.getText().length() - 1) + "'\n    Suggested: '" + ctx.loop().getText() + ";'\n");
                    notStated = false;
                }
            }
        }
//        System.out.println("Statement | Operation: " + ctx.operation());
        if(ctx.operation() != null) {
            String split[] = ctx.getText().split(";|<missing");
            if (!split[0].equals(ctx.operation().getText())) {
//                System.out.println("SPLIT{0}: " + split[0]);
//                System.out.println(" CTX: " + ctx.operation().getText());
                frame.getjTextPaneDebug().append("Cannot identify the operation statement '" + ctx.getText() + "'\n    Suggested: '" + ctx.operation().getText() + ";'\n");
                notStated = false;
            }
        }
//        System.out.println("Statement | Call: " + ctx.call());
        if(ctx.call() != null){
            String split[] = ctx.getText().split(";");
            if (!split[0].equals(ctx.call().getText())) {
//                System.out.println("SPLIT{0}: " + split[0]);
//                System.out.println(" CTX: " + ctx.call().getText());
                frame.getjTextPaneDebug().append("Cannot identify the call statement '" + ctx.getText() + "'\n    Suggested: '" + ctx.call().getText() + ";'\n");
                notStated = false;
            }
        }
//        System.out.println("Statement | Print: " + ctx.print());
        if(ctx.print() != null) {
            String split[] = ctx.getText().split(";");
            if (!split[0].equals(ctx.print().getText())) {
//                System.out.println("SPLIT{0}: " + split[0]);
//                System.out.println(" CTX: " + ctx.declaration().getText());
                frame.getjTextPaneDebug().append("In line " + ctx.print().PRINT().getSymbol().getLine() + ": Cannot identify the print statement '" + ctx.getText() + "'\n    Suggested: '" + ctx.print().getText() + ";'\n");
                notStated = false;
            }
        }
//        System.out.println("Statement | Scan: " + ctx.scan());
        if(ctx.scan() != null){
            String split[] = ctx.getText().split(";");
            if (!split[0].equals(ctx.scan().getText())) {
//                System.out.println("SPLIT{0}: " + split[0]);
//                System.out.println(" CTX: " + ctx.declaration().getText());
                frame.getjTextPaneDebug().append("In line " + ctx.scan().SCAN().getSymbol().getLine() + ": Cannot identify the scan statement '" + ctx.getText() + "'\n    Suggested: '" + ctx.scan().getText() + ";'\n");
                notStated = false;
            }
        }
        try {
//            System.out.println("Statement | SEMICOLON: " + ctx.SEMICOLON());
            if (ctx.SEMICOLON().getText().contains("missing")) {
                String split[] = ctx.getText().split("<missing");
                frame.getjTextPaneDebug().append("Missing semicolon in '" + split[0] + "'\n");
            }
        } catch (NullPointerException e) {
            if(notStated) {
                System.out.println("Not Stated: " + notStated);
                System.out.println("Length: " + ctx.getText().length());
                if (ctx.getText().length() != 0) {
                    System.out.println("Cannot identify the statement in " + ctx.getText());
                    frame.getjTextPaneDebug().append("Cannot identify the statement in " + ctx.getText() + " \n");
                }
            } else {
                System.out.println("Length: " + ctx.getText().length());
                System.out.println("Cannot identify the statement");
                frame.getjTextPaneDebug().append("Cannot identify the statement \n");
            }
        }
        return visitChildren(ctx);
    }
}
