package streams;

import java.sql.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * @author Victor$
 * @date 10/25/2023$
 * Description:
 */
public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        System.out.println("#1...");
        for (int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }

        System.out.println("\nUsando o foreach...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nUsando Lambda...");
        aprovados.forEach(System.out::println);

        System.out.println("\nUsando Iterator...");
        Iterator<String> it = aprovados.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nUsando Stream...");
        Stream<String> str = aprovados.stream();
        str.forEach(System.out::println); // Laço interno!!

    }
}