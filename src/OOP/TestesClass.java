package OOP;

import OOP.classes.dominio.Car;
import OOP.classes.dominio.Pessoa;

public class TestesClass {
    static void main(String[] args) {

//        Pessoa adriel = new Pessoa();
//
//        adriel.idade = 21;
//        adriel.nome = "Adriel";
//        adriel.sexo = 'M';

        Car mercedes = new Car();
        Car nissan = new Car();

        mercedes.nome = "s25";
        mercedes.model = "sedan";
        mercedes.year = 2005;

        nissan.nome = "350z";
        nissan.model = "sedan";
        nissan.year = 1998;

        System.out.println(mercedes.nome);
        System.out.println(mercedes.year);
        System.out.println(mercedes.model);

        System.out.println(nissan.nome);
        System.out.println(nissan.model);
        System.out.println(nissan.year);






    }
}
