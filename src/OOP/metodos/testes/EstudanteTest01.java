package OOP.metodos.testes;

import OOP.metodos.dominio.Estudante;
import OOP.metodos.dominio.ImprimirEstudantes;

public class EstudanteTest01 {
    static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Adriel";
        estudante1.idade = 28;
        estudante1.sexo = 'M';

        estudante2.nome = "Babara";
        estudante2.idade = 35;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();



    }
}
