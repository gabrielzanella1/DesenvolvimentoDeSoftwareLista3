public class Exercicio08 {
    public static void executar(){
        String nome = Prompt.lerLinha("Informe o nome do aluno: ");
        double nota1 = Prompt.lerDecimal("Informe a primeira nota: ");
        double nota2 = Prompt.lerDecimal("Informe a segunda nota: ");
        double nota3 = Prompt.lerDecimal("Informe a terceira nota: ");

        Aluno2 aluno = new Aluno2(nome, nota1, nota2, nota3);
        double media = aluno.calcularMedia();
        String mencao = aluno.calcularMencao();

        Prompt.imprimir("Nome do aluno: " + nome);
        Prompt.imprimir("Média: " + media);
        Prompt.imprimir("Resultado: " + mencao);
    }
}  