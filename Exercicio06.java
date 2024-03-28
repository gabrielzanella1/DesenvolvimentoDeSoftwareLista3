public class Exercicio06 {
    public static void executar() {
        double precoCusto = Prompt.lerDecimal("Informe o preço de custo do produto: ");
        double percentualAcrescimo = Prompt.lerDecimal("Informe o percentual de acréscimo (%): ");

        Produto produto = new Produto(precoCusto);
        double precoVenda = produto.calcularPrecoVenda(percentualAcrescimo);

        Prompt.imprimir("O preço de venda do produto é: R$ " + precoVenda);
    }
}