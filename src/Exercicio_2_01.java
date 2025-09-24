import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2_01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois valores distintos:");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double maior = 0;

        if (a > b){
            maior = a;
        }else {
            maior = b;
        }

        System.out.println("Maior = " + maior);

        sc.close();
    }
}
