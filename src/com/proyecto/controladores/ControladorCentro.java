/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.base.CentroComercial;
import com.proyecto.base.Cliente;
import com.proyecto.vistas.VistaCentro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;

/**
 *
 * @author Javier
 */
public class ControladorCentro implements ActionListener, IWindow {

    private VistaCentro vistaCentro;

    private final CentroComercial centroComercial;
    private final Cliente clienteActual;

    public ControladorCentro(Cliente cliente, CentroComercial centroComercial) {
        this.centroComercial = centroComercial;
        this.clienteActual = cliente;

        this.vistaCentro = new VistaCentro();
        this.addListener();
        this.mostrarSaludo(cliente.getNombreCliente());

    }

    private void addListener() {
        this.vistaCentro.getBtn_Heladeria().addActionListener(this);
        this.vistaCentro.getBtn_Relojeria().addActionListener(this);
        this.vistaCentro.getBtn_Electronica().addActionListener(this);
        this.mouseListenerCarrito();
        this.mouseListenerAtras();

    }

    public void iniciarVista() {
        this.vistaCentro.setVisible(true);
    }

    public void mostrarSaludo(String nombre) {
        this.vistaCentro.getjLSaludo().setText("Buen dia " + nombre
                + "! Bienvenido al Centro Comercial!");
//        this.vistaCentro.getjLSaludo().updateUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.vistaCentro.getBtn_Heladeria() == e.getSource()) {
            this.vistaCentro.dispose();
            new ControladorHeladeria(this.clienteActual, this.centroComercial).iniciarVista();
        }
        if (this.vistaCentro.getBtn_Relojeria() == e.getSource()) {
            this.vistaCentro.dispose();
            new ControladorRelojeria(this.clienteActual, this.centroComercial).iniciarVista();
        }
        if (this.vistaCentro.getBtn_Electronica() == e.getSource()) {
            this.vistaCentro.dispose();
            new ControladorElectronica(this.clienteActual, this.centroComercial).iniciarVista();
        }
    }

    public void mouseListenerCarrito() {
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ControladorCentro.this.vistaCentro.disable();
                new ControladorCarrito(ControladorCentro.this).iniciarVista();

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ControladorCentro.this.vistaCentro.getjLCarrito().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };

        this.vistaCentro.getjLCarrito().addMouseListener(mouseListener);

    }

    public void mouseListenerAtras() {
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ControladorCentro.this.centroComercial.salirCliente(ControladorCentro.this.clienteActual);
                ControladorCentro.this.vistaCentro.dispose();
                new ControladorInicio(centroComercial).iniciarVista();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ControladorCentro.this.vistaCentro.getjLAtras().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };

        this.vistaCentro.getjLAtras().addMouseListener(mouseListener);
    }

    @Override
    public void childClosed(WindowEvent e) {
        this.vistaCentro.enable();
    }

}
