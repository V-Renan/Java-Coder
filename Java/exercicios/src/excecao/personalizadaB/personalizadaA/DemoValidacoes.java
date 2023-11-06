package excecao.personalizadaB.personalizadaA;

import excecao.Aluno;

/**
 * @author Victor$
 * @date 11/6/2023$
 * Description:
 */
public class DemoValidacoes {

    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("Ana", 7);
            Validar.aluno(aluno);

            Validar.aluno(null);

        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloException | IllegalArgumentException e) { // Usando (ou) |
            System.out.println(e.getMessage());
        }


        System.out.println("Fim :)");
    }
}
