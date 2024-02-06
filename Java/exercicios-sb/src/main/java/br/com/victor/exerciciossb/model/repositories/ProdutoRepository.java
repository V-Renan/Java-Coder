package br.com.victor.exerciciossb.model.repositories;

import br.com.victor.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Victor$
 * @date 06/02/2024$
 * Description:
 */
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
