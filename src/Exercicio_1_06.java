import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do diâmetro: ");
        double diametro = sc.nextDouble();
        double raio = diametro / 2.0;

        double area = Math.PI * raio * raio;
        System.out.printf("Area = %.2f%n", area);

        sc.close();
    }
}
