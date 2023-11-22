package br.com.victor.calc.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 11/22/2023$
 * Description:
 */
public class Memoria {

    private static final Memoria instancia = new Memoria();

    private final List<MemoriaObservador> observadores = new ArrayList<>();

    private String textoAtual = "";

    private Memoria() {
        return;
    }

    public static Memoria getInstancia() {
        return instancia;
    }

    public void adicionarObservador(MemoriaObservador observador) {
        observadores.add(observador);
    }

    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }

    public void processarComando(String valor) {

        if ("AC".equals(valor)) {
            textoAtual = "";
        } else {
            textoAtual += valor;
        }

        observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
    }
}
