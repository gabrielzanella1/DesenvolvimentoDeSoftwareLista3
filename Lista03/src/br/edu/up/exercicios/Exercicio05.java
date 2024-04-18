package br.edu.up.exercicios;
import br.edu.up.Prompt;
import br.edu.up.modelos.MamaoComAcucar;

public class Exercicio05 {
    public void Executar() {
        double valorCompra = Prompt.lerDecimal("Digite o valor da compra: ");

        double valorPrestacao = MamaoComAcucar.calcularPrestacoes(valorCompra);

        Prompt.imprimir("Valor das prestaçoes: R$ " + valorPrestacao);
    }
}
