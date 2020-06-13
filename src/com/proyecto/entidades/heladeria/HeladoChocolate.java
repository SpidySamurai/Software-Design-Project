package com.proyecto.entidades.heladeria;

import com.proyecto.base.Articulo;
import com.proyecto.decorator.IHelado;

/**
 *
 * @author LEFT4
 */
public class HeladoChocolate extends Articulo implements IHelado {

    public HeladoChocolate() {
        super("Helado Chocolate", "HEL01", "HELBASH", 9.5);
    }

    @Override
    public double precio() {
        return 9.5;
    }

}
