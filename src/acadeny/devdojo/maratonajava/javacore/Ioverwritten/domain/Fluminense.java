package acadeny.devdojo.maratonajava.javacore.Ioverwritten.domain;

public class Fluminense {
    private String capitain;

    public Fluminense(String capitain) {
        this.capitain = capitain;
    }

    @Override
    public String toString() {
        return "Fluminense{" +
                "capitain='" + capitain + '\'' +
                '}';
    }

    public String getCapitain() {
        return capitain;
    }

    public void setCapitain(String capitain) {
        this.capitain = capitain;
    }
}
