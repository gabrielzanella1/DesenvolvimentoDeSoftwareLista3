public class Exercicio19 {
    public static void executar(){
        int lado1 = Prompt.lerInteiro("Digite o primeiro lado do triângulo: ");
        int lado2 = Prompt.lerInteiro("Digite o segundo lado do triângulo: ");
        int lado3 = Prompt.lerInteiro("Digite o terceiro lado do triângulo: ");

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                Prompt.imprimir("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                Prompt.imprimir("Triângulo Isósceles");
            } else {
                Prompt.imprimir("Triângulo Escaleno");
            }
        } else {
            Prompt.imprimir("Os valores informados não formam um triângulo.");
        }
    }
}