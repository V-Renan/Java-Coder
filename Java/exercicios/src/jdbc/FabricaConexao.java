package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Victor$
 * @date 11/28/2023$
 * Description:
 */
public class FabricaConexao {

    public static Connection getConexao() {

        try {
            final String url = "jdbc:mysql://localhost:3306/curso_java?verifyServerCertificate=false&useSLL=true";
            final String usuario = "root";
            final String senha = "12345678";

            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // ctrl + alt + t (cria try catch)
    }
}
