package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 10/4/2023$
 * Description:
 */
public class Compra {

    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int qtde) {
        this.itens.add(new Item(p, qtde));
    }

    void adcionarItem(String nome, double preco, int qtde) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qtde));
    }

    double obterValorTotal() {
        double total = 0;

        for(Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }

}
