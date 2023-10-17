package praticando;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author Victor$
 * @date 10/4/2023$
 * Description:
 */
public class Cliente {

    private String nome;

    private String sobrenome;

    private String id;

    private String endereco;


    public Cliente(String nome, String sobrenome, String id, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.id = id;
        this.endereco = endereco;
    }

    public Cliente() {
        this("", "", "", "");
    }

    ArrayList<Compras> compra = new ArrayList<>();

    void adicionarCompra(Compras compra) {
       this.compra.add(compra);
    }

    double obterValorTotal() {
        double total = 0;

        for (Compras compra : compra) {
            total += compra.obterValorParcial();
        }

        return total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return "ID: " + id + "\nNome: " + nome + " Sobrenome: " + sobrenome +
                "\nEndereço: " + endereco;
    }
}
