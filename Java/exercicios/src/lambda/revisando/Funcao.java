package lambda.revisando;

import java.util.function.Function;

/**
 * @author Victor$
 * @date 10/25/2023$
 * Description:
 */
public class Funcao {

    public static void main(String[] args) {

        Function<Integer, String> parOuImpar = numero
                -> numero % 2 == 0 ? "Par" : "Ímpar";

        Function<String, String> oResultadoE =
                valor -> "O Resultado é: " + valor;

        Function<String, String> afirmacao =
                valor -> valor + "!!";

        Function<String, String> duvida =
                valor -> valor + "??";

        String resultadoFinal1 = parOuImpar
                .andThen(oResultadoE)
                .andThen(afirmacao)
                .apply(32);

        System.out.println(resultadoFinal1);

        String resultadoFinal2 = parOuImpar
                .andThen(oResultadoE)
                .andThen(duvida)
                .apply(32);

        System.out.println(resultadoFinal2);
    }
}
