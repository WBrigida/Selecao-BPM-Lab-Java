import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2_07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        double R = peso / (altura * altura);
        if (R < 20){
            System.out.println("Abaixo do Peso");
        } else if (R < 25) {
            System.out.println("Peso Ideal");
        }else {
            System.out.println("Acima do peso");
        }

        sc.close();
    }
}
