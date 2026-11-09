package OOP.exception.exception.testes;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\test.txt");
        try { // Tente rodar isso
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado com sucesso (" + isCriado + ")");
        } catch (IOException e) { // Caso contrário rode isso
            e.printStackTrace();
            throw e;
        }// o catch nunca pode ficar vazio e nunca pode ter uma regra de negocio dentro dele
    }
}
