import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do diâmetro: ");
        double diametro = sc.nextDouble();
        double raio = diametro / 2.0;

        double volume = 4 * Math.PI * raio * raio * raio / 3.0;
        System.out.printf("Volume = %.2f%n", volume);

        sc.close();

    }
}
