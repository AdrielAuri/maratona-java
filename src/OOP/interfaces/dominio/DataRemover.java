package OOP.interfaces.dominio;

public interface DataRemover {
    void remove();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissão");
    }

}
