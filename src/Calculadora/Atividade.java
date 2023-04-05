package Calculadora;
import javax.swing.*;
import java.awt.*;

class Atividade extends JFrame {
    private JTextField textField;

    public Atividade() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 350);
        getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setBounds(10, 10, 260, 40);
        getContentPane().add(textField);

        JButton btn1 = new JButton("1");
        btn1.setBounds(10, 60, 50, 50);
        getContentPane().add(btn1);

        JButton btn2 = new JButton("2");
        btn2.setBounds(70, 60, 50, 50);
        getContentPane().add(btn2);

        JButton btn3 = new JButton("3");
        btn3.setBounds(130, 60, 50, 50);
        getContentPane().add(btn3);

        JButton btn4 = new JButton("4");
        btn4.setBounds(10, 120, 50, 50);
        getContentPane().add(btn4);

        JButton btn5 = new JButton("5");
        btn5.setBounds(70, 120, 50, 50);
        getContentPane().add(btn5);

        JButton btn6 = new JButton("6");
        btn6.setBounds(130, 120, 50, 50);
        getContentPane().add(btn6);

        JButton btn7 = new JButton("7");
        btn7.setBounds(10, 180, 50, 50);
        getContentPane().add(btn7);

        JButton btn8 = new JButton("8");
        btn8.setBounds(70, 180, 50, 50);
        getContentPane().add(btn8);

        JButton btn9 = new JButton("9");
        btn9.setBounds(130, 180, 50, 50);
        getContentPane().add(btn9);

        JButton btn0 = new JButton("0");
        btn0.setBounds(70, 240, 50, 50);
        getContentPane().add(btn0);

        JButton btnPonto = new JButton(".");
        btnPonto.setBounds(10, 240, 50, 50);
        getContentPane().add(btnPonto);

        JButton btnIgual = new JButton("=");
        btnIgual.setBounds(130, 240, 50, 50);
        getContentPane().add(btnIgual);

        JButton btnMais = new JButton("+");
        btnMais.setBounds(190, 60, 80, 50);
        getContentPane().add(btnMais);

        JButton btnMenos = new JButton("-");
        btnMenos.setBounds(190, 120, 80, 50);
        getContentPane().add(btnMenos);

        JButton btnMultiplicacao = new JButton("*");
        btnMultiplicacao.setBounds(190, 180, 80, 50);
        getContentPane().add(btnMultiplicacao);

        JButton btnDivisao = new JButton("/");
        btnDivisao.setBounds(190, 240, 80, 50);
        getContentPane().add(btnDivisao);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Atividade();
    }
}
