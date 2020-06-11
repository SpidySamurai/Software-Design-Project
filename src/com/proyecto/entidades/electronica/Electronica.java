package com.proyecto.entidades.electronica;

import com.proyecto.base.Articulo;
import com.proyecto.base.CarritoCompras;
import com.proyecto.base.Cliente;
import com.proyecto.base.Tienda;
import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public class Electronica extends Tienda {

    private static Electronica tiendaElectronica;

    private Electronica() {
        super("Electronica", "ELEBASH");
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
        if (tiendaElectronica == null) {
            tiendaElectronica = new Electronica();
            return tiendaElectronica;
        }
        return tiendaElectronica;
    }

}
