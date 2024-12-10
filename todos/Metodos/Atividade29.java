import java.util.Scanner;

public class Atividade29 {
    public static void main(String[] args) {
        // int x = 10;
        // int y = (int);
        Scanner scanner = new Scanner (System.in);
        System.out.println("Quero um numero Decimal: ");
        // Estou a pedir a um numero decimal com o "double" ao utilizador 
        double numero = scanner.nextDouble();
        
        //Converte o valor inicial para int
        int inteiro = (int) numero;

        float floa = (float) numero;

        long longa = (long) numero;

        System.out.println("Numero inicial " + numero);
        System.out.println("Segundo numero convertido para Int " + inteiro);
        System.out.println("Terceiro numero float " + floa);
        System.out.println("Quarto numero long " + longa);

        System.out.println("TYPECAST EXPLICITO");
    }
}
