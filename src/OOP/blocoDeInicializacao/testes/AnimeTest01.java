package OOP.blocoDeInicializacao.testes;

import OOP.blocoDeInicializacao.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime("Bleach");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");

        }


    }

}
