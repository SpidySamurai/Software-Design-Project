/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.base.Articulo;
import com.proyecto.base.Cliente;
import com.proyecto.iterator.IteratorCarritoComprasArt;
import com.proyecto.vistas.VistaCarrito;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javier
 */
public final class ControladorCarrito implements ActionListener {

    private final IWindow ventanaPadre;
    private final VistaCarrito vCarrito;
    private Cliente clienteActual;

    public ControladorCarrito(IWindow ventanaPadre, Cliente clienteActual) {
        this.ventanaPadre = ventanaPadre;
        this.clienteActual = clienteActual;
        vCarrito = new VistaCarrito();

        addListener();
        rellenarVista();

    }

    private void addListener() {
        windowListener();
    }

    public void iniciarVista() {
        this.vCarrito.setVisible(true);
    }

    public void rellenarVista() {
        DefaultTableModel model = (DefaultTableModel) this.vCarrito.getjTable1().getModel();
        IteratorCarritoComprasArt IteratorCCA = new IteratorCarritoComprasArt(this.clienteActual.getCarrito());
        Object rowData[] = new Object[4];
        while (IteratorCCA.contieneSiguiente()) {
            Articulo artTemp = IteratorCCA.siguiente();
            rowData[0] = artTemp.getNombreArticulo();
            rowData[1] = artTemp.getIdArticulo();
            rowData[2] = artTemp.getIdTienda();
            rowData[3] = artTemp.getPrecioArticulo();
            model.addRow(rowData);
        }

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
