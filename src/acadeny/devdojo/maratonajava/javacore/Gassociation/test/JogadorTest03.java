package acadeny.devdojo.maratonajava.javacore.Gassociation.test;

import acadeny.devdojo.maratonajava.javacore.Gassociation.domain.Jogador;
import acadeny.devdojo.maratonajava.javacore.Gassociation.domain.Team;

public class JogadorTest03 {
    public static void main(String[] args) {
        Team team =  new Team("Fluminense F.C");

        Jogador player = new Jogador("Ausgustin Cannobio");
        Jogador player1 = new Jogador("Hercules");
        Jogador player2 = new Jogador("Freytes");
        Jogador player3 = new Jogador("Pablo Baya");

        Jogador[] players = {player, player1, player2, player3};

        player.setTeam(team);
        player1.setTeam(team);
        player2.setTeam(team);
        player3.setTeam(team);

        team.setPlayers(players);

        team.print();
        player2.imprime();



    }
}
