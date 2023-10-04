package oo.composicao;

import java.util.ArrayList;

/**
 * @author Victor$
 * @date 10/3/2023$
 * Description:
 */
public class Compra {

    String cliente;

    ArrayList<Item> itens = new ArrayList<Item>();

    void adcionarItem(Item item) {
        this.itens.add(item);
        item.compra = this;
    }

    void adcionarItem(String nome, int quantidade, double preco) {
        //this.itens.add(new Item(nome, quantidade, preco));
        this.adcionarItem(new Item(nome, quantidade, preco));
    }


    double getValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.quantidade * item.preco;
        }

        return total;
    }

}
