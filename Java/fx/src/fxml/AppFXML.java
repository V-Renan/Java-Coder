package fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;

/**
 * @author Victor$
 * @date 31/01/2024$
 * Description:
 */
public class AppFXML extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        String arquivoCSS = getClass().getResource("/fxml/Login.css").toExternalForm();
        URL arquivoFXML = getClass().getResource("/fxml/Login.fxml");
        GridPane raiz = FXMLLoader.load(arquivoFXML);

        Scene cena = new Scene(raiz,350,350);
        cena.getStylesheets().add(arquivoCSS);
        stage.setResizable(false);
        stage.setTitle("Tela de Login");
        stage.setScene(cena);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
