package acadeny.devdojo.maratonajava.javacore.Exercicios.test;

import acadeny.devdojo.maratonajava.javacore.Exercicios.domai.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.numeroMultiplicaVarArgs(2,7);

        calculadora.printResults();
    }
}
