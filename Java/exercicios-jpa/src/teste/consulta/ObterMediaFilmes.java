package teste.consulta;

import infra.DAO;
import modelo.consulta.NotaFilme;
import modelo.muitospramuitos.Filme;

/**
 * @author Victor$
 * @date 09/01/2024$
 * Description:
 */
public class ObterMediaFilmes {

    public static void main(String[] args) {

        DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
        NotaFilme nota = dao.consultarUM("obterMediaGeralDosFilmes");

        System.out.println(nota.getMedia());

        dao.fechar();
    }
}
