/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.base;

/**
 *
 * @author Javier
 */
public class Articulo {

    private final String nombreArticulo;
    private final String idArticulo;
    private final String idTienda;
    private final double precioArticulo;

    public Articulo(String nombreArt, String idArt, String idTienda, double precioArt) {
        this.nombreArticulo = nombreArt;
        this.idArticulo = idArt;
        this.idTienda = idTienda;
        this.precioArticulo = precioArt;

    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public String getIdArticulo() {
        return idArticulo;
    }

    public String getIdTienda() {
        return idTienda;
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }

}
