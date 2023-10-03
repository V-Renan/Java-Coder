package colecoes;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Victor$
 * @date 10/3/2023$
 * Description:
 */
public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e add -> adicionam elementos na fila
        // Diferença é o comportamento quando fila está cheia!
        fila.add("Ana"); // retorna false
        fila.offer("Bia"); // Lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Diferença é o comportamento quando a fila está vazia!
        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lança uma exeção
        System.out.println(fila.element());

        // Poll e Remove -> obter o próximo elemento da fila (e remove)

        // Diferença é o comportamento quando a fila está vazia!
        System.out.println(fila.poll()); // retorna false
        System.out.println(fila.remove()); // lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        //fila.clear();
        //fila.size();
        //fila.isEmpty();
        //fila.contains(...);
    }
}
