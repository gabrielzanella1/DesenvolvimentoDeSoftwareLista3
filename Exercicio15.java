public class Exercicio15 {
    public static void executar(){
        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            String combustivel = Prompt.lerLinha("Digite o tipo de combustível (álcool, gasolina, diesel): ");
            if (combustivel.equalsIgnoreCase("zero")) {
                break;
            }

            double valorVeiculo = Prompt.lerDecimal("Digite o valor do veículo: ");

            double desconto = 0;
            if (combustivel.equalsIgnoreCase("álcool")) {
                desconto = valorVeiculo * 0.25;
            } else if (combustivel.equalsIgnoreCase("gasolina")) {
                desconto = valorVeiculo * 0.21;
            } else if (combustivel.equalsIgnoreCase("diesel")) {
                desconto = valorVeiculo * 0.14;
            } else {
                System.out.println("Tipo de combustível inválido. Desconto será zero.");
            }

            double valorPago = valorVeiculo - desconto;

            totalDesconto += desconto;
            totalPago += valorPago;

            Prompt.imprimir("Valor do veículo: R$ " + valorVeiculo);
            Prompt.imprimir("Valor do desconto: R$ " + desconto);
            Prompt.imprimir("Valor a ser pago pelo cliente: R$ " + valorPago);
            Prompt.linhaEmBranco();
        }

        Prompt.imprimir("Total de desconto: R$ " + totalDesconto);
        Prompt.imprimir("Total pago pelos clientes: R$ " + totalPago);
    }
}

