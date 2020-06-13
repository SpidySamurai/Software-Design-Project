/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.base.Articulo;
import com.proyecto.base.CentroComercial;
import com.proyecto.base.Cliente;
import com.proyecto.vistas.VistaInfoArticulo;
import com.proyecto.vistas.VistaRelojeria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;

/**
 *
 * @author Javier
 */
public final class ControladorRelojeria implements ActionListener, IWindow {

    private final VistaRelojeria vRelojeria;
    private final VistaInfoArticulo vInfoA;

    private final CentroComercial centroComercial;
    private final Cliente clienteActual;

    public ControladorRelojeria(Cliente clienteActual, CentroComercial centroComercial) {
        this.vRelojeria = new VistaRelojeria();
        this.vInfoA = new VistaInfoArticulo();

        this.centroComercial = centroComercial;
        this.clienteActual = clienteActual;

        addListener();
    }

    private void addListener() {
        this.vRelojeria.getjBRolexSubmariner().addActionListener(this);
        this.vRelojeria.getjBRolexDaytona().addActionListener(this);
        this.vRelojeria.getjBRelojPared().addActionListener(this);
        this.vRelojeria.getjBRelojPared().addActionListener(this);
        this.vRelojeria.getjBCronometro().addActionListener(this);

        mouseListenerAtras();
        mouseListenerCarrito();

        this.vInfoA.getjBAñadir();
        this.vInfoA.getjBCancelar();
        this.vInfoA.getjLNombre();
        this.vInfoA.getjLIdTienda();
        this.vInfoA.getjLPrecio();
        this.vInfoA.getjLIdProducto();

    }

    public void iniciarVista() {
        this.vRelojeria.setVisible(true);
    }

    public void desplegarInfo(Articulo producto) {
        this.vInfoA.getjLNombre().setText(producto.getNombreArticulo());
        this.vInfoA.getjLIdProducto().setText(producto.getIdArticulo());
        this.vInfoA.getjLIdTienda().setText(producto.getIdTienda());
        this.vInfoA.getjLPrecio().setText(String.valueOf(producto.getPrecioArticulo()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    private void mouseListenerAtras() {
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ControladorRelojeria.this.vRelojeria.dispose();
                new ControladorCentro(ControladorRelojeria.this.clienteActual, ControladorRelojeria.this.centroComercial).iniciarVista();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ControladorRelojeria.this.vRelojeria.getjLAtras().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };

        this.vRelojeria.getjLAtras().addMouseListener(mouseListener);
    }

    private void mouseListenerCarrito() {
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ControladorRelojeria.this.vRelojeria.disable();
                new ControladorCarrito(ControladorRelojeria.this).iniciarVista();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ControladorRelojeria.this.vRelojeria.getjLCarrito().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };

        this.vRelojeria.getjLCarrito().addMouseListener(mouseListener);
    }

    @Override
    public void childClosed(WindowEvent e) {
        this.vRelojeria.enable();
    }

}
