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
public class DataIndividual extends DataProducto {

    public DataIndividual(String nombre, String descripcion, String rutaImagen, DataStockProducto stock, String nickName) {
        super(nombre, descripcion, rutaImagen, stock, nickName);
    }

    public DataIndividual(String nombre, String descripcion, String rutaImagen) {
        super(nombre, descripcion, rutaImagen);
    }

}
