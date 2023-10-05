package revisandoOO.exemplo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 10/5/2023$
 * Description:
 */
public class Curso {

    final String nome;
    final List<Aluno> alunos = new ArrayList<>();

    Curso(String nome) {
        this.nome = nome;
    }

    Curso() {
        this("");
    }
    void adcionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

    public String toString() {
        return nome;
    }
}
