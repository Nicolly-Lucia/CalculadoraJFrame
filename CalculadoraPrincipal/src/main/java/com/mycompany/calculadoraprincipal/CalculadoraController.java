package com.mycompany.calculadoraprincipal;

public class CalculadoraController {

    public double somar(double n1, double n2) {
        return n1 + n2;
    }

    public double subtrair(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    public double dividir(double n1, double n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Não pode dividir por zero.");
        }
        return n1 / n2;
    }

    public double raizNumero1(double n1) {
        if (n1 < 0) {
            throw new ArithmeticException("Número inválido.");
        }
        return Math.sqrt(n1);
    }

    public double raizNumero2(double n2) {
        if (n2 < 0) {
            throw new ArithmeticException("Número inválido.");
        }
        return Math.sqrt(n2);
    }
}