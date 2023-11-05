package praticando4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 11/5/2023$
 * Description:
 */
public class Cliente {

    String nome;

    List<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
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
