package org.example.inventario_casa_desktop.Controlador;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.inventario_casa_desktop.Modelo.IngredienteModel;

public class IngredientesController {
    @FXML
    private TableView<IngredienteModel> tablaDatos;

    @FXML
    public void cargarIngredientes(){
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
