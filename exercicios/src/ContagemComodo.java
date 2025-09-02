import java.util.Scanner;

public class ContagemComodo {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);

        String nomeComodo, opcao;
        double larg, comp, areaComodo = 0 , areaTotal = 0;
        do {
            System.out.println("Nome do comodo: ");
            nomeComodo = leitorTexto.nextLine();

            System.out.println("Largura: ");
            larg = leitor.nextDouble();

            System.out.println("Comprimento: ");
            comp = leitor.nextDouble();

            areaComodo = larg * comp;
            System.out.println("área da(o) " + nomeComodo + " é " + areaComodo + "m²");

            //calcular a area total
            areaTotal += areaComodo; //areaTotal = areaTotal + areaComodo

            System.out.println("Deseja adicionar outro comodo? [S]im ou [N]ão");
            opcao = leitorTexto.nextLine();

        }while(opcao.equalsIgnoreCase("Sim") || opcao.equalsIgnoreCase("S"));
        //Exibir a area total
        System.out.println("Área total da residência é: " + areaTotal + "m²");
    }
}
