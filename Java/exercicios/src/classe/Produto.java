package classe;


/**
 * @author Victor$
 * @date 9/28/2023$
 * Description:
 */
public class Produto {

    String nome;
    Double preco;
    static Double desconto = 0.25;

    Produto() {

    }

    Produto(String nomeInicial, Double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    public Double precoComDesconto() {
        return preco * (1 - desconto);
    }
    public Double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }

}
