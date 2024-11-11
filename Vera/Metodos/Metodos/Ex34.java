package Metodos;

public class Ex34 {
    private int dia;
    private int mes;
    private int ano;

    public Ex34() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1;
    }

    public int getdia() {
        return dia;
    }

    public int getmes() {
        return mes;
    }

    public int getano() {
        return ano;
    }

    public void setEx34(int dia, int mes, int ano) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            System.out.println("Wrong number range");
        }

        if (mes >= 1 && mes <= 31) {
            this.mes = mes;
        } else {
            System.out.println("Wrong number range");
        }
    }
}
