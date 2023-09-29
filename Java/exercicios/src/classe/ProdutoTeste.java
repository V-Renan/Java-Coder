package classe;

/**
 * @author Victor$
 * @date 9/28/2023$
 * Description:
 */
public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.86);

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        Produto.desconto = 0.50;

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());

        double precofinal1 = p1.precoComDesconto();
        double precofinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = ((precofinal1 + precofinal2) / 2);

        System.out.printf("Média carrinho: R$%.2f.", mediaCarrinho);
        System.out.println();
    }
}
