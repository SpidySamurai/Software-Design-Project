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
public class FactoryElectronica implements FactoryTienda{

    @Override
    public void entrar() {
        
    }

    @Override
    public void salir() {
        
    }

    @Override
    public Heladeria CreateHelado() {
        return null;
    }

    @Override
    public Relojeria CreateReloj() {
        return null;
    }

    @Override
    public Electronica CreateElectronico() {
        return new Electronica();
    }

}
