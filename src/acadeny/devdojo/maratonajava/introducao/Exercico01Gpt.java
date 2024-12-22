package acadeny.devdojo.maratonajava.introducao;
import java.util.Scanner;


public class Exercico01Gpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sn;
        int age = 0;
        int maior = 0;
        int menor = 0;
        int pessoas = 0;


        while (true) {
            System.out.print("Informe sua idade: ");
            age = scanner.nextInt();
            pessoas+=1;
            if (age >= 18) {
                maior +=1;
            }
            else {
                menor +=1;
            }

            while (true){
                System.out.println("Quer adicionar outra pessoa? [S] OU [N] ");
                sn = scanner.next().toUpperCase();
                if (sn.equals("S")) {
                    break;
                }
                else if (sn.equals("N")) {
                    System.out.println("Número de Pessoas Cadastradas: "+pessoas);
                    System.out.println("Número de Maiores de Idade: "+maior);
                    System.out.println("Número de Menores de Idade: "+menor);
                    System.out.println("FIM DO PROGRAMA!");

                    scanner.close();
                    return;
                }
                else {
                    System.out.println("Opção Inválida! Resposta deve ser [S] ou [N]!");

                }

            }



        }

    }
}
