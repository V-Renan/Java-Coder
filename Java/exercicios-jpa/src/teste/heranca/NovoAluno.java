package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

/**
 * @author Victor$
 * @date 11/01/2024$
 * Description:
 */
public class NovoAluno {

    public static void main(String[] args) {

        DAO< Aluno> alunoDAO = new DAO<>();

        Aluno aluno1 = new Aluno(123L, "Joao");

        AlunoBolsista aluno2 = new AlunoBolsista(345L, "Maria", 1000);

        alunoDAO.incluirAtomico(aluno1);
        alunoDAO.incluirAtomico(aluno2);

        alunoDAO.fechar();
    }
}
