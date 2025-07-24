import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_18 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto 1: R$ ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor do produto 2: R$ ");
        double b = sc.nextDouble();
        System.out.print("Digite o valor do produto 3: R$ ");
        double c = sc.nextDouble();
        System.out.print("Digite o valor do produto 4: R$ ");
        double d = sc.nextDouble();
        System.out.print("Digite o valor do produto 5: R$ ");
        double e = sc.nextDouble();

        double soma = a + b + c + d + e;
        System.out.println("Total = R$ " + soma);

        System.out.print("Valor de pagamento: R$ ");
        double pagamento = sc.nextDouble();

        double troco =  pagamento - soma;
        System.out.printf("Troco = R$ %.2f%n", troco);

        sc.close();
    }
}
