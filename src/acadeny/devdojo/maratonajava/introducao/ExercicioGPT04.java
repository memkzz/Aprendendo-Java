package acadeny.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class ExercicioGPT04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float notas = 0;
        float provas = 4;

        for (int i = 0; i < provas; i++){
            System.out.print("Nota "+ i +": ");
            notas += scanner.nextInt();
        }
        float media = notas / provas;

        System.out.println("Sua média é: "+media);

    }
}
