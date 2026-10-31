package OOP.interfaces.testes;

import OOP.interfaces.dominio.DataLoader;
import OOP.interfaces.dominio.DatabaseLoader;
import OOP.interfaces.dominio.FileLoader;

public class DataLoaderTest {
    static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DatabaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();

    }
}
