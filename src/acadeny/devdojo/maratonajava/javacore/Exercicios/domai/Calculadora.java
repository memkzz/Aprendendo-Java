package acadeny.devdojo.maratonajava.javacore.Exercicios.domai;

public class Calculadora {
    public int somaDoisNumeros(int numero1, int numero2){
        int soma = numero1 + numero2;
        return soma;
    }
    public int subtrairDoisNumeros(int numero1, int numero2){
        int subtracao = numero1 - numero2;
        return subtracao;
    }
    public void exibirResultado(){
        System.out.println("Resultado da soma: "+somaDoisNumeros(3,5));
        System.out.println("Resultado da susbtração: "+subtrairDoisNumeros(5,2));
    }


    public int numerosSomaVarArgs(int... numbers){
        int soma = 0;
        for (int i:numbers){
            soma += i;
        }
        return soma;
    }
    public int numeroMultiplicaVarArgs(int... numbers){
        int multiplies = 1;
        for (int i: numbers){
            multiplies *= i;
        }
        return multiplies;
    }
    public void printResults(){
        System.out.println(numerosSomaVarArgs());
        System.out.println(numeroMultiplicaVarArgs());
    }



}
