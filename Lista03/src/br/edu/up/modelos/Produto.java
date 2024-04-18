package br.edu.up.modelos;

public class Produto {
    private double precoCusto;

    public Produto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double calcularPrecoVenda(double percentualAcrescimo) {
        return precoCusto * (1 + percentualAcrescimo / 100);
    }
}
