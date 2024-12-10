package EXP5;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        
        // Como criar um HashSet
        HashSet<String> amigos = new HashSet<>();

        // Como criar uma lista de amigos
        amigos.add("afonso");
        amigos.add("Tiago");
        amigos.add("João");
        amigos.add("Miguel");

        // Mostrar a fila ( Nao vai ter repetição)
        System.out.println("Fala Inicial" + amigos);

        // Vamos verificar se o elemento existe 
        System.out.println("Contém David? " + amigos.contains("David"));

        // Vamos verificar o tamanho do hashSet
        System.out.println("Tamanho da lista " + amigos.size());

        // Vamos verificar o maior e menor elemento

        // Como criar um TreeSet
        TreeSet<Integer> numero = new TreeSet<>();

        // Adicionar numeros ao TreeSet
        numero.add(30);
        numero.add(20);
        numero.add(20);
        numero.add(40);

        // Apresentar o valores ordenados
        // Na execução do codigo ele nao vai repetir o mesmo valor 
        System.out.println("Numeros no TreeSet (Ordenados)" + numero);

        // Verificar qual e o menor e maior numero
        System.out.println("Maior numero " + numero.first()); // Apresenta o maior numero 
        System.out.println("Menor numero " + numero.last()); // Apresenta o menor numero

        // Remover os numeros 20
        numero.remove(20);
        System.out.println("Remove os numeros 20 " + numero);

        // Como criar um objeto do tipo Map
        HashMap<String, Integer> IdadeTurma = new HashMap<>();

        // Adicionar valor ao HashMap
        IdadeTurma.put("Ana", 26);
        IdadeTurma.put("Bruno", 34);
        IdadeTurma.put("Ricardo", 40);
        IdadeTurma.put("Fernanda", 22);

        // Mostrar os valores
        System.out.println("Valores do Map " + IdadeTurma);

        // Substituir os valores
        IdadeTurma.put("Ana", 41);

        // Mostrar o valor de uma chave
        System.out.println("O valor da chave da casa nova e  " + IdadeTurma.get("Casanova"));
        
        // Eliminar uma chave
        IdadeTurma.remove("Todinho");
        System.out.println("Turma sem o todinho " + IdadeTurma);

        // Verifica se existe uma chave Clementina
        System.out.println(IdadeTurma.containsKey("Clementina"));


        // Como criar um LinkedHashMap
        LinkedHashMap<String, Double> precosProdutos = new LinkedHashMap<>();

        // Add produtos ao LinkedHashMap
        precosProdutos.put("Arroz", 1.99);
        precosProdutos.put("Feijão", 12.99);
        precosProdutos.put("Pikanha", 50.00);

        // Exibir a lista
        System.out.println("Lista " + precosProdutos);

        // Iterar a lista
        for(String produto : precosProdutos.keySet()){
            System.out.println(produto + ":" + precosProdutos.get(produto));
        }


        // Como criar um objeto Queue
        Queue<Integer> numeros = new LinkedList<>();

        // Adicionar numeros a lista
        numeros.add(23);
        numeros.add(39);
        numeros.add(46);

        // Exibir o primeiro elemento
        System.out.println("Adicionando numeros " + numeros.peek()); // Como selecionar o primeiro elemento

        // Como eliminar valores
        System.out.println("Eliminando elementos " + numeros.poll());

        // Verificar se a lista vazia
        System.out.println("A lista está vazia?" + numeros.isEmpty());

        
    }   
}
