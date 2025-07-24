import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_17 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 2 valors: ");
        int X = sc.nextInt();
        int Y = sc.nextInt();

        double potencia = Math.pow(X,Y);
        System.out.printf("X elevado a Y = %.2f%n", potencia);

        sc.close();
    }
}
