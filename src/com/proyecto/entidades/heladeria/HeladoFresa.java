/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entidades.heladeria;

import com.proyecto.base.Articulo;
import com.proyecto.decorator.IHelado;

/**
 *
 * @author LEFT4
 */
public class HeladoFresa extends Articulo implements IHelado {

    public HeladoFresa(String nombreArt, String idArt, String idTienda, double precioArt) {
        super("Helado Fresa", "HEL04", "HELBASH", 10);
    }

    @Override
    public double precio() {
        return 10;
    }

}
