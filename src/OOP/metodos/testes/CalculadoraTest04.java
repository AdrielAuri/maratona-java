package OOP.metodos.testes;

import OOP.metodos.dominio.Calculadora;

public class CalculadoraTest04 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);

        calculadora.somaVarArgs(1,2,3,4,5);

    }
}
