package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @author Victor$
 * @date 11/20/2023$
 * Description:
 */
public class Porteiro {

    private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();

    public void registrarObservador(ObservadorChegadaAniversariante observador) {
        observadores.add(observador);
    }

    public void monitorar() {
        Scanner scan = new Scanner(System.in);

        String valor = "";

        while (!"sair".equalsIgnoreCase(valor)) {

            System.out.println("Aniversariante chegou? ");
            valor = scan.nextLine();

            if ("sim".equalsIgnoreCase(valor)) {
                // Criar o envento
                EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
                // notificar os observadores!
                observadores.stream().forEach(o -> o.Chegou(evento));
                valor = "sair";
            } else {
                System.out.println("Alarme falso!");
            }
        }

        scan.close();
    }
}
