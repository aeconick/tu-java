module com.example.upr3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.upr3 to javafx.fxml;
    exports com.example.upr3;
}