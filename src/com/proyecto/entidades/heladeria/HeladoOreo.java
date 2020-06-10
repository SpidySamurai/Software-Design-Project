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
public class HeladoOreo extends Articulo implements IHelado{

    public HeladoOreo() {
        super("Helado Oreo", "HEL05", "HELBASH", 12.5);
    }

    @Override
    public double precio() {
        return 12.5;
    }
    
}
