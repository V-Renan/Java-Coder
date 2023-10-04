package oo.composicao.desafio;

/**
 * @author Victor$
 * @date 10/4/2023$
 * Description:
 */
public class Item {
    final Produto produto;

    final int quantidade;

    Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
