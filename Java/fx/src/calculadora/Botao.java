package calculadora;

import javafx.scene.control.Button;

import java.util.function.Consumer;

/**
 * @author Victor$
 * @date 06/02/2024$
 * Description:
 */
public class Botao extends Button {

    public Botao(String texto, Consumer<String> func, String... classesCSS) {
        super(texto);

        getStyleClass().add("botao");

        setOnAction(e -> func.accept(getText()));

        for(String classeCSS: classesCSS) {
            getStyleClass().add(classeCSS);
        }
    }
}