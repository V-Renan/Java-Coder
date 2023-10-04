package oo.composicao.desafio;

/**
 * @author Victor$
 * @date 10/4/2023$
 * Description:
 */
public class Sistema {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adcionarItem("Caneta", 1, 100);
        compra1.adicionarItem(new Produto("Notebook", 2000), 2);

        Compra compra2 = new Compra();
        compra2.adcionarItem("Caderno", 10, 10);
        compra2.adicionarItem(new Produto("Impressora", 1000), 1);

        Cliente cliente = new Cliente("Maria Jilia Morais");
        cliente.adicionarCompra(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());
    }
}
