package jdbc.desafio;

import java.sql.SQLException;

/**
 * @author Victor$
 * @date 11/28/2023$
 * Description:
 */
public class Demo {

    public static void main(String[] args) throws SQLException {

        Utilitarios utilitarios = new Utilitarios();

        utilitarios.imprimirTabela();
        utilitarios.exibirPessoa();
        utilitarios.imprimirTabela();
        utilitarios.fecharConexao();
    }
}
