package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author Victor$
 * @date 11/30/2023$
 * Description:
 */
public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {

        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o codigo: ");
        int codigo = scan.nextInt();

        Connection conexao = FabricaConexao.getConexao();
        String sql = "DELETE FROM pessoas WHERE codigo > ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);

        int contador = stmt.executeUpdate();

        if (contador > 0) {
            System.out.println("Pessoa excluida com sucesos!");
        } else {
            System.out.println("Nada feito!");
        }

        System.out.println("Linhas afetas: " + contador);

        conexao.close();
        scan.close();
    }
}
