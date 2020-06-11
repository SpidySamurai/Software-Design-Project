/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.state;

import com.proyecto.base.Articulo;
import com.proyecto.base.CarritoCompras;

/**
 *
 * @author Javier
 */
public class EstadoCancelado implements IEstado {

    @Override
    public void añadirAlCarrito(Articulo producto, CarritoCompras carritoCompras) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void quitarDelCarrito(Articulo producto, CarritoCompras carritoCompras) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
