package teste.umpraum;

import infra.DAO;
import modelo.basico.Produto;

/**
 * @author Victor$
 * @date 14/12/2023$
 * Description:
 */
public class NovoProduto {

    public static void main(String[] args) {

        DAO<Produto> dao = new DAO<>(Produto.class);

        Produto produto = new Produto("Monitor 23″", 789.98);
        dao.incluirAtomico(produto).fechar();

        System.out.println("Id do produto: " + produto.getId());
    }
}
