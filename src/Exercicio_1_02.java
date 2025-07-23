import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da aresta: ");
        double aresta = sc.nextDouble();

        double area = aresta * aresta;
        System.out.println("Area do Quadrado = " + area);

        sc.close();
    }
}
