package praticando3.domain;

import java.util.Objects;

/**
 * @author Victor$
 * @date 10/27/2023$
 * Description:
 */
public class Cliente {

    private String nome;
    private Integer cpf;
    private String endereco;
    private Integer numero;
    private Integer tel;

    public Cliente(String nome, String cpf, String end, String numero, String tel) {
        this.nome = nome;
        this.cpf = Integer.parseInt(cpf);
        this.endereco = end;
        this.numero = Integer.parseInt(numero);
        this.tel = Integer.parseInt(tel);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    public String toString() {
        return "Nome: " + getNome() + "CPF: " + getCpf();
    }
}
