package acadeny.devdojo.maratonajava.introducao;
import java.util.Scanner;
public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // char, int, byte, short, enum, String
        Scanner scanner = new Scanner(System.in);
        System.out.print("Difite um número de 1 a 7: ");
        int dia = scanner.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabádo");
                break;
            default:
                System.out.println("Erro! o número tem que estar entre 1 e 7!");
        }
            scanner.close();
    }
}
