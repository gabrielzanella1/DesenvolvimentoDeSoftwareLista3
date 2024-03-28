public class Exercicio22 {
    public static void executar(){
        int tipoCliente = Prompt.lerInteiro("Informe o tipo de cliente (1 - Residência, 2 - Comércio, 3 - Indústria): ");
        int kwHoraConsumido = Prompt.lerInteiro("Informe a quantidade de KW/h consumidos: ");

        ConsumoLuz consumoLuz = new ConsumoLuz(tipoCliente);
        double valorConta = consumoLuz.calcularValorConta(kwHoraConsumido);

        Prompt.imprimir("O valor da conta de luz é R$ " + valorConta);
    }
}
