package br.com.victor.exerciciossb.model.repositories;

import br.com.victor.exerciciossb.model.entities.Produto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Victor$
 * @date 06/02/2024$
 * Description:
 */
@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

    public Iterable<Produto> findAll(Pageable page);
    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
}
