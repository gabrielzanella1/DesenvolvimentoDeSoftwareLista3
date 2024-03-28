public class Exercicio24 {
    public static void executar(){ 
        double notaLaboratorio = Prompt.lerDecimal("Informe a nota do trabalho de laboratório: ");
        double notaAvaliacaoSemestral = Prompt.lerDecimal("Informe a nota da avaliação semestral: ");
        double notaExameFinal = Prompt.lerDecimal("Informe a nota do exame final: ");

        MediaPonderada mediaPonderada = new MediaPonderada(notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal);
        double mediaFinal = mediaPonderada.calcularMediaFinal();

        Prompt.imprimir("A média final do estudante é: " + mediaFinal);
    }
}
