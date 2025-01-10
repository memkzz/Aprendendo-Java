package acadeny.devdojo.maratonajava.javacore.Hheritage.domain;

public class Person {
    protected String name;
    protected String cpf;
    protected Address address;

    public Person(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.address.getRua()+" "+this.address.getCep());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
