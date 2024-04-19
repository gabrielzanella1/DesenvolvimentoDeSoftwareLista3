package br.edu.up.exercicios;

import br.edu.up.modelos.Carango;
import br.edu.up.Prompt;

public class Exercicio15 {
    public void Executar() {
        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            String combustivel = Prompt.lerLinha("Informe o tipo de combustível (Álcool, Gasolina, Diesel): ");
            if (combustivel.equalsIgnoreCase("Álcool") || combustivel.equalsIgnoreCase("Gasolina")
                    || combustivel.equalsIgnoreCase("Diesel")) {
                double valorVeiculo = Prompt.lerDecimal("Informe o valor do veículo (0 para encerrar): ");
                if (valorVeiculo == 0) {
                    break;
                }

                Carango carango = new Carango(combustivel, valorVeiculo);
                double desconto = carango.calcularDesconto();
                double valorFinal = carango.calcularValorFinal();

                Prompt.imprimir("Desconto: R$ " + desconto);
                Prompt.imprimir("Valor a ser pago pelo cliente: R$ " + valorFinal);

                totalDesconto += desconto;
                totalPago += valorFinal;
            } else {
                Prompt.imprimir("Tipo de combustível inválido. Informe novamente.");
            }
        }

        Prompt.imprimir("Total de desconto dado: R$ " + totalDesconto);
        Prompt.imprimir("Total pago pelos clientes: R$ " + totalPago);
    }
}
