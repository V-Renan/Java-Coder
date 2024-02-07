package calculadora;

import javafx.scene.layout.VBox;

/**
 * @author Victor$
 * @date 06/02/2024$
 * Description:
 */
public class Calculadora extends VBox {
    public Calculadora() {
        BarraTitulo barraTitulo = new BarraTitulo();
        Display display = new Display();
        Teclado teclado = new Teclado();

        getStyleClass().add("calculadora");

        getChildren().add(barraTitulo);
        getChildren().add(display);
        getChildren().add(teclado);

        teclado.noCliqueChame(texto -> {
            if (texto.equals("AC")) {
                display.limpar();
            } else {
                display.addTexto(texto);
            }
        });
    }
}
