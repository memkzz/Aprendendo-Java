package acadeny.devdojo.maratonajava.javacore.Kenum.domain;

public class Client {
    private String name;
    private ClientType typeCliente;


    public Client(String name, ClientType typeCliente) {
        this.name = name;
        this.typeCliente = typeCliente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
