package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author Victor$
 * @date 10/31/2023$
 * Description:
 */
public class Recude1 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        Integer total1 = nums.parallelStream()
                .reduce(soma)
                .get();
        System.out.println(total1);

        Integer total2 = nums.stream().reduce(100, soma);
        System.out.println(total2);

        // Resultado foi um Opcional<Interger>...
        nums.stream()
                .filter(n -> n > 4)
                .reduce(soma)
                .ifPresent(System.out::println);
    }
}
