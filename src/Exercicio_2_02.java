import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2_02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois valores distintos:");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double menor = 0;

        if (a < b){
            menor = a;
        }else {
            menor = b;
        }

        System.out.println("Menor = " + menor);

        sc.close();
    }
}
