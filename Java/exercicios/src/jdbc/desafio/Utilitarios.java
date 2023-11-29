package jdbc.desafio;

import jdbc.FabricaConexao;
import jdbc.Pessoa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Victor$
 * @date 11/28/2023$
 * Description:
 */
public class Utilitarios {

    private Connection conexao;

    public Utilitarios() throws SQLException {
        this.conexao = FabricaConexao.getConexao();
    }

    public void fecharConexao() throws SQLException {
        if (conexao != null && !conexao.isClosed()) {
            conexao.close();
        }
    }

    public void imprimirTabela() throws SQLException {

        String sql = "SELECT * FROM pessoas";

        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.getCodigo() + " ==> " + p.getNome());
        }
    }

    public void exibirPessoa() throws SQLException {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o id para pesquisa: ");
        String id_pessoa = scan.nextLine();

        String sql = """
                SELECT * FROM pessoas
                WHERE codigo = ?
                """;

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, id_pessoa);
        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.getCodigo() + " | " + p.getNome());
        }

        System.out.println("Deseja alterar o nome dessa pessoa? [S/N]");
        String op = scan.nextLine();

        if ("S".equalsIgnoreCase(op)) {
            alterarNome(id_pessoa);
        }
    }

    public void alterarNome(String id_pessoa) throws SQLException {

        Scanner scan = new Scanner(System.in);

        int id = Integer.parseInt((id_pessoa));

        System.out.println("Digit o nome: ");
        String nome = scan.nextLine();

        String sql = """
                UPDATE pessoas
                SET nome = ?
                WHERE codigo = ?
                """;

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setInt(2, id);
        stmt.executeUpdate();

        System.out.println("Nome alterado com sucesso!");
    }
}
