package acadeny.devdojo.maratonajava.javacore.Kenum.test;

import acadeny.devdojo.maratonajava.javacore.Kenum.domain.Client;
import acadeny.devdojo.maratonajava.javacore.Kenum.domain.ClientType;
import acadeny.devdojo.maratonajava.javacore.Kenum.domain.PaymentType;

public class ClienteTest {
    public static void main(String[] args) {
        Client client = new Client("Jorge Vaz", ClientType.NATURAL_PERSON, PaymentType.CREDIT);
        Client client2 = new Client("Pedro Amorim", ClientType.NATURAL_PERSON, PaymentType.DEBIT);


        client.print();
        System.out.println("-----");
        client2.print();

    }
}
