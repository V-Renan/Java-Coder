package infra;

import modelo.basico.Produto;

/**
 * @author Victor$
 * @date 14/12/2023$
 * Description:
 */
public class ProdutoDAO extends DAO<Produto> {

    public ProdutoDAO() {
        super(Produto.class);
    }
}
