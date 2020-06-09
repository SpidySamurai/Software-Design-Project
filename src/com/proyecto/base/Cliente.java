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
public class Cliente {

    private final String nombreCliente;
    private CarritoCompras carrito;
    private Tienda tiendaActual;

    public Cliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

}
