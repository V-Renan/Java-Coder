package revisandoOO.desafio;

/**
 * @author Victor$
 * @date 10/5/2023$
 * Description:
 */
public class Demo {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Victor");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.67, 100);
        compra1.adicionarItem(new Produto("Notebook", 1897.88), 2);

        Compra compra2= new Compra();
        compra2.adicionarItem("Caderno", 10, 10);
        compra2.adicionarItem(new Produto("Impressora", 998.90), 1);

        cliente1.adicionarCompra(compra1);
        cliente1.compras.add(compra2);

        System.out.println("Total: R$" + cliente1.obterValorTotal());
    }
}
