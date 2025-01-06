package acadeny.devdojo.maratonajava.javacore.Gassociation.domain;

public class Team {
    private String name;
    private Jogador[] players;

    public Team(String name) {
        this.name = name;
    }
    public Team(String name, Jogador[] players) {
        this.name = name;
        this.players = players;
    }

    public void print(){
        System.out.println("Team: "+this.name);
        if (players == null) return;
        System.out.println("NOVOS REFORÇOS!");
        for (Jogador player: players){
            System.out.println("Contratado: "+player.getName());
        }
    }

    public Jogador[] getPlayers() {
        return players;
    }

    public void setPlayers(Jogador[] players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
