public class Exercicio02 {
    public static void executar() {
        double distanciaPercorrida = Prompt.lerDecimal("Digite a distância total percorrida (em km): ");

        double combustivelGasto = Prompt.lerDecimal("Digite o total de combustível gasto (em litros): ");

        Automovel automovel = new Automovel(distanciaPercorrida, combustivelGasto);

        Prompt.imprimir("Consumo médio do automóvel: " + automovel.calcularConsumoMedio() + " km/l");
    }
}
