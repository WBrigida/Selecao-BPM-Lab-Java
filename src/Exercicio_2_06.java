import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2_06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três valores distintos:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double maior = 0;
        if (a > b && a > c){
            maior = a;
        } else if (b > a && b > c) {
            maior = b;
        }else {
            maior = c;
        }

        System.out.printf("Maior = %.2f%n", maior);

        sc.close();
    }
}
