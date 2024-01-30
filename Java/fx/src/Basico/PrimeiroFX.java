package Basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * @author Victor$
 * @date 26/01/2024$
 * Description:
 */
public class PrimeiroFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button botaoA = new Button("A");
        Button botaoB = new Button("B");
        Button botaoC = new Button("C");

        botaoC.setOnAction(e -> System.exit(0));
        botaoB.setOnAction(e -> System.out.println("Teste"));
        botaoA.setOnAction(e -> System.out.println("Hello Victor!"));

        HBox box = new HBox();
        box.setSpacing(10);
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(botaoA);
        box.getChildren().add(botaoB);
        box.getChildren().add(botaoC);

        Scene cena = new Scene(box, 150, 100);

        primaryStage.setScene(cena);
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}
