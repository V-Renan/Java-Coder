package generics;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * @author Victor$
 * @date 11/17/2023$
 * Description:
 */
public class Par<C, V>{

    private C chave;
    private V valor;

    public Par() {

    }

    public Par(C chave, V valor) {
        super();
        this.chave = chave;
        this.valor = valor;
    }

    public C getChave() {
        return chave;
    }

    public void setChave(C chave) {
        this.chave = chave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Par<?, ?> par = (Par<?, ?>) o;
        return Objects.equals(chave, par.chave);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chave);
    }
}
