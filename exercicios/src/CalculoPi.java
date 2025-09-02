import java.util.Scanner;

public class CalculoPi {
    public static void main(String[] args) {

        final double PI = 3.1416;
        double raio, area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do raio do círculo: ");
        raio = scanner.nextDouble();

        area = PI * (raio * raio);

        System.out.println("A área do círculo é: " + area);

        scanner.close();

    }
}
