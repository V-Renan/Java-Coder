package lambda.revisando;

import java.util.Arrays;
import java.util.List;

/**
 * @author Victor$
 * @date 10/24/2023$
 * Description:
 */
public class ForEach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional...");
        for (String nomes : aprovados) {
            System.out.println(nomes);
        }

        System.out.println("\nLambda #01...");
        aprovados.forEach(nome ->  // Em caso de apenas um parâmetro não é necessário usar os () e {}
            System.out.println(nome + "!!!"));

        System.out.println("\nMethod Reference #01...");
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda #02...");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod Reference #02...");
        aprovados.forEach(ForEach::meuImprimir);

        System.out.println("\nChamando por outra classe para testar");
        aprovados.forEach(Dividir::meuImprirmir2);

    }

    static void meuImprimir(String nome) {
        System.out.println("Oi! Meu nome é " + nome);
    }
}
