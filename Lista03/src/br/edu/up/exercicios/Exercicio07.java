package br.edu.up.exercicios;

import br.edu.up.Prompt;
import br.edu.up.modelos.Carro;

public class Exercicio07 {
    public void Executar(){
        double custoFabrica = Prompt.lerDecimal("Informe o custo de fábrica do carro: ");

        Carro carro = new Carro(custoFabrica);
        double custoConsumidor = carro.calcularCustoConsumidor();

        Prompt.imprimir("O custo ao consumidor do carro é: R$ " + custoConsumidor);
    }
}
