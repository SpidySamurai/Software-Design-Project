/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.base.CentroComercial;
import com.proyecto.base.Cliente;
import com.proyecto.vistas.VistaRelojeria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 *
 * @author Javier
 */
public class ControladorRelojeria implements ActionListener, IWindow {

    private VistaRelojeria vRelojeria;
    private final CentroComercial centroComercial;

    public ControladorRelojeria(Cliente clienteActual, CentroComercial centroComercial) {
        this.vRelojeria = new VistaRelojeria();

        this.centroComercial = centroComercial;

    }

    public void addListener() {

    }

    public void iniciarVista() {
        this.vRelojeria.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void childClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
