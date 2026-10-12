package OOP.metodos.testes;

import OOP.metodos.dominio.Calculadora;

public class CalculadoraTest01 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("=====================");
        calculadora.subtraiDoisNumeros();
    }
}
