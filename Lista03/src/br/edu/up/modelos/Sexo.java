package br.edu.up.modelos;

public class Sexo {
    public static String verificarSexo(char sexo) {
        if (sexo == 'M' || sexo == 'm') {
            return "Homem";
        } else if (sexo == 'F' || sexo == 'f') {
            return "Mulher";
        } else {
            return "Sexo inválido";
        }
    }
}
