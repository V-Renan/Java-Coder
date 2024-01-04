package teste.umpraum;

import infra.DAO;
import infra.ProdutoDAO;
import modelo.basico.Produto;

import java.util.List;

/**
 * @author Victor$
 * @date 14/12/2023$
 * Description:
 */
public class ObterProdutos extends DAO<Produto> {

    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos();

        for (Produto produto : produtos) {
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome());
        }

        double precoTotal = produtos
                .stream()
                .map(p -> p.getPreco())
                .reduce(0.0, (t, p) -> t + p)
                .doubleValue();

        System.out.println("O valor total é R$" + precoTotal);

        dao.fechar();
    }
}
