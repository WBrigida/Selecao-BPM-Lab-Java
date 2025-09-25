import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2_08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três valores:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Equilátero");
            } else if (a == b || b == c  || a == c) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        }

        sc.close();
    }
}
