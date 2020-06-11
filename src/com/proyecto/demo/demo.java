package com.proyecto.demo;

import com.proyecto.base.CentroComercial;
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

        CentroComercial centroComercial = new CentroComercial();

        new ControladorInicio(centroComercial).iniciarVista();
    }

}
