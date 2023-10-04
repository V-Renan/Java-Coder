package praticando;

/**
 * @author Victor$
 * @date 10/4/2023$
 * Description:
 */
public class Demo {

    public static void main(String[] args) {

        Jogos jogo1 = new Jogos();
        jogo1.setNome("God of War");
        jogo1.setGenero("Ação-Aventura");
        jogo1.setId("1");
        jogo1.setPreco(300.00);

        Cliente cliente1 = new Cliente();
        cliente1.setId("1");
        cliente1.setNome("Victor");
        cliente1.setSobrenome("Moura");
        cliente1.setEndereco("End123");
        cliente1.setCelular(123645);

        System.out.println(jogo1.toString());
        System.out.println(cliente1.toString());


    }
}
