package teste.basico.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

/**
 * @author Victor$
 * @date 04/01/2024$
 * Description:
 */
public class ObterClienteAssento {

    public static void main(String[] args) {

        DAO< Cliente > daoCliente = new DAO<>(Cliente.class);

        Cliente cliente = daoCliente.obterPorID(1L);
        System.out.println(cliente.getAssento().getNome());
        daoCliente.fechar();

        DAO< Assento > daoAssento = new DAO<>(Assento.class);
        Assento assento = daoAssento.obterPorID(4L);

        System.out.println(assento.getCliente().getNome());

        daoAssento.fechar();
    }
}
