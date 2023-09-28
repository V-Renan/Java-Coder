package classe;

/**
 * @author Victor$
 * @date 9/28/2023$
 * Description:
 */
public class Pessoas {

    private String nome;

    private Long cpf;

    private Integer idade;

    private Double altura;

    private Long celular;

    public Pessoas() {
        this.nome = this.getNome();
        this.cpf = this.getCpf();
        this.idade = this.getIdade();
        this.altura = this.getAltura();
        this.celular = this.getCelular();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }


    public String imprimirPessoas() {
        return "------------Pessoas------------" +
                "\nnome: " + nome +
                "\ncpf: " + cpf +
                "\nidade: " + idade +
                "\naltura: " + altura +
                "\ncelular: " + celular;
    }
}
