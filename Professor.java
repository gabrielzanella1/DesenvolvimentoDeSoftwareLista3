public class Professor {
    private int nivel;
    private double valorHoraAula;

    public Professor(int nivel) {
        this.nivel = nivel;
        switch (nivel) {
            case 1:
                valorHoraAula = 12.0;
                break;
            case 2:
                valorHoraAula = 17.0;
                break;
            case 3:
                valorHoraAula = 25.0;
                break;
            default:
                valorHoraAula = 0.0;
                break;
        }
    }

    public double calcularSalario(int horasAula) {
        return valorHoraAula * horasAula;
    }
}