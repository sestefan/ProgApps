/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manejador;

import java.util.ArrayList;
import java.util.HashMap;
import modelo.Categoria;
import modelo.Restaurante;

/**
 *
 * @author Sebastián Estefan
 */
public class ManejadorCategoria {

    private static ManejadorCategoria instancia;
    private final HashMap<String, Categoria> categorias;

    private ManejadorCategoria() {
        categorias = new HashMap<>();
    }

    public static ManejadorCategoria getInstance() {
        if (instancia == null) {
            instancia = new ManejadorCategoria();
        }
        return instancia;
    }

    public boolean existeCategoriaNombre(String nombre) {
        return categorias.containsKey(nombre);
    }

    /**
     *
     * @param categoria
     */
    public void ingresarCategoria(Categoria categoria) {
        String nombre = categoria.getNombre();
        categorias.put(nombre, categoria);
    }

    /**
     *
     * @return
     */
    public ArrayList<Categoria> listarCategorias() {
        return (ArrayList<Categoria>) categorias.values();
    }

    /**
     *
     * @param nombre
     * @param r
     */
    public void agregarRestaurante(String nombre, Restaurante r) {
        Categoria c = categorias.get(nombre);
        c.agregarRestaurante(r);
    }

}
