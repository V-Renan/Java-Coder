package classe;

/**
 * @author Victor$
 * @date 9/28/2023$
 * Description:
 */
public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 100.00,Produto.desconto);

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 100.00;
        //p2.desconto = Produto.desconto;



        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precofinal1 = p1.precoComDesconto();
        double precofinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = ((precofinal1 + precofinal2) / 2);

        System.out.printf("Média carrinho: R$%.2f.", mediaCarrinho);
        System.out.println();
        System.out.println(p1.precoComDesconto());
        System.out.println(p2.precoComDesconto());
    }
}
