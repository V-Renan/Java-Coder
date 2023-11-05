package praticando4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 11/5/2023$
 * Description:
 */
public class Compra {

    List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto produto, int quantidade) {
        this.itens.add(new Item(produto, quantidade));
    }

    void adicionarItem(String nome, double preco, int qtde) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qtde));
    }
    double getValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }
}
