/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.iterator;

import com.proyecto.base.Articulo;
import com.proyecto.base.CarritoCompras;

/**
 *
 * @author Javier
 */
public class IteratorCarritoComprasArt implements Iterator {

    private final CarritoCompras carritoCompras;
    private int posicion;

    public IteratorCarritoComprasArt(CarritoCompras carritoCompras) {
        this.carritoCompras = carritoCompras;
    }

    @Override
    public Articulo siguiente() {
        return carritoCompras.getArticulosCarrito().get(posicion++);
    }

    @Override
    public boolean contieneSiguiente() {
        return this.posicion < this.carritoCompras.getArticulosCarrito().size();
    }

}
