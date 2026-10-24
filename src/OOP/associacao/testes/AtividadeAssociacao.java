package OOP.associacao.testes;

import OOP.associacao.dominio.Aluno;
import OOP.associacao.dominio.Local;
import OOP.associacao.dominio.Professor;
import OOP.associacao.dominio.Seminario;

public class AtividadeAssociacao {
    static void main(String[] args) {

        Professor professor = new Professor("Adriel", "Música");
        Aluno aluno1 = new Aluno("Barbara", 35);
        Aluno aluno2 = new Aluno("Nando Reis", 48);
        Aluno[] alunosSeminarios = {aluno1, aluno2};
        Local local = new Local("Brasília");
        Seminario seminario = new Seminario("Aprendendo Música", alunosSeminarios, local);
        Seminario[] seminariosProfessor = {seminario};
        professor.setSeminarios(seminariosProfessor);

        professor.imprime();

    }
}
