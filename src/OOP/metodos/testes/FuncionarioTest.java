package OOP.metodos.testes;

import OOP.metodos.dominio.Funcionario;

public class FuncionarioTest {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Adriel");
        funcionario.setIdade(28);
        funcionario.setSalarios(new double[]{750, 1000, 380});
        funcionario.imprimirDados();
    }
}
