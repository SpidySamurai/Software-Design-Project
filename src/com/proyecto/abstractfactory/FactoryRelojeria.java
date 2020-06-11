/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.abstractfactory;

import com.proyecto.base.Tienda;

import com.proyecto.entidades.relojeria.Relojeria;

/**
 *
 * @author Javier
 */
public class FactoryRelojeria implements FactoryTienda {

    @Override
    public Tienda crearTienda() {
        return Relojeria.getInstance();

    }

}
