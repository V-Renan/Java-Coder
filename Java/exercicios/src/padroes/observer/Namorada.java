package padroes.observer;

/**
 * @author Victor$
 * @date 11/20/2023$
 * Description:
 */
public class Namorada implements ObservadorChegadaAniversariante{

    public void Chegou(EventoChegadaAniversariante evento) {
        System.out.println("Avisar os convidados...");
        System.out.println("Apagar as luzes...");
        System.out.println("Esperar um pouco...");
        System.out.println("e... SURPRESA!!");
    }
}
