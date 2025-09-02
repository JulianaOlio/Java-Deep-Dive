import java.util.Arrays;

public class OrdenarVetor {
    public static void main(String[] args) {

        String[] alunos = new String[]{"Ana", "Eliane", "Maria" , "Joao", "Kelly"};
        Arrays.sort(alunos);
        System.out.println("Vetor ordenado ");
        for(int i = 0; i < alunos.length; i++){
            System.out.println(alunos[i]);
        }


    }
}
