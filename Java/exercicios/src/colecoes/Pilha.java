package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Victor$
 * @date 10/3/2023$
 * Description:
 */
public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros =  new ArrayDeque<>();

        livros.add("O Pequeno Príncipe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println("--------------------------");

        for (String livro : livros) {
            System.out.println(livro);
        }

        System.out.println("--------------------------");


        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
//      System.out.println(livros.pop());
//      System.out.println(livros.remove());

//        livros.size();
//        livros.contains();
//        livros.contains();
//        livros.isEmpty();

    }
}
