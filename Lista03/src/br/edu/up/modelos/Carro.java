package br.edu.up.modelos;

public class Carro {
    private double custoFabrica;
    private double percentualConsumidor = 0.28;
    private double impostos = 0.45;

    public Carro(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double calcularCustoConsumidor() {
        double custoComImpostos = custoFabrica * (1 + impostos);
        double custoComDistribuidor = custoComImpostos * (1 + percentualConsumidor);
        return custoComDistribuidor;
    }
}
