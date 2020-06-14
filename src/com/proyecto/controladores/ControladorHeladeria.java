/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.abstractfactory.FactoryHeladeria;
import com.proyecto.base.Articulo;
import com.proyecto.base.CentroComercial;
import com.proyecto.base.Cliente;
import com.proyecto.base.Tienda;
import com.proyecto.entidades.heladeria.HeladoChocolate;
import com.proyecto.entidades.heladeria.HeladoCombinado;
import com.proyecto.entidades.heladeria.HeladoFresa;
import com.proyecto.entidades.heladeria.HeladoOreo;
import com.proyecto.entidades.heladeria.HeladoVainilla;
import com.proyecto.vistas.VistaHeladeria;
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
public final class ControladorHeladeria implements ActionListener, IWindow {

    private final VistaHeladeria vHeladeria;
    private final VistaInfoArticulo vInfoA;

    private final CentroComercial centroComercial;
    private final Cliente clienteActual;
    private final Tienda heladeria;
    private int index;

    public ControladorHeladeria(Cliente clienteActual, CentroComercial centroComercial) {
        this.vHeladeria = new VistaHeladeria();
        this.vInfoA = new VistaInfoArticulo();
        heladeria = new FactoryHeladeria().crearTienda();

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

        this.vInfoA.getjBAñadir().addActionListener(this);
        this.vInfoA.getjBCancelar().addActionListener(this);

    }

    public void iniciarVista() {
        this.vHeladeria.setVisible(true);
    }

    public void desplegarInfo(Articulo producto) {
        this.vInfoA.getjLNombre().setText("Nombre " + producto.getNombreArticulo());
        this.vInfoA.getjLIdProducto().setText("Id Producto: " + producto.getIdArticulo());
        this.vInfoA.getjLIdTienda().setText("Id Tienda: " + producto.getIdTienda());
        this.vInfoA.getjLPrecio().setText("Precio: " + String.valueOf(producto.getPrecioArticulo()));
    }

    public boolean stock(Articulo producto) {
        for (Articulo a : this.heladeria.getArticulosTienda()) {
            if (a.getClass() == producto.getClass()) {
                index = this.heladeria.getArticulosTienda().indexOf(a);
                return true;
            }
        }
        index = -1;
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.vHeladeria.getjBHeladoChocolate() == e.getSource()) {
            stock(new HeladoChocolate());
            this.vHeladeria.disable();
            this.desplegarInfo(new HeladoChocolate());
            this.vInfoA.setVisible(true);

        }
        if (this.vHeladeria.getjBHeladoCombinado() == e.getSource()) {
            stock(new HeladoCombinado());
            this.vHeladeria.disable();
            this.desplegarInfo(new HeladoCombinado());
            this.vInfoA.setVisible(true);

        }
        if (this.vHeladeria.getjBHeladoFresa() == e.getSource()) {
            stock(new HeladoFresa());
            this.vHeladeria.disable();
            this.desplegarInfo(new HeladoFresa());
            this.vInfoA.setVisible(true);

        }
        if (this.vHeladeria.getjBHeladoOreo() == e.getSource()) {
            stock(new HeladoOreo());
            this.vHeladeria.disable();
            this.desplegarInfo(new HeladoOreo());
            this.vInfoA.setVisible(true);

        }
        if (this.vHeladeria.getjBHeladoVainilla() == e.getSource()) {
            stock(new HeladoVainilla());
            this.vHeladeria.disable();
            this.desplegarInfo(new HeladoVainilla());
            this.vInfoA.setVisible(true);

        }
        if (this.vInfoA.getjBCancelar() == e.getSource()) {
            this.vHeladeria.enable();
            this.vInfoA.dispose();
        }
        if (this.vInfoA.getjBAñadir() == e.getSource()) {
            if (index >= 0) {
                this.heladeria.añadirAlCarrito(this.clienteActual.getCarrito(), this.heladeria.getArticulosTienda().get(index));
                this.vInfoA.dispose();
                this.vHeladeria.enable();
            } else {
                JOptionPane.showMessageDialog(null, "Este articulo no esta disponible.");
            }
        }
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
                new ControladorCarrito(ControladorHeladeria.this, ControladorHeladeria.this.clienteActual).iniciarVista();
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
