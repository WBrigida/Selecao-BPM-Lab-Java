import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_12 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da resistencia: ");
        double resistencia = sc.nextDouble();
        System.out.print("Digite o valor da Corrente elétrica: ");
        double corrente = sc.nextDouble();

        double tensao = corrente * resistencia;
        System.out.printf("Tensão em volts = %.2f%n", tensao);

        sc.close();
    }
}
