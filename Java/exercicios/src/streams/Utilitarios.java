package streams;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * @author Victor$
 * @date 10/27/2023$
 * Description:
 */
public interface Utilitarios {

    public static Consumer<String> print =
            System.out::print;
    public static UnaryOperator<String> maiuscula =
            (String::toUpperCase);
    public static UnaryOperator<String> primeiraLetra =
            n -> n.charAt(0) + "";
    public static String grito(String n) {
        return n + "!!!! ";
    }
    public static Function<Integer, String> binario =
            Integer::toBinaryString;
    public static String inverter(String x) {
        StringBuilder inverter = new StringBuilder();
        for (int i = x.length() - 1; i >= 0; i--) {
            inverter.append(x.charAt(i));
        }
        return inverter.toString();
    }
    public static UnaryOperator<String> inverter2 =
            texto -> new StringBuilder(texto).reverse().toString();
    public static Function<String, Integer> inteiro =
            n -> Integer.parseInt(n, 2);
}
