package oo.composicao;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 10/4/2023$
 * Description:
 */
public class Curso {

    final String nome;

    final List<Aluno> alunos = new ArrayList<>();

    Curso(String nome) {
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

    public String toString() {
        return nome;
    }
}
