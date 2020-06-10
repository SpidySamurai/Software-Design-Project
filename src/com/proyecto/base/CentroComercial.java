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
public final class CentroComercial {

    private final String NOMBRE_CENTRO_COMERCIAL = "BASH";
    private ArrayList<Tienda> listaTiendas;
    private ArrayList<Cliente> listaClientes;

    public CentroComercial() {
        listaTiendas = new ArrayList<>();
        listaClientes = new ArrayList<>();
    }

    public void entrarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void salirCliente(Cliente cliente) {
        listaClientes.remove(cliente);
    }

    //Metodo usado para darle al cliente un carrito
    public CarritoCompras getCarrito() {
        return new CarritoCompras();
    }

    public ArrayList<Cliente> getClientes() {
        return this.listaClientes;
    }

    public ArrayList<Tienda> getTiendas() {
        return this.listaTiendas;
    }

    public void pagar(CarritoCompras carrito) {
        //A considerar implementación
    }

}
