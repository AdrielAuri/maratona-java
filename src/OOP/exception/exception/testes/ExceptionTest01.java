package OOP.exception.exception.testes;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    static void main(String[] args) {

        criarNovoArquivo();

    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\test.txt");
        try { // Tente rodar isso
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado com sucesso (" + isCriado + ")");
        }catch (IOException e){ // Caso contrário rode isso
            e.printStackTrace();
        }// o catch nunca pode ficar vazio e nunca pode ter uma regra de negocio dentro dele
    }
}
