package com.proyecto.abstractfactory;

import com.proyecto.base.Tienda;
import com.proyecto.entidades.electronica.Electronica;

/**
 *
 * @author Javier
 */
public class FactoryElectronica implements FactoryTienda {

    @Override
    public Tienda crearTienda() {
        return Electronica.getInstance();

    }

}
