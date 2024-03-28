public class CarangoVelho {
    private int ano;

    public CarangoVelho(int ano) {
        this.ano = ano;
    }

    public double calcularDesconto() {
        if (ano <= 2000) {
            return 0.12;
        } else {
            return 0.07;
        }
    }
}