public class Main {
    public static void main(String[] args) {
        Bolo bolodeaniversario = new Bolo();
        
        // Mostrar detalhes do bolo
        bolodeaniversario.sabor = "Morango";
        bolodeaniversario.tamanho = 30;
        bolodeaniversario.cobertura = false;

        // Exibir detalhes do bolo
        bolodeaniversario.Exibirdetalhes();

        // Alterar cobertura
        bolodeaniversario.adicionarcobertura();

        // adiciono um enter
        System.out.println();

        bolodeaniversario.Exibirdetalhes();
    }
}
