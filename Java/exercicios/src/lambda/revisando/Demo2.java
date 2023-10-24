package lambda.revisando;

import java.util.function.BiFunction;

/**
 * @author Victor$
 * @date 10/23/2023$
 * Description:
 */
public class Demo2 {

    public static void main(String[] args) {

        Calculo calc = (x, y) -> {
          return x + y;
        };
        System.out.println(calc.executar(5, 5));

        calc = (x, y) -> x * y;
        System.out.println(calc.executar(2, 5.5));

        calc = (x, y) -> {
            return x / y;
        };
        System.out.println(calc.executar(24, 2));

        System.out.println(calc.legal());
        System.out.println(Calculo.muitoLegal());
    }
}
