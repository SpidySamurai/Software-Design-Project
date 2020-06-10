/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.base;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public final class CarritoCompras {

    private ArrayList<Articulo> articulos;
    private final int capacidad; //Numero limite de articulos que se pueden llevar en un carrito

    public CarritoCompras(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Articulo> getArticulosCarrito() {
        return this.articulos;
    }

    public void añadirAlCarrito(Articulo producto) {
        if (this.articulos.size() != this.capacidad) {
            this.articulos.add(producto);
        } else {
            JOptionPane.showMessageDialog(null, "Capacidad del carrito excedida");
        }
    }
}
