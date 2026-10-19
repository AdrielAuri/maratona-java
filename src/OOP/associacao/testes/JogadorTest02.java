package OOP.associacao.testes;

import OOP.associacao.dominio.Jogador;
import OOP.associacao.dominio.Time;


public class JogadorTest02 {
    static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        // Terceiro
        jogador.setTime(time);
        jogador.imprime();
    }
}
