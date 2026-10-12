package OOP.metodos.testes;

import OOP.metodos.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resul = calculadora.divideDoisNumeros(50, 2);
        System.out.println(resul);
    }
}
