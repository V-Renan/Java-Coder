package classe.desafioComida;

/**
 * @author Victor$
 * @date 9/29/2023$
 * Description:
 */
public class Comida {

    private String nome;

    private Double peso;

    public Comida() {
        this(null, 0.0);
    }

    public Comida(String nome, Double peso) {
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

    public String imprimirComida() {
        return "Comida: " + getNome() +
                "\nPeso da comida: " + getPeso() + "Kg";
    }
}
