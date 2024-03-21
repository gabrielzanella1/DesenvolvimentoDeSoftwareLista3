public class Exercicio26 {
    public static void executar(){
        String nome = Prompt.lerLinha("Digite o nome do pretendente: ");
        int idade = Prompt.lerInteiro("Digite a idade do pretendente: ");
        int grupoRisco = Prompt.lerInteiro("Digite o grupo de risco (1 - baixo, 2 - médio, 3 - alto): ");

        String categoria;

        if (idade >= 17 && idade <= 20) {
            switch (grupoRisco) {
                case 1:
                    categoria = "Categoria 1";
                    break;
                case 2:
                    categoria = "Categoria 2";
                    break;
                case 3:
                    categoria = "Categoria 3";
                    break;
                default:
                    categoria = "Pessoa não enquadrada em nenhuma categoria";
                    break;
            }
        } else if (idade >= 21 && idade <= 24) {
            switch (grupoRisco) {
                case 2:
                    categoria = "Categoria 2";
                    break;
                case 3:
                    categoria = "Categoria 3";
                    break;
                case 4:
                    categoria = "Categoria 4";
                    break;
                default:
                    categoria = "Pessoa não enquadrada em nenhuma categoria";
                    break;
            }
        } else if (idade >= 25 && idade <= 34) {
            switch (grupoRisco) {
                case 3:
                    categoria = "Categoria 3";
                    break;
                case 4:
                    categoria = "Categoria 4";
                    break;
                case 5:
                    categoria = "Categoria 5";
                    break;
                default:
                    categoria = "Pessoa não enquadrada em nenhuma categoria";
                    break;
            }
        } else if (idade >= 35 && idade <= 64) {
            switch (grupoRisco) {
                case 4:
                    categoria = "Categoria 4";
                    break;
                case 5:
                    categoria = "Categoria 5";
                    break;
                case 6:
                    categoria = "Categoria 6";
                    break;
                default:
                    categoria = "Pessoa não enquadrada em nenhuma categoria";
                    break;
            }
        } else if (idade >= 65 && idade <= 70) {
            switch (grupoRisco) {
                case 7:
                    categoria = "Categoria 7";
                    break;
                case 8:
                    categoria = "Categoria 8";
                    break;
                case 9:
                    categoria = "Categoria 9";
                    break;
                default:
                    categoria = "Pessoa não enquadrada em nenhuma categoria";
                    break;
            }
        } else {
            categoria = "Pessoa não enquadrada em nenhuma categoria";
        }

        Prompt.linhaEmBranco();
        Prompt.imprimir("Nome do pretendente: " + nome);
        Prompt.imprimir("Idade: " + idade);
        Prompt.imprimir("Categoria: " + categoria);
    }
}
