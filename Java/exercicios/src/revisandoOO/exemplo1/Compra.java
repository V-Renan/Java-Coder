package revisandoOO.exemplo1;

import java.util.ArrayList;

/**
 * @author Victor$
 * @date 10/5/2023$
 * Description:
 */
public class Compra {

    String cliente;

    ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(String nome, int quantidade, double preco) {
        itens.add(new Item(nome, quantidade, preco));
    }

    double obterValorTotal() {
        double total = 0;

        for (Item itens : itens) {
            total += itens.quantidade * itens.preco;
        }

        return total;
    }
}
