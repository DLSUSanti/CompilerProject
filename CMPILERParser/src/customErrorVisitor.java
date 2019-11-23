public class customErrorVisitor extends gBaseVisitor<Value> {

    @Override public Value visitProgram(gParser.ProgramContext ctx) {
        System.out.println("HELLO WE HERE");
        return visitChildren(ctx);
    }

    @Override public Value visitMain(gParser.MainContext ctx) { return visitChildren(ctx); }

    @Override public Value visitFunction(gParser.FunctionContext ctx) { return visitChildren(ctx); }

    @Override public Value visitCall(gParser.CallContext ctx) { return visitChildren(ctx); }

    @Override public Value visitReturnstatement(gParser.ReturnstatementContext ctx) { return visitChildren(ctx); }

    @Override public Value visitGlobaldelcaration(gParser.GlobaldelcarationContext ctx) { return visitChildren(ctx); }

    @Override public Value visitDeclaration(gParser.DeclarationContext ctx) { return visitChildren(ctx); }

    @Override public Value visitSingledeclaration(gParser.SingledeclarationContext ctx) { return visitChildren(ctx); }

    @Override public Value visitArraydeclaration(gParser.ArraydeclarationContext ctx) { return visitChildren(ctx); }

    @Override public Value visitBooleandeclaration(gParser.BooleandeclarationContext ctx) { return visitChildren(ctx); }

    @Override public Value visitIntdeclaration(gParser.IntdeclarationContext ctx) { return visitChildren(ctx); }

    @Override public Value visitIntarrdeclaration(gParser.IntarrdeclarationContext ctx) { return visitChildren(ctx); }

    @Override public Value visitFloatdeclaration(gParser.FloatdeclarationContext ctx) { return visitChildren(ctx); }

    @Override public Value visitFloatarrdeclaration(gParser.FloatarrdeclarationContext ctx) { return visitChildren(ctx); }

    @Override public Value visitChardeclaration(gParser.ChardeclarationContext ctx) { return visitChildren(ctx); }

    @Override public Value visitChararrdeclaration(gParser.ChararrdeclarationContext ctx) { return visitChildren(ctx); }

    @Override public Value visitForcedintdec(gParser.ForcedintdecContext ctx) { return visitChildren(ctx); }

    @Override public Value visitAssignment(gParser.AssignmentContext ctx) { return visitChildren(ctx); }

    @Override public Value visitCondition(gParser.ConditionContext ctx) { return visitChildren(ctx); }

    @Override public Value visitIfstatement(gParser.IfstatementContext ctx) { return visitChildren(ctx); }

    @Override public Value visitElseifstatement(gParser.ElseifstatementContext ctx) { return visitChildren(ctx); }

    @Override public Value visitElsestatement(gParser.ElsestatementContext ctx) { return visitChildren(ctx); }

    @Override public Value visitLoop(gParser.LoopContext ctx) { return visitChildren(ctx); }

    @Override public Value visitLoopfor(gParser.LoopforContext ctx) { return visitChildren(ctx); }

    @Override public Value visitLoopwhile(gParser.LoopwhileContext ctx) { return visitChildren(ctx); }

    @Override public Value visitLoopdowhile(gParser.LoopdowhileContext ctx) { return visitChildren(ctx); }

    @Override public Value visitOperation(gParser.OperationContext ctx) { return visitChildren(ctx); }

    @Override public Value visitOpr(gParser.OprContext ctx) { return visitChildren(ctx); }

    @Override public Value visitAddopr(gParser.AddoprContext ctx) { return visitChildren(ctx); }

    @Override public Value visitMultopr(gParser.MultoprContext ctx) { return visitChildren(ctx); }

    @Override public Value visitTerminalopr(gParser.TerminaloprContext ctx) { return visitChildren(ctx); }

    @Override public Value visitShortopr(gParser.ShortoprContext ctx) { return visitChildren(ctx); }

    @Override public Value visitPrint(gParser.PrintContext ctx) { return visitChildren(ctx); }

    @Override public Value visitPrintblock(gParser.PrintblockContext ctx) { return visitChildren(ctx); }

    @Override public Value visitStringcontent(gParser.StringcontentContext ctx) { return visitChildren(ctx); }

    @Override public Value visitScan(gParser.ScanContext ctx) { return visitChildren(ctx); }

    @Override public Value visitNestedcondition(gParser.NestedconditionContext ctx) { return visitChildren(ctx); }

    @Override public Value visitBooleanexp(gParser.BooleanexpContext ctx) { return visitChildren(ctx); }

    @Override public Value visitLogic(gParser.LogicContext ctx) { return visitChildren(ctx); }

    @Override public Value visitRelation(gParser.RelationContext ctx) { return visitChildren(ctx); }

    @Override public Value visitBooleanvalue(gParser.BooleanvalueContext ctx) { return visitChildren(ctx); }

    @Override public Value visitVararrname(gParser.VararrnameContext ctx) { return visitChildren(ctx); }

    @Override public Value visitIdentifier(gParser.IdentifierContext ctx) { return visitChildren(ctx); }

    @Override public Value visitCharliteral(gParser.CharliteralContext ctx) { return visitChildren(ctx); }

    @Override public Value visitStringliteral(gParser.StringliteralContext ctx) { return visitChildren(ctx); }

    @Override public Value visitIntliteral(gParser.IntliteralContext ctx) { return visitChildren(ctx); }

    @Override public Value visitFloatliteral(gParser.FloatliteralContext ctx) { return visitChildren(ctx); }

    @Override public Value visitBlock(gParser.BlockContext ctx) { return visitChildren(ctx); }

    @Override public Value visitStatement(gParser.StatementContext ctx) { return visitChildren(ctx); }

}
