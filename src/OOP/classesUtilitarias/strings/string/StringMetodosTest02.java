package OOP.classesUtilitarias.strings.string;

import java.util.Locale;

public class StringMetodosTest02 {
    static void main(String[] args) {
        String nome1 = "Goku";
        String numeros = "012345";

        System.out.println(nome1.charAt(0)); // Faz uma busca por caractere baseado no indice
        System.out.println(nome1.length()); // metodo para saber o tamanho de um array ou string
        System.out.println(nome1.replace("G", "J")); // troca todos os caracteres da primeira posição pela segunda
        System.out.println(nome1.toLowerCase()); // transforma toda string em minusculo
        System.out.println(nome1.toUpperCase()); // transforma toda string em maiusculo
        System.out.println(numeros.substring(0, 4)); // mostra uma certa quantidade de caracteres baseado nos dois indices informados (inicio e fim) sendo que fim é sempre um numero a menos
        System.out.println(nome1.trim()); // Remove os valores em branco que tem n começo e fim de de uma variavel.

    }
}
