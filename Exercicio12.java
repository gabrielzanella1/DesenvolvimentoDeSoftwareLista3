public class Exercicio12 {
    public static void executar(){
        int totalCarrosAte2000 = 0;
        int totalGeral = 0;

        char continuar;
        do {
            int ano = Prompt.lerInteiro("Digite o ano do veículo: ");
            double valor = Prompt.lerDecimal("Digite o valor do veículo: ");

            double desconto;
            if (ano <= 2000) {
                desconto = valor * 0.12;
                totalCarrosAte2000++;
            } else {
                desconto = valor * 0.07;
            }

            double valorComDesconto = valor - desconto;

            Prompt.linhaEmBranco();
            Prompt.imprimir("Valor do veículo: R$ " + valor);
            Prompt.imprimir("Valor do desconto: R$ " + desconto);
            Prompt.imprimir("Valor a ser pago pelo cliente: R$ " + valorComDesconto);
            Prompt.linhaEmBranco();

            totalGeral++;

            continuar = Prompt.lerLinha("Deseja continuar calculando desconto? (S/N)").toUpperCase().charAt(0);
        } while (continuar == 'S');

        Prompt.linhaEmBranco();
        Prompt.imprimir("Total de carros com ano até 2000: " + totalCarrosAte2000);
        Prompt.imprimir("Total geral de carros: " + totalGeral);
    }
}
