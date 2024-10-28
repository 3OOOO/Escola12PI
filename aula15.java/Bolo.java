public class Bolo {
    // Variaveis de intancias 
    public String sabor;
    public int tamanho;
    public boolean cobertura;

    // Apresenta os detalhes do bolo
    public void Exibirdetalhes() {
        System.out.println("Sabor do bolo " + sabor );
        System.out.println("Tamanho do bolo " + tamanho );
        System.out.println("Cobertura  " + (cobertura ? "Sim": "Não" ));
    }

    // Adicione cobertura no bolo
    public void adicionarcobertura() {
        cobertura = true;
    }
}
