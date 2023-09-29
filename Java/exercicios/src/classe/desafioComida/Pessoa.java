package classe.desafioComida;

/**
 * @author Victor$
 * @date 9/29/2023$
 * Description:
 */
public class Pessoa {

    private String nome;

    private Double peso;

    public Pessoa() {
        this(null, 0.0);
    }

    public Pessoa(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void comer(Comida comida) {
        if (getPeso() != null) {
            peso += comida.getPeso();
        }
    }

    public String apresentarPessoas() {
        return "Nome: " + getNome() +
                "\nPeso: " + getPeso() + "kg";
    }
}
