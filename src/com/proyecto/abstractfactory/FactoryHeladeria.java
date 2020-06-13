package com.proyecto.abstractfactory;

import com.proyecto.base.Tienda;
import com.proyecto.entidades.heladeria.Heladeria;

public class FactoryHeladeria implements FactoryTienda {

    @Override
    public Tienda crearTienda() {
        return Heladeria.getInstance();

    }

}
