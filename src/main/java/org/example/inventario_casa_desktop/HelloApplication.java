package org.example.inventario_casa_desktop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.inventario_casa_desktop.Controlador.IngredientesController;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Vista/Ingredientes.fxml"));
        Parent root = fxmlLoader.load();

        IngredientesController controladorIngredientes = new IngredientesController();
        controladorIngredientes.cargarIngredientes();

        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}