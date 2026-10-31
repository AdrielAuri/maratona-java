package OOP.interfaces.dominio;

// Interface são com contratos e foram criados para serem implementados e não instanciadas
// Todos os metodos nesse tipo de classe são public e abstrato, por isso não precisa colocar
// Também é possivel criar metodos concretos, não sendo necessario a implemenação

// Todos os atributos em uma interface são constantes

public interface DataLoader {
    void load();

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
