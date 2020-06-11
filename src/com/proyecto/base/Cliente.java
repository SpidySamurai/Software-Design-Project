package com.proyecto.base;

/**
 *
 * @author Javier
 */
public final class Cliente {

    private final String nombreCliente;
    private CarritoCompras carrito;
    private Tienda tiendaActual;

    public Cliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setCarrito(CarritoCompras carrito) {
        this.carrito = carrito;
    }

    public void setTiendaActual(Tienda tiendaActual) {
        this.tiendaActual = tiendaActual;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public CarritoCompras getCarrito() {
        return carrito;
    }

    public Tienda getTiendaActual() {
        return tiendaActual;
    }

}
