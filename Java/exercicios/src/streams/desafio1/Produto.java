package streams.desafio1;

import java.util.function.Function;

/**
 * @author Victor$
 * @date 10/28/2023$
 * Description:
 */
public class Produto {

    private String nome;
    private Double preco;
    private Double desconto;
    private Double frete;

    public Produto(String nome, Double preco, Double desconto, Double frete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.frete = frete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }

    public Double obterValorTotal() {
        double precoParcial = getPreco() * (1- getDesconto());
        double total = precoParcial + getFrete();
        return total;
    }


    public static Function<Double, String> formatar =
            valor -> String.valueOf(Double.parseDouble(String.format("%.2f", valor)));

    public String toString() {
        //double precoComDesconto = getPreco() * (1- getDesconto());
        return "------Produto------" + "\nNome: " + getNome() +
                "\nPreco: R$" + getPreco() +
                "\nDesconto: " + getDesconto() + "%" +
                "\nPreco final com desconto: R$" + formatar.apply(obterValorTotal()) +
                "\nFrete: R$" + formatar.apply(getFrete());
    }
}
