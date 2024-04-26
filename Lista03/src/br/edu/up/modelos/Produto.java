package br.edu.up.modelos;

public class Produto {
    private double precoCusto;

    public Produto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double calcularPrecoVenda(double percentualAcrescimo) {
        return getPrecoCusto() * (1 + percentualAcrescimo / 100);
    }
}
