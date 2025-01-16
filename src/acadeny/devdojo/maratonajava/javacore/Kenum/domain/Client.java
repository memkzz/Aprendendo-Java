package acadeny.devdojo.maratonajava.javacore.Kenum.domain;

public class Client {
    private String name;
    private ClientType typeCliente;
    private PaymentType paymentType;

    public Client(String name, ClientType typeCliente, PaymentType paymentType) {
        this.name = name;
        this.typeCliente = typeCliente;
        this.paymentType = paymentType;
    }

    public Client(String name, ClientType typeCliente) {
        this.name = name;
        this.typeCliente = typeCliente;
    }

    public void print(){
        System.out.println("Name: "+this.name);
        System.out.println("Client Type: "+typeCliente);
        System.out.println("Payment Form: "+paymentType);
        System.out.println("Discount: "+paymentType.calculateDiscount(100));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
