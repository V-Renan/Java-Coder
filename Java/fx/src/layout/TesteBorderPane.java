package layout;

import javafx.scene.layout.BorderPane;

/**
 * @author Victor$
 * @date 30/01/2024$
 * Description:
 */
public class TesteBorderPane extends BorderPane {
    public TesteBorderPane() {
        Caixa c1 = new Caixa().comTexto("TOPO");
        setTop(c1);

        Caixa c2 = new Caixa().comTexto("ESQUERDA");
        setLeft(c2);

        Caixa c3 = new Caixa().comTexto("DIREITA");
        setRight(c3);

        Caixa c4 = new Caixa().comTexto("FUNDO");
        setBottom(c4);

        Caixa c5 = new Caixa().comTexto("AREA CENTRAL");
        setCenter(c5);
    }
}
