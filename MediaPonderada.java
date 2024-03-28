public class MediaPonderada {
    private double notaLaboratorio;
    private double notaAvaliacaoSemestral;
    private double notaExameFinal;

    public MediaPonderada(double notaLaboratorio, double notaAvaliacaoSemestral, double notaExameFinal) {
        this.notaLaboratorio = notaLaboratorio;
        this.notaAvaliacaoSemestral = notaAvaliacaoSemestral;
        this.notaExameFinal = notaExameFinal;
    }

    public double calcularMediaFinal() {
        double mediaFinal = (notaLaboratorio * 2 + notaAvaliacaoSemestral * 3 + notaExameFinal * 5) / 10;
        return mediaFinal;
    }
}