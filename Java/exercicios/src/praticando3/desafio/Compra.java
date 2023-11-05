package praticando3.desafio;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 10/31/2023$
 * Description:
 */
public class Compra {

    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int quantidade) {
        this.itens.add(new Item(p, quantidade));
    }

    void adicionarItem(String nome, double preco, int quantidade) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, quantidade));
    }

    double getValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }

}
