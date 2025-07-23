import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        double base = sc.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double altura = sc.nextDouble();

        double area = base * altura / 2.0;
        System.out.printf("Area = %.2f%n", area);

        sc.close();
    }
}
