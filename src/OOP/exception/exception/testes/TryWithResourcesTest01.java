package OOP.exception.exception.testes;

import OOP.exception.exception.dominio.Leitor1;
import OOP.exception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    static void main(String[] args) {

        lerArquivo();

    }

    // metodo clean para melhorar a legibilidade do código
    // é possivel criar varios objetos dentro do try, contanto que ele implemente de Closeable ou autoCloseable
    // dessa forma o java fecha automaticamente o arquivo só que da forma inversa.
    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitoe2 = new Leitor2();) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // metodo verboso para leitura de um arquivo
    public static void lerArquivos2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("Teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
