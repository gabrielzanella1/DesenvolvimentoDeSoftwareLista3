public class Carango {
    private String combustivel;
    private double valorVeiculo;

    public Carango(String combustivel, double valorVeiculo) {
        this.combustivel = combustivel;
        this.valorVeiculo = valorVeiculo;
    }

    public double calcularDesconto() {
        double desconto = 0;
        switch (combustivel.toUpperCase()) {
            case "ÁLCOOL":
                desconto = valorVeiculo * 0.25;
                break;
            case "GASOLINA":
                desconto = valorVeiculo * 0.21;
                break;
            case "DIESEL":
                desconto = valorVeiculo * 0.14;
                break;
        }
        return desconto;
    }

    public double calcularValorFinal() {
        return valorVeiculo - calcularDesconto();
    }
}