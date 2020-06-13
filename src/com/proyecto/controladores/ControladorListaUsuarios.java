/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.base.CentroComercial;
import com.proyecto.base.Cliente;
import com.proyecto.base.Tienda;
import com.proyecto.iterator.IteratorCentroComercialCliente;
import com.proyecto.iterator.IteratorCentroComercialTienda;
import com.proyecto.vistas.VistaListaClientes;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Javier
 */
public final class ControladorListaUsuarios {

    private final IWindow ventanaPadre;
    private final VistaListaClientes vListaClientes;

    public ControladorListaUsuarios(IWindow ventanaPadre) {
        this.ventanaPadre = ventanaPadre;
        vListaClientes = new VistaListaClientes();
        windowListener();
        rellenarVista();
    }

    public void iniciarVista() {
        this.vListaClientes.setVisible(true);
    }

    private void rellenarVista() {
        DefaultMutableTreeNode clientes = new DefaultMutableTreeNode("Clientes");
        DefaultTreeModel dtm = new DefaultTreeModel(clientes);

        ArrayList<DefaultMutableTreeNode> nodos = new ArrayList<>();
        ArrayList<Cliente> clientesO = new ArrayList<>();
        ArrayList<Tienda> tiendasO = new ArrayList<Tienda>();

        CentroComercial centroC = CentroComercial.getInstance();

        IteratorCentroComercialCliente iteradorCClientes = new IteratorCentroComercialCliente(centroC);
        IteratorCentroComercialTienda iteradorCTiendas = new IteratorCentroComercialTienda(centroC);

        while (iteradorCTiendas.contieneSiguiente()) {
            tiendasO.add(iteradorCTiendas.siguiente());
        }

        while (iteradorCClientes.contieneSiguiente()) {
            clientesO.add(iteradorCClientes.siguiente());
        }

        for (Cliente c : clientesO) {
            DefaultMutableTreeNode prsn = new DefaultMutableTreeNode();
            prsn.setUserObject(c);
            clientes.add(prsn);
        }

        this.vListaClientes.getjTree1().setModel(dtm);
    }

    private void windowListener() {
        WindowListener e = new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
                ControladorListaUsuarios.this.ventanaPadre.childClosed(e);
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
        this.vListaClientes.addWindowListener(e);
    }

}
