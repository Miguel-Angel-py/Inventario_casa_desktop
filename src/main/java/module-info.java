module org.example.inventario_casa_desktop {
    requires javafx.controls;
    requires javafx.fxml;

    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.inventario_casa_desktop to javafx.fxml;
    exports org.example.inventario_casa_desktop;
    exports org.example.inventario_casa_desktop.Controlador;
    opens org.example.inventario_casa_desktop.Controlador to javafx.fxml;
}