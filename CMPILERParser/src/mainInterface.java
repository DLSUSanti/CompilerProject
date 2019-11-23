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

    private JPanel contentPane;

    /**
     * Create the frame.
     */
    public mainInterface() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 653, 427);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 45, 621, 211);
        contentPane.add(scrollPane);

        JTextArea jTextPaneEditor = new JTextArea();
        scrollPane.setViewportView(jTextPaneEditor);

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(10, 277, 621, 104);
        contentPane.add(scrollPane_1);

        JTextArea jTextPaneDebug = new JTextArea();
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

        JButton btnRun = new JButton("Run");
        btnRun.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

//                jTextPaneDebug.append(madeListener.message() + "\n");
            }
        });
        btnRun.setBounds(542, 11, 89, 23);
        contentPane.add(btnRun);
    }
}