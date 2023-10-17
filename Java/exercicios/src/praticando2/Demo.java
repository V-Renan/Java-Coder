package praticando2;

/**
 * @author Victor$
 * @date 10/6/2023$
 * Description:
 */
public class Demo {

    public static void main(String[] args) {

        Compra c1 = new Compra();
        Compra c2 = new Compra();
        Compra c3 = new Compra();
        c1.adicionarIten("God of War", 1, 300.00);
        c2.adicionarIten("Call of Duty - Modern Warfare III", 1, 400);
        c3.adicionarIten("Spider-Man 2", 1, 350);

        Cliente cliente1 = new Cliente("Victor");
        Cliente cliente2 = new Cliente("Renan");

        cliente1.adicionarCompra(c1);
        cliente1.adicionarCompra(c2);
        var totatCliente1 = cliente1.obterValorTotal();
        System.out.println("Total: R$" + totatCliente1);


    }
}
