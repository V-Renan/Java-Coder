package praticando;

import revisandoOO.desafio.Compra;

import java.util.List;
import java.util.Objects;

/**
 * @author Victor$
 * @date 10/4/2023$
 * Description:
 */
public class Jogos {

    private String nome;

    private String genero;

    private String id;

    private Double preco;

    private int quantidade;


    public Jogos(String nome, String genero, String id, Double preco) {
        this.nome = nome;
        this.genero = genero;
        this.id = id;
        this.preco = preco;
    }
    public Jogos() {
        this("", "", "0", 0.0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogos that = (Jogos) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return "ID: " + id + "\nNome: " + nome + "\nGênero: " + genero + "\nPreço: " + preco + "\n";
    }
}
