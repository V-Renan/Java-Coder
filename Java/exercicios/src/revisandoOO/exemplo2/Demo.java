package revisandoOO.exemplo2;

/**
 * @author Victor$
 * @date 10/5/2023$
 * Description:
 */
public class Demo {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Victor");
        Aluno aluno2 = new Aluno("João");
        Aluno aluno3 = new Aluno("Maria");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React Native");

        curso1.adcionarAluno(aluno1);
        curso1.adcionarAluno(aluno2);

        curso2.adcionarAluno(aluno1);
        curso2.adcionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno aluno : curso1.alunos) {
            System.out.print("Aluno: " + aluno);
            System.out.println(" | Curso: " + curso1);
        }

        System.out.println("-----------------------------------------");

        for (Curso curso : aluno3.cursos) {
            System.out.println("Sou o(a) " + aluno3 + " e estou cursando: " + curso);
        }

        System.out.println("-----------------------------------------");

        for (Aluno aluno : curso3.alunos) {
            System.out.print("Aluno: " + aluno);
            System.out.println(" | Curso: " + curso3);
        }

        System.out.println("-----------------------------------------");

        System.out.println("Alunos cadastrados no curso: " + curso1 + "\n" + aluno1.cursos.get(0).alunos);

        System.out.println("-----------------------------------------");

        Curso cursoEncotrado = aluno1.obterCursoPorNome("Java Completo");


        if (cursoEncotrado != null) {
            System.out.println(cursoEncotrado.nome);
            System.out.println("Alunos: " + cursoEncotrado.alunos);
        }
    }
}
