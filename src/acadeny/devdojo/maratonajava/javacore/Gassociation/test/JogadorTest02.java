package acadeny.devdojo.maratonajava.javacore.Gassociation.test;

import acadeny.devdojo.maratonajava.javacore.Gassociation.domain.Jogador;
import acadeny.devdojo.maratonajava.javacore.Gassociation.domain.Team;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador player = new Jogador("Augostin Cannobio");
        Team team = new Team("Fluminense F.C");
        player.setTeam(team);
        player.imprime();
    }
}
