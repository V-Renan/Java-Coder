package lambda.revisando;

/**
 * @author Victor$
 * @date 10/25/2023$
 * Description:
 */
public class Produto {

    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString() {
        double precoFinal = preco * (1 - desconto);
        return "Produto: " + nome + " | " + "Preco: R$" + preco + " | " + "Preco final com desconto: R$" + precoFinal;
    }
}
