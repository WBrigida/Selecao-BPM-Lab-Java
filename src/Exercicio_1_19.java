import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_19 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double p1 = sc.nextDouble();

        double media = 5.0;

        double p2 = media * 2.0 - p1;
        System.out.printf("O aluno precisa tirar : %.2f%n", p2);

        sc.close();

    }
}
