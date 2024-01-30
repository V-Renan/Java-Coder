package layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Victor$
 * @date 29/01/2024$
 * Description:
 */
public class AppLayout extends Application {
    @Override
    public void start(Stage stage) throws Exception {
//        VBox temp = new VBox();
//        temp.getChildren().add(new Caixa().comTexto("1"));
//        temp.getChildren().add(new Caixa().comTexto("2"));
//        temp.getChildren().add(new Caixa().comTexto("3"));
//        temp.getChildren().add(new Caixa().comTexto("4"));
//        temp.getChildren().add(new Caixa().comTexto("5"));
//        temp.getChildren().add(new Caixa().comTexto("6"));
//        temp.getChildren().add(new Caixa().comTexto("7"));

//        temp.getChildren().add(new Quadrado());
//        temp.getChildren().add(new Quadrado());
//        temp.getChildren().add(new Quadrado());
//        temp.getChildren().add(new Quadrado());
//        temp.getChildren().add(new Quadrado());
//        temp.getChildren().add(new Quadrado());
//        temp.getChildren().add(new Quadrado());
//        Scene principal = new Scene(temp, 800, 600);

        Scene principal = new Scene(new TesteAnchorPane(), 800, 600);
        stage.setScene(principal);
        stage.show();
        stage.setTitle("Gerenciadores de LayOut");
    }
    public static void main(String[] args) {
        launch(args);
    }
}
