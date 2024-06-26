package br.edu.up.exercicios;

import br.edu.up.modelos.Salario;
import br.edu.up.Prompt;

public class Exercicio17 {
    public void Executar() {
        double totalAumentoFolha = 0;

        while (true) {
            String nome = Prompt.lerLinha("Informe o nome do funcionário (ou 'FIM' para encerrar): ");
            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }

            double salarioAtual = Prompt.lerDecimal("Informe o salário atual de " + nome + ": ");
            double salarioMinimo = Prompt.lerDecimal("Informe o valor do salário mínimo: ");

            Salario salario = new Salario(nome, salarioAtual, salarioMinimo);
            double novoSalario = salario.calcularReajuste();
            double aumentoFolha = salario.calcularAumentoFolhaPagamento();

            Prompt.imprimir("Novo salário de " + nome + ": R$ " + novoSalario);
            Prompt.imprimir("Aumento na folha de pagamento: R$ " + aumentoFolha);

            totalAumentoFolha += aumentoFolha;
        }

        Prompt.imprimir("Total de aumento na folha de pagamento: R$ " + totalAumentoFolha);
    }
}
