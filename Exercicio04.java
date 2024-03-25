public class Exercicio04 {
    public static void executar() {
        Prompt.imprimir("Digite a cotação do dólar: ");
        double cotacaoDolar = Prompt.lerDecimal();

        Cambio cambio = new Cambio(cotacaoDolar);

        Prompt.imprimir("Digite a quantidade de dólares disponíveis: ");
        double valorEmDolar = Prompt.lerDecimal();

        double valorEmReal = cambio.converterParaReal(valorEmDolar);

        Prompt.imprimir("Valor em real: R$ " + valorEmReal);

    }
}
