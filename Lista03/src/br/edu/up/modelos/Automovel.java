package br.edu.up.modelos;

public class Automovel {
    public int DistanciaPercorrida;
    public double CombustivelGasto;

    public double CalculaConsumo() {
        return this.DistanciaPercorrida / this.CombustivelGasto;
    }
}
