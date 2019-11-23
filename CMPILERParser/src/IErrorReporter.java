import org.antlr.v4.runtime.ParserRuleContext;

public interface IErrorReporter {
    void ReportError(ParserRuleContext context, String error);
}
