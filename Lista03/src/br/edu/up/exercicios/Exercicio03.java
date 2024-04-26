package br.edu.up.exercicios;

import br.edu.up.modelos.Vendedor;

public class Exercicio03 {
    public void Executar() {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Paulo Ricardo"); 
        vendedor.setSalario(10000); 
        vendedor.setTotalVendas(100000);

        double venda = vendedor.CalculaSalario();
        System.out.println(venda);
    }
}
