package com.proyecto.entidades.heladeria;

import com.proyecto.base.Articulo;
import com.proyecto.base.CarritoCompras;
import com.proyecto.base.Cliente;
import com.proyecto.base.Tienda;
import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public class Heladeria extends Tienda {

    private static Heladeria tiendaHeladeria;

    public Heladeria() {
        super("Heladeria", "HELBASH");
    }

    public static Tienda getInstance() {
        if (tiendaHeladeria == null) {
            tiendaHeladeria = new Heladeria();
            return tiendaHeladeria;
        }
        return tiendaHeladeria;
    }

}
