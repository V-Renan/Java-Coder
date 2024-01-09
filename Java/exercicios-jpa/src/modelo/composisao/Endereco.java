package modelo.composisao;

import javax.persistence.Embeddable;

/**
 * @author Victor$
 * @date 09/01/2024$
 * Description:
 */

@Embeddable
public class Endereco {

    private String longradouro;
    private String complemento;

    public String getLongradouro() {
        return longradouro;
    }

    public void setLongradouro(String longradouro) {
        this.longradouro = longradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
