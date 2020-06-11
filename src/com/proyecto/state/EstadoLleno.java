/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.state;

import com.proyecto.base.Articulo;
import com.proyecto.base.CarritoCompras;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class EstadoLleno implements IEstado {

    @Override
    public void añadirAlCarrito(Articulo producto, CarritoCompras carritoCompras) {
        JOptionPane.showMessageDialog(null, "Carrito lleno");
    }

    @Override
    public void quitarDelCarrito(Articulo producto, CarritoCompras carritoCompras) {
        carritoCompras.getArticulosCarrito().remove(producto);
        carritoCompras.setEstadoActual(new EstadoConArticulos());
        
    }

}
