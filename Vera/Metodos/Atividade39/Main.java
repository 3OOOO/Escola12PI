package Atividade39;
// Classe abstrata Veiculo
abstract class main {
    // Atributos comuns
    private String marca;
    private String modelo;
    private int ano;

    // Construtor
    public main(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos Get e Set (Encapsulamento)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Métodos concretos comuns
    public void acelerar() {
        System.out.println("O veículo está a acelerar.");
    }

    public void travar() {
        System.out.println("O veículo está a travar.");
    }

    // Método abstrato para calcular o preço do aluguer
    public abstract double calcularPrecoAluguer(int dias);
}

// Subclasse Carro que herda de Veiculo
class Carro extends main{
    private boolean temArCondicionado;

    // Construtor
    public Carro(String marca, String modelo, int ano, boolean temArCondicionado) {
        super(marca, modelo, ano);
        this.temArCondicionado = temArCondicionado;
    }

    // Getter e Setter para ar-condicionado
    public boolean isTemArCondicionado() {
        return temArCondicionado;
    }

    public void setTemArCondicionado(boolean temArCondicionado) {
        this.temArCondicionado = temArCondicionado;
    }

    @Override
    public double calcularPrecoAluguer(int dias) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPrecoAluguer'");
    }
}

    // Implementação do cálculo