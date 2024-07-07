package org.example.inventario_casa_desktop.Controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.inventario_casa_desktop.Modelo.IngredienteModel;

public class AddIngredienteController {

    @FXML
    private TextField tfNombre;
    @FXML
    private TextField tfCantidad;
    @FXML
    private Button botonAceptar;
    @FXML
    private Label labelSoloInts;

    @FXML
    private void initialize(){

    }

    @FXML
    private void valSoloInts(){
        if(tfCantidad.getText().matches(".*[a-zA-Z].*")){
           tfCantidad.setText(tfCantidad.getText().replaceAll("[a-zA-Z]", ""));
            labelSoloInts.visibleProperty().set(true);
        }else{
            labelSoloInts.visibleProperty().set(false);
        }
    }

    @FXML
    private void anadirIngrediente(){
        IngredienteModel ingredienteAnadir = new IngredienteModel(tfNombre.getText(), Integer.parseInt(tfCantidad.getText()));
    }

}
