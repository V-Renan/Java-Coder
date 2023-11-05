package praticando4;

/**
 * @author Victor$
 * @date 11/5/2023$
 * Description:
 */
public class Demo {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        Cliente cliente1 = new Cliente("Victor");
        Cliente cliente2 = new Cliente("Renan");

        Produto p1 = new Produto("Call of Duty MWIII", 300.00);
        Produto p2 = new Produto("Monitor AOC", 800);
        Produto p3 = new Produto("Teclado Mecânico", 115.00);

        compra1.adicionarItem(p1, 1);
        compra1.adicionarItem(p2, 2);

        compra2.adicionarItem(p3, 1);
        compra2.adicionarItem(p1, 2);

        cliente1.compras.add(compra1);
        cliente2.adicionarCompra(compra2);


        System.out.println(cliente1.getValorTotal());
        System.out.println(cliente2.getValorTotal());


    }
}
