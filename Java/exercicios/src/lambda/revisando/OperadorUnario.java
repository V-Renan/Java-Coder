package lambda.revisando;

import java.util.function.UnaryOperator;

/**
 * @author Victor$
 * @date 10/25/2023$
 * Description:
 */
public class OperadorUnario {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n +2;
        UnaryOperator<Integer> vezesDois = n -> n *2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int resultado1 = maisDois
                .andThen(vezesDois)
                .andThen(aoQuadrado)
                .apply(0);

        System.out.println(resultado1);

        int resultado2 = aoQuadrado
                .compose(vezesDois)
                .compose(maisDois)
                .apply(0);

        System.out.println(resultado2);
    }
}
