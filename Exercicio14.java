public class Exercicio14 {
    public static void executar(){
        double totalCusto = 0;
        double totalVenda = 0;

        for (int i = 0; i < 40; i++) {
            double custo = Prompt.lerDecimal("Digite o preço de custo do produto " + (i + 1) + ": ");
            double venda = Prompt.lerDecimal("Digite o preço de venda do produto " + (i + 1) + ": ");

            double fechamento = venda - custo;
            String resultado;
            if (fechamento > 0) {
                resultado = "Lucro";
            } else if (fechamento < 0) {
                resultado = "Prejuízo";
            } else {
                resultado = "Deu elas por elas.";
            }

            Prompt.imprimir("Resultado para o produto " + (i + 1) + ": " + resultado);

            totalCusto += custo;
            totalVenda += venda;
        }

        double mediaCusto = totalCusto / 40;
        double mediaVenda = totalVenda / 40;

        Prompt.linhaEmBranco();
        Prompt.imprimir("Média de preço de custo: " + mediaCusto);
        Prompt.imprimir("Média de preço de venda: " + mediaVenda);
    }
}
