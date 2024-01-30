package Basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Victor$
 * @date 26/01/2024$
 * Description:
 */
public class Contador extends Application {

    private int contador = 0;
    private void atualizarLabelNumero(Label label) {
        label.setText(Integer.toString(contador));

        label.getStyleClass().remove("verde");
        label.getStyleClass().remove("vermelho");
        if (contador > 0) {
            label.getStyleClass().add("verde");
        } else if (contador < 0) {
            label.getStyleClass().add("vermelho");
        }
    }

    @Override
    public void start(Stage stage) throws Exception {

        Label labelTitulo = new Label("Contador");
        labelTitulo.getStyleClass().add("titulo");

        Label labelNumero = new Label("0");
        labelNumero.getStyleClass().add("numero");

        Button botaoDecremento = new Button("-");
        botaoDecremento.getStyleClass().add("botoes");
        botaoDecremento.setOnAction(e -> {
            contador--;
            atualizarLabelNumero(labelNumero);
        });
        Button botaoIncremento = new Button("+");
        botaoIncremento.getStyleClass().add("botoes");
        botaoIncremento.setOnAction(e -> {
            contador++;
            atualizarLabelNumero(labelNumero);
        });

        Button botaoSair = new Button("Sair");
        botaoSair.setOnAction(e -> {
            System.out.println("Encerrando!");
            System.exit(0);
        });


        HBox boxBotoes = new HBox();
        boxBotoes.setAlignment(Pos.CENTER);
        boxBotoes.setSpacing(10);
        boxBotoes.getChildren().add(botaoDecremento);
        boxBotoes.getChildren().add(botaoIncremento);
        HBox boxBotoes2 = new HBox();
        boxBotoes2.setAlignment(Pos.BASELINE_RIGHT);
        boxBotoes2.getChildren().add(botaoSair);

        VBox boxConteudo = new VBox();
        boxConteudo.getStyleClass().add("conteudo");
        boxConteudo.setSpacing(10);
        boxConteudo.setAlignment(Pos.CENTER);
        boxConteudo.getChildren().add(labelTitulo);
        boxConteudo.getChildren().add(labelNumero);
        boxConteudo.getChildren().add(boxBotoes);
        boxConteudo.getChildren().add(boxBotoes2);

        String caminhoCss = getClass().getResource("/Basico/Contador.css")
                .toExternalForm();

        Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
        cenaPrincipal.getStylesheets().add(caminhoCss);
        cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");


        stage.setScene(cenaPrincipal);
        stage.show();

        stage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}
