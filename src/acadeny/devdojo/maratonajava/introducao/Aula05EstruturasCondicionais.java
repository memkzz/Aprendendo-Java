package acadeny.devdojo.maratonajava.introducao;
import java.util.Scanner;
public class Aula05EstruturasCondicionais {
    public static void main (String [] args){
        System.out.println("Analisador de idade para consumir bebida alcolica.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        int age = scanner.nextInt();

        if (age >= 18){
            System.out.println("Autorizado a consumir bedida Alcolica!");
        }
        else {
            System.out.println("Não autorizado consumir bebida Alcolica!");
        }

    }
}
