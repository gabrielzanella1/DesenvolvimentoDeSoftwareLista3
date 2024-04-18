package br.edu.up.modelos;

public class MamaoComAcucar {
    private static final int numeroPrestacoes = 5;

    public static double calcularPrestacoes(double valorCompra) {
        return valorCompra / numeroPrestacoes;
    }
}
