package acadeny.devdojo.maratonajava.javacore.Jabstractclasses.domain;

public class Develover extends Employee{
    public Develover(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Develover{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
