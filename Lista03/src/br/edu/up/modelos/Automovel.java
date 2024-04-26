package br.edu.up.modelos;

public class Automovel {
    private int DistanciaPercorrida;
    private double CombustivelGasto;

    public double CalculaConsumo() {
        return this.DistanciaPercorrida / this.CombustivelGasto;
    }

    public int getDistanciaPercorrida() {
        return DistanciaPercorrida;
    }

    public void setDistanciaPercorrida(int distanciaPercorrida) {
        DistanciaPercorrida = distanciaPercorrida;
    }

    public double getCombustivelGasto() {
        return CombustivelGasto;
    }

    public void setCombustivelGasto(double combustivelGasto) {
        CombustivelGasto = combustivelGasto;
    }
}
