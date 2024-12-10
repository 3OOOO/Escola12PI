import java.util.ArrayList;
import java.util.Collection;
import java.util.literator;

public class main {
    public static void main(String[] args) {
        // Criar uma variavel...
        Collection<String> nomes = new ArrayList<>();
        literator<String> literator = new 

        nomes.add("Kevin");
        nomes.add("Matilde");
        nomes.add("Josefa");

        System.out.println(nomes);

        while (literator.hasNext()) {
            
        }

        // Verificar os nomes com o size()
        System.out.println("Verificar o tamanho do array" +nomes.size());

        // Verifica de contem o nome
        System.out.println("Contem Kevin" + nomes.contains("Kevin"));
        System.out.println("Contem Carlos" + nomes.contains("Carlos"));

        // remove o nome 
        nomes.remove("Josefa");
        System.out.println(nomes);

        // Verificar se a tarefa esta vazia
        System.out.println("Esta vazia " + nomes.isEmpty());

        //apagar todos os dados
        nomes.clear();

    }
}