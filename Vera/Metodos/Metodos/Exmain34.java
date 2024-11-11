package Metodos;

public class Exmain34 {
    public static void main(String[] args) {
        Contabancaria contajoao = new Contabancaria();

        contajoao.depositar(100);

        System.out.println("Saldo da conta " + contajoao.getsaldo());

        contajoao.levantar(45.5);
        System.out.println();
        System.out.println("O valor que sera levantado " + contajoao.getsaldo());
    }
}
