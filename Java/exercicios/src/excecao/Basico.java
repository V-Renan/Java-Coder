package excecao;

/**
 * @author Victor$
 * @date 11/6/2023$
 * Description:
 */
public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;

        try {
            imprimirAluno(a1);
        } catch (Exception excecao) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome de usuário!");
        }

        // ctrl + alt + t para gera Surround With
        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o erro: " + e.getMessage());
        }


        System.out.println("Fim :)");
    }

    public static void imprimirAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}
