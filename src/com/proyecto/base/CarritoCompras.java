package com.proyecto.base;

import com.proyecto.state.EstadoVacio;
import com.proyecto.state.IEstado;
import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public final class CarritoCompras {

    private ArrayList<Articulo> articulos;
    private final int capacidad; //Numero limite de articulos que se pueden llevar en un carrito

    //Implementación de state
    IEstado estadoActual;

    public CarritoCompras(int capacidad) {
        this.capacidad = capacidad;
        this.estadoActual = new EstadoVacio();
    }

    public ArrayList<Articulo> getArticulosCarrito() {
        return this.articulos;
    }

    public void añadirAlCarrito(Articulo producto) {
        this.estadoActual.añadirAlCarrito(producto, this);
    }

    public void quitarDelCarrito(Articulo producto) {
        this.estadoActual.quitarDelCarrito(producto, this);
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void setEstadoActual(IEstado estadoActual) {
        this.estadoActual = estadoActual;
    }

}
