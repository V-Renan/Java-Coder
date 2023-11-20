package padroes.observer;

/**
 * @author Victor$
 * @date 11/20/2023$
 * Description:
 */
public class AniversarioSurpresa {

    public static void main(String[] args) {

        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.registrarObservador(namorada);

        porteiro.registrarObservador(e -> {
            System.out.println("Surpresa via lambda!!");
            System.out.println("Ocorreu em: " + e.getMomento());
        });
        porteiro.monitorar();
    }
}
