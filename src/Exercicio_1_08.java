import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        System.out.print("Digite o valor da aresta: ");
        double aresta = sc.nextDouble();

        double esfera = 4 * Math.PI * raio * raio * raio / 3.0;
        double cubo = aresta * aresta *aresta;
        double livre = cubo - esfera;
        System.out.printf("O volume livre é: %.2f%n", livre);

        sc.close();
    }
}
