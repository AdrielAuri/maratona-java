package OOP.interfaces.dominio;

// Nãoo existe limite para implementação de interfaces em uma classe.
public class DatabaseLoader implements DataLoader, DataRemover {
    // Private -> Default -> Protected -> Public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Recomendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        DataRemover.super.checkPermission();
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na classe DataBaseLoader");
    }
}
