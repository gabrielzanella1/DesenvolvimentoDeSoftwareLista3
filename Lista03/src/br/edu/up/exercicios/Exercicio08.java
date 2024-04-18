package br.edu.up.exercicios;

import br.edu.up.Prompt;
import br.edu.up.modelos.Aluno2;


public class Exercicio08 {
    public void Executar(){
        String nome = Prompt.lerLinha("Informe o nome do aluno: ");
        double nota1 = Prompt.lerDecimal("Informe a primeira nota: ");
        double nota2 = Prompt.lerDecimal("Informe a segunda nota: ");
        double nota3 = Prompt.lerDecimal("Informe a terceira nota: ");

        Aluno2 aluno = new Aluno2(nome, nota1, nota2, nota3);
        double media = aluno.calcularMedia();
        String mencao = aluno.calcularResultado();

        Prompt.imprimir("Nome do aluno: " + nome);
        Prompt.imprimir("Média: " + media);
        Prompt.imprimir("Resultado: " + mencao);
    }
}
