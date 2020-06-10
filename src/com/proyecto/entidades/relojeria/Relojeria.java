/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entidades.relojeria;

import com.proyecto.base.Articulo;
import com.proyecto.base.CarritoCompras;
import com.proyecto.base.Cliente;
import com.proyecto.base.Tienda;
import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public class Relojeria extends Tienda {

    private static Relojeria tiendaRelojeria;

    private Relojeria() {
        super("Relojeria", "RELBASH");
    }

    @Override
    public void entrarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salirCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> getClientesTienda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Articulo> getArticulosTienda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void añadirAlCarrito(CarritoCompras carritoCompras, Articulo producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarDelCarrito(CarritoCompras carritoCompras, Articulo producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void añadirProductoTienda(Articulo producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearPaquete(ArrayList<Articulo> productos, double descuento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Tienda getInstance() {
        if (tiendaRelojeria == null) {
            tiendaRelojeria = new Relojeria();
            return tiendaRelojeria;
        }
        return tiendaRelojeria;
    }

}
