/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.base.CentroComercial;
import com.proyecto.base.Cliente;
import com.proyecto.vistas.VistaHeladeria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;

/**
 *
 * @author Javier
 */
public final class ControladorHeladeria implements ActionListener, IWindow {

    private final VistaHeladeria vHeladeria;

    private final CentroComercial centroComercial;
    private final Cliente clienteActual;

    public ControladorHeladeria(Cliente clienteActual, CentroComercial centroComercial) {
        this.vHeladeria = new VistaHeladeria();

        this.centroComercial = centroComercial;
        this.clienteActual = clienteActual;

        addListener();
    }

    public void addListener() {
        this.vHeladeria.getjBHeladoChocolate().addActionListener(this);
        this.vHeladeria.getjBHeladoCombinado().addActionListener(this);
        this.vHeladeria.getjBHeladoFresa().addActionListener(this);
        this.vHeladeria.getjBHeladoOreo().addActionListener(this);
        this.vHeladeria.getjBHeladoVainilla().addActionListener(this);
        mouseListenerAtras();
        mouseListenerCarrito();

    }

    public void iniciarVista() {
        this.vHeladeria.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public void mouseListenerAtras() {
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ControladorHeladeria.this.vHeladeria.dispose();
                new ControladorCentro(ControladorHeladeria.this.clienteActual, ControladorHeladeria.this.centroComercial).iniciarVista();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ControladorHeladeria.this.vHeladeria.getjLAtras().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };

        this.vHeladeria.getjLAtras().addMouseListener(mouseListener);
    }

    public void mouseListenerCarrito() {
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ControladorHeladeria.this.vHeladeria.disable();
                new ControladorCarrito(ControladorHeladeria.this).iniciarVista();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ControladorHeladeria.this.vHeladeria.getjLCarrito().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };

        this.vHeladeria.getjLCarrito().addMouseListener(mouseListener);
    }

    @Override
    public void childClosed(WindowEvent e) {
        this.vHeladeria.enable();
    }

}
