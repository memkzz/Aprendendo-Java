package acadeny.devdojo.maratonajava.javacore.Gassociation.domain;

public class Jogador {
    private String name;
    private Team team;

    public Jogador(String name) {
        this.name = name;
    }

    public void imprime() {
        System.out.println(this.name);
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
