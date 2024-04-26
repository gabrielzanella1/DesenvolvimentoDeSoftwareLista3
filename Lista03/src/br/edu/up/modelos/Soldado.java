package br.edu.up.modelos;

public class Soldado {
    private String nome;
    private char sexo;
    private int idade;
    private boolean saude;

    public Soldado(String nome, char sexo, int idade, boolean saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isSaude() {
        return saude;
    }

    public void setSaude(boolean saude) {
        this.saude = saude;
    }

    public boolean estaAptoServicoMilitar() {
        return idade >= 18 && idade <= 45 && saude;
    }

    public char getSexo() {
        return sexo;
    }
}
