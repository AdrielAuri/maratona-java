package OOP.associacao.testes;

import OOP.associacao.dominio.Jogador;
import OOP.associacao.dominio.Time;

public class JogadorTest03 {
    static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Cafú");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("=== Jogador ===");
        jogador.imprime();
        System.out.println("=== Time ===");
        time.imprime();
    }
}
