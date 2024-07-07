package org.example.inventario_casa_desktop.Modelo;

public class IngredienteModel {

    private int Id;
    private String Nombre;
    private int Cantidad;

    public IngredienteModel(int id, String nombre, int cantidad) {
        Id = id;
        Nombre = nombre;
        Cantidad = cantidad;
    }

    public IngredienteModel(){}

    public IngredienteModel(String nombre, int cantidad){
        this.Nombre = nombre;
        this.Cantidad = cantidad;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "IngredienteModel{" +
                "Id=" + Id +
                ", Nombre='" + Nombre + '\'' +
                ", Cantidad=" + Cantidad +
                '}';
    }
}
