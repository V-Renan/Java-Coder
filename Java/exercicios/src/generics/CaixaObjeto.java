package generics;

/**
 * @author Victor$
 * @date 11/16/2023$
 * Description:
 */
public class CaixaObjeto {

    private Object coisa;

    public void guardar(Object coisa) {
        this.coisa = coisa;
    }

    public Object abrir() {
        return coisa;
    }
}
