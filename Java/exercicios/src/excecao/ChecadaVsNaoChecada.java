package excecao;

/**
 * @author Victor$
 * @date 11/6/2023$
 * Description:
 */
public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

        try {
            gerarErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());;
        }


        try {
            gerarErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }

    // Exceção não checada ou não verificada.
    static void gerarErro1() {
        throw new RuntimeException("Ocorreu um erro bem legal! #01");
    }

    // Exceção checada ou verificada
    static void gerarErro2() throws Exception {
        throw new Exception("Ocorreu um erro bem legal! #02");
    }
}
