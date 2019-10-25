import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;

public class Main {
    public static void main(String[] args) throws Exception{
        String src = "FUNCTION VOID performFunction(INT x)" +
                "{" +
                "boolean y = (5 > 4 && TRUE) || (FALSE && !(x==0));" +
                "INT[10] myArray;" +
                "INT y;" +
                "" +
                "SCAN (\" input \", x)" +
                "PRINT (\"The input is: \", x);" +
                "IF(x != 0){" +
                "" +
                "}" +
                "ELSE{" +
                "" +
                "};" +
                "" +
                "y = x;" +
                "FOR(x=x; x>5; x--){" +
                "FOR(i=0; i<x; i++){" +
                "PRINT (\"Hello World\");" +
                "};" +
                "};" +
                "y;" +
                "" +
                "INT x = 2;" +
                "CALL performFunction(x);";
        gLexer lexer = new gLexer(new ANTLRInputStream(src));
        while (true){
            Token token = lexer.nextToken();
            if(token.getType() == gLexer.EOF) {
                break;
            }
            if(token.getType() >= 1 && token.getType() <= 4){
                System.out.print("Literal");
            }
            if(token.getType() >= 5 && token.getType() <= 19){
                System.out.print("Keyword");
            }
            if(token.getType() == 20){
                System.out.print("Identifier");
            }
            if(token.getType() >= 21 && token.getType() <= 31){
                System.out.print("Separator");
            }
            if(token.getType() >= 32 && token.getType() <= 52){
                System.out.print("Operator");
            }
            System.out.print(" \t::\t " + token.getText());
            System.out.println();
        }
    }
}
