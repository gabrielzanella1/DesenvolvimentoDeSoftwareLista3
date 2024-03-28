public class Exercicio12 {
    public static void executar(){
        int totalCarrosAte2000 = 0;
        int totalGeral = 0;

        char continuar = 'S';
        while (continuar == 'S' || continuar == 's') {
            int ano = Prompt.lerInteiro("Informe o ano do veículo: ");
            CarangoVelho carango = new CarangoVelho(ano);

            double desconto = carango.calcularDesconto();
            double valorOriginal = Prompt.lerDecimal("Informe o valor original do veículo: ");
            double valorDesconto = valorOriginal * desconto;
            double valorFinal = valorOriginal - valorDesconto;

            Prompt.imprimir("Desconto: R$ " + valorDesconto);
            Prompt.imprimir("Valor a ser pago pelo cliente: R$ " + valorFinal);

            if (ano <= 2000) {
                totalCarrosAte2000++;
            }
            totalGeral++;

            continuar = Prompt.lerLinha("Deseja continuar calculando desconto? (S/N)").charAt(0);
        }

        Prompt.imprimir("Total de carros até 2000: " + totalCarrosAte2000);
        Prompt.imprimir("Total geral de carros: " + totalGeral);
    }
}
