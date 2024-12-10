/* 
public class Main {
    public static void main(String[] args) {
        Bolo bolodeaniversario = new Bolo();
        
        // Mostrar detalhes do bolo
        bolodeaniversario.setsabor("Morango");
        bolodeaniversario.settamanho(30);
        bolodeaniversario.setcobertura(false);

        // Exibir detalhes do bolo
        bolodeaniversario.Exibirdetalhes();

        // Alterar cobertura
        bolodeaniversario.adicionarcobertura();

        // adiciono um enter
        System.out.println();

        bolodeaniversario.Exibirdetalhes();
    }
}
*/

public class Main {
    // Bolomorango.Exibirdetalhes();
    // bolomorango.tipoconfesao();

    public static void main(String[] args) {
        Bolochocolate bolochocolate = new Bolochocolate(30, true);
        Bolomorango bolomorango = new Bolomorango(75, false);
    }
    
}