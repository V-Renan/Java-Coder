package praticando2;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 10/6/2023$
 * Description:
 */
public class Compra {

    List<Item> itens = new ArrayList<>();

    void adicionarIten(String nome, int quantidade, double preco) {
        var jogo = new Jogo(nome, preco);
        itens.add(new Item(jogo, quantidade));
    }

    double obterValorParcial() {
        double total = 0;

        for (Item itens : itens) {
            total += itens.quantidade * itens.game.preco;
        }

        return total;
    }
}
