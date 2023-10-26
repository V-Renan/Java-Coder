package lambda.revisando;

/**
 * @author Victor$
 * @date 10/25/2023$
 * Description:
 */
public class Produto {

    private String nome;
    private double preco;
    private double desconto;

    public Produto() {

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString() {
        double desconto = getPreco() * (1- getDesconto());
        return "Produto: " + nome + " | " + "Preco: R$" + preco + " | " + "Desconto: R$" + desconto;
    }
}
