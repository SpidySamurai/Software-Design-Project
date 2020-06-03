/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.provisional;

import com.proyecto.abstractfactory.FactoryTienda;
import java.util.ArrayList;
import java.util.Enumeration;

/**
 *
 * @author Javier
 */
public class Tienda implements FactoryTienda{
    private String nombreTienda;
    private String idTienda;
    private ArrayList<Articulo> articulos;
    private ArrayList<Cliente> clientes;

    @Override
    public void entrar() {
        
    }

    @Override
    public void salir() {
        
    }
    
    public Enumeration clientesTienda(){
        return null;
        
    }
    
    public Enumeration articulosTienda(){
        return null;
        
    }
    
    public void addACarrito(CarritodeCompras cdc, Articulo art){
        
    }
    
    public void ElimDeCarrito(CarritodeCompras cdc, Articulo art){
        
    }
    
    public void addArticulo(Articulo art){
        
    }
    
//    public void crearPaquete(ArrayList articulos, descuento){
//        METODO POR ACLARAR QUE RECIBIRA EXACTAMENTE
//    }
    
}
