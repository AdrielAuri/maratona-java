package OOP.polimorfismo.testes;

import OOP.polimorfismo.dominio.Computador;
import OOP.polimorfismo.dominio.Produto;
import OOP.polimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    static void main(String[] args) {
        Produto produto = new Computador("Ryzen", 3500);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("===============");

        Produto produto2 = new Tomate("Vermelho", 100);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());



    }
}
