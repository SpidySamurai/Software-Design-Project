package com.proyecto.abstractfactory;

import com.proyecto.base.Tienda;

import com.proyecto.entidades.relojeria.Relojeria;

/**
 *
 * @author Javier
 */
public class FactoryRelojeria implements FactoryTienda {

    @Override
    public Tienda crearTienda() {
        return Relojeria.getInstance();

    }

}
