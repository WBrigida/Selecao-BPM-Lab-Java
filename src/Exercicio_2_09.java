import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2_09 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner( System.in);

        System.out.println("Digite três valores:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double a2 = a * a;
        double b2 = b * b;
        double c2 = c * c;

        if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2){
            System.out.println("Os valores formam um triângulo retângulo.");
        }else {
            System.out.println("Os valores NÃO formam um triângulo retângulo.");
        }
    }
}
