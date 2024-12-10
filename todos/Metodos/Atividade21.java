public class Atividade21 {
    public static void main(String[] args) {
        System.out.println("Crie uma matriz 2x3 que gere 3x2");
        int matriz[][] = {{1, 2, 3},{4, 5, 6}}; // Criação da matriz
        
        // Corre a Linhas inteira
        for (int i = 0; i < matriz.length; i++) { 
            // Corre a Colunas inteira
            for (int l = 0; l < matriz[i].length; l++) {
                System.out.print(matriz[i][l] + " ");
            }
            System.out.println(" ");
        }
        
    }
}