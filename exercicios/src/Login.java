import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senha;
        String usuario;

        System.out.println("informe o usuario: ");
        usuario = scanner.nextLine();

        System.out.println("Informe a senha");
        senha = scanner.nextLine();

        if(usuario.equals("Adm") && senha.equals(123)){
            System.out.println("Acesso Autorizado");
        }else{
            System.out.println("Acesso Negado");
        }
    }
}
