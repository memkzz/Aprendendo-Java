package acadeny.devdojo.maratonajava.javacore.Hheritage.test;

import acadeny.devdojo.maratonajava.javacore.Hheritage.domain.Address;
import acadeny.devdojo.maratonajava.javacore.Hheritage.domain.Employee;
import acadeny.devdojo.maratonajava.javacore.Hheritage.domain.Person;

public class HerancaTest {
    public static void main(String[] args) {
        Address address = new Address();
        address.setCep("553-32");
        address.setRua("Rua Vinte");

        Person person = new Person();
        person.setName("Jorge");
        person.setCpf("33322");
        person.setAddress(address);

        Employee employee = new Employee(2000);
        employee.setName("Felipe");
        employee.setCpf("223344");
        employee.setAddress(address);



        person.print();
        System.out.println("---------");
        employee.print();
    }

}
