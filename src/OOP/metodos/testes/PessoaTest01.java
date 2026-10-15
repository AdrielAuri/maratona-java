package OOP.metodos.testes;

import OOP.metodos.dominio.Pessoa;

public class PessoaTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Adriel");
        pessoa.setIdade(28);

        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
