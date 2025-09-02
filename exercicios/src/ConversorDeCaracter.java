import java.util.Scanner;

public class ConversorDeCaracter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um caracter: ");
        char caracter = scanner.next().charAt(0);

        int codigo = (int) caracter;

        System.out.println("Caracter: " + caracter);
        System.out.println("Octal: " + Integer.toOctalString(codigo));
        System.out.println("Decimal: " + codigo);
        System.out.println("Hexa: " + Integer.toHexString(codigo).toLowerCase());

        scanner.close();

    }
}
