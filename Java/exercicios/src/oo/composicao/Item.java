package oo.composicao;

/**
 * @author Victor$
 * @date 10/3/2023$
 * Description:
 */
public class Item {

    String nome;

    int quantidade;

    double preco;

    Compra compra;

    Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
