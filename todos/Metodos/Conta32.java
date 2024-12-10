package Metodos;

public class Conta32 {
    // Variaveis de intancia
    public int valorInicial;
    public double saldoDaConta;
    public boolean depositar;
    public boolean levantar;

    public void Exibirdetalhes() {
        System.out.println("Valor inicial: " + valorInicial );
        System.out.println("Saldo: " + saldoDaConta );
        System.out.println("Depositar Dinheiro: " + depositar);
        System.out.println("Levantar dinheiro: " + levantar);
    }

    public void valorInicial() {
        valorInicial = 0 ;
    }

    public void saldoDaConta() {
        saldoDaConta = 60;
    }

    public void depositar() {
        depositar = false;
    }

    public void levantar() {
        levantar = true;
    }

   
}

// Private serve para isolar o codigo de um Hacker
// Variaveis são caracteristicas e objeto e comportamento


// Cria um atributo tipo PUBLICO que armazene DOUBLE, assim armazenando saldo na conta.
// A conta inicia com 0
// 4 metodos publicos 
// Metodo de inserir saldo
// Definir saldo
// Para obter saldo
// Depositar dinheiro 