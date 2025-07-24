import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_14 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a velocidade inicial: ");
        double inicial = sc.nextDouble();
        System.out.print("Digite a aceleração: ");
        double aceleracao = sc.nextDouble();
        System.out.print("Digite o tempo do percurso: ");
        double percurso = sc.nextDouble();

        double fim = inicial + (percurso * aceleracao);
        double km = fim * 3.6;
        System.out.printf("A velocidade final (em km/h): %.2f%n", km);

        sc.close();
    }
}
