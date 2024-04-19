package br.edu.up.exercicios;

import br.edu.up.Prompt;
import br.edu.up.modelos.Triangulo;

public class Exercicio19 {
    public void Executar() {
        int lado1 = Prompt.lerInteiro("Informe o comprimento do lado 1: ");
        int lado2 = Prompt.lerInteiro("Informe o comprimento do lado 2: ");
        int lado3 = Prompt.lerInteiro("Informe o comprimento do lado 3: ");

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        String tipoTriangulo = triangulo.verificarTriangulo();

        Prompt.imprimir("Os lados informados formam um triângulo " + tipoTriangulo);
    }
}
