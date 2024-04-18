package br.edu.up.modelos;

public class Aluno {
    public String Nome;
    public double Media;

    public double CalculaMedia(double nota1, double nota2, double nota3) {
        Media = ((nota1 + nota2 + nota3) / 3);
        return Media;
    }
}
