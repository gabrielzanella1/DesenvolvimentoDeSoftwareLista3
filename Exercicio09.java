public class Exercicio09 {
    public static void executar(){
        int numerosDentro = 0;

        for (int i = 0; i < 80; i++) {
            int numero = Prompt.lerInteiro("Digite um número: ");
            if (numero >= 10 && numero <= 150) {
                numerosDentro++;
            }
        }

        Prompt.imprimir("Quantidade de números no intervalo entre 10 e 150: " + numerosDentro);
    }
}
