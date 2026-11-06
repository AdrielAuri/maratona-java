package OOP.exception.testes;

public class StackOverFlowTest01 {
    static void main(String[] args) {
        recursividade();
    }
    // Esse tipo de erro acontece quando a memoria é estourada por conta da repetição do metodo
    public static void recursividade(){
        recursividade();
    }
}
