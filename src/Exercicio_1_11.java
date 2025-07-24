import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_11 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distancia em milhas que deseja converter: ");
        double milhas = sc.nextDouble();

        double km = milhas * 1.6;
        System.out.printf("Distancia em Km: %.2f%n", km);

        sc.close();
    }
}
