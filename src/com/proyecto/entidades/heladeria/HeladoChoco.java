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
public class HeladoChoco extends Articulo implements IHelado {
//    private String nombreArt = "Helado de Chocolate";
//    private String idArt = "HEL01";
//    private String idTienda = "HELBASH";
//    private double precioArticulo = precio();

    public HeladoChoco(String nombreArt, String idArt, String idTienda, double precioArticulo) {
        super("Helado Chocolate", "HEL01", "HELBASH", 9.5);
    }

    @Override
    public double precio() {
        return 9.5;
    }

}
