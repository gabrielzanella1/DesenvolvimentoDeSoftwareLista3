public class Exercicio17 {
    public static void executar(){
        String nome = Prompt.lerLinha("Digite o nome do funcionário: ");
        double salarioAtual = Prompt.lerDecimal("Digite o salário do funcionário: ");

        double novoSalario = salarioAtual * 1.10; 
        double reajuste = novoSalario - salarioAtual;

        Prompt.linhaEmBranco();
        Prompt.imprimir("Nome do funcionário: " + nome);
        Prompt.imprimir("Reajuste concedido: R$ " + reajuste);
        Prompt.imprimir("Novo salário: R$ " + novoSalario);
    }
}

