package br.edu.up.exercicios;

import br.edu.up.modelos.Nadador;
import br.edu.up.Prompt;

public class Exercicio21 {
    public void Executar() {
        int idade = Prompt.lerInteiro("Informe a idade do nadador: ");

        Nadador nadador = new Nadador(idade);
        String categoria = nadador.classificarCategoria();

        Prompt.imprimir("O nadador está na categoria: " + categoria);
    }
}
