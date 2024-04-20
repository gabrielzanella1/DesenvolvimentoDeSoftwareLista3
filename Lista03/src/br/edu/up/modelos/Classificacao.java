package br.edu.up.modelos;

import br.edu.up.Prompt;

public class Classificacao {
    private String nomeEstudante;
    private int numeroMatricula;
    private double notaLaboratorio;
    private double notaAvaliacaoSemestral;
    private double notaExameFinal;

    public Classificacao(String nomeEstudante, int numeroMatricula, double notaLaboratorio,
            double notaAvaliacaoSemestral, double notaExameFinal) {
        this.nomeEstudante = nomeEstudante;
        this.numeroMatricula = numeroMatricula;
        this.notaLaboratorio = notaLaboratorio;
        this.notaAvaliacaoSemestral = notaAvaliacaoSemestral;
        this.notaExameFinal = notaExameFinal;
    }

    public double calcularMediaFinal() {
        double mediaFinal = (notaLaboratorio * 2 + notaAvaliacaoSemestral * 3 + notaExameFinal * 5) / 10;
        return mediaFinal;
    }

    public String classificarEstudante() {
        double mediaFinal = calcularMediaFinal();
        if (mediaFinal >= 8) {
            return "A";
        } else if (mediaFinal >= 7) {
            return "B";
        } else if (mediaFinal >= 6) {
            return "C";
        } else if (mediaFinal >= 5) {
            return "D";
        } else {
            return "R";
        }
    }

    public void imprimirInformacoes() {
        double mediaFinal = calcularMediaFinal();
        String classificacao = classificarEstudante();
        Prompt.imprimir("Nome: " + nomeEstudante);
        Prompt.imprimir("Número de Matrícula: " + numeroMatricula);
        Prompt.imprimir("Nota Final: " + mediaFinal);
        Prompt.imprimir("Classificação: " + classificacao);
    }
}