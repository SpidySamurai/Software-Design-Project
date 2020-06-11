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
public class HeladoVainilla extends Articulo implements IHelado {

    public HeladoVainilla() {
        super("Helado Vainilla", "HEL03", "HELBASH", 9.5);
    }

    @Override
    public double precio() {
        return 9.5;

    }

}
