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

/**
 *
 * @author Javier
 */
public class ControladorCentro implements ActionListener {

    private VistaCentro vistaCentro;
    private CentroComercial centroComercial;

    public ControladorCentro(Cliente cliente) {
        centroComercial = new CentroComercial();
        centroComercial.entrarCliente(cliente);

        this.vistaCentro = new VistaCentro();
        this.addListener();

    }

    private void addListener() {
        this.vistaCentro.getBtn_Carrito().addActionListener(this);
        this.vistaCentro.getBtn_Heladeria().addActionListener(this);
        this.vistaCentro.getBtn_Relojeria().addActionListener(this);
        this.vistaCentro.getBtn_Electronica().addActionListener(this);

    }

    public void iniciarVista() {
        this.vistaCentro.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.vistaCentro.getBtn_Carrito() == e.getSource()) {

        }
        if (this.vistaCentro.getBtn_Heladeria() == e.getSource()) {

        }
        if (this.vistaCentro.getBtn_Relojeria() == e.getSource()) {

        }
        if (this.vistaCentro.getBtn_Electronica() == e.getSource()) {

        }
    }

}
