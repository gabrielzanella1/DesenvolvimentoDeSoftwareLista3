package br.edu.up.exercicios;

import br.edu.up.modelos.Aluno;

public class Exercicio01 {
    public void Executar() {
        Aluno aluno = new Aluno();
        aluno.Nome = "Gabriel";

        double media = aluno.CalculaMedia(10, 7, 5.5);
        System.out.println(media);
    }
}
