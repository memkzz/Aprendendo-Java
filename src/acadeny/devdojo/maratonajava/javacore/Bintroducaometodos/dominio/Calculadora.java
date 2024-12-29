package acadeny.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(int num1, int num2){
        int soma = num1 + num2;
        System.out.println(soma);

    }
    public void subtraiDoisNumeros(int num1, int num2){
        int subtracao = num1 - num2;
        System.out.println("A subtração entre "+num1+" e "+num2+" é igual a: "+subtracao);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        int multiplicacao = num1 * num2;
        System.out.println(multiplicacao);

    }
}
