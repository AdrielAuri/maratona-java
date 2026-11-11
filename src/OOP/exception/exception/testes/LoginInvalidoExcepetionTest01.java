package OOP.exception.exception.testes;

import OOP.exception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExcepetionTest01 {
    static void main(String[] args) {

        try {
            logar();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner leitura = new Scanner(System.in);
        String userDB = "Goku";
        String passwordDB = "ssj";

        System.out.println("Usuario");
        String userDigitado = leitura.nextLine();
        System.out.println("Senha");
        String passwordDigitado = leitura.nextLine();

        if (!userDB.equals(userDigitado) || !passwordDB.equals(passwordDigitado)) {
            throw new LoginInvalidoException("User & Password Invalid");
        }
        System.out.println("User logged in sucessfully");
    }
}
