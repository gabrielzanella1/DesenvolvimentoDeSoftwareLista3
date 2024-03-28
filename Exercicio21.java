public class Exercicio21 {
    public static void executar(){
        int idade = Prompt.lerInteiro("Informe a idade do nadador: ");

        Nadador nadador = new Nadador(idade);
        String categoria = nadador.classificarCategoria();

        Prompt.imprimir("O nadador está na categoria: " + categoria);
    }
}
