/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.abstractfactory;

import com.proyecto.base.Tienda;
import com.proyecto.entidades.heladeria.Heladeria;

/**
 *
 * @author Javier
 */
public class FactoryHeladeria implements FactoryTienda {

    @Override
    public Tienda crearTienda() {
        return Heladeria.getInstance();
    }

}
