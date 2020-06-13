package com.proyecto.entidades.heladeria;

import com.proyecto.base.Articulo;
import com.proyecto.decorator.IHelado;

/**
 *
 * @author LEFT4
 */
public class HeladoFresa extends Articulo implements IHelado {

    public HeladoFresa() {
        super("Helado Fresa", "HEL04", "HELBASH", 10);
    }

    @Override
    public double precio() {
        return 10;
    }

}
