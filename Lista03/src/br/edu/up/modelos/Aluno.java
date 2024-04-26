package br.edu.up.modelos;

public class Aluno {
    private String Nome;
    private double Media;

    public double CalculaMedia(double nota1, double nota2, double nota3) {
        Media = ((nota1 + nota2 + nota3) / 3);
        return Media;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getMedia() {
        return Media;
    }
}
