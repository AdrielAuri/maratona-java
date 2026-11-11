package OOP.classesUtilitarias.strings.string;

public class StringTest01 {
    static void main(String[] args) {

        // Strings são imutaveis, tomar cuidado ao associar um novo valor a esse tipo de variavel
        String nome1 = "Adriel";
        String nome2 = "Adriel";

        // aqui você está checando a referencia da variavel se é o mesmo na string pool
        System.out.println(nome1 == nome2);

    }
}
