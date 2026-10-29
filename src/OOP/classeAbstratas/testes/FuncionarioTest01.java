package OOP.classeAbstratas.testes;

import OOP.classeAbstratas.dominio.Desenvolvedor;
import OOP.classeAbstratas.dominio.Gerente;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Gerente gerente = new Gerente("Sasa", 2000);
        Desenvolvedor dev = new Desenvolvedor("Adriel", 5000);
        System.out.println(gerente);
        System.out.println(dev);
    }
}
