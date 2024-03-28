public class Exercicio11 {
    public static void executar(){
        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 0; i < 56; i++) {
            String nome = Prompt.lerLinha("Informe o nome da pessoa " + (i + 1) + ": ");
            char sexo = Prompt.lerLinha("Informe o sexo (M/F) da pessoa " + (i + 1) + ": ").charAt(0);

            String mensagem = Sexo.verificarSexo(sexo);
            Prompt.imprimir("Pessoa " + (i + 1) + ": " + nome + " - " + mensagem);

            if (mensagem.equals("Homem")) {
                totalHomens++;
            } else if (mensagem.equals("Mulher")) {
                totalMulheres++;
            }
        }

        Prompt.imprimir("Total de homens: " + totalHomens);
        Prompt.imprimir("Total de mulheres: " + totalMulheres);
    }
}

