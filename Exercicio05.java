public class Exercicio05 {
    public static void executar(){
        double cot = Prompt.lerDecimal("Informe o valor da compra: ");

        Prompt.imprimir("O valor valor da prestação fica: " + (cot / 5));
    }
}
