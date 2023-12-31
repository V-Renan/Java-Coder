package streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * @author Victor$
 * @date 10/28/2023$
 * Description:
 */
public class Filter {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.8, true);
        Aluno a2 = new Aluno("Bia", 5.8, true);
        Aluno a3 = new Aluno("Daniel", 9.8, false);
        Aluno a4 = new Aluno("Gui", 6.8, false);
        Aluno a5 = new Aluno("Rebeca", 7.1, true);
        Aluno a6 = new Aluno("Pedro", 8.8, true);

      List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

      alunos.stream()
              .filter(aprovado)
              .map(saudacaoAprovado)
              .forEach(System.out::println);

    }

    public static Predicate<Aluno> aprovado =
            n -> n.nota >= 7;

    public static Function<Aluno, String> saudacaoAprovado =
            a -> "Parabéns " + a.nome + ", você foi aprovado(a)!";
}
