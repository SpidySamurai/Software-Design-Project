/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.vistas.VistaListaClientes;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Javier
 */
public class ControladorListaUsuarios {

    private final IWindow ventanaPadre;
    private final VistaListaClientes vListaClientes;

    public ControladorListaUsuarios(IWindow ventanaPadre) {
        this.ventanaPadre = ventanaPadre;
        vListaClientes = new VistaListaClientes();
        windowListener();
    }

    public void iniciarVista() {
        this.vListaClientes.setVisible(true);
    }

    public void windowListener() {
        WindowListener e = new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
                ControladorListaUsuarios.this.ventanaPadre.childClosed(e);
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }

        };
        this.vListaClientes.addWindowListener(e);
    }

}
