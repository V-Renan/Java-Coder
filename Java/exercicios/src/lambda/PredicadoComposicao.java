package lambda;

import java.util.function.Predicate;

/**
 * @author Victor$
 * @date 20/10/2023$
 * Description:
 */
public class PredicadoComposicao {

    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTreDigitos = num -> num >= 100 && num <= 999;

        System.out.println(isPar.and(isTreDigitos).negate().test(123));
        System.out.println(isPar.or(isTreDigitos).test(123));
    }
}
