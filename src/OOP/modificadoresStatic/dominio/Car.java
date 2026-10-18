package OOP.modificadoresStatic.dominio;

public class Car {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;
    //modificador static serve para alterar diretamente um valor em todo objeto criado quando esse valor é alterado
    //em alguma instancia que ja foi iniciada

    public Car(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeLimite = velocidadeLimite;
    }

    public void imprime(){
        System.out.println("=================");
        System.out.println("Modelo" + this.nome);
        System.out.println("Velocidade máxima:" + this.velocidadeMaxima);
        System.out.println("Velocidade limite:" + Car.velocidadeLimite);
    }

    //É recomendado usar o static quando um metodo não estiver usando uma variavel da instancia
    public static void setVelocidadeLimite(double velocidadeLimite){
        Car.velocidadeLimite = velocidadeLimite;
    }
    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
