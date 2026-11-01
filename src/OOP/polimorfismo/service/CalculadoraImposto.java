package OOP.polimorfismo.service;

import OOP.polimorfismo.dominio.Produto;

public class CalculadoraImposto {

    // Ao invés de passar as subclasses como argumento, passa a super classe que automaticamente todas as filhas poderão usar
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
