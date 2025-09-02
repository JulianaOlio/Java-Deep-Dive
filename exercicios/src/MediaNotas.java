import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nota1, nota2, nota3, media;

        System.out.println("Digita a 1ª nota: ");
        nota1 = scanner.nextInt();

        System.out.println("Digita a 2ª nota: ");
        nota2 = scanner.nextInt();

        System.out.println("Digita a 3ª nota: ");
        nota3 = scanner.nextInt();

        media = (nota1 + nota2 + nota3) /3;

        if(media >=7){
            System.out.println("Sua média foi: " + media + "\nVocê foi aprovado(a)!");
        }else if (media >= 5 && media < 7) {
            System.out.println("Sua média foi: " + media + "\nVocê ficou de recuperação!");
        }else if (media < 4){
            System.out.println("Sua média foi: " + media + "\nVocê foi reprovado(a)!");
        }
        System.out.println("Informe a nota de exame: ");
        int notaExame = scanner.nextInt();

        int novaMedia = (media + notaExame)/2;
        if(novaMedia >=5){
            System.out.println("Aluno(a) aprovado(a) com nova média: " + novaMedia);
        }else {
            System.out.println("Aluno(a) reprovado(a) com nova média: " + novaMedia);
        }

    scanner.close();

    }
}
