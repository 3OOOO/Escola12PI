public class Atividade30 {
    public static void main(String[] args) {
        // Exemplo int[] numeros = new int[5];

        System.out.println("Lista de notas ");
        double[] numero = new double[5];
        double total = 0;
        double soma = 0;

        // Inserir dados em um Array
        numero[0] = 13.13; 
        numero[1] = 9.03;
        numero[2] = 18.90;
        numero[3] = 19.40;
        numero[4] = 10.00;
        
        for (int i = 0; i < numero.length; i++) {
            total += 1;
            soma += numero[i];
        }
        
        System.out.println("Total de notas: " + total);
        System.out.println("Soma das notas: " + soma);

        // Calcular a media corretamente
        double media = soma / total;  // Corrigido aqui: soma / total (não total / soma)
        System.out.println("Média das notas: " + media);
    }
}

