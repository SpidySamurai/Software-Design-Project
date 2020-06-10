/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entidades.heladeria;

import com.proyecto.decorator.IHelado;
import com.proyecto.base.Articulo;

/**
 *
 * @author LEFT4
 */
public class HeladoCombinado extends Articulo implements IHelado {

    public HeladoCombinado(String nombreArt, String idArt, String idTienda, double precioArt) {
        super("Helado combinado", "HEL02", "HELBASH", 11.5);
    }

    @Override
    public double precio() {
        return 11.5;
    }

}
