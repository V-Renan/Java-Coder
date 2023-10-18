package oo.encapsulamento;

/**
 * @author Victor$
 * @date 10/18/2023$
 * Description:
 */
public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;

    public Pessoa(String nome,String sobrenome ,int idade) {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
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

    public String getNomeCompleto() {
        return getNome() + " " + getSobrenome();
    }

    // Getter
    public int getIdade() {
        return idade;
    }

    // Setter
    public void setIdade(int novaIdade) {
        //novaIdade = Math.abs(novaIdade);
        if (isIdadeValida(novaIdade)) {
            this.idade = novaIdade;
        }
    }

    public boolean isIdadeValida(int idade) {
        if (idade >= 0 && idade <= 130) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Nome: " + getNome() + "\n" +
                "Sobrenome: " + sobrenome + "\n" +
                "Idade: " + getIdade();
    }
}
