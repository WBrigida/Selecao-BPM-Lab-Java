import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2_03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois valores:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double maior = 0;
        if(a == b){
            System.out.println("Numeros igauis.");
        } else if (a > b) {
            maior = a;
        }else {
            maior = b;
        }

        System.out.printf("O maior valor é: %.2f%n", maior);

        sc.close();
    }
}
