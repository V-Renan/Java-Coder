package excecao.personalizadaA;

/**
 * @author Victor$
 * @date 11/6/2023$
 * Description:
 */

public class StringVaziaException extends RuntimeException{

    private String nomeDoAtributo;
    public StringVaziaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }


    public String getMessage() {
        return String.format("O atributo '%s' está vazio!", nomeDoAtributo);
    }
}
