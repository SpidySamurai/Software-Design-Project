package com.proyecto.entidades.electronica;

import com.proyecto.base.Articulo;
import com.proyecto.base.CarritoCompras;
import com.proyecto.base.Cliente;
import com.proyecto.base.Tienda;
import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public class Electronica extends Tienda {

    private static Electronica tiendaElectronica;

    private Electronica() {
        super("Electronica", "ELEBASH");
    }

    public static Tienda getInstance() {
        if (tiendaElectronica == null) {
            tiendaElectronica = new Electronica();
            return tiendaElectronica;
        }
        return tiendaElectronica;
    }

}
