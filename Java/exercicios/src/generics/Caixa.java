package generics;

/**
 * @author Victor$
 * @date 11/16/2023$
 * Description:
 */
public class Caixa<T> {

    private T coisa;

    public void guardar(T coisa) {
        this.coisa = coisa;
    }

    public T abrir() {
        return coisa;
    }
}
