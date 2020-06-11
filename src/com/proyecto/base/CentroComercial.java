package com.proyecto.base;

import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public final class CentroComercial {

    private final String nombreCentro = "BASH";
    private final ArrayList<Tienda> listaTiendas;
    private final ArrayList<Cliente> listaClientes;

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
    public CarritoCompras getCarrito(int capacidad) {
        return new CarritoCompras(capacidad);
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

    public String getNombreCentro() {
        return nombreCentro;
    }

    public ArrayList<Tienda> getListaTiendas() {
        return listaTiendas;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

}
