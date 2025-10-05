import java.awt.*;
import javax.swing.*;

public class AppCalculadora {
    public static void main(String[] args) throws Exception {
        JFrame calculadora = new JFrame("Calculadora");
        calculadora.setSize(270, 350);
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculadora.setLocationRelativeTo(null);
        calculadora.setLayout(null);
        calculadora.getContentPane().setBackground(new Color(100, 100, 100));

        Font Arial = new Font("Arial", Font.BOLD, 11);

        JTextField displayCalc = new JTextField("");
        displayCalc.setBounds(10, 5, 235, 35);
        displayCalc.setFont(Arial);
        calculadora.add(displayCalc);

        JButton btnCe = new JButton("CE");
        btnCe.setBounds(10, 75, 170, 30);
        btnCe.setFont(Arial);
        calculadora.add(btnCe);

        JButton btnDiv = new JButton("/");
        btnDiv.setBounds(205, 75, 40, 30);
        btnDiv.setFont(Arial);
        calculadora.add(btnDiv);

        JButton btn7 = new JButton("7");
        btn7.setBounds(10, 130, 40, 30);
        btn7.setFont(Arial);
        calculadora.add(btn7);

        JButton btn8 = new JButton("8");
        btn8.setBounds(75, 130, 40, 30);
        btn8.setFont(Arial);
        calculadora.add(btn8);

        JButton btn9 = new JButton("9");
        btn9.setBounds(140, 130, 40, 30);
        btn9.setFont(Arial);
        calculadora.add(btn9);

        JButton btnMult = new JButton("x");
        btnMult.setBounds(205, 130, 40, 30);
        btnMult.setFont(Arial);
        calculadora.add(btnMult);

        JButton btn4 = new JButton("4");
        btn4.setBounds(10, 175, 40, 30);
        btn4.setFont(Arial);
        calculadora.add(btn4);

        JButton btn5 = new JButton("5");
        btn5.setBounds(75, 175, 40, 30);
        btn5.setFont(Arial);
        calculadora.add(btn5);

        JButton btn6 = new JButton("6");
        btn6.setBounds(140, 175, 40, 30);
        btn6.setFont(Arial);
        calculadora.add(btn6);

        JButton btnSub = new JButton("-");
        btnSub.setBounds(205, 175, 40, 30);
        btnSub.setFont(Arial);
        calculadora.add(btnSub);

        JButton btn1 = new JButton("1");
        btn1.setBounds(10, 220, 40, 30);
        btn1.setFont(Arial);
        calculadora.add(btn1);

        JButton btn2 = new JButton("2");
        btn2.setBounds(75, 220, 40, 30);
        btn2.setFont(Arial);
        calculadora.add(btn2);

        JButton btn3 = new JButton("3");
        btn3.setBounds(140, 220, 40, 30);
        btn3.setFont(Arial);
        calculadora.add(btn3);

        JButton btnAdi = new JButton("+");
        btnAdi.setBounds(205, 220, 40, 30);
        btnAdi.setFont(Arial);
        calculadora.add(btnAdi);

        JButton btn0 = new JButton("0");
        btn0.setBounds(10, 260, 105, 30);
        btn0.setFont(Arial);
        calculadora.add(btn0);

        JButton btnPoint = new JButton(".");
        btnPoint.setBounds(140, 260, 40, 30);
        btnPoint.setFont(Arial);
        calculadora.add(btnPoint);

        JButton btnEqual = new JButton("=");
        btnEqual.setBounds(205, 260, 40, 30);
        btnEqual.setFont(Arial);
        calculadora.add(btnEqual);

        calculadora.setVisible(true);
    }
}