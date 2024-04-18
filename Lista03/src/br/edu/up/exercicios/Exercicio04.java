package br.edu.up.exercicios;

import br.edu.up.Prompt;
import br.edu.up.modelos.Cambio;

public class Exercicio04 {
    public void Executar(){

        System.out.println("Digite a cotação do dólar: ");
        double cotacaoDolar = Prompt.lerDecimal();

        Cambio cambio = new Cambio(cotacaoDolar);

        System.out.println("Digite a quantidade de dólares disponíveis: ");
        double valorEmDolar = Prompt.lerDecimal();

        double valorEmReal = cambio.converterParaReal(valorEmDolar);

        System.out.println("Valor em real: R$ " + valorEmReal);
    }
}
