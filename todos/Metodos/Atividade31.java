package Metodos;
import java.util.Scanner;

public class Atividade31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Insira numeros para efetuar a divisão ===");

        System.out.print("Introduza o primeiro numero: ");
        int n1 = scanner.nextInt();

        System.out.print("Introduza o segundo numero: ");
        int n2 = scanner.nextInt();

        if (n1 == 0) {
            System.out.println("Erro: Não é possível dividir por zero.");
            return;
        } else if (n2 == 0) {
            System.out.println("Erro: Não é possível dividir por zero.");
            return;
        } else {
            
            int conta = n1 / n2;
            System.out.println("A divisão entre " + conta );
        }
    }
}

