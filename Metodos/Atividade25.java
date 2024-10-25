import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoAtual = obterAno("Digite o ano atual: ", scanner);
        int anoNascimento = obterAno("Digite o ano de nascimento: ", scanner);
        int idade = calcularIdade(anoAtual, anoNascimento);
        System.out.println("A sua idade é " + idade);
    }
    
    public static int obterAno(String mensagem, Scanner scanner) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }
    
    public static int calcularIdade(int anoAtual, int anoNascimento) {
        return anoAtual - anoNascimento;
    }
}
