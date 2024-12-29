package acadeny.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import acadeny.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.ano = 2023;
        carro01.marca = "Toyota";
        carro01.modelo = "Corolla";

        Carro carro02 = new Carro();
        carro02.ano = 2022;
        carro02.marca = "Chevrolet";
        carro02.modelo = "Onix";

        System.out.println("CARROS\n"+ "Marca: "+carro01.marca+"\nModelo: "+carro01.modelo+"\nAno: "+carro01.ano);
        System.out.println("Marca: "+carro02.marca+"\nModelo: "+carro02.modelo+"\nAno: "+carro02.ano);
    }
    }

