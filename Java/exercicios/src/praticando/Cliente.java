package praticando;

import java.util.ArrayList;
import java.util.List;
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

    private Integer celular;

    public Cliente(String nome, String sobrenome, String id, String endereco, String celular) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.id = id;
        this.endereco = endereco;
        this.celular = Integer.valueOf(celular.trim());
    }

    public Cliente() {
        this("", "", "", "", String.valueOf(0));
    }

    List<Jogos> jogo = new ArrayList<>();

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

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
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
        return "ID:" + id + "\n Nome: " + nome + " Sobrenome: " + sobrenome;
    }
}
