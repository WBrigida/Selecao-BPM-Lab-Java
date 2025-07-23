import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        double base = sc.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        System.out.println("Area = " + area);

        sc.close();
    }
}
