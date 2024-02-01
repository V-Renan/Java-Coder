package fxml;

import javafx.animation.PauseTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

/**
 * @author Victor$
 * @date 31/01/2024$
 * Description:
 */
public class LoginControlador {
    @FXML
    private TextField campoEmail;
    @FXML
    private PasswordField campoSenha;
    public void entrar() {
        sucesso();
    }
    private boolean emailIsValido() {
        return campoEmail.getText().equals("teste@teste.com");
    }
    private boolean senhaIsValido() {
        return campoSenha.getText().equals("teste123");
    }
    private void sucesso() {
        if (emailIsValido() && senhaIsValido()) {
            Notifications.create().title("login FXML")
                    .position(Pos.CENTER)
                    .text("Login efetuado com sucesso!")
                    .showInformation();
        } else {
            Notifications.create().title("login FXML")
                    .position(Pos.CENTER)
                    .text("Usuario e Senha invalidos!")
                    .showError();
        }
    }
    @FXML
    private void sair() {
        Notifications.create()
                .title("Sair")
                .position(Pos.CENTER)
                .text("Encerrando...")
                .showInformation();

        PauseTransition pause = new PauseTransition(Duration.seconds(2));
        pause.setOnFinished(e -> encerrar());
        pause.play();
    }

    private void encerrar() {
        System.exit(0);
    }
}
