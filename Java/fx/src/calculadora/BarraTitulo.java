package calculadora;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 * @author Victor$
 * @date 06/02/2024$
 * Description:
 */
public class BarraTitulo extends HBox {
    private Button botaoFechar = new Button();

    public BarraTitulo() {
        getStyleClass().add("barra-titulo");

        botaoFechar.setOnAction(e -> System.exit(0));

        setOnMouseEntered(e -> botaoFechar.setText("x"));
        setOnMouseExited(e -> botaoFechar.setText(""));

        botaoFechar.getStyleClass().add("botao-fechar");
        getChildren().add(botaoFechar);
    }
}
