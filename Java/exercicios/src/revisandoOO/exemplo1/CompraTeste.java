package revisandoOO.exemplo1;

/**
 * @author Victor$
 * @date 10/5/2023$
 * Description:
 */
public class CompraTeste {

    public static void main(String[] args) {

        Compra cliente1 = new Compra();
        cliente1.cliente = "Victor";

        // Adcionando item com instância da classe
        Item item1 = new Item("Caneta", 1, 2.50);
        cliente1.itens.add(item1);
        // Adicionando item com o método criado
        cliente1.adicionarItem("Borracha", 1, 3.50);
        // Adicionando item com instância dentro do cliente criado
        cliente1.itens.add(new Item("Caderno", 1, 5.50));



        for (Item itens : cliente1.itens) {
            System.out.println(itens.nome);
        }
        System.out.println("Valor total da compra: R$" + cliente1.obterValorTotal());
    }

}
