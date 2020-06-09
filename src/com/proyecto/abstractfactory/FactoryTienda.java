/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.abstractfactory;

import com.proyecto.entidades.electronica.Electronica;
import com.proyecto.entidades.heladeria.Heladeria;
import com.proyecto.entidades.relojeria.Relojeria;

/**
 *
 * @author Javier
 */
public interface FactoryTienda{

    abstract void entrar();

    abstract void salir();
    
    abstract Heladeria CreateHelado();
    
    abstract Relojeria CreateReloj();
    
    abstract Electronica CreateElectronico();
}
