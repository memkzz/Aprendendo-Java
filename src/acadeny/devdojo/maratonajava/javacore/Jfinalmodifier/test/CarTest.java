package acadeny.devdojo.maratonajava.javacore.Jfinalmodifier.test;

import acadeny.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Buyer;
import acadeny.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Car;
import acadeny.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Lancer;

import java.awt.*;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.BUYER.setName("Fravio");

        Lancer lancer = new Lancer();
        lancer.setName("Emerson");
        lancer.print();
        System.out.println(Car.MAXIMUM_SPEED);
        System.out.println(car.BUYER);


    }
}
