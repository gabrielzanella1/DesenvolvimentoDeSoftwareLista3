import java.util.Scanner;

public class Exercicio03 {
    public static void executar() {
        Prompt.imprimir("Digite o nome do vendedor: ");
        String nome = Prompt.lerLinha();

        Prompt.imprimir("Digite o salário fixo do vendedor: ");
        double salarioFixo = Prompt.lerDecimal();

        Prompt.imprimir("Digite o total de vendas do vendedor: ");
        double totalVendas = Prompt.lerDecimal();

        Vendedor vendedor = new Vendedor(nome, salarioFixo, totalVendas);

        Prompt.imprimir("Nome do vendedor: " + vendedor.getNome());
        Prompt.imprimir("Salário fixo: R$ " + vendedor.getSalarioFixo());
        Prompt.imprimir("Salário final: R$ " + vendedor.calcularSalarioFinal());
    }
}
