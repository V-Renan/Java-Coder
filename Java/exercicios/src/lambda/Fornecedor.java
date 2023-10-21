package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author Victor$
 * @date 20/10/2023$
 * Description:
 */
public class Fornecedor {

    public static void main(String[] args) {

        Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
        System.out.println(umaLista.get());
    }
}
