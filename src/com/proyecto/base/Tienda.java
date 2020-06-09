/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.base;

import com.proyecto.abstractfactory.FactoryTienda;
import com.proyecto.singleton.Singleton;
import java.util.ArrayList;
import java.util.Enumeration;

/**
 *
 * @author Javier
 */
public abstract class Tienda {

    private String nombreTienda;
    private int idTienda;
    private ArrayList<Articulo> articulosTienda;
    private ArrayList<Cliente> clientesTienda;
    
    

}
