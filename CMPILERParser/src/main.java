import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        // GUI
//        mainInterface frame = new mainInterface();
//        frame.setVisible(true);

        //TODO: Contents of runBtn will be transferred to mainInterface Class
        gLexer lexer = new gLexer(new ANTLRFileStream("D:\\GitHub\\CompilerProject\\CMPILERParser\\testcases\\interpreter_test.txt"));
        lexer.removeErrorListeners();
        gParser parser = new gParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();

        ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();
        customListener listener = new customListener();
        walker.walk(listener,tree);
//
//        customErrorVisitor customErrorVisitor = new customErrorVisitor();
//        customErrorVisitor.visit(tree);

        customVisitor visitor = new customVisitor();
        visitor.visit(tree);
    }
}
