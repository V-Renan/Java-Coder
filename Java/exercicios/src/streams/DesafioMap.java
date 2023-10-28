package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * @author Victor$
 * @date 10/27/2023$
 * Description:
 */
public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        /*
         * 1. Número para String binária... 6 => "110"
         * 2. Reverter a String... "110" => "011"
         * 3. Converter de volta para inteiro => "011" => 3
         */

        nums.stream()
                .map(Utilitarios.binario)
                .map(Utilitarios::inverter)
                .map(Utilitarios.inteiro)
                .forEach(System.out::println);
    }
}
