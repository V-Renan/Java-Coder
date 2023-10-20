package lambda;

/**
 * @author Victor$
 * @date 10/20/2023$
 * Description:
 */
public class DemoCalculo2 {

    public static void main(String[] args) {

      Calculo calc = (x, y) -> {
          return x + y;
      };

        System.out.println(calc.executar(1,2));

        calc = (x, y) -> x * y;

        System.out.println(calc.executar(2,5));
    }
}
