module exerciciosfx {
    opens Basico;
    opens layout;
    opens fxml;
    exports calculadora;
    requires org.controlsfx.controls;
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
}