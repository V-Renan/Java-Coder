package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Victor$
 * @date 11/28/2023$
 * Description:
 */
public class ConsultarPessoas2 {

    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a sua base de consulta: ");
        String base = scan.nextLine();

        String sql = """
                SELECT * FROM pessoas
                where nome like ?
                """;

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + base + "%");
        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p : pessoas) {
            System.out.println("Pessoas encontradas com a base [" + base + "] no nome: ===> " + p.getNome());
        }

        scan.close();
        stmt.close();
        conexao.close();
    }
}
