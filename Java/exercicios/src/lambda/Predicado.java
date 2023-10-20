package lambda;

import java.util.function.Predicate;

/**
 * @author Victor$
 * @date 20/10/2023$
 * Description:
 */
public class Predicado {

    public static void main(String[] args) {

        Predicate<Produto> isExpensive =
                prod -> (prod.preco * (1 - prod.desconto)) >= 750;

        Produto p1 = new Produto("Notebook", 3893.89, 0.85);

        System.out.println(isExpensive.test(p1));
    }
}
