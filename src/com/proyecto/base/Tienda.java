/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.base;



import com.proyecto.singleton.Singleton;
import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public abstract class Tienda implements Singleton{

    private final String nombreTienda;
    private final String idTienda;
    private final ArrayList<Articulo> articulosTienda;
    private final ArrayList<Cliente> clientesTienda;

    protected Tienda(String nombreTienda, String idTienda) {
        articulosTienda = new ArrayList<>();
        clientesTienda = new ArrayList<>();
        this.nombreTienda = nombreTienda;
        this.idTienda = idTienda;
    }

    public abstract void entrarCliente(Cliente cliente);

    public abstract void salirCliente(Cliente cliente);

    public abstract ArrayList<Cliente> getClientesTienda();

    public abstract ArrayList<Articulo> getArticulosTienda();

    public abstract void añadirAlCarrito(CarritoCompras carritoCompras, Articulo producto);

    public abstract void eliminarDelCarrito(CarritoCompras carritoCompras, Articulo producto);

    public abstract void añadirProductoTienda(Articulo producto);

    public abstract void crearPaquete(ArrayList<Articulo> productos, double descuento);

    public String getNombreTienda() {
        return nombreTienda;
    }

    public String getIdTienda() {
        return idTienda;
    }


}
