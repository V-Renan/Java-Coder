package praticando2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 10/6/2023$
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

    double obterValorTotal() {
        double total = 0;

        for (Compra c : compras) {
            total += c.obterValorParcial();
        }

        return total;
    }
}
