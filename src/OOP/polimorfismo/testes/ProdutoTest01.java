package OOP.polimorfismo.testes;

import OOP.metodos.dominio.Calculadora;
import OOP.polimorfismo.dominio.Computador;
import OOP.polimorfismo.dominio.Televisao;
import OOP.polimorfismo.dominio.Tomate;
import OOP.polimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    static void main(String[] args) {
        Televisao televisao = new Televisao("Motorola", 8000);
        Computador computador = new Computador("Ryzen", 5000);
        Tomate tomate = new Tomate("Vermelho", 10);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("====================");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("=====================");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
