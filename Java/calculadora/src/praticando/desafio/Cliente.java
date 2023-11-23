package praticando.desafio;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 11/23/2023$
 * Description:
 */
public class Cliente {

    final String nome;

    final List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra compra) {
        this.compras.add(compra);
    }

    double getValorTotal() {
        double total = 0;

        for (Compra compra : compras) {
            total += compra.getValorTotal();
        }

        return total;
    }
}
