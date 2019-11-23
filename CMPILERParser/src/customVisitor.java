import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class customVisitor extends gBaseVisitor<Value>{

    private Map<String, Value> memory = new HashMap<String, Value>();
    private Map<String, Function> functionMap = new HashMap<>();

    @Override
    public Value visitMain(gParser.MainContext ctx) {
        System.out.println("Visited Main -> " + ctx.getText());
        return super.visitMain(ctx);
    }

    @Override
    public Value visitFunction(gParser.FunctionContext ctx) {
        System.out.println("Visited Function -> " + ctx.getText());
        return super.visitFunction(ctx);
    }

    @Override
    public Value visitCall(gParser.CallContext ctx) {
        System.out.println("Visited Call -> " + ctx.getText());
        return super.visitCall(ctx);
    }

    //declarations (add call statements)
    @Override
    public Value visitIntdeclaration(gParser.IntdeclarationContext ctx) {
        //System.out.println("Visited Int Declaration -> " + ctx.getText());
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
                Value check2 = memory.get(ctx.identifier(1).getText());
                if(check2 == null){
                    System.err.println("Variable " + ctx.identifier(1).getText() + " has not been declared");
                }
                else {
                    if(check2.datatype.equals(checkvalue.datatype)){
                        memory.put(ctx.id.getText(), check2);
                    }
                    else {
                        System.err.println("Mismatching data types");
                    }
                }
            }
            else if(ctx.call()!=null){
                System.out.println("Assigning a call to int");
            }
            else{
                storevalue = new Value(0, "int");
                memory.put(ctx.id.getText(), storevalue);
                //System.out.println("Assigning default value to int");
            }
        }
        else{
            System.err.println("Variable " + ctx.id.getText() + " already exists");
        }
        return super.visitIntdeclaration(ctx);
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
                Value check2 = memory.get(ctx.identifier(1).getText());
                if(check2 == null){
                    System.err.println("Variable " + ctx.identifier(1).getText() + " has not been declared");
                }
                else {
                    if(check2.datatype.equals(checkvalue.datatype)){
                        memory.replace(ctx.id.getText(), check2);
                    }
                    else {
                        System.err.println("Mismatching data types");
                    }
                }
            }
            else if(ctx.call()!=null){
                System.out.println("Assigning a call to float");
            }
            else{
                storevalue = new Value(0, "float");
                memory.put(ctx.id.getText(), storevalue);
                //System.out.println("Assigning default value to float");
            }
        }
        else{
            System.err.println("Variable " + ctx.id.getText() + " already exists");
        }
        return super.visitFloatdeclaration(ctx);
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
                    System.err.println("Variable " + ctx.identifier(1).getText() + " has not been declared");
                }
                else {
                    if(check2.datatype.equals(checkvalue.datatype)){
                        memory.replace(ctx.id.getText(), check2);
                    }
                    else {
                        System.err.println("Mismatching data types");
                    }
                }
            }
            else if(ctx.call()!=null){
                System.out.println("Assigning a call to char");
            }
            else{
                storevalue = new Value("\'\'", "char");
                memory.put(ctx.id.getText(), storevalue);
                //System.out.println("Assigning default value to char");
            }
        }
        else{
            System.err.println("Variable " + ctx.id.getText() + " already exists");
        }
        return super.visitChardeclaration(ctx);
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
                }
                else {
                    if(check2.datatype.equals(checkvalue.datatype)){
                        memory.replace(ctx.id.getText(), check2);
                    }
                    else {
                        System.err.println("Mismatching data types");
                    }
                }
            }
            else if(ctx.call()!=null){
                System.out.println("Assigning a call to string");
            }
            else{
                storevalue = new Value("\"\"", "string");
                memory.put(ctx.id.getText(), storevalue);
                //System.out.println("Assigning default value to string");
            }
        }
        else{
            System.err.println("Variable " + ctx.id.getText() + " already exists");
        }
        return super.visitChararrdeclaration(ctx);
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
            System.err.println("Variable " + ctx.id.getText() + " already exists");
        }
        return super.visitBooleandeclaration(ctx);
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
                System.err.println("Cannot get user input for variable " + ctx.identifier().getText() + " (variable does not exist)");
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
            System.out.println("Equation contains call");
            mathvalue = new Value(0, "double");
            return mathvalue;
        }
        else if(ctx.opr() != null){
            return this.visit(ctx.opr());
        }
        else{
            System.out.println("Cannot identify value");
            mathvalue = new Value(0, "double");
            return mathvalue;
        }
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
                System.err.println("Variable " + ctx.identifier().getText() + " does not exist");
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
                    System.err.println("Cannot parse variable " + ctx.identifier().getText());
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
        return super.visitLoop(ctx);
    }

    //Assignment
    @Override
    public Value visitAssignment(gParser.AssignmentContext ctx) {
        System.out.println("Visited Assignment -> " + ctx.getText());
        Value storevalue;
        Value checkvalue = memory.get(ctx.id.getText());
        if(checkvalue == null){
            System.err.println("Variable " + ctx.id.getText() + " has not been declared");
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
                }
            }
            else if(ctx.opr() != null){
                //System.out.println("operation");
                if(checkvalue.datatype.equals("int")){
                    Double raw = visit(ctx.opr()).asDouble();
                    int result = raw.intValue();
                    storevalue = new Value(result, "int");
                    memory.replace(ctx.id.getText(), storevalue);
                    System.out.println("Assigning int " + result + " to variable " + ctx.id.getText());
                }
                else if(checkvalue.datatype.equals("float")){
                    Double raw = visit(ctx.opr()).asDouble();
                    float result = raw.floatValue();
                    storevalue = new Value(result, "float");
                    memory.replace(ctx.id.getText(), storevalue);
                    System.out.println("Assigning float " + result + " to variable " + ctx.id.getText());
                }
                else{
                    System.err.println("Type mismatch");
                }
            }
            else if(ctx.identifier(1) != null){
                //System.out.println("identifier");
                Value check2 = memory.get(ctx.identifier(1).getText());
                if(check2 == null){
                    System.err.println("Variable " + ctx.identifier(1).getText() + " has not been declared");
                }
                else {
                    if(check2.datatype.equals(checkvalue.datatype)){
                        memory.replace(ctx.id.getText(), check2);
                    }
                    else {
                        System.err.println("Mismatching data types");
                    }
                }
            }
            else if(ctx.call() != null){
                //System.out.println("call");
            }
            else{
                System.err.println("Error assigning data to variable " + ctx.id.getText());
            }
        }
        return super.visitAssignment(ctx);
    }

    //scan and print
    @Override
    public Value visitScan(gParser.ScanContext ctx) {
        Value checkvalue = memory.get(ctx.identifier().getText());

        if(checkvalue!=null){
            System.out.println(ctx.stringliteral().getText().substring(1, ctx.stringliteral().getText().length()-1));
            Scanner sc =new Scanner(System.in);
            Value newvalue;
            String assignvalue = sc.next();
            if(checkvalue.datatype.equals("int")){
                newvalue = new Value(Integer.parseInt(assignvalue), "int");
                memory.replace(ctx.identifier().getText(), newvalue);
                //System.out.println("Stored" + newvalue);
            }
            else if(checkvalue.datatype.equals("float")){
                newvalue = new Value(Float.parseFloat(assignvalue), "float");
                memory.replace(ctx.identifier().getText(), newvalue);
            }
            else if(checkvalue.datatype.equals("char")){
                newvalue = new Value('\'' + assignvalue + '\'', "char");
                memory.replace(ctx.identifier().getText(), newvalue);
            }
            else if(checkvalue.datatype.equals("string")){
                newvalue = new Value('"' + assignvalue + '"', "string");
                memory.replace(ctx.identifier().getText(), newvalue);
            }
            else if(checkvalue.datatype.equals("boolean")){
                newvalue = new Value(assignvalue, "boolean");
                memory.replace(ctx.identifier().getText(), newvalue);
            }
            else{
                System.err.println("Cannot identify datatype for variable " + ctx.identifier().getText());
            }
        }
        else{
            System.err.println("Cannot get user input for variable " + ctx.identifier().getText() + " (variable does not exist)");
        }

        return super.visitScan(ctx);
    }

    @Override
    public Value visitPrint(gParser.PrintContext ctx) {
        int i = 0;
        while(ctx.printblock().stringcontent(i)!=null){
            if(ctx.printblock().stringcontent(i).stringliteral()!=null){
                String printstring = ctx.printblock().stringcontent(i).stringliteral().getText();
                System.out.print(printstring.substring(1, printstring.length()-1));
            }
            else{
                String identifier = ctx.printblock().stringcontent(i).identifier().getText();
                Value checkvalue = memory.get(identifier);

                if(checkvalue!=null){
                    if(checkvalue.datatype.equals("int")){
                        System.out.print(checkvalue.asInt());
                    }
                    else if(checkvalue.datatype.equals("float")){
                        System.out.print(checkvalue.asFloat());
                    }
                    else if(checkvalue.datatype.equals("char")){
                        System.out.print(checkvalue.asString().substring(1, checkvalue.asString().length()-1));
                    }
                    else if(checkvalue.datatype.equals("string")){
                        System.out.print(checkvalue.asString().substring(1, checkvalue.asString().length()-1));
                    }
                    else if(checkvalue.datatype.equals("boolean")){
                        System.out.print(checkvalue.asBoolean());
                    }
                    else{
                        System.err.println("Cannot identify datatype for variable " + identifier);
                    }
                }
                else{
                    System.err.println("Cannot get user input for variable " + identifier + " (variable does not exist)");
                }
            }
            i++;
        }
        System.out.println();
        //System.out.println(i);
        return super.visitPrint(ctx);
    }
}
