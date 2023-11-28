package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author Victor$
 * @date 11/28/2023$
 * Description:
 */
public class NovaPessoa {

    public static void main(String[] args) throws SQLException {

        Scanner scan = new Scanner(System.in);
        Connection conexao = FabricaConexao.getConexao();

        System.out.print("Informe o nome: ");
        String nome = scan.nextLine();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);

        stmt.execute();

        System.out.println("Pessoa incluida com sucesso!");
        scan.close();
    }
}
