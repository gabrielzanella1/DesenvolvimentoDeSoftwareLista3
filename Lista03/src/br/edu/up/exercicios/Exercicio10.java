package br.edu.up.exercicios;

import br.edu.up.Prompt;
import br.edu.up.modelos.Maioridade;

public class Exercicio10 {
    public void Executar() {
        int numeroPessoas = Prompt.lerInteiro("Informe o número de pessoas: ");

        for (int i = 0; i < numeroPessoas; i++) {
            int idade = Prompt.lerInteiro("Informe a idade da pessoa " + (i + 1) + ": ");
            String mensagem = Maioridade.verificarMaioridade(idade);
            Prompt.imprimir("Pessoa " + (i + 1) + ": " + mensagem);
        }
    }
}
