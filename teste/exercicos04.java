package teste;

import java.util.Scanner;

public class exercicos04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome de usuario: ");
        String usuario = scanner.nextLine();
        
        System.out.println("Digite uma senha: ");
        String senha = scanner.nextLine();

        if (usuario.equals(senha)) {
            System.out.println("As restrições do programa pede que o usuario e senha nao sejam iguais.");
        }else {
            System.out.println("Seja bem vindo");
        }  
    }
}
