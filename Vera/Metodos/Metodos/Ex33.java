package Metodos;

public class Ex33 {
    private int quartos;   // Número de quartos entre 1 e 5
    private int numero;    // Número da casa entre 1 e 4
    private String nomeRua;  // Nome da rua
    private String localizacao; // Localização da casa

    public Ex33(int quartos, int numero, String nomeRua, String localizacao) {
        this.setQuartos(quartos);
        this.setNumero(numero);
        this.setNomeRua(nomeRua);
        this.setLocalizacao(localizacao);
    }

    public void setQuartos(int quartos) {
        if (quartos >= 1 && quartos <= 5) {
            this.quartos = quartos;
        } else {
            System.out.println("Erro: O número de quartos deve estar entre 1 e 5.");
        }
    }

    public void setNumero(int numero) {
        if (numero >= 1 && numero <= 4) {
            this.numero = numero;
        } else {
            System.out.println("Erro: O número da casa deve estar entre 1 e 4.");
        }
    }

    public void setNomeRua(String nomeRua) {
        if (nomeRua != null && !nomeRua.trim().isEmpty()) {
            this.nomeRua = nomeRua;
        } else {
            System.out.println("Erro: Nome da rua não pode ser vazio.");
        }
    }

    public void setLocalizacao(String localizacao) {
        if (localizacao != null && !localizacao.trim().isEmpty()) {
            this.localizacao = localizacao;
        } else {
            System.out.println("Erro: Localização não pode ser vazia.");
        }
    }

    public int getQuartos() {
        return quartos;
    }

    public int getNumero() {
        return numero;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    @Override
    public String toString() {
        return "Casa {" + 
                "quartos=" + quartos + 
                ", numero=" + numero + 
                ", nomeRua='" + nomeRua + '\'' + 
                ", localizacao='" + localizacao + '\'' + 
                '}';
    }

    // Método main para rodar o programa
    public static void main(String[] args) {
        // Criando uma instância de Ex33 para testar
        Ex33 casa = new Ex33(3, 2, "Rua das Flores", "Cidade XYZ");
        System.out.println(casa);
    }
}

