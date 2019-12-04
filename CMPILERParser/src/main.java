import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        // GUI
        mainInterface frame = new mainInterface();
        frame.setVisible(true);

        //TODO: Contents of runBtn will be transferred to mainInterface Class
//        gLexer lexer = new gLexer(new ANTLRFileStream("testcases/interpreter_test.txt"));
//        gParser parser = new gParser(new CommonTokenStream(lexer));
//        ParseTree tree = parser.program();
//
////        customErrorChecker errorChecker = new customErrorChecker();
////        errorChecker.visit(tree);
//
//        customVisitor visitor = new customVisitor(frame);
//        visitor.visit(tree);
    }
}
