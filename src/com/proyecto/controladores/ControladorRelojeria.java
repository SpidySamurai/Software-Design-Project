/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.abstractfactory.FactoryRelojeria;
import com.proyecto.base.Articulo;
import com.proyecto.base.CentroComercial;
import com.proyecto.base.Cliente;
import com.proyecto.base.Tienda;
import com.proyecto.entidades.relojeria.Cronometro;
import com.proyecto.entidades.relojeria.Despertador;
import com.proyecto.entidades.relojeria.RelojPared;
import com.proyecto.entidades.relojeria.RolexDaytona;
import com.proyecto.entidades.relojeria.RolexSubmariner;
import com.proyecto.vistas.VistaInfoArticulo;
import com.proyecto.vistas.VistaRelojeria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public final class ControladorRelojeria implements ActionListener, IWindow {

    private final VistaRelojeria vRelojeria;
    private final VistaInfoArticulo vInfoA;

    private final CentroComercial centroComercial;
    private final Cliente clienteActual;
    private final Tienda relojeria;
    private int index;

    public ControladorRelojeria(Cliente clienteActual, CentroComercial centroComercial) {
        this.vRelojeria = new VistaRelojeria();
        this.vInfoA = new VistaInfoArticulo();
        relojeria = new FactoryRelojeria().crearTienda();

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

        this.vInfoA.getjBAñadir().addActionListener(this);
        this.vInfoA.getjBCancelar().addActionListener(this);

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

    public boolean stock(Articulo producto) {
        for (Articulo a : this.relojeria.getArticulosTienda()) {
            if (a.getClass() == producto.getClass()) {
                index = this.relojeria.getArticulosTienda().indexOf(a);
                return true;
            }
        }
        index = -1;
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.vRelojeria.getjBRolexDaytona() == e.getSource()) {
            stock(new RolexDaytona());
            this.vRelojeria.disable();
            this.desplegarInfo(new RolexDaytona());
            this.vInfoA.setVisible(true);

        }
        if (this.vRelojeria.getjBRolexSubmariner() == e.getSource()) {
            stock(new RolexSubmariner());
            this.vRelojeria.disable();
            this.desplegarInfo(new RolexSubmariner());
            this.vInfoA.setVisible(true);

        }
        if (this.vRelojeria.getjBRelojPared() == e.getSource()) {
            stock(new RelojPared());
            this.vRelojeria.disable();
            this.desplegarInfo(new RelojPared());
            this.vInfoA.setVisible(true);

        }
        if (this.vRelojeria.getjBDespertador() == e.getSource()) {
            stock(new Despertador());
            this.vRelojeria.disable();
            this.desplegarInfo(new Despertador());
            this.vInfoA.setVisible(true);

        }
        if (this.vRelojeria.getjBCronometro() == e.getSource()) {
            stock(new Cronometro());
            this.vRelojeria.disable();
            this.desplegarInfo(new Cronometro());
            this.vInfoA.setVisible(true);

        }
        if (this.vInfoA.getjBCancelar() == e.getSource()) {
            this.vRelojeria.enable();
            this.vInfoA.dispose();
        }
        if (this.vInfoA.getjBAñadir() == e.getSource()) {
            if (index >= 0) {
                this.relojeria.añadirAlCarrito(this.clienteActual.getCarrito(), this.relojeria.getArticulosTienda().get(index));
                this.vInfoA.dispose();
                this.vRelojeria.enable();
            } else {
                JOptionPane.showMessageDialog(null, "Este articulo no esta disponible.");
            }
        }

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
                new ControladorCarrito(ControladorRelojeria.this, ControladorRelojeria.this.clienteActual).iniciarVista();
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
