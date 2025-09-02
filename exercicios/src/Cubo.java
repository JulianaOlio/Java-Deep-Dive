import java.util.Scanner;

public class Cubo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número: ");
        numero = scanner.nextInt();

        System.out.println("O cubo do número informado : " + numero + " é " + Math.pow(numero,3));

        System.out.println("O dobro do número informado : " + numero + " é " + Math.pow(numero,2));
    }
}
