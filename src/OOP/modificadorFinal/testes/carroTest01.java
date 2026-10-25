package OOP.modificadorFinal.testes;

import OOP.modificadorFinal.dominio.Carro;

public class carroTest01 {
    static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("Ford");


        System.out.println(carro);
        System.out.println("Velocidade máxima = " + Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Auri");
        System.out.println(carro.COMPRADOR);
    }
}
