package OOP.sobrecargaMetodos.testes;

import OOP.sobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 78, "Shounen");
        anime.imprimir();
    }
}
