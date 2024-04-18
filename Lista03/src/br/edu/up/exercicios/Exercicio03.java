package br.edu.up.exercicios;

import br.edu.up.modelos.Vendedor;

public class Exercicio03 {
    public void Executar() {
        Vendedor vendedor = new Vendedor();
        vendedor.Nome = "Paulo Ricardo";
        vendedor.Salario = 10000;
        vendedor.TotalVendas = 100000;

        double venda = vendedor.CalculaSalario();
        System.out.println(venda);
    }
}
