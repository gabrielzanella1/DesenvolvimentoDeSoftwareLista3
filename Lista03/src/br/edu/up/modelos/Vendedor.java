package br.edu.up.modelos;

public class Vendedor {
    private String Nome;
    private double Salario;
    private double TotalVendas;

    public double CalculaSalario() {
        return (TotalVendas * 0.15) + Salario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public double getTotalVendas() {
        return TotalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        TotalVendas = totalVendas;
    }
}