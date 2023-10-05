package revisandoOO.exemplo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 10/5/2023$
 * Description:
 */
public class Aluno {

    final String nome;

    final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }

    Aluno() {
        this("");
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso obterCursoPorNome(String nome) {
        for (Curso curso : this.cursos) {
            if (curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return nome;
    }
}
