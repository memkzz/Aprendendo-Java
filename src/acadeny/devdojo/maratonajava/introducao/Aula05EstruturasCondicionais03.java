package acadeny.devdojo.maratonajava.introducao;
import java.util.Scanner;
public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        System.out.println("Se você tiver mais que 5000 na sua conta, terá que nos dar 500!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanto tem na sua conta? ");
        double conta = scanner.nextDouble();

        String resultado = (conta > 5000) ? "Vou dar os 500.." : "Não tenho para dar os 500..";
        System.out.println(resultado);

    }
}
