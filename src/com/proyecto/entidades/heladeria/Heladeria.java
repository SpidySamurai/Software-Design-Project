package com.proyecto.entidades.heladeria;

import com.proyecto.base.Articulo;
import com.proyecto.base.CarritoCompras;
import com.proyecto.base.Cliente;
import com.proyecto.base.Tienda;
import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public class Heladeria extends Tienda {

    private static Heladeria tiendaHeladeria;

    public Heladeria() {
        super("Heladeria", "HELBASH");
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
        if (tiendaHeladeria == null) {
            tiendaHeladeria = new Heladeria();
            return tiendaHeladeria;
        }
        return tiendaHeladeria;
    }

}
