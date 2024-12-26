package acadeny.devdojo.maratonajava.introducao;

import java.util.Arrays;

public class ExercicioGPT03 {
    public static void main(String[] args) {
        int[] numeros = {15,21,7,48,19};

        int maior = Arrays.stream(numeros).max().getAsInt();
        System.out.println(maior);
            }

        }


