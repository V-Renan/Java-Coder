package classe;


import java.util.Locale;
import java.util.Scanner;

/**
 * @author Victor$
 * @date 9/28/2023$
 * Description:
 */
public class Produto {

    String nome;
    Double preco;
    Double desconto;

    public Double precoComDesconto() {
        return preco * (1 - desconto);
    }public Double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }
}
