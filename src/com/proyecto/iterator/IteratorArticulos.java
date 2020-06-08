/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.iterator;

import com.proyecto.base.Articulo;
import java.util.ArrayList;
//import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author Javier
 */
public class IteratorArticulos implements Iterator{
    
    private Articulo art;
    ArrayList<Articulo> listaArticulos;
    private int posicion;

    public IteratorArticulos(Articulo art){
        this.art = art;
    }

    @Override
    public boolean hasNext() {
        return this.posicion < this.art.getArticulo().size();
    }

    @Override
    public Articulo next() {
        return this.art.getArticulo().get(posicion++); //Falta una parte
    }
    



}
