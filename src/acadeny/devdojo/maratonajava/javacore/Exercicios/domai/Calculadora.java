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



}
