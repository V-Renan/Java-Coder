package lambda;

import java.util.function.BinaryOperator;

/**
 * @author Victor$
 * @date 20/10/2023$
 * Description:
 */
public class DemoCalculo3 {

    public static void main(String[] args) {

        // Não permite: int -> Double
        // double -> Double
        BinaryOperator<Double> calc = (x, y) -> {
            return x + y;
        };
        System.out.println(calc.apply(1.0,2.0));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(2.0,5.0));

        System.out.println("Integer Valued");

        BinaryOperator<Integer> calc2 = (x, y) -> {
            return x + y;
        };
        System.out.println(calc2.apply(2,2));

        calc2 = (x, y) -> x * y;
        System.out.println(calc2.apply(2,3));
    }
}
