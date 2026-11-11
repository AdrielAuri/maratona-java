package OOP.exception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {

    // nao é possivel lançar uma exceção mais generica ou checked como o exception no throws quando se esta sobrescrevendo
    // também não pode declarar uma exceção checked que não foi declarada no metodo original
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando Funcionario");
    }
}
