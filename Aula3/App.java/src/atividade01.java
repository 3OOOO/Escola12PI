// Crie um vetor igual a apresentação do lado
public class atividade01 {
    public static void main(String[] args) {
        String[] nomes = new String[12];
        nomes[0] = "mês de jan tem 31 dias";
        nomes[1] = "mês de fev tem 28 dias";
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

        for (int i = 0; i < 12; i++) {
            System.out.println(nomes[i]);
        }
    }
}
