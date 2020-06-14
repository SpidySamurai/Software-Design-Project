package com.proyecto.base;

import com.proyecto.singleton.Singleton;
import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public abstract class Tienda implements Singleton {

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

    public void entrarCliente(Cliente cliente) {
        this.clientesTienda.add(cliente);
    }

    public void salirCliente(Cliente cliente) {
        this.clientesTienda.remove(cliente);

    }

    public void añadirAlCarrito(CarritoCompras carritoCompras, Articulo producto) {
        this.articulosTienda.remove(producto);

        carritoCompras.añadirAlCarrito(producto);
    }

    public void eliminarDelCarrito(CarritoCompras carritoCompras, Articulo producto) {
        carritoCompras.quitarDelCarrito(producto);
    }

    public void añadirProductoTienda(Articulo producto) {
        this.articulosTienda.add(producto);

    }

    public void crearPaquete(ArrayList<Articulo> productos, double descuento) {

    }

    public ArrayList<Articulo> getArticulosTienda() {
        return articulosTienda;
    }

    public ArrayList<Cliente> getClientesTienda() {
        return clientesTienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public String getIdTienda() {
        return idTienda;
    }

    @Override
    public String toString() {
        return this.getNombreTienda();
    }

}
