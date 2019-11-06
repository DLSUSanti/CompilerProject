import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        File file = new File("D:\\GitHub\\CompilerProject\\CMPILERScanner\\src\\test-case.txt");
        File file = new File("D:\\GitHub\\CompilerProject\\CMPILERScanner\\src\\parser_test_2.txt");
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");

        ErrorListener errorListener = new ErrorListener();
        CharStream stream = new ANTLRInputStream(sc.next());

        gLexer lexer = new gLexer(stream);
        TokenStream tokens = new CommonTokenStream(lexer);

        gParser parser = new gParser(tokens);
        // function call to error listener
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);
//        parser.getNumberOfSyntaxErrors();

        // Tree
        ParseTree tree = parser.program();
//        System.err.println(tree.toStringTree(parser));
        Trees.inspect(tree, parser);

        // GUI Interface
//        GUIErrorMessage(errorListener.errorMsg);
//        JOptionPane.showMessageDialog(null, errorListener.errorMsg, "ERROR MESSAGE", JOptionPane.PLAIN_MESSAGE);
    }

    private static void GUIErrorMessage(String message){
        JFrame jFrame = new JFrame("ERROR MESSAGE");
        JTextArea jTextArea = new JTextArea();

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jTextArea);

        jTextArea.setText(message);
        jTextArea.setEditable(false);

        jFrame.add(jPanel);
        jFrame.setSize(500, 500);
        jFrame.setResizable(false);
        jFrame.show();
    }

    static class ErrorListener extends BaseErrorListener {
        //When the value is false, the syntaxError method returns without displaying errors.
        private static final boolean REPORT_SYNTAX_ERRORS = true;
        private String errorMsg = "";

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            if (!REPORT_SYNTAX_ERRORS) {
                return;
            }

            String sourceName = recognizer.getInputStream().getSourceName();
            if (!sourceName.isEmpty()) {
                sourceName = String.format("%s:%d:%d: ", sourceName, line, charPositionInLine);
            }

//            System.out.println("line "+line+":"+charPositionInLine+" "+msg);
            errorMsg = errorMsg + "\n" + "line "+line+":"+charPositionInLine+" "+msg;

            // mismatched input
            if(msg.contains("mismatched input")) {
                String split[] = msg.split("'");
                if (msg.contains("{';', '+', '-', '*', '/', '%'}")) {
                    System.err.println("line " + line + ":" + charPositionInLine + " Hi! There is something wrong here --> '" + split[1]  + "' expecting '" + split[3] + "'");
                } else if (msg.contains("CHAR_LITERAL, STRING_LITERAL, INT_LITERAL, FLOAT_LITERAL")) {
                    System.err.println("line " + line + ":" + charPositionInLine + " Hi! There is something wrong here --> '" + split[1] +  "' expecting identifier");
                } else if (msg.contains("STRING_LITERAL, IDENTIFIER")) {
                    System.err.println("line " + line + ":" + charPositionInLine + " Hi! There is something wrong here --> '" + split[1] + "' expected identifier");
                } else if (msg.contains("expecting {')'")) {
                    System.err.println("line " + line + ":" + charPositionInLine + " Hi! There is something wrong here --> '" + split[1] + "' expecting operator or symbol");
                }else if(msg.contains("expecting ';'")) {
                    System.err.println("line " + line + ":" + charPositionInLine + " Hi! There is something wrong here --> '" + split[1] + "' expecting ';'");
                }else if(msg.contains("expecting '='")){
                    System.err.println("line " + line + ":" + charPositionInLine + " Hi! There is something wrong here --> '" + split[1] + "' expecting '='");
                }
            }
            // no viable alternative
            if(msg.contains("no viable alternative")){
                String split[] = msg.split("'");
                System.err.println("line " + line + ":" + charPositionInLine + " Hi! There is something wrong here --> '" + split[1] + "' not a statement");
            }
            // extraneous input
            if(msg.contains("extraneous input")){
                String split[] = msg.split("'");
                String split1[] = msg.split(",");
                System.err.println("line " + line + ":" + charPositionInLine + " Hi! There is something wrong here --> '" + split[1] + "' missing identifier");
            }
            // missing
            if(msg.contains("missing")) {
                String split[] = msg.split("'");
                if (msg.contains("missing ';' at '}'")) {
                    System.err.println("line " + line + ":" + charPositionInLine + " Hi! There is something wrong here --> '" + split[1] + "' missing ';'");
                }else{
                    System.err.println("line " + line + ":" + charPositionInLine + " Hi! There is something wrong here --> '" + split[1] + "' missing");
                }
            }
        }
        @Override
        public String toString() {
            return errorMsg;
        }
    }
}