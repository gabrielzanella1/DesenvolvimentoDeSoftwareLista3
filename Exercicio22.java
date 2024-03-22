public class Exercicio22 {
    public static void executar(){
        int tipoCliente = Prompt.lerInteiro("Digite o tipo de cliente (1 - Residência, 2 - Comércio, 3 - Indústria): ");
        double valorKwh = 0;

        if (tipoCliente == 1) {
            valorKwh = 0.60;
        } else if (tipoCliente == 2) {
            valorKwh = 0.48;
        } else if (tipoCliente == 3) {
            valorKwh = 1.29;
        } else {
            Prompt.imprimir("Tipo de cliente inválido.");
            return;
        }

        double consumoKwh = Prompt.lerDecimal("Digite o consumo em KWh: ");
        double valorConta = valorKwh * consumoKwh;

        Prompt.linhaEmBranco();
        Prompt.imprimir("Valor da conta de luz: R$" + valorConta);
    }
}
