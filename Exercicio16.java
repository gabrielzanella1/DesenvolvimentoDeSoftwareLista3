public class Exercicio16 {
    public static void executar(){
        double salarioMinimo = 1300.00; 
        int totalFuncionarios = 584;
        double totalReajuste = 0;

        for (int i = 0; i < totalFuncionarios; i++) {
            double salarioAtual = Prompt.lerDecimal("Digite o salário do funcionário " + (i + 1) + ": ");
            double novoSalario;

            if (salarioAtual < 3 * salarioMinimo) {
                novoSalario = salarioAtual * 1.5; 
            } else if (salarioAtual >= 3 * salarioMinimo && salarioAtual <= 10 * salarioMinimo) {
                novoSalario = salarioAtual * 1.2; 
            } else if (salarioAtual > 10 * salarioMinimo && salarioAtual <= 20 * salarioMinimo) {
                novoSalario = salarioAtual * 1.15; 
            } else {
                novoSalario = salarioAtual * 1.1; 
            }

            double reajuste = novoSalario - salarioAtual;
            totalReajuste += reajuste;

            Prompt.imprimir("Salário atual do funcionário: R$ " + salarioAtual);
            Prompt.imprimir("Novo salário do funcionário: R$ " + novoSalario);
            Prompt.imprimir("Reajuste concedido: R$ " + reajuste);
            Prompt.linhaEmBranco();
        }

        Prompt.imprimir("Total de reajuste concedido: R$ " + totalReajuste);
    }
}   
