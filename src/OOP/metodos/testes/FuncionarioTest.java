package OOP.metodos.testes;

import OOP.metodos.dominio.Funcionario;

public class FuncionarioTest {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Adriel";
        funcionario.idade = 28;
        funcionario.salarios = new double[]{750, 1000, 380};

        funcionario.imprimirDados();
        funcionario.mediaSalarios();
    }
}
