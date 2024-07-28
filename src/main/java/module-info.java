module org.example.inventario_casa_desktop {
    requires javafx.controls;
    requires javafx.fxml;

    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires org.mongodb.driver.sync.client;

    opens org.example.inventario_casa_desktop to javafx.fxml;
    exports org.example.inventario_casa_desktop;
    exports org.example.inventario_casa_desktop.Controlador;
    opens org.example.inventario_casa_desktop.Controlador to javafx.fxml;
    exports org.example.inventario_casa_desktop.Modelo;
    opens org.example.inventario_casa_desktop.Modelo to javafx.fxml;
}