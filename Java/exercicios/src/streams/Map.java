package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

/**
 * @author Victor$
 * @date 10/27/2023$
 * Description:
 */
public class Map {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
        marcas.stream().map(String::toUpperCase).forEach(print);

        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        UnaryOperator<String> grito = n -> n + "!!! ";

//        String teste = maiuscula.andThen(primeiraLetra)
//                .andThen(primeiraLetra)
//                .andThen(grito)
//                .apply("BMW");
//
//        System.out.println(teste);

        System.out.println("\n\nUsando composição...");
        marcas.stream()
                .map(maiuscula)
                .map(primeiraLetra)
                .map(grito)
                .forEach(print);

        System.out.println("\n");
        List<String> comidas = Arrays.asList("Camarão, ", "Batata ", "Miojo");
        comidas.stream().map(Utilitarios.maiuscula)
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print);
    }
}
