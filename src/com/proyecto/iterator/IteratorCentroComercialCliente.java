/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.iterator;

import com.proyecto.base.CentroComercial;
import com.proyecto.base.Cliente;

/**
 *
 * @author Javier
 */
public class IteratorCentroComercialCliente implements Iterator {

    private final CentroComercial centroComercial;
    private int posicion;

    public IteratorCentroComercialCliente(CentroComercial centroC) {
        this.centroComercial = centroC;
    }

    @Override
    public Cliente siguiente() {
        return this.centroComercial.getClientes().get(posicion++);
    }

    @Override
    public boolean contieneSiguiente() {
        return this.posicion < this.centroComercial.getClientes().size();
    }

}
