package OOP.exception.exception.testes;

import OOP.exception.exception.dominio.Funcionario;
import OOP.exception.exception.dominio.LoginInvalidoException;
import OOP.exception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Funcionario funcionario1 = new Funcionario();

        try {
            funcionario1.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
