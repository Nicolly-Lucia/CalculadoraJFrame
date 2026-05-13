package com.mycompany.calculadoraprincipal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraGUI extends JFrame {

    JLabel Titulo, N1, N2, Resultado;
    JTextField txtN1, txtN2;

    JButton btnSomar, btnSubtrair, btnMultiplicar;
    JButton btnDividir, btnRaiz1, btnRaiz2;

    CalculadoraController controller = new CalculadoraController();

    public CalculadoraGUI() {

        setTitle("Calculadora");
        setSize(500, 430);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        getContentPane().setBackground(new Color(12, 20, 35));

        //titulo
        Titulo = new JLabel("Calculadora");
        Titulo.setBounds(145, 15, 250, 30);
        Titulo.setForeground(new Color(0, 180, 255));
        Titulo.setFont(new Font("Consolas", Font.BOLD, 24));
        add(Titulo);

        // campos de texto
        N1 = new JLabel("Valor 1:");
        N1.setBounds(50, 70, 80, 25);
        N1.setForeground(Color.WHITE);
        add(N1);

        txtN1 = new JTextField();
        txtN1.setBounds(130, 70, 280, 30);
        txtN1.setBackground(new Color(30, 45, 65));
        txtN1.setForeground(Color.WHITE);
        txtN1.setCaretColor(Color.WHITE);
        add(txtN1);

        N2 = new JLabel("Valor 2:");
        N2.setBounds(50, 115, 80, 25);
        N2.setForeground(Color.WHITE);
        add(N2);

        txtN2 = new JTextField();
        txtN2.setBounds(130, 115, 280, 30);
        txtN2.setBackground(new Color(30, 45, 65));
        txtN2.setForeground(Color.WHITE);
        txtN2.setCaretColor(Color.WHITE);
        add(txtN2);

        // botões
        btnSomar = criarBotao(" + ", 50, 180);
        btnSubtrair = criarBotao(" - ", 150, 180);
        btnMultiplicar = criarBotao(" x ", 250, 180);
        btnDividir = criarBotao(" / ", 350, 180);

        btnRaiz1 = criarBotao("√1", 150, 255);
        btnRaiz2 = criarBotao("√2", 250, 255);

        // resultado
        Resultado = new JLabel("Resultado: ");
        Resultado.setBounds(50, 340, 400, 30);
        Resultado.setForeground(new Color(0, 255, 180));
        Resultado.setFont(new Font("Consolas", Font.BOLD, 20));
        add(Resultado);

// eventos
btnSomar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        calcular("somar");
    }
});

btnSubtrair.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        calcular("subtrair");
    }
});

btnMultiplicar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        calcular("multiplicar");
    }
});

btnDividir.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        calcular("dividir");
    }
});

btnRaiz1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        calcular("raiz1");
    }
});

btnRaiz2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        calcular("raiz2");
    }
});
    }

    public JButton criarBotao(String texto, int x, int y) {
        JButton btn = new JButton(texto);
        btn.setBounds(x, y, 80, 55);
        btn.setBackground(new Color(0, 90, 180));
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Arial", Font.BOLD, 18));
        btn.setFocusPainted(false);
        add(btn);
        return btn;
    }

public void calcular(String op) {

    try {

        double n1 = 0;
        double n2 = 0;
        double r = 0;

        switch (op) {

            case "somar":
                n1 = Double.parseDouble(txtN1.getText());
                n2 = Double.parseDouble(txtN2.getText());
                r = controller.somar(n1, n2);
                break;

            case "subtrair":
                n1 = Double.parseDouble(txtN1.getText());
                n2 = Double.parseDouble(txtN2.getText());
                r = controller.subtrair(n1, n2);
                break;

            case "multiplicar":
                n1 = Double.parseDouble(txtN1.getText());
                n2 = Double.parseDouble(txtN2.getText());
                r = controller.multiplicar(n1, n2);
                break;

            case "dividir":
                n1 = Double.parseDouble(txtN1.getText());
                n2 = Double.parseDouble(txtN2.getText());
                r = controller.dividir(n1, n2);
                break;

            case "raiz1":
                n1 = Double.parseDouble(txtN1.getText());
                r = controller.raizNumero1(n1);
                break;

            case "raiz2":
                n2 = Double.parseDouble(txtN2.getText());
                r = controller.raizNumero2(n2);
                break;
        }

        Resultado.setText("Resultado: " + r);

    } catch (Exception e) {

        JOptionPane.showMessageDialog(null,
        "Digite valores válidos!");

    }
}

        }