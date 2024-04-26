package br.edu.up.modelos;

public class Carro {
    private double custoFabrica;
    private double percentualConsumidor = 0.28;
    private double impostos = 0.45;

    public double getCustoFabrica() {
        return custoFabrica;
    }

    public void setCustoFabrica(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double getPercentualConsumidor() {
        return percentualConsumidor;
    }

    public void setPercentualConsumidor(double percentualConsumidor) {
        this.percentualConsumidor = percentualConsumidor;
    }

    public double getImpostos() {
        return impostos;
    }

    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    public Carro(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double calcularCustoConsumidor() {
        double custoComImpostos = getCustoFabrica() * (1 + getPercentualConsumidor());
        double custoComDistribuidor = custoComImpostos * (1 + getPercentualConsumidor());
        return custoComDistribuidor;
    }
}
