import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 2 valores:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double mediaGeo = Math.sqrt(a * b);
        System.out.printf("Media = %.2f%n", mediaGeo);

        sc.close();
    }
}
