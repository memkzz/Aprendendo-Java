package acadeny.devdojo.maratonajava.javacore.Gassociation.domain;

public class Jogador {
    private String name;

    public Jogador(String name) {
        this.name = name;
    }

    public void imprime() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
