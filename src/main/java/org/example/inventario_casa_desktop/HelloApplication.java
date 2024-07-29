package org.example.inventario_casa_desktop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Vista/Ingredientes.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root, 1080, 720);
        stage.setTitle("Inventario Casa Vers. Desktop");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}