package com.proyecto.iterator;

import com.proyecto.base.Tienda;

/**
 *
 * @author Javier
 */
public class IteratorTiendaCliente implements Iterator {

    private final Tienda tienda;
    private int posicion;

    public IteratorTiendaCliente(Tienda tienda) {
        this.tienda = tienda;

    }

    @Override
    public Object siguiente() {
        return this.tienda.getClientesTienda().get(posicion++);
    }

    @Override
    public boolean contieneSiguiente() {
        return this.posicion < this.tienda.getClientesTienda().size();
    }

}
