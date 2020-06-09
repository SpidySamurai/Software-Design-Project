/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.base;

import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public class Articulo {

    private String nombreArt;
    private String idArticulo;
    private String idTienda;
    private String precio;
    private ArrayList<Articulo> listaArticulos;

    public Articulo() {
        this.listaArticulos = new ArrayList<Articulo>();
    }

    public void addArticulo(Articulo art) {
        this.listaArticulos.add(art);
    }

    public ArrayList<Articulo> getArticulo() {
        return this.listaArticulos;
    }
}
