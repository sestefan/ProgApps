/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatype;

/**
 *
 * @author sestefan
 */
public abstract class DataProducto {

    private String nombre;
    private String descripcion;
    private String rutaImagen;
    private DataStockProducto stock;
    private DataRestaurante dataRestaurante;

    public DataProducto(String nombre, String descripcion, String rutaImagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
    }

    public DataProducto(String nombre, String descripcion, String rutaImagen, DataStockProducto stock, DataRestaurante dataRestaurante) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.stock = stock;
        this.dataRestaurante = dataRestaurante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public DataStockProducto getStock() {
        return stock;
    }

    public DataRestaurante getDataRestaurante() {
        return dataRestaurante;
    }

}
