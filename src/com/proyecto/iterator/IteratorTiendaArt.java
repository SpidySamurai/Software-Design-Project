package com.proyecto.iterator;

import com.proyecto.base.Articulo;
import com.proyecto.base.Tienda;

/**
 *
 * @author Javier
 */
public class IteratorTiendaArt implements Iterator {

    private final Tienda tienda;
    private int posicion;

    public IteratorTiendaArt(Tienda tienda) {
        this.tienda = tienda;
    }

    @Override
    public Articulo siguiente() {
        return this.tienda.getArticulosTienda().get(posicion++);
    }

    @Override
    public boolean contieneSiguiente() {
        return this.posicion < this.tienda.getArticulosTienda().size();
    }

}
