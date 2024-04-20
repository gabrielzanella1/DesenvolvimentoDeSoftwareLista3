package br.edu.up.modelos;

public class ConsumoLuz {
    private int tipoCliente;
    private double valorKwHora;

    public ConsumoLuz(int tipoCliente) {
        this.tipoCliente = tipoCliente;
        switch (tipoCliente) {
            case 1:
                valorKwHora = 0.602;
                break;
            case 2:
                valorKwHora = 0.483;
                break;
            case 3:
                valorKwHora = 1.29;
                break;
            default:
                valorKwHora = 0.0;
                break;
        }
    }

    public double calcularValorConta(int kwHoraConsumido) {
        return valorKwHora * kwHoraConsumido;
    }
}