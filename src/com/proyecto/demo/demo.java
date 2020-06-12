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
        //Centro comercial, que igual podría implementar singleton ...
        CentroComercial centroComercial = new CentroComercial();
        //Clientes que estan en el centro comercial
        Cliente jose = new Cliente("Jose");
        Cliente eduardo = new Cliente("Eduardo");
        Cliente enrique = new Cliente("Enrique");
        Cliente gener = new Cliente("Gener");

        Tienda heladeria = new FactoryHeladeria().crearTienda();
        Tienda relojeria = new FactoryRelojeria().crearTienda();
        Tienda electronica = new FactoryElectronica().crearTienda();

        new ControladorInicio(centroComercial).iniciarVista();
    }

}
