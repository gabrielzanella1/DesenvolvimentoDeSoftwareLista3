package br.edu.up.modelos;

public class Vendedor {
    public String Nome;
    public double Salario;
    public double TotalVendas;

    public double CalculaSalario() {
        return (TotalVendas * 0.15) + Salario;
    }
}