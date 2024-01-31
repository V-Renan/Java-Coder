package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 30/01/2024$
 * Description:
 */
public class TesteTilePane extends TilePane {
    public TesteTilePane() {
        List<Quadrado> quadrados = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            quadrados.add(new Quadrado(i * 10));
        }

        setPadding(new Insets(20, 10, 20, 10));
        setVgap(10);
        setHgap(10);
        setOrientation(Orientation.VERTICAL);
        setTileAlignment(Pos.BOTTOM_RIGHT);
        getChildren().addAll(quadrados);
    }
}
