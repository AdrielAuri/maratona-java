package OOP.modificadoresStatic.testes;

import OOP.modificadoresStatic.dominio.Car;

public class CarTest01 {
    static void main(String[] args) {
        Car carro1 = new Car("Mazda RX-8 ", 270);
        Car carro2 = new Car("Nissan 350z ", 280);
        Car carro3 = new Car("Toyota Supra ", 350);

        Car.setVelocidadeLimite(180);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
