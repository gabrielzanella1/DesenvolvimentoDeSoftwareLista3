public class Exercicio18 {
    public static void executar(){
        String nome = Prompt.lerLinha("Digite o nome do funcionário: ");
        int idade = Prompt.lerInteiro("Digite a idade do funcionário: ");
        String sexo = Prompt.lerLinha("Digite o sexo do funcionário (M/F): ");
        double salarioFixo = Prompt.lerDecimal("Digite o salário fixo do funcionário: ");

        double abono = 0;
        if (sexo.equalsIgnoreCase("M") && idade >= 30) {
            abono = 100;
        } else if (sexo.equalsIgnoreCase("M") && idade < 30) {
            abono = 50;
        } else if (sexo.equalsIgnoreCase("F") && idade >= 30) {
            abono = 200;
        } else if (sexo.equalsIgnoreCase("F") && idade < 30) {
            abono = 80;
        } else {
            System.out.println("Sexo inválido. Abono será zero.");
        }

        double salarioLiquido = salarioFixo + abono;

        Prompt.linhaEmBranco();
        Prompt.imprimir("Nome do funcionário: " + nome);
        Prompt.imprimir("Salário líquido: R$ " + salarioLiquido);
    }
}
