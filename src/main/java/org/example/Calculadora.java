package org.example;

public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b; // a
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida");
        }
        return a / b;
    }

    public boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public int potencia(int base, int expoente) {
        return (int) Math.pow(base, expoente);
    }
}
