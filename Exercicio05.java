public class Exercicio05 {
    public static void executar() {
        double valorCompra = Prompt.lerDecimal("Digite o valor da compra: ");

        double valorPrestacao = MamaoComAcucar.calcularValorPrestacoes(valorCompra);

        Prompt.imprimir("Valor das prestações: R$ " + valorPrestacao);
    }
}
