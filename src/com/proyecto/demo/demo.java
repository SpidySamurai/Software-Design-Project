package com.proyecto.demo;

import com.proyecto.abstractfactory.FactoryElectronica;
import com.proyecto.abstractfactory.FactoryHeladeria;
import com.proyecto.abstractfactory.FactoryRelojeria;
import com.proyecto.base.CentroComercial;
import com.proyecto.base.Cliente;
import com.proyecto.base.Tienda;
import com.proyecto.controladores.ControladorInicio;

/**
 *
 * @author Javier
 */
public class demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Setup de memoria
        //Centro comercial, que igual implementa singleton :)
        CentroComercial centroComercial = CentroComercial.getInstance();
        //Clientes que estan en el centro comercial
        Cliente jose = new Cliente("Jose");
        Cliente eduardo = new Cliente("Eduardo");
        Cliente enrique = new Cliente("Enrique");
        Cliente gener = new Cliente("Gener");
        //Simulamos la entrada de todos los clientes
        centroComercial.entrarCliente(jose);
        centroComercial.entrarCliente(eduardo);
        centroComercial.entrarCliente(enrique);
        centroComercial.entrarCliente(gener);

        //Tiendas pertenecientes al centro comercial
        Tienda heladeria = new FactoryHeladeria().crearTienda();
        Tienda relojeria = new FactoryRelojeria().crearTienda();
        Tienda electronica = new FactoryElectronica().crearTienda();

        //Simulamos que estan en alguna tienda esto para desplegar la lista y su ubicación
        jose.setTiendaActual(heladeria);
        enrique.setTiendaActual(electronica);
        gener.setTiendaActual(relojeria);

        heladeria.entrarCliente(jose);
        electronica.entrarCliente(enrique);
        relojeria.entrarCliente(gener);
        
        centroComercial.añadirTienda(heladeria);
        centroComercial.añadirTienda(relojeria);
        centroComercial.añadirTienda(electronica);
        

        new ControladorInicio().iniciarVista();
    }

}
