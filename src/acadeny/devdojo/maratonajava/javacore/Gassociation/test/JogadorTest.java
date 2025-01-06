package acadeny.devdojo.maratonajava.javacore.Gassociation.test;

import acadeny.devdojo.maratonajava.javacore.Gassociation.domain.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador player = new Jogador("Salah");
        Jogador player1 = new Jogador("Vini Jr");
        Jogador player2 = new Jogador("Rodri");
        Jogador[] players = {player, player1, player2};
        for (Jogador p:players){
            p.imprime();

        }
    }
}
