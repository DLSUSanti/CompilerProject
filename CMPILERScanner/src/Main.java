import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
        String src = " public void performFunction(int x)\n" +
                "{\n" +
                "float _sampleIdentifier123 = 999.9f;\n" +
                "boolean y = (5 > 4 && true) || (false && !(x==0));\n" +
                "}";
        JavaLexer lexer = new JavaLexer(new ANTLRInputStream(src));
        while(true) {
            Token token = lexer.nextToken();
            if(token.getType() == JavaLexer.EOF) {
                break;
            }
            //if(token.getType()>=61 && token.getType()<=69){
            //    System.out.println("Separators" + " :: " + token.getText());
            //}
            System.out.println(token.getType() + " :: " + token.getText());

        }
        */


        File file = new File("D:\\GitHub\\Scannertry\\src\\test-case.txt");
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");

        ErrorListener errorListener = new ErrorListener();
        CharStream stream = new ANTLRInputStream(sc.next());

        gLexer lexer = new gLexer(stream);
        TokenStream tokens = new CommonTokenStream(lexer);

        gParser parser = new gParser(tokens);
        // function call to error listener
//        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        // Tree
        ParseTree tree = parser.program();
        System.err.println(tree.toStringTree(parser));
        Trees.inspect(tree, parser);

        GUIErrorMessage(errorListener.errorMsg);
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

            System.out.println("line "+line+":"+charPositionInLine+" "+msg);
            errorMsg = errorMsg + "\n" + "line "+line+":"+charPositionInLine+" "+msg;
        }
        @Override
        public String toString() {
            return errorMsg;
        }
    }
}