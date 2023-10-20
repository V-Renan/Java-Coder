package lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author Victor$
 * @date 20/10/2023$
 * Description:
 */
public class ForEach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia","Lia", "Gui");

        System.out.println("Forma tradicional...");
        for (String nomes : aprovados) {
            System.out.println(nomes);
        }

        System.out.println("\nLambda #01");
        /*
        Em caso de apenas um parâmetro
            aprovados.forEach(nome -> System.out.println(nome + "!"));

         */

        aprovados.forEach((nome) -> {
            System.out.println(nome + "!!");
        });

        System.out.println("\nLambda #2");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod Reference #1...");
        aprovados.forEach(System.out::println);

        System.out.println("\nMethod Reference #2...");
        aprovados.forEach(ForEach::meuImprimir);
    }

    static void meuImprimir(String nome) {
        System.out.println("Oi! Meu nome é " + nome);
    }
}
