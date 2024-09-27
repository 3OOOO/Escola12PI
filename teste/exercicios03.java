package teste;

import java.util.Scanner;

public class exercicios03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (numero < 6) {
            System.out.println("O número " + numero + " é inválido.");
        } else {
            System.out.println("O número " +numero + " é válido.");
        }
    }
}
