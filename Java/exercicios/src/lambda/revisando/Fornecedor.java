package lambda.revisando;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author Victor$
 * @date 10/25/2023$
 * Description:
 */
public class Fornecedor {

    public static void main(String[] args) {

        Supplier<List<String>> umLista =
                () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println(umLista.get());
    }
}
