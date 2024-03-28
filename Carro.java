public class Carro {
    private double custoFabrica;
    private static final double PERCENTUAL_DISTRIBUIDOR = 0.28;
    private static final double IMPOSTOS = 0.45;

    public Carro(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double calcularCustoConsumidor() {
        double custoComImpostos = custoFabrica * (1 + IMPOSTOS);
        double custoComDistribuidor = custoComImpostos * (1 + PERCENTUAL_DISTRIBUIDOR);
        return custoComDistribuidor;
    }
}