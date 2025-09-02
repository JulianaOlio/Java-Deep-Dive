import java.util.Scanner;

public class Construcao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double bloco, altura, largura, resultado;
        double metro = 10000.0; // 1 metro quadrado = 100 cm x 100 cm

        System.out.println("Infome a altura do bloco em centímetros: ");
        altura = leitor.nextDouble();

        System.out.println("Infome a largura do bloco em centímetros: ");
        largura = leitor.nextDouble();

        bloco = altura * largura;

        System.out.println("Bloco: " + bloco);

        resultado = (metro / bloco);
        System.out.println("Quantidade de blocos por metro quadrado: " + (int)resultado);


    }
}
