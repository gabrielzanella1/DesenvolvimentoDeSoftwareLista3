package br.edu.up.exercicios;

import br.edu.up.modelos.Automovel;

public class Exercicio02 {
    public void Executar() {
        Automovel automovel = new Automovel();
        automovel.setDistanciaPercorrida(110); 
        automovel.setCombustivelGasto(8.5);

        double consumo = automovel.CalculaConsumo();
        System.out.println(consumo);
    }
}
