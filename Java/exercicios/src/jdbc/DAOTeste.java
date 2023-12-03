package jdbc;

/**
 * @author Victor$
 * @date 03/12/2023$
 * Description:
 */
public class DAOTeste {

    public static void main(String[] args) {

        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
        System.out.println(dao.incluir(sql, "Paulo Guedes", 1000));
        System.out.println(dao.incluir(sql, "Amelia Costa", 1003));
        System.out.println(dao.incluir(sql, "Augusto Silveira", 1001));

        dao.close();
    }
}
