package Metodos;

public class Main {
    public static void main(String[] args) {
        Conta32 contadigital = new Conta32();

        contadigital.valorInicial = 0;
        contadigital.saldoDaConta = 60;
        contadigital.depositar = false;
        contadigital.levantar = true;

        // Exibir detalhes da Conta
        contadigital.Exibirdetalhes();

        // Adiciono um enter
        System.out.println();
        
        contadigital.Exibirdetalhes();
    }
}
