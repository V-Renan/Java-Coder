package lambda.revisando2;

/**
 * @author Victor$
 * @date 19/02/2024$
 * Description:
 */
public class CalculoTeste2 {
    public static void main(String[] args) {
        Calculo soma = (x, y) -> {
          return x + y;
        };

        System.out.println(soma.executar(2 ,3));
    }
}
