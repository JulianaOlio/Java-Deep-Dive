import java.util.Scanner;

public class CalcularQuadrado {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Double area, base, altura;

        System.out.println("Informe a o valor da base para calcular o quadrado");
        base = leitor.nextDouble();

        System.out.println("Informe a o valor da altura para calcular o quadrado");
        altura = leitor.nextDouble();

        area = base * altura;

        System.out.println("A área do quadrado é " + area + " considerando a base " + base + " e a altura " + altura + " informada.");

    }
}
