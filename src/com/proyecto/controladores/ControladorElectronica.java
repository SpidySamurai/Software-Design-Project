/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.abstractfactory.FactoryElectronica;
import com.proyecto.base.Articulo;
import com.proyecto.base.CentroComercial;
import com.proyecto.base.Cliente;
import com.proyecto.base.Tienda;
import com.proyecto.entidades.electronica.Celular;
import com.proyecto.entidades.electronica.Laptop;
import com.proyecto.entidades.electronica.SmartBand;
import com.proyecto.entidades.electronica.Tablet;
import com.proyecto.entidades.electronica.Teclado;
import com.proyecto.vistas.VistaElectronica;
import com.proyecto.vistas.VistaInfoArticulo;
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
public final class ControladorElectronica implements ActionListener, IWindow {

    private final VistaElectronica vElectronica;
    private final VistaInfoArticulo vInfoA;

    private final CentroComercial centroComercial;
    private final Cliente clienteActual;
    private final Tienda electronica;
    private int index;

    public ControladorElectronica(Cliente clienteActual, CentroComercial centroComercial) {
        this.vElectronica = new VistaElectronica();
        this.vInfoA = new VistaInfoArticulo();

        this.centroComercial = centroComercial;
        this.clienteActual = clienteActual;
        electronica = new FactoryElectronica().crearTienda();

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

        this.vInfoA.getjBAñadir().addActionListener(this);
        this.vInfoA.getjBCancelar().addActionListener(this);

    }

    public void iniciarVista() {
        this.vElectronica.setVisible(true);
    }

    public void desplegarInfo(Articulo producto) {
        this.vInfoA.getjLNombre().setText(producto.getNombreArticulo());
        this.vInfoA.getjLIdProducto().setText(producto.getIdArticulo());
        this.vInfoA.getjLIdTienda().setText(producto.getIdTienda());
        this.vInfoA.getjLPrecio().setText(String.valueOf(producto.getPrecioArticulo()));
    }

    public boolean stock(Articulo producto) {
        for (Articulo a : this.electronica.getArticulosTienda()) {
            if (a.getClass() == producto.getClass()) {
                index = this.electronica.getArticulosTienda().indexOf(a);
                return true;
            }
        }
        index = -1;
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.vElectronica.getjBCelular() == e.getSource()) {
            stock(new Celular());
            this.vElectronica.disable();
            this.desplegarInfo(new Celular());
            this.vInfoA.setVisible(true);

        }
        if (this.vElectronica.getjBLaptop() == e.getSource()) {
            stock(new Laptop());
            this.vElectronica.disable();
            this.desplegarInfo(new Laptop());
            this.vInfoA.setVisible(true);

        }
        if (this.vElectronica.getjBSmartBand() == e.getSource()) {
            stock(new SmartBand());
            this.vElectronica.disable();
            this.desplegarInfo(new SmartBand());
            this.vInfoA.setVisible(true);

        }
        if (this.vElectronica.getjBTeclado() == e.getSource()) {
            stock(new Teclado());
            this.vElectronica.disable();
            this.desplegarInfo(new Teclado());
            this.vInfoA.setVisible(true);

        }
        if (this.vElectronica.getjBTablet() == e.getSource()) {
            stock(new Tablet());
            this.vElectronica.disable();
            this.desplegarInfo(new Tablet());
            this.vInfoA.setVisible(true);

        }
        if (this.vInfoA.getjBCancelar() == e.getSource()) {
            this.vElectronica.enable();
            this.vInfoA.dispose();
        }
        if (this.vInfoA.getjBAñadir() == e.getSource()) {
            if (index >= 0) {
                this.electronica.añadirAlCarrito(this.clienteActual.getCarrito(), this.electronica.getArticulosTienda().get(index));
                this.vInfoA.dispose();
                this.vElectronica.enable();
            } else {
                JOptionPane.showMessageDialog(null, "Este articulo no esta disponible.");
            }
        }
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
                new ControladorCarrito(ControladorElectronica.this,ControladorElectronica.this.clienteActual).iniciarVista();
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
