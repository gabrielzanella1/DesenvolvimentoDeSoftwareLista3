public class Exercicio10 {
    public static void executar() {
        int numeroPessoas = Prompt.lerInteiro("Informe o número de pessoas: ");

        for (int i = 0; i < numeroPessoas; i++) {
            int idade = Prompt.lerInteiro("Informe a idade da pessoa " + (i + 1) + ": ");
            String mensagem = Maioridade.verificarMaioridade(idade);
            Prompt.imprimir("Pessoa " + (i + 1) + ": " + mensagem);
        }
    }
}
