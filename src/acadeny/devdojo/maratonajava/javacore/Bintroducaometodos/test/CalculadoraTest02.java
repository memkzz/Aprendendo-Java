package acadeny.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import acadeny.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,3,4,5,6,1};
        calculadora.somaArrays(numeros);
        calculadora.somaVarArgs(1,2,3,4);
    }
}
