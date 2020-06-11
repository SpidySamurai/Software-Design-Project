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
public interface IEstado {

    public void añadirAlCarrito(Articulo producto, CarritoCompras carritoCompras);

    public void quitarDelCarrito(Articulo producto, CarritoCompras carritoCompras);

}
