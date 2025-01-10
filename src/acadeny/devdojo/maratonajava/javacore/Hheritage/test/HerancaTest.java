package acadeny.devdojo.maratonajava.javacore.Hheritage.test;

import acadeny.devdojo.maratonajava.javacore.Hheritage.domain.Address;
import acadeny.devdojo.maratonajava.javacore.Hheritage.domain.Employee;
import acadeny.devdojo.maratonajava.javacore.Hheritage.domain.Person;

public class HerancaTest {
    public static void main(String[] args) {
        Address address = new Address();
        address.setCep("553-32");
        address.setRua("Rua Vinte");

        Person person = new Person("Jorge", "223.445.768-90");
        person.setAddress(address);

        Employee employee = new Employee("Felipe","227.413.889-05", 2000);
        employee.setAddress(address);



        person.print();
        System.out.println("---------");
        employee.print();
        System.out.println("---------");
        employee.paymentRelatory();
    }

}
