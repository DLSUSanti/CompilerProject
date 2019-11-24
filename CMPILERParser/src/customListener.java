import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class customListener extends gBaseListener {
    private boolean withNum = false;

    @Override
    public void exitProgram(gParser.ProgramContext ctx) {
        System.out.println("Listener --> " + ctx.getText());

        try {
            if (ctx.main().MAIN().toString().isEmpty()) {
                System.err.println("Missing Main");
            }
        } catch (NullPointerException e) {
            System.err.println("Missing Main");
        }

    }

    @Override
    public void exitMain(gParser.MainContext ctx) {

        System.out.println("[Listener] MAIN --> " + ctx.MAIN());
    }

    @Override
    public void exitFunction(gParser.FunctionContext ctx) {
    }

    @Override
    public void exitCall(gParser.CallContext ctx) {
    }

    @Override
    public void exitReturnstatement(gParser.ReturnstatementContext ctx) {
    }

    @Override
    //globaldelcaration: GLOBAL declaration SEMICOLON;
    public void exitGlobaldelcaration(gParser.GlobaldelcarationContext ctx) {

    }

    @Override
    public void exitDeclaration(gParser.DeclarationContext ctx) {
    }

    @Override
    public void exitSingledeclaration(gParser.SingledeclarationContext ctx) {
    }

    @Override
    public void exitArraydeclaration(gParser.ArraydeclarationContext ctx) {
    }

    @Override
    public void exitBooleandeclaration(gParser.BooleandeclarationContext ctx) {

    }

    @Override
    // TODO: intdeclaration: INTEGER id=identifier (EQUALS (opr|call|identifier))?;
    public void exitIntdeclaration(gParser.IntdeclarationContext ctx) {
        System.out.println(ctx.INTEGER());
        System.out.println(ctx.id.IDENTIFIER());

        try {
            if (ctx.EQUALS() != null) {
                System.out.println(ctx.EQUALS());
                if (ctx.opr().addopr().multopr().terminalopr().intliteral().INT_LITERAL() != null) {
                    System.out.println(ctx.opr().addopr().multopr().terminalopr().intliteral().INT_LITERAL());
                } else {
                    errorMessage(ctx.opr().addopr().multopr().terminalopr().intliteral().INT_LITERAL().getSymbol().getLine(), "number");
                }
            }
        } catch (NullPointerException e){}
    }

    @Override
    public void exitIntarrdeclaration(gParser.IntarrdeclarationContext ctx) {
    }

    @Override
    public void exitFloatdeclaration(gParser.FloatdeclarationContext ctx) {
    }

    @Override
    public void exitFloatarrdeclaration(gParser.FloatarrdeclarationContext ctx) {
    }

    @Override
    public void exitChardeclaration(gParser.ChardeclarationContext ctx) {
//        System.out.println(ctx.INTEGER());
//        System.out.println(ctx.id.IDENTIFIER());
//
//        try {
//            if (!ctx.opr().addopr().multopr().terminalopr().intliteral().INT_LITERAL().getSymbol().equals("")) {
//                if (ctx.EQUALS().getSymbol().equals("")) {
//                    System.err.println("No");
//                } else {
//                    System.out.println(ctx.EQUALS());
//                    System.out.println(ctx.opr().addopr().multopr().terminalopr().intliteral().INT_LITERAL());
//                }
//            }
//        } catch (NullPointerException e){}
    }

    @Override
    public void exitChararrdeclaration(gParser.ChararrdeclarationContext ctx) {
    }

    @Override
    public void exitForcedintdec(gParser.ForcedintdecContext ctx) {
    }

    @Override
    public void exitAssignment(gParser.AssignmentContext ctx) {
    }

    @Override
    public void exitCondition(gParser.ConditionContext ctx) {
    }

    @Override
    public void exitIfstatement(gParser.IfstatementContext ctx) {
    }

    @Override
    public void exitElseifstatement(gParser.ElseifstatementContext ctx) {
    }

    @Override
    public void exitElsestatement(gParser.ElsestatementContext ctx) {
    }

    @Override
    public void exitLoop(gParser.LoopContext ctx) {
    }

    @Override
    public void exitLoopfor(gParser.LoopforContext ctx) {
    }

    @Override
    public void exitLoopwhile(gParser.LoopwhileContext ctx) {
    }

    @Override
    public void exitLoopdowhile(gParser.LoopdowhileContext ctx) {
    }

    @Override
    public void exitOperation(gParser.OperationContext ctx) {
    }

    @Override
    public void exitOpr(gParser.OprContext ctx) {
    }

    @Override
    public void exitAddopr(gParser.AddoprContext ctx) {
    }

    @Override
    public void exitMultopr(gParser.MultoprContext ctx) {
    }

    @Override
    public void exitTerminalopr(gParser.TerminaloprContext ctx) {
    }

    @Override
    public void exitShortopr(gParser.ShortoprContext ctx) {
    }

    @Override
    public void exitPrint(gParser.PrintContext ctx) {
    }

    @Override
    public void exitPrintblock(gParser.PrintblockContext ctx) {

    }

    @Override
    public void exitStringcontent(gParser.StringcontentContext ctx) {
    }

    @Override
    // scan: SCAN LPARENTHESIS stringliteral COMMA identifier RPARENTHESIS;
    public void exitScan(gParser.ScanContext ctx) {
        System.out.println("[LISTENER] Scan --> " + ctx.getText());
//        var scan = ctx.SCAN();
//        System.out.println(ctx.SCAN());

        try {
            var rPar = ctx.RPARENTHESIS();
//        System.out.println(ctx.RPARENTHESIS());
            if (rPar.getText().contains("missing"))
                errorMessage(rPar.getSymbol().getLine(), ")");

            var identifier = ctx.identifier().IDENTIFIER();
//        System.out.println(ctx.identifier().IDENTIFIER());
            if (identifier.getText().contains("missing"))
                errorMessage(identifier.getSymbol().getLine(), "identifier");

            var comma = ctx.COMMA();
//        System.out.println(ctx.COMMA());
            if (comma.getText().contains("missing"))
                errorMessage(comma.getSymbol().getLine(), ",");

            var sentence = ctx.stringliteral().STRING_LITERAL();
//        System.out.println(ctx.stringliteral().STRING_LITERAL());
            if (sentence.getText().contains("missing"))
                errorMessage(sentence.getSymbol().getLine(), "string literal");

            var lPar = ctx.LPARENTHESIS();
//        System.out.println(ctx.LPARENTHESIS());
            if (lPar.getText().contains("missing"))
                errorMessage(lPar.getSymbol().getLine(), "(");
        } catch (NullPointerException e) {}
    }

    @Override
    public void exitNestedcondition(gParser.NestedconditionContext ctx) {
    }

    @Override
    public void exitBooleanexp(gParser.BooleanexpContext ctx) {
    }

    @Override
    public void exitLogic(gParser.LogicContext ctx) {
    }

    @Override
    public void exitRelation(gParser.RelationContext ctx) {
    }

    @Override
    public void exitBooleanvalue(gParser.BooleanvalueContext ctx) {
    }

    @Override
    public void exitVararrname(gParser.VararrnameContext ctx) {
    }

    @Override
    public void exitIdentifier(gParser.IdentifierContext ctx) {

    }

    @Override
    public void exitCharliteral(gParser.CharliteralContext ctx) {
    }

    @Override
    public void exitStringliteral(gParser.StringliteralContext ctx) {
    }

    @Override
    public void exitIntliteral(gParser.IntliteralContext ctx) {
//        System.out.println(ctx.INT_LITERAL());
//
//        if(ctx.INT_LITERAL() != null){
//            System.out.println(ctx.INT_LITERAL());
//        }
    }

    @Override
    public void exitFloatliteral(gParser.FloatliteralContext ctx) {
    }

    @Override
    public void exitBlock(gParser.BlockContext ctx) {
        System.err.println("[Listener] exitBlock --> " + ctx.getText());
//        System.out.println("[Listener] Block -> " + ctx.LBRACE());
        System.out.println("[Listener] Block -> " + ctx.RBRACE());
        if(ctx.LBRACE().toString().contains("missing")){
            System.err.println("Missing '{'");
        }
        if(ctx.RBRACE().toString().contains("missing")){
            System.err.println("Missing '}'");
        }
    }

    @Override
    public void exitStatement(gParser.StatementContext ctx) {
        System.out.println("[Listener] Statement --> " + ctx.getText());

        // scanner
        if(ctx.getText().contains("analyse")) {

        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    @Override
    public void visitTerminal(TerminalNode node) {
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
    }

    public void errorMessage(int line, String symbol){
        System.err.println("HOY! KOYA at line " + line + " missing '" + symbol + "' ka!");
    }
}