public class Exercicio20 {
    public static void executar(){
        int nivel = Prompt.lerInteiro("Informe o nível do professor (1, 2 ou 3): ");
        int horasAula = Prompt.lerInteiro("Informe a quantidade de horas/aula dadas pelo professor: ");

        Professor professor = new Professor(nivel);
        double salario = professor.calcularSalario(horasAula);

        Prompt.imprimir("O salário do professor é R$ " + salario);
    }
}
