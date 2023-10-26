package lambda.revisando;

import java.util.function.Predicate;

/**
 * @author Victor$
 * @date 10/25/2023$
 * Description:
 */
public class PredicadoComposicao {

    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = n -> n >= 100 && n <= 999;

        System.out.println(isPar.and(isTresDigitos).negate().test(123));
        System.out.println(isPar.or(isTresDigitos).test(123));
    }
}
