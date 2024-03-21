public class Exercicio21 {
    public static void executar(){
        int idade = Prompt.lerInteiro("Digite a idade do nadador: ");

        String categoria = "";

        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B";
        } else if (idade >= 18 && idade <= 25) {
            categoria = "Sênior";
        } else {
            categoria = "Idade fora da faixa etária";
        }

        Prompt.linhaEmBranco();
        Prompt.imprimir("Categoria do nadador: " + categoria);
    }
}
