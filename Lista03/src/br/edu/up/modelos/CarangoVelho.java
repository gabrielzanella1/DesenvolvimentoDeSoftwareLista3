package br.edu.up.modelos;

public class CarangoVelho {
    private int ano;

    public CarangoVelho(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double calcularDesconto() {
        if (ano <= 2000) {
            return 0.12;
        } else {
            return 0.07;
        }
    }
}
