package praticando3.desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Victor$
 * @date 10/31/2023$
 * Description:
 */
public class Cliente {

    final String nome;

    Cliente(String nome) {
        this.nome = nome;
    }
    final List<Compra> compras = new ArrayList<>();

    double getValorTotal() {
        double total = 0;

        for (Compra compra : compras) {
            total += compra.getValorTotal();
        }

        return total;
    }
}
