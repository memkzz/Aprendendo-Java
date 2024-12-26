package acadeny.devdojo.maratonajava.introducao;

public class ExercicoGpt02 {
    public static void main(String[] args) {
        int[] numeros = {2,4,6,8,10};
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            soma+= numeros[i];

        }
        System.out.println("Soma de todos os valores "+ soma);
    }
}
