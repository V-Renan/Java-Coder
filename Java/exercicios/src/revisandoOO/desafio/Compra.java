package revisandoOO.desafio;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 10/5/2023$
 * Description:
 */
public class Compra {

    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int qtde) {
        this.itens.add(new Item(p, qtde));
    }

    void adicionarItem(String nome, double preco, int qtde) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qtde));
    }

    double obterValorParcial() {
        double total = 0;

        for (Item itens : this.itens) {
            total += itens.quantidade * itens.produto.preco;
        }

        return total;
    }
}
