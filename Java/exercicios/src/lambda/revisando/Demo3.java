package lambda.revisando;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * @author Victor$
 * @date 10/23/2023$
 * Description:
 */
public class Demo3 {

    public static void main(String[] args) {

        BinaryOperator<Double> calc = (x, y) -> {
            return x + y;
        };
        System.out.println(calc.apply(2.0, 5.0));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(2.0, 5.0));

        calc = (x, y) -> x / y;
        System.out.println(calc.apply(30.00, 15.00));
    }
}
