package acadeny.devdojo.maratonajava.javacore.Exercicios.test;

import acadeny.devdojo.maratonajava.javacore.Exercicios.domai.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();
        carro.nome = "Corolla";
        carro.ano = 2020;
        carro.modelo = "Toyota";

        carro1.nome = "Gol";
        carro1.modelo ="Volkswagen";
        carro1.ano = 2002;

        carro.exibirDetalhes();
        carro1.exibirDetalhes();

    }
}
