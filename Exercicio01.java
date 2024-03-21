public class Exercicio01 {
    public static void executar(){

        String nome = Prompt.lerLinha("Informe nome do Aluno: ");

        int[] notas = new int[3];
        double soma = 0;

        for(int i = 0; i < notas.length; i++){
            notas[i] = Prompt.lerInteiro("Informe a nota " + i + ": ");
            soma += notas[i];
        }

       double media = soma/notas.length;

       Prompt.imprimir("O nome do aluno é: " + nome + " e sua média é: " + media);
    }
}
