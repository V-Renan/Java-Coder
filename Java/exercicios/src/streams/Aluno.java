package streams;

/**
 * @author Victor$
 * @date 10/28/2023$
 * Description:
 */
public class Aluno {

    final String nome;
    final double nota;
    final boolean bomComportamento;

    public Aluno(String nome, double nota) {
        this(nome, nota, true);
    }

    public Aluno(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
