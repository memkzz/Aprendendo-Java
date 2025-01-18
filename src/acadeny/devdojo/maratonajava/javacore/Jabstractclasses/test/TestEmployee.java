package acadeny.devdojo.maratonajava.javacore.Jabstractclasses.test;

import acadeny.devdojo.maratonajava.javacore.Jabstractclasses.domain.Develover;
import acadeny.devdojo.maratonajava.javacore.Jabstractclasses.domain.Employee;
import acadeny.devdojo.maratonajava.javacore.Jabstractclasses.domain.Manager;

public class TestEmployee {
    public static void main(String[] args) {
        Manager manager = new Manager("Jorge Devans", 12300);
        Develover dev = new Develover("Dev Memkzz", 3200);
        System.out.println(manager);
        System.out.println(dev);
    }
}
