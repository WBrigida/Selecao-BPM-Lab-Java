import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_16 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de um ângulo em graus: ");
        double angulo = sc.nextDouble();

        double radianos = Math.toRadians(angulo);

        double seno = Math.sin(radianos);
        double coseno = Math.cos(radianos);
        double tangente = Math.tan(radianos);
        double secante = 1 / coseno;
        System.out.printf("Seno = %.2f%n", seno);
        System.out.printf("Coseno = %.2f%n", coseno);
        System.out.printf("Tangente = %.2f%n", tangente);
        System.out.printf("Secante = %.2f%n", secante);

        sc.close();
    }
}
