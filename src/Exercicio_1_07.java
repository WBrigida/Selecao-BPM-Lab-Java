import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da altura: ");
        double altura = sc.nextDouble();
        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double volume = altura * Math.PI * raio * raio / 3.0;
        System.out.printf("Volume = %.2f%n",volume);

        sc.close();
    }
}
