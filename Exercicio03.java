public class Exercicio03 {
    public static void executar(){
        String nome = Prompt.lerLinha("Informe o nome do vendedor: ");
        double salario = Prompt.lerDecimal("Informe o salário Fixo do vendedor " + nome + ":");
        double vendas = Prompt.lerDecimal("Informe o total de vendas mensal: ");

        double comissao = vendas * 0.15;

        Prompt.imprimir("O vendedor " + nome + " tem um salário fixo de: " + salario + " e seu salário total será: " + (comissao + salario));
    }
}
