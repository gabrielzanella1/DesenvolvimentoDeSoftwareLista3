public class Intervalo {
    public static int lerNumerosNoIntervalo() {
        int quantidadeNumerosNoIntervalo = 0;
        for (int i = 0; i < 80; i++) {
            int numero = Prompt.lerInteiro("Informe o " + (i + 1) + "º número: ");
            if (numero >= 10 && numero <= 150) {
                quantidadeNumerosNoIntervalo++;
            }
        }
        return quantidadeNumerosNoIntervalo;
    }
}

