public class Cambio {
    private double cotacaoDolar;

    public Cambio(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    public double converterParaReal(double valorEmDolar) {
        return valorEmDolar * cotacaoDolar;
    }

    public double getCotacaoDolar() {
        return cotacaoDolar;
    }
}
