package com.proyecto.state;

import com.proyecto.base.Articulo;
import com.proyecto.base.CarritoCompras;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class EstadoConArticulos implements IEstado {

    @Override
    public void añadirAlCarrito(Articulo producto, CarritoCompras carritoCompras) {
        if (carritoCompras.getArticulosCarrito().size() < carritoCompras.getCapacidad()) {
            carritoCompras.getArticulosCarrito().add(producto);
        } else {
            JOptionPane.showMessageDialog(null, "Carrito lleno.");
            carritoCompras.setEstadoActual(new EstadoLleno());
        }
    }

    @Override
    public void quitarDelCarrito(Articulo producto, CarritoCompras carritoCompras) {
        if (carritoCompras.getArticulosCarrito().size() > 0) {
            carritoCompras.getArticulosCarrito().remove(producto);
        } else {
            JOptionPane.showMessageDialog(null, "Carrito vacio.");
            carritoCompras.setEstadoActual(new EstadoVacio());
        }
    }

}
