public class Exercicio25 {
    public static void executar(){
        String nome = Prompt.lerLinha("Digite o nome do estudante: ");
        int matricula = Prompt.lerInteiro("Digite o número de matrícula do estudante: ");
        double notaLaboratorio = Prompt.lerDecimal("Digite a nota do trabalho de laboratório: ");
        double notaSemestral = Prompt.lerDecimal("Digite a nota da avaliação semestral: ");
        double notaExameFinal = Prompt.lerDecimal("Digite a nota do exame final: ");

        double media = (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;
        String classificacao;

        if (media >= 8 && media <= 10) {
            classificacao = "A";
        } else if (media >= 7 && media < 8) {
            classificacao = "B";
        } else if (media >= 6 && media < 7) {
            classificacao = "C";
        } else if (media >= 5 && media < 6) {
            classificacao = "D";
        } else {
            classificacao = "R";
        }

        Prompt.linhaEmBranco();
        Prompt.imprimir("Nome do estudante: " + nome);
        Prompt.imprimir("Número de matrícula: " + matricula);
        Prompt.imprimir("Nota final: " + media);
        Prompt.imprimir("Classificação: " + classificacao);
    }
}
