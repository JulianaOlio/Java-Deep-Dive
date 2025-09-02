import java.util.Arrays;

public class MomentosHandsOn {
    public static void main(String[] args) {

        /*

         */

        int[] vetor = {12, 45, 7, 89, 23, 56, 91, 3, 67, 34};

        int soma = Arrays.stream(vetor).sum();
        System.out.println(soma);

        int maior = Arrays.stream(vetor).max().getAsInt();
        System.out.println(maior);


    }
}
