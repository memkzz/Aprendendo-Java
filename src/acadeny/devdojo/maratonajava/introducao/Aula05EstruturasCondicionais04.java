package acadeny.devdojo.maratonajava.introducao;
import java.util.Scanner;
public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        System.out.println("CALCULO DE IMPOSTO ANUAL HOLANDÊS");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual seu salario anual? ");
        double anualSalary = scanner.nextDouble();

        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.50/100;
        double valorImposto;

        if (anualSalary <= 34712) {
            valorImposto = anualSalary * primeiraFaixa;
        }
        else if (anualSalary <= 68507) {
            valorImposto = anualSalary * segundaFaixa;
        }
        else {
            valorImposto = anualSalary * terceiraFaixa;
        }
        System.out.println("Valor do imposto que deve ser pago anual baseado o seu salário é de: "+valorImposto);
    }
}
