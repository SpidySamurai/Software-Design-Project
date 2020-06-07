/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entidades.heladeria;

import com.proyecto.decorator.DecoradorHelado;

/**
 *
 * @author LEFT4
 */
public class CerezasHelado extends DecoradorHelado{
    
    private double precio = 6;

    @Override
    public double precio() {
        return this.getHelado().precio() + precio;
    }

    
}