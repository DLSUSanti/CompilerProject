import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class customListener extends gBaseListener {

    @Override
    public void exitProgram(gParser.ProgramContext ctx) {
        System.out.println("Listener --> " + ctx.getText());
    }

    @Override
    public void exitMain(gParser.MainContext ctx) {
        System.out.println("[Listener] MAIN --> " +ctx.MAIN());
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
    public void exitIntdeclaration(gParser.IntdeclarationContext ctx) {
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
    public void exitScan(gParser.ScanContext ctx) {
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
    }

    @Override
    public void exitFloatliteral(gParser.FloatliteralContext ctx) {
    }

    @Override
    public void exitBlock(gParser.BlockContext ctx) {
        System.out.println("[Listener] exitBlock --> " + ctx.getText());
        System.out.println("[Listener] Block -> " + ctx.LBRACE());
        System.out.println("[Listener] Block -> " + ctx.RBRACE());
        if(ctx.RBRACE().toString().contains("missing")){
            System.err.println("Missing '}'");
        }
    }

    @Override
    public void exitStatement(gParser.StatementContext ctx) {
        System.out.println("[Listener] Statement --> " + ctx.getText());
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
}