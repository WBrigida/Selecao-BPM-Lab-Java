import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_09 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 4 valores:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        double media = (a + b + c + d) / 4.0;
        System.out.printf("A média aritmética dos 4 valores é: %.2f%n", media);

        sc.close();
    }
}
