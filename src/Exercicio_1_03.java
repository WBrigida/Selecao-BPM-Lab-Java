import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da diagonal: ");
        double diagonal = sc.nextDouble();

        double area = diagonal * diagonal / 2.0;
        System.out.printf("Area = %.2f%n", area);

        sc.close();
    }
}
