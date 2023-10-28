package streams.desafio1;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Victor$
 * @date 10/28/2023$
 * Description:
 */
public final class Utilitarios {

    public static Predicate<Produto> desconto30 =
            n -> n.getDesconto() >= 0.30;

    public static Predicate<Produto> freteGratis =
            n -> n.getFrete() == 0.0;

    public static Predicate<Produto> precoFinal =
            n -> n.obterValorTotal() < 1000;

    public static Function<Produto, String> promocao =
            produto -> "\nAproveite a promoção deste produto com frete grátis e com mais de 30% de desconto!\n" + produto.toString();
}
