/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.vistas.VistaCarrito;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Javier
 */
public final class ControladorCarrito implements ActionListener {

    private final IWindow ventanaPadre;

    private final VistaCarrito vCarrito;

    public ControladorCarrito(IWindow ventanaPadre) {
        this.ventanaPadre = ventanaPadre;
        vCarrito = new VistaCarrito();

        addListener();

    }

    public void addListener() {
        windowListener();
    }

    public void iniciarVista() {
        this.vCarrito.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
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
                ControladorCarrito.this.ventanaPadre.childClosed(e);
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
        this.vCarrito.addWindowListener(e);
    }

}
