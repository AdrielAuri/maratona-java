package OOP.heranca.testes;

import OOP.heranca.dominio.Endereco;
import OOP.heranca.dominio.Funcionario;
import OOP.heranca.dominio.Pessoa;

public class HerancaTest01 {
    static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("São gervásio");
        endereco.setCep("40000-265");
        Pessoa pessoa = new Pessoa("Adriel");
        pessoa.setCpf("11111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("=============");

        Funcionario funcionario = new Funcionario("Lucas");
        funcionario.setCpf("5555555555");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(5000);

        funcionario.imprime();

    }
}
