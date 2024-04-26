package br.edu.up.exercicios;

import br.edu.up.modelos.Contabilidade;
import br.edu.up.Prompt;

public class Exercicio14 {
    public void Executar() {
        double totalPrecoCusto = 0;
        double totalPrecoVenda = 0;

        for (int i = 0; i < 40; i++) {
            double precoCusto = Prompt.lerDecimal("Informe o preço de custo do produto " + (i + 1) + ": ");
            double precoVenda = Prompt.lerDecimal("Informe o preço de venda do produto " + (i + 1) + ": ");

            Contabilidade produto = new Contabilidade(precoCusto, precoVenda);
            String resultado = produto.calcularResultado();
            Prompt.imprimir("Produto " + (i + 1) + ": " + resultado);

            totalPrecoCusto += precoCusto;
            totalPrecoVenda += precoVenda;
        }

        double mediaPrecoCusto = totalPrecoCusto / 40;
        double mediaPrecoVenda = totalPrecoVenda / 40;
        
        Prompt.imprimir("Média de preço de custo: R$ " + mediaPrecoCusto);
        Prompt.imprimir("Média de preço de venda: R$ " + mediaPrecoVenda);
    }
}
