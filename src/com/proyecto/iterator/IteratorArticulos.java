/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.iterator;

import com.proyecto.base.Tienda;
import com.proyecto.entidades.relojeria.Relojeria;
import java.util.Iterator;

/**
 *
 * @author Javier
 */
public class IteratorArticulos implements Iterator{
    
    private int[] listaArticulos;
    public IteratorArticulos(Tienda art){
        art.articulosTienda();
    }
    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
    



}
