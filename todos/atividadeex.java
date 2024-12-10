public class atividadeex {
    // Atributos da Casa
    // deve estar entre 1 e 5
    private int quartos; 

    // Deve estar entre 1 e 4
    private int numero; 

    // Nome da rua
    private String nomeRua; 

    // localização
    private String localizacao; 

    public atividadeex(int quartos, int numero, String nomeRua, String localizacao) {
        setQuartos(quartos);
        setNumero(numero);
        setNomeRua(nomeRua);
        setLocalizacao(localizacao);
    }

    public void setQuartos(int quartos) {
        if (quartos >= 1 && quartos <= 5) {
            this.quartos = quartos;
        } else {
            throw new IllegalArgumentException("Os Quartos deve estar entre 1 e 5.");
        }
    }

    public void setNumero(int numero) {
        if (numero >= 1 && numero <= 4) {
            this.numero = numero;
        } else {
            throw new IllegalArgumentException("A casa deve estar entre 1 e 4.");
        }
    }

    public void setNomeRua(String nomeRua) {
        if (nomeRua != null && !nomeRua.trim().isEmpty()) {
            this.nomeRua = nomeRua;
        } else {
            throw new IllegalArgumentException("A rua não pode ser null.");
        }
    }

    public void setLocalizacao(String localizacao) {
        if (localizacao != null && !localizacao.trim().isEmpty()) {
            this.localizacao = localizacao;
        } else {
            throw new IllegalArgumentException("A Localização não pode ser null.");
        }
    }

    // Getters para cada atributo
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

    // Método para exibir informações da Casa
    @Override
    public String toString() {
        return "Casa {" + "quartos=" + quartos + ", numero=" + numero + ", nomeRua='" + nomeRua + '\'' + ", localizacao='" + localizacao + '\'' + '}';
    }
}
 
