package lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * @author Victor$
 * @date 20/10/2023$
 * Description:
 */
public class Funcao {

    public static void main(String[] args) {

        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Ímpar";

        System.out.println(parOuImpar.apply(32));

        Function<String, String> oResultadoE =
                valor -> "O resultado é: " + valor;

        Function<String, String> empolgado =
                valor -> valor + "!!!";

        Function<String, String> duvida =
                valor -> valor + "???";

        String resultadofinal1 = parOuImpar
                .andThen(oResultadoE).andThen(empolgado)
                .apply(32);

        System.out.println(resultadofinal1);

        String resultadofinal2 = parOuImpar
                .andThen(oResultadoE).andThen(duvida)
                .apply(33);

        System.out.println(resultadofinal2);
    }
}
