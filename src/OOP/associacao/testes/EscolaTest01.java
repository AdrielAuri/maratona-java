package OOP.associacao.testes;


import OOP.associacao.dominio.Escola;
import OOP.associacao.dominio.Professor;

public class EscolaTest01 {
    static void main(String[] args) {
        Professor professor1 = new Professor("Adriel");
        Professor professor2 = new Professor("Barbara");

        //Atributo professor da classe Escola associando os objetos criados a partir da classe professor
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);
        escola.imprime();


    }
}
