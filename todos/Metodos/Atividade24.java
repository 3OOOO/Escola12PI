import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        nex(); 
    }

    public static void nex() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        String nome = "Maria Rita";
        int idade = scanner.nextInt();

        if (idade <= 17) {
            System.out.println("Nao pode estar aqui!");
            System.out.println("== Menu ==");
            System.out.println("1 - Bebidas");
            System.out.println("2 - Coca");
            System.out.println("3 - Suco");
            System.out.println("4 - Danone");
            System.out.println("5 - Sair");

            int opcao = 0;
            while (opcao != 5) {
                System.out.print("Escolha uma bebida: ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Você escolheu Bebidas " + nome);
                        return;
                    case 2:
                        System.out.println("Você escolheu Coca " + nome);
                        return;
                    case 3:
                        System.out.println("Você escolheu Suco " + nome);
                        return;
                    case 4:
                        System.out.println("Você escolheu Danone " + nome);
                        return;
                    case 5:
                        System.out.println("Sair");
                        return;
                }
            }

        } else {
            System.out.println("Seja Bem-Vinda Maria Rita!");

            System.out.println("== Menu ==");
            System.out.println("1 - Bebidas");
            System.out.println("2 - Cerveja");
            System.out.println("3 - Vinho");
            System.out.println("4 - Xarope");
            System.out.println("5 - Sair");

            int opcao = 0;
            while (opcao != 5) {
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Você escolheu Bebidas " + nome);
                        return;
                    case 2:
                        System.out.println("Você escolheu Cerveja " + nome);
                        return;
                    case 3:
                        System.out.println("Você escolheu Vinho " + nome);
                        return;
                    case 4:
                        System.out.println("Você escolheu Xarope " + nome);
                        return;
                    case 5:
                        System.out.println("Sair");
                        return;
                }
            }
        }
    }
}

