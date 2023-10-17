package praticando;

/**
 * @author Victor$
 * @date 10/4/2023$
 * Description:
 */
public class Demo {

    public static void main(String[] args) {

        Compras jogo1 = new Compras();
        Compras jogo2 = new Compras();
        Compras jogo3 = new Compras();

        jogo1.adicionarJogo("God of War", "Ação-Aventura", "1", 300.00);
        jogo2.adicionarJogo("The whitcher 3", "RPG", "2", 250.00);
        jogo3.adicionarJogo("Spider-Man", "Ação-Aventura", "3", 280.00);

        Cliente cliente1 = new Cliente("Victor", "Renan","1", "End-123");

        for (Jogos j : jogo1.jogo) {
            System.out.println(j);
        }

        for (Jogos j : jogo2.jogo) {
            System.out.println(j);
        }


        cliente1.adicionarCompra(jogo1);
        cliente1.adicionarCompra(jogo2);
        cliente1.adicionarCompra(jogo3);
        System.out.println("Total: R$" + cliente1.obterValorTotal());

    }
}
