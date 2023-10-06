package revisandoOO.desafio;

/**
 * @author Victor$
 * @date 10/5/2023$
 * Description:
 */
public class Item {

    final int quantidade;

    final Produto produto;

    Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
