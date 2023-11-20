package padroes.observer;

import java.util.Date;

/**
 * @author Victor$
 * @date 11/20/2023$
 * Description:
 */
public class EventoChegadaAniversariante {

    private final Date momento;

    public EventoChegadaAniversariante(Date momento) {
        this.momento = momento;
    }

    public Date getMomento() {
        return momento;
    }
}
