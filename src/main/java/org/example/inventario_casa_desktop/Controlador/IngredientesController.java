package org.example.inventario_casa_desktop.Controlador;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.example.inventario_casa_desktop.HelloApplication;
import org.example.inventario_casa_desktop.Modelo.IngredienteModel;

import java.io.IOException;

public class IngredientesController{
    @FXML
    private TableView<IngredienteModel> tablaDatos;

    @FXML
    private void initialize(){
        cargarIngredientes();
    }
    @FXML
    protected void onAddIngredienteButtonClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Vista/AddIngrediente.fxml"));
        Parent root = fxmlLoader.load();

        Stage stage = new Stage();
        stage.setTitle("Añadir Ingrediente");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner((((Button) event.getSource()).getScene().getWindow()));
        Scene scene = new Scene(root, 600, 500);
        stage.setScene(scene);
        stage.showAndWait();
    }
    @FXML
    protected void cargarIngredientes(){
        TableColumn<IngredienteModel, String> columnaNombre = new TableColumn<>("Nombre");
        columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        TableColumn<IngredienteModel, Integer> columnaCantidad = new TableColumn<>("Cantidad");
        columnaCantidad.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
        tablaDatos.getColumns().add(columnaNombre);
        tablaDatos.getColumns().add(columnaCantidad);

        ObservableList<IngredienteModel> data = FXCollections.observableArrayList(
                new IngredienteModel(1,"Prueba1", 30),
                new IngredienteModel(2,"Prueba2", 302)
        );
        tablaDatos.setItems(data);
    }
}
