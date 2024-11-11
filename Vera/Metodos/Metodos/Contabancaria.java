package Metodos;

public class Contabancaria {
    private double saldo;

    public void depositar(double valor){
        saldo += valor;
    }

    public void levantar(double valor) {
        saldo -= valor;
    }

    // Ver o resultado obtido 
    public double getsaldo() {
        return this.saldo; 
    }
}
