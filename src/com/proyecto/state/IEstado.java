package com.proyecto.state;

import com.proyecto.base.Articulo;
import com.proyecto.base.CarritoCompras;

/**
 *
 * @author Javier
 */
public interface IEstado {

    public void añadirAlCarrito(Articulo producto, CarritoCompras carritoCompras);

    public void quitarDelCarrito(Articulo producto, CarritoCompras carritoCompras);

}
