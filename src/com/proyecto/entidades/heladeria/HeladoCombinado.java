package com.proyecto.entidades.heladeria;

import com.proyecto.decorator.IHelado;
import com.proyecto.base.Articulo;

/**
 *
 * @author LEFT4
 */
public class HeladoCombinado extends Articulo implements IHelado {

    public HeladoCombinado() {
        super("Helado combinado", "HEL02", "HELBASH", 11.5);
    }

    @Override
    public double precio() {
        return 11.5;
    }

}
