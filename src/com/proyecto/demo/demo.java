package com.proyecto.demo;

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
        SetupMemoria sm = new SetupMemoria();
        new ControladorInicio().iniciarVista();
    }

}
