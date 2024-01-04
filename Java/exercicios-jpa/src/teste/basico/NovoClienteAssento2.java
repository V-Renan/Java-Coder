package teste.basico;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

/**
 * @author Victor$
 * @date 04/01/2024$
 * Description:
 */
public class NovoClienteAssento2 {

    public static void main(String[] args) {

        Assento assento = new Assento("4D");
        Cliente cliente = new Cliente("Maria", assento);

        DAO<Cliente> dao = new DAO<>();

        dao.incluirAtomico(cliente);
    }
}
