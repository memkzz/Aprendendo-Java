package acadeny.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class Exercises01GptAssAteAula20 {
    public static void main (String[] args){


        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha o prmeiro número: ");
        long numberOneChoice = scanner.nextLong();

        System.out.print("Escolha o segundo número: ");
        long numberTwoChoice = scanner.nextLong();

        System.out.println("Escolha uma opção de operação matemática : [1] Adição | [2] Subtração | [3] Mutiplicação | [4] Divisão");
        long userChoice = scanner.nextLong();


        long addition = numberOneChoice + numberTwoChoice;
        long subtraction = numberOneChoice - numberTwoChoice;
        long multiplication = numberOneChoice * numberTwoChoice;
        long division = numberOneChoice / numberTwoChoice;

        if (userChoice == 1){
            System.out.println("A resposta da Adição entre o primeiro e o segundo valor é de: " + addition);
        }
        else if (userChoice == 2) {
            System.out.println("A resposta da Substração entre o primeiro e o segundo valor é de: " + subtraction);
        }
        else if (userChoice == 3){
            System.out.println("A resposta da Multiplicação entre o primeiro e o segundo valor é de: " + multiplication);
        }
        else if (userChoice == 4){
            System.out.println("A resposta da Divisão emtre o priemiro e o segundo valor é de: " + division);
        }
        scanner.close();
    }
}
