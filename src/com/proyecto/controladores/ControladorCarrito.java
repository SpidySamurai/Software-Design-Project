/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.abstractfactory.FactoryElectronica;
import com.proyecto.abstractfactory.FactoryHeladeria;
import com.proyecto.abstractfactory.FactoryRelojeria;
import com.proyecto.base.Articulo;
import com.proyecto.base.Cliente;
import com.proyecto.iterator.IteratorCarritoComprasArt;
import com.proyecto.vistas.VistaCarrito;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javier
 */
public final class ControladorCarrito implements ActionListener {

    private final IWindow ventanaPadre;
    private final VistaCarrito vCarrito;
    private final Cliente clienteActual;

    public ControladorCarrito(IWindow ventanaPadre, Cliente clienteActual) {
        this.ventanaPadre = ventanaPadre;
        this.clienteActual = clienteActual;
        vCarrito = new VistaCarrito();

        addListener();
        rellenarVista();

    }

    private void addListener() {
        this.vCarrito.getjBEliminar().addActionListener(this);
        this.vCarrito.getjBPagar().addActionListener(this);
        this.vCarrito.getjBVaciar().addActionListener(this);
        windowListener();
    }

    public void iniciarVista() {
        this.vCarrito.setVisible(true);
    }

    public void rellenarVista() {
        DefaultTableModel model = (DefaultTableModel) this.vCarrito.getjTable1().getModel();
        model.setRowCount(0);
        IteratorCarritoComprasArt IteratorCCA = new IteratorCarritoComprasArt(this.clienteActual.getCarrito());
        Object rowData[] = new Object[4];
        double costoTotal = 0;
        while (IteratorCCA.contieneSiguiente()) {
            Articulo artTemp = IteratorCCA.siguiente();
            rowData[0] = artTemp;
            rowData[1] = artTemp.getIdArticulo();
            rowData[2] = artTemp.getIdTienda();
            rowData[3] = artTemp.getPrecioArticulo();
            costoTotal += artTemp.getPrecioArticulo();
            model.addRow(rowData);
        }
        this.vCarrito.getjLCosto().setText("Costo: " + costoTotal);
    }

    public void devolverTienda(Articulo producto) {
        //Tiendas
        this.clienteActual.getCarrito().quitarDelCarrito(producto);
        if (producto.getIdTienda().equals(new FactoryHeladeria().crearTienda().getIdTienda())) {
            new FactoryHeladeria().crearTienda().añadirProductoTienda(producto);
        }
        if (producto.getIdTienda().equals(new FactoryRelojeria().crearTienda().getIdTienda())) {
            new FactoryRelojeria().crearTienda().añadirProductoTienda(producto);
        }
        if (producto.getIdTienda().equals(new FactoryElectronica().crearTienda().getIdTienda())) {
            new FactoryElectronica().crearTienda().añadirProductoTienda(producto);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.vCarrito.getjBEliminar() == e.getSource()) {
            if (this.vCarrito.getjTable1().getRowCount() > 0) {
                if (this.vCarrito.getjTable1().getSelectedRow() > -1) {
//                    DefaultTableModel model = (DefaultTableModel) this.vCarrito.getjTable1().getModel();
                    Articulo producto = (Articulo) this.vCarrito.getjTable1().getValueAt(this.vCarrito.getjTable1().getSelectedRow(), 0);
//                    this.clienteActual.getCarrito().quitarDelCarrito(producto);
                    this.devolverTienda(producto);
//                    model.removeRow(this.vCarrito.getjTable1().getSelectedRow());
                    this.rellenarVista();
                }
            }
        }
        if (this.vCarrito.getjBVaciar() == e.getSource()) {
            IteratorCarritoComprasArt iteratorCCA = new IteratorCarritoComprasArt(this.clienteActual.getCarrito());
            ArrayList<Articulo> articulos = new ArrayList<>();
            while (iteratorCCA.contieneSiguiente()) {
                Articulo producto = iteratorCCA.siguiente();
                articulos.add(producto);
            }
            for (Articulo a : articulos) {
                this.devolverTienda(a);
            }
            this.rellenarVista();
        }
        if (this.vCarrito.getjBPagar() == e.getSource()) {
            this.clienteActual.getCarrito().getArticulosCarrito().clear();
            this.rellenarVista();
        }
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
