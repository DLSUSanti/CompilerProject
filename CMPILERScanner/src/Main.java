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
//        Trees.inspect(tree, parser);

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
            if(msg.contains("{';', '+', '-', '*', '/', '%'}")){
                String split[] = msg.split("'");
                System.err.println("line " + line + ":" + charPositionInLine + " expecting '" + split[3] + "'");
            }else if(msg.contains("CHAR_LITERAL, STRING_LITERAL, INT_LITERAL, FLOAT_LITERAL")){
                System.err.println("line " + line + ":" + charPositionInLine + " expecting identifier");
            }else if(msg.contains("STRING_LITERAL, IDENTIFIER")){
                System.err.println("line " + line + ":" + charPositionInLine + " expected expression");
            }else if(msg.contains("')', ','")){
                System.err.println("line " + line + ":" + charPositionInLine + " expecting ')' or ','");
            }else if(msg.contains("mismatched input '('")) {
                System.err.println("line " + line + ":" + charPositionInLine + " expecting ';'");
            }else if(msg.contains("expecting '='")){
                System.err.println("line " + line + ":" + charPositionInLine + " variable might not be initialized");
            }
            // no viable alternative
            else if(msg.contains("no viable alternative")){
                System.err.println("line " + line + ":" + charPositionInLine + " not a statement");
            }
            // extraneous input
            else if(msg.contains("extraneous input")){
                String split[] = msg.split("'");
                System.err.println("line " + line + ":" + charPositionInLine + " parameter expected in '" + split[1] + "'");
            }
            // missing
            else if(msg.contains("missing ';' at '}'")){
                System.err.println("line " + line + ":" + charPositionInLine + " missing ';'");
            }
        }
        @Override
        public String toString() {
            return errorMsg;
        }
    }

//    void testOne(){
//        int x = 0;
////        System.out.println(."Hello. I need your number:" , x);
//
//        for(int i; i< 10; i += 1){
//            System.out.println(("Yes " + x);
//        };
//        x=5x;
//    }
//
//    void testTwo(float x){
//        if(x==2){
//            System.out.println("x is a very huge number");
//        };
//    }
//
//    void testThree(int  x,, int y){
//        int i = 0;
//        do {
//            i++;
//        }while (i == x);
//    }
//
//    void testFour(int x, int y, int z){
//        int sum = x + y + z;
//    }
//
//    fonction vide testFive(){
//        imprimer("Hello");
//    }
//
//    essentiel{
//        decimale value = (5*1) + (5*5/1+3+(4+(5*3)))/2.0*8.0;
//        appel testOne();
//        appel testTwo(value);
//
//        appel testTwo(5.0);
//        appel testTwo(5.0;
//        appel testThree(25, 13);
//        appel testThree((12*10), (54*5));
//        appel testThree(4,,5);
//        appel testThree(4,5);
//    }
//

}