package acadeny.devdojo.maratonajava.javacore.Kenum.test;

import acadeny.devdojo.maratonajava.javacore.Kenum.domain.Client;
import acadeny.devdojo.maratonajava.javacore.Kenum.domain.ClientType;

public class ClienteTest {
    public static void main(String[] args) {
        Client client = new Client("Jorge Vaz", ClientType.LEGAL_ENTITY);
        Client client2 = new Client("Pedro Amorim", ClientType.NATURAL_PERSON);
    }
}
