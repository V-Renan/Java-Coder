package praticando;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 10/6/2023$
 * Description:
 */
public class Compras {

    List<Jogos> jogo = new ArrayList<>();

    void adicionarJogo(String nome, String genero, String id, double preco) {
        var jogo = new Jogos(nome, genero, id, preco);
        this.jogo.add(jogo);
    }

    double obterValorParcial() {
        double total = 0;

        for (Jogos jogo : this.jogo) {
            total += jogo.getPreco();
        }

        return total;
    }
}
