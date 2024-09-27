// Crie um vetor igual a apresentação do lado. Mencione se o ano é bissexto ou nao e corrija o mês de fevereiro
import java.util.Scanner;
public class atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();
        
        boolean Bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        String[] nomes = new String[12];
        nomes[0] = "mês de jan tem 31 dias";
        nomes[1] = "mês de fev tem " + (Bissexto ? "29" : "28") + " dias";
        nomes[2] = "mês de mar tem 31 dias";
        nomes[3] = "mês de abr tem 30 dias";
        nomes[4] = "mês de mai tem 31 dias";
        nomes[5] = "mês de jun tem 30 dias";
        nomes[6] = "mês de jul tem 31 dias";
        nomes[7] = "mês de ago tem 31 dias";
        nomes[8] = "mês de set tem 30 dias";
        nomes[9] = "mês de out tem 31 dias";
        nomes[10] = "mês de nov tem 30 dias";
        nomes[11] = "mês de dez tem 31 dias";

        if (Bissexto) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
        for (int i = 0; i < 12; i++) {
            System.out.println(nomes[i]);
        }

        scanner.close();
    }
}

