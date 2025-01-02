package acadeny.devdojo.maratonajava.javacore.Exercicios.domai;

public class Pessoa {
    private String name;
    private int age;
    private double height;


    public void displayInformation(){
        System.out.println("Nome: "+this.name);
        System.out.println("Idade: "+this.age);
        System.out.println("Altura: "+this.height);
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 1){
            System.out.println("Idade inválida!");
            return;
        }
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
}
