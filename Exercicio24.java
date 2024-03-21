public class Exercicio24 {
    public static void executar(){ 
        double notaLaboratorio = Prompt.lerDecimal("Digite a nota do trabalho de laboratório: ");
        double notaSemestral = Prompt.lerDecimal("Digite a nota da avaliação semestral: ");
        double notaExameFinal = Prompt.lerDecimal("Digite a nota do exame final: ");

        double media = (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;

        Prompt.linhaEmBranco();
        Prompt.imprimir("Media final: " + media);
    }
}
