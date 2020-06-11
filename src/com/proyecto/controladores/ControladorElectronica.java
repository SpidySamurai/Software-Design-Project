/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.base.CentroComercial;
import com.proyecto.base.Cliente;
import com.proyecto.vistas.VistaElectronica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;

/**
 *
 * @author Javier
 */
public class ControladorElectronica implements ActionListener, IWindow {

    private VistaElectronica vElectronica;

    private final CentroComercial centroComercial;
    private Cliente clienteActual;

    public ControladorElectronica(Cliente clienteActual, CentroComercial centroComercial) {
        this.vElectronica = new VistaElectronica();

        this.centroComercial = centroComercial;
        this.clienteActual = clienteActual;

        addListener();

    }

    private void addListener() {
        this.vElectronica.getjBCelular().addActionListener(this);
        this.vElectronica.getjBLaptop().addActionListener(this);
        this.vElectronica.getjBSmartBand().addActionListener(this);
        this.vElectronica.getjBTeclado().addActionListener(this);
        this.vElectronica.getjBTablet().addActionListener(this);

        mouseListenerAtras();
        mouseListenerCarrito();
    }

    public void iniciarVista() {
        this.vElectronica.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    private void mouseListenerAtras() {
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ControladorElectronica.this.vElectronica.dispose();
                new ControladorCentro(ControladorElectronica.this.clienteActual, ControladorElectronica.this.centroComercial).iniciarVista();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ControladorElectronica.this.vElectronica.getjLAtras().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };

        this.vElectronica.getjLAtras().addMouseListener(mouseListener);
    }

    private void mouseListenerCarrito() {
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ControladorElectronica.this.vElectronica.disable();
                new ControladorCarrito(ControladorElectronica.this).iniciarVista();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ControladorElectronica.this.vElectronica.getjLCarrito().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };

        this.vElectronica.getjLCarrito().addMouseListener(mouseListener);
    }

    @Override
    public void childClosed(WindowEvent e) {
        this.vElectronica.enable();
    }

}
