import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {

        //notas disponíveis 50, 20, 10
        //solicitar saque de 270 reais
        //mostra quantas notas disponiveis do caixa eletronico vai receber

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor que deseja sacar: ");
        int valorSaque, notasDe50, notasDe20, notasDe10, resto;

        valorSaque= leitor.nextInt();

        notasDe50 = valorSaque / 50;
        resto = valorSaque%50;
        notasDe20 = resto / 20;
        resto %=20;
        notasDe10 = resto / 10;
        resto %= 10;

        System.out.println("Notas de 50,00: " + notasDe50);
        System.out.println("Notas de 20,00: " + notasDe20);
        System.out.println("Notas de 10,00: " + notasDe10);

        leitor.close();
    }
}
