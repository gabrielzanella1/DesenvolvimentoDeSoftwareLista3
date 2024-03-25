public class Exercicio01 {
    public static void executar() {

        Prompt.imprimir("Digite o nome do aluno: ");
        String nome = Prompt.lerLinha();

        Prompt.imprimir("Digite a nota da primeira prova: ");
        double nota1 = Prompt.lerDecimal();

        Prompt.imprimir("Digite a nota da segunda prova: ");
        double nota2 = Prompt.lerDecimal();

        Prompt.imprimir("Digite a nota da terceira prova: ");
        double nota3 = Prompt.lerDecimal();

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        Prompt.imprimir("Nome do aluno: " + aluno.getNome());
        Prompt.imprimir("Média: " + aluno.calcularMedia());
    }
}
