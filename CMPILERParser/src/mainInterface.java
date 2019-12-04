import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class mainInterface extends JFrame {

    private customVisitor visitor;
    private JPanel contentPane;
    Thread runningthread;

    /**
     * Create the frame.
     */
    private JTextArea jTextPaneEditor;
    private JTextArea jTextPaneDebug;
    private JTextField jTextPaneInput;
    private JButton btnRun;
    private Boolean sleep;

    public mainInterface() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 653, 480);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 45, 621, 211);
        contentPane.add(scrollPane);

        jTextPaneEditor = new JTextArea();
        scrollPane.setViewportView(jTextPaneEditor);

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(10, 277, 621, 104);
        contentPane.add(scrollPane_1);

        jTextPaneDebug = new JTextArea();
        scrollPane_1.setViewportView(jTextPaneDebug);
        jTextPaneDebug.setEditable(false);

        JLabel lblDebug = new JLabel("Debugger");
        lblDebug.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblDebug.setBounds(10, 262, 102, 14);
        contentPane.add(lblDebug);

        JLabel lblEditor = new JLabel("Editor");
        lblEditor.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblEditor.setBounds(10, 31, 102, 14);
        contentPane.add(lblEditor);

        JLabel lblCalculator = new JLabel("Final Project");
        lblCalculator.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblCalculator.setBounds(10, 6, 135, 20);
        contentPane.add(lblCalculator);

        JLabel lblInput = new JLabel("Input");
        lblInput.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblInput.setBounds(10, 385, 102, 14);
        contentPane.add(lblInput);

        jTextPaneInput = new JTextField();
        jTextPaneInput.setBounds(10, 400, 621, 30);
        jTextPaneInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(runningthread!=null && !jTextPaneInput.getText().isEmpty()){
                    jTextPaneDebug.append(jTextPaneInput.getText());
                    jTextPaneDebug.append("\n");
                    System.out.println(jTextPaneInput.getText());
                    synchronized (runningthread){
                        runningthread.notify();
                    }
                }
            }
        });
        contentPane.add(jTextPaneInput);

        btnRun = new JButton("Run");
        btnRun.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jTextPaneDebug.setText("");
                jTextPaneInput.setText("");
                visitor = new customVisitor(mainInterface.this);
                String input = jTextPaneEditor.getText();
                gLexer lexer = new gLexer(new ANTLRInputStream(input));
                gParser parser = new gParser(new CommonTokenStream(lexer));
                ParseTree tree = parser.program();

                runningthread = new Thread(){
                    @Override
                    public void run() {
                        visitor.visit(tree);
                    }
                };
                runningthread.start();
            }
        });
        btnRun.setBounds(542, 11, 89, 23);
        contentPane.add(btnRun);

    }

    public JTextArea getjTextPaneDebug() {
        return jTextPaneDebug;
    }


    public JTextField getjTextPaneInput() {
        return jTextPaneInput;
    }

    public Boolean getSleep() {
        return sleep;
    }

    public void setSleep(Boolean sleep) {
        this.sleep = sleep;
    }
}