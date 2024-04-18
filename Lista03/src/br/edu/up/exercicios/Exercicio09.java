package br.edu.up.exercicios;

import br.edu.up.modelos.Intervalo;
import br.edu.up.Prompt;

public class Exercicio09 {
    public void Executar(){
        int quantidadeNumerosNoIntervalo = Intervalo.lerNumerosNoIntervalo();

        Prompt.imprimir("Quantidade de números no intervalo entre 10 e 150: " + quantidadeNumerosNoIntervalo);
    }
}
