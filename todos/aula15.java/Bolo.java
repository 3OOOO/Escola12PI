public abstract class Bolo {
    // Variaveis de intancias 
    private String sabor;
    private int tamanho;
    private boolean cobertura;

    public String getsabor() {
        return sabor;
    }

    public void setsabor(String sabor) {
        this.sabor = sabor;
    }

    //

    public int gettamanho() {
        return tamanho;
    }

    public void settamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    //

    public boolean getcobertura() {
        return cobertura;
    }

    public void setcobertura(boolean cobertura) {
        this.cobertura = cobertura;
    }

    // Apresenta os detalhes do bolo
    public void Exibirdetalhes() {
        System.out.println("Sabor do bolo " + sabor );
        System.out.println("Tamanho do bolo " + tamanho );
        System.out.println("Cobertura  " + (cobertura ? "Sim": "Não" ));
    }

    // Adicione cobertura no bolo Metodo
    public void adicionarcobertura() {
        cobertura = true;

    }

    public abstract void tipoconfesao();
    
    
}
