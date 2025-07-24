import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_15 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("A cotação de um dólar em reais: ");
        double cotacao = sc.nextDouble();
        System.out.print("Digite um certo valor em dólares: ");
        double dolar = sc.nextDouble();

        double reais = dolar * cotacao;
        System.out.printf("Valor em reais = R$ %.2f%n", reais);

        sc.close();
    }
}
