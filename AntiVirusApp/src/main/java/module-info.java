module com.example.antivirusapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.antivirusapp to javafx.fxml;
    exports com.example.antivirusapp;
}