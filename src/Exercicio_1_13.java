import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_13 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em  Celsius (oC): ");
        double c = sc.nextDouble();

        double f = c * 1.8 + 32.0;
        System.out.printf("Temperatura equivalente em Fahrenheit (oF): %.2f%n", f);

        sc.close();
    }
}
