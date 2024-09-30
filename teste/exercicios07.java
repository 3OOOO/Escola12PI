package teste;

import java.util.Scanner;

public class exercicios07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        System.out.println("Digite 5 números:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero; 
            }
        }
        System.out.println("O maior número e : " + maior);
    }
}
