package fxml;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
        System.out.println(campoEmail.getText());
        System.out.println(campoSenha.getText());
    }
}
