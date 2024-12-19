package acadeny.devdojo.maratonajava.introducao;
import java.util.Scanner;
public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        System.out.println("Alocador de Atletas");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual sua idade atleta: ");
        int ageAtleta = scanner.nextInt();
        String equipe;

        if (ageAtleta <= 10) {
            equipe = "Pela sua idade você será alocado a Equipe Infantil!";
        }
        else if (ageAtleta <= 14) {
            equipe = "Pela sua idade você será alocado a Equipe Mirim!";
        }
        else if (ageAtleta < 18) {
            equipe = "Pela sua idade você será alocado a Equipe Juvenil!";
        }
        else {
            equipe = "Pela sua idade você será alocaod a Equipe Adulto!";
        }
        System.out.println(equipe);
        scanner.close();
    }
}
