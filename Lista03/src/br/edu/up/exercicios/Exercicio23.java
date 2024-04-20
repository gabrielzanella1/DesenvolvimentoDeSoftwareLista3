package br.edu.up.exercicios;

import br.edu.up.modelos.*;
import br.edu.up.Prompt;

public class Exercicio23 {
    public void Executar() {
        String nome = Prompt.lerLinha("Digite o nome: ");
        String sexo = Prompt.lerLinha("Digite o sexo (M - Masculino, F - Feminino): ");
        double altura = Prompt.lerDecimal("Digite a altura (em metros): ");
        int idade = Prompt.lerInteiro("Digite a idade: ");

        double pesoIdeal = 0;

        if (sexo.equalsIgnoreCase("M")) {
            if (altura > 1.70) {
                if (idade <= 20) {
                    pesoIdeal = (72.7 * altura) - 58;
                } else if (idade >= 21 && idade <= 39) {
                    pesoIdeal = (72.7 * altura) - 53;
                } else {
                    pesoIdeal = (72.7 * altura) - 45;
                }
            } else {
                if (idade < 40) {
                    pesoIdeal = (72.7 * altura) - 50;
                } else {
                    pesoIdeal = (72.7 * altura) - 58;
                }
            }
        } else if (sexo.equalsIgnoreCase("F")) {
            if (altura > 1.50) {
                pesoIdeal = (62.1 * altura) - 44.7;
            } else if (altura <= 1.50) {
                if (idade >= 35) {
                    pesoIdeal = (62.1 * altura) - 45;
                } else {
                    pesoIdeal = (62.1 * altura) - 49;
                }
            }
        } else {
            Prompt.imprimir("Sexo inválido.");
            return;
        }

        Prompt.linhaEmBranco();
        Prompt.imprimir("Nome: " + nome);
        Prompt.imprimir("Peso ideal: " + pesoIdeal);
    }
}
