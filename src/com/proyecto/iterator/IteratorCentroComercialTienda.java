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
        return this.centroComercial.getTiendas().size() > posicion;
    }

}
