/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.vistas.VistaRelojeria;

/**
 *
 * @author Javier
 */
public class ControladorRelojeria {

    private VistaRelojeria vRelojeria;

    public ControladorRelojeria() {
        this.vRelojeria = new VistaRelojeria();
    }

    public void addListener() {

    }

    public void iniciarVista() {
        this.vRelojeria.setVisible(true);
    }

}
