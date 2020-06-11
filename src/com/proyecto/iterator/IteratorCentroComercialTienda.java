/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.iterator;

import com.proyecto.base.CentroComercial;
import com.proyecto.base.Tienda;

/**
 *
 * @author Javier
 */
public class IteratorCentroComercialTienda implements Iterator {

    private final CentroComercial centroComercial;
    private int posicion;

    public IteratorCentroComercialTienda(CentroComercial centroComercial) {
        this.centroComercial = centroComercial;
    }

    @Override
    public Tienda siguiente() {
        return this.centroComercial.getTiendas().get(posicion++);
    }

    @Override
    public boolean contieneSiguiente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
