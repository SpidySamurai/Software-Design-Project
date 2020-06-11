package com.proyecto.entidades.heladeria;

import com.proyecto.decorator.DecoradorHelado;

/**
 *
 * @author LEFT4
 */
public class ConoChocolate extends DecoradorHelado {

    private final double precio = 10;

    @Override
    public double precio() {
        return this.getHelado().precio() + precio;
    }

}
