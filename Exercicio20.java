public class Exercicio20 {
    public static void executar(){
        String nome = Prompt.lerLinha("Digite o nome do professor: ");
        int nivel = Prompt.lerInteiro("Digite o nível do professor (1, 2 ou 3): ");
        int horasAula = Prompt.lerInteiro("Digite a quantidade de horas/aula dadas: ");

        double valorHoraAula;

        if (nivel == 1) {
            valorHoraAula = 12.00;
        } else if (nivel == 2) {
            valorHoraAula = 17.00;
        } else if (nivel == 3) {
            valorHoraAula = 25.00;
        } else {
            valorHoraAula = 0.00;
            System.out.println("Nível inválido. Valor da hora/aula será zero.");
        }

        double salario = horasAula * valorHoraAula;

        Prompt.linhaEmBranco();
        Prompt.imprimir("Nome do professor: " + nome);
        Prompt.imprimir("Salário: R$ " + salario);
    }
}
