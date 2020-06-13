package com.proyecto.entidades.relojeria;

import com.proyecto.base.Articulo;
import com.proyecto.base.CarritoCompras;
import com.proyecto.base.Cliente;
import com.proyecto.base.Tienda;
import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public class Relojeria extends Tienda {

    private static Relojeria tiendaRelojeria;

    private Relojeria() {
        super("Relojeria", "RELBASH");
    }

    public static Tienda getInstance() {
        if (tiendaRelojeria == null) {
            tiendaRelojeria = new Relojeria();
            return tiendaRelojeria;
        }
        return tiendaRelojeria;
    }

}
