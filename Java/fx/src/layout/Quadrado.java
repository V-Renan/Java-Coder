package layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * @author Victor$
 * @date 29/01/2024$
 * Description:
 */
public class Quadrado extends Rectangle {
    private static int i = 0;
    private String[] cores = {
            "#c33c5e", "39aac6", "28d79a",
            "#fb750e", "6657a8", "f9060e"
    };
    public Quadrado() {
        this(100, 100);
    }
    public Quadrado(int larg, int alt) {
        setWidth(larg);
        setHeight(alt);
        setFill(Color.web(cores[i]));
        i++;
        if (i == 6) {
            i = 0;
        }
    }
}
