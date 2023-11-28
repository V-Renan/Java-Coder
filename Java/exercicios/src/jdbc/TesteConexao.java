package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Victor$
 * @date 11/28/2023$
 * Description:
 */
public class TesteConexao {

    public static void main(String[] args) throws SQLException {

        final String url = "jdbc:mysql://localhost:3306/wm?verifyServerCertificate=false&useSSL=true";
        final String usuario = "root";
        final String senha = "12345678";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        System.out.println("Conexão efetuada com sucesso!");
        conexao.close();
    }
}
