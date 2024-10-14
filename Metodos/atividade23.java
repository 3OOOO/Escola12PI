
package Metodos;
/* 

public class atividade23 {
    public static void main(String[] args) {
       nex();
       ne(args);
    }

    public static void nex() {
        System.out.println("Seja Bem Vinda Maria Rica!");

        System.out.println("== Menu ==");
        System.out.println("1 - Entradas");
        System.out.println("2 - Prato Carne");
        System.out.println("3 - Prato Peixe");
        System.out.println("4 - Sobremesa");
        System.out.println("5 - Sair");
        
    }

    public static void ne(String[] args) {
        System.out.println("Maria Rica");
    }
}

*/

public class atividade23 {
    public static void main(String[] args) {
       nex();
       ne(args);
    }

    public static void nex() {
        int idade = 19;

        if( idade <= 17) {
            System.out.println("Nao pode estar aqui!");
            System.out.println("== Menu ==");
            System.out.println("1 - Bebidas");
            System.out.println("2 - coca");
            System.out.println("3 - suco");
            System.out.println("4 - danone");
            System.out.println("5 - Sair");

            return;
        }else{
            System.out.println("Seja Bem Vinda Maria Rita!");

            System.out.println("== Menu ==");
            System.out.println("1 - Bebidas");
            System.out.println("2 - Cerveija");
            System.out.println("3 - Vinho");
            System.out.println("4 - xarope");
            System.out.println("5 - Sair");
        }          
    }

    public static void ne(String[] args) {
        System.out.println("Maria Rita");
    }
}
