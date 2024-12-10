package EX49;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public class SistemaAtendimento {

    private Queue<String> fila;

    public SistemaAtendimento() {
        fila = new LinkedList<>();
    }

    // Método para adicionar um cliente à fila
    public void adicionarCliente(String cliente) {
        fila.add(cliente);
        System.out.println("Cliente " + cliente + " foi adicionado à fila.");
        exibirFila();
    }

    // Método para visualizar o próximo cliente sem removê-lo
    public String verProximoCliente() {
        if (fila.isEmpty()) {
            return "Nenhum cliente na fila.";
        } else {
            return "Próximo cliente: " + fila.peek();
        }
    }

    // Método para remover o cliente que foi atendido
    public void atenderProximoCliente() {
        if (fila.isEmpty()) {
            System.out.println("Nenhum cliente na fila para atender.");
        } else {
            String atendido = fila.poll();
            System.out.println("Cliente " + atendido + " foi atendido e removido da fila.");
        }
        exibirFila();
    }

    // Método para exibir a fila atual
    public void exibirFila() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Fila atual: " + fila);
        }
    }

    public static void main(String[] args) {
        SistemaAtendimento sistemaAtendimento = new SistemaAtendimento();

        // Adicionar clientes
        sistemaAtendimento.adicionarCliente("João");
        sistemaAtendimento.adicionarCliente("Maria");
        sistemaAtendimento.adicionarCliente("Carlos");

        // Ver o próximo cliente
        System.out.println(sistemaAtendimento.verProximoCliente());

        // Atender o próximo cliente
        sistemaAtendimento.atenderProximoCliente();

        // Atender mais um cliente
        sistemaAtendimento.atenderProximoCliente();

        // Ver o próximo cliente novamente
        System.out.println(sistemaAtendimento.verProximoCliente());

        // Atender o último cliente
        sistemaAtendimento.atenderProximoCliente();

        // Tentar atender sem clientes na fila
        sistemaAtendimento.atenderProximoCliente();
    }
}
}
