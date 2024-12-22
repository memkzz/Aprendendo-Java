package acadeny.devdojo.maratonajava.introducao;
import java.util.Scanner;
public class Exercicio01Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número 1: ");
        int number1 = scanner.nextInt();

        System.out.print("Número 2: ");
        int number2 = scanner.nextInt();

        System.out.println("Qual operação matemática desejada? [1] ADIÇÃO [2] SUBTRAÇÃO [3] MULTIPLAÇÃO [DIVISÃO] 4");
        int choiceUser = scanner.nextInt();

        int adicao = number1+number2;
        int subtracao = number1-number2;
        int multiplicacao = number1*number2;
        int divisao = number1/number2;

        switch (choiceUser) {
            case 1:
                System.out.println("O resultado da adição dos números escolhidos é: "+adicao);
                break;
            case 2:
                System.out.println("O resultado da subtração dos números escolhidos é: "+subtracao);
                break;
            case 3:
                System.out.println("O resultado da multiplicação dos números escolhidos é: "+multiplicacao);
                break;
            case 4:
                System.out.println("O resultado da divisão dos números escolhidos é: "+divisao);
                break;
            default:
                System.out.println("ERRO! A Opção deve estar entre 1 e 4, tente novamente!");

                scanner.close();
        }

        System.out.println();

    }
}
