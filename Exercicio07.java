public class Exercicio07 {
    public static void executar(){
        double custoFabrica = Prompt.lerDecimal("Informe o custo de fábrica do carro: ");

        Carro carro = new Carro(custoFabrica);
        double custoConsumidor = carro.calcularCustoConsumidor();

        Prompt.imprimir("O custo ao consumidor do carro é: R$ " + custoConsumidor);
    }
}

