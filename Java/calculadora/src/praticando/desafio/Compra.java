package praticando.desafio;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 11/23/2023$
 * Description:
 */
public class Compra {

    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto produto, int quantidade) {
        this.itens.add(new Item(produto, quantidade));
    }

    void adicionarItem(String nome, double preco, int quantidade) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, quantidade));
    }

    double getValorTotal() {
        double total = 0;

        for (Item itens : itens) {
            total += itens.quantidade * itens.produto.preco;
        }

        return total;
    }
}
