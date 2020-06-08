/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.base.CentroComercial;
import com.proyecto.vistas.VistaCentro;
import com.proyecto.vistas.VistaCentroTemp;
import com.proyecto.vistas.vistaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Javier
 */
public class ControladorCentro implements ActionListener {

    private VistaCentro vCentro;

    //Provisional
    private VistaCentroTemp vCentroT;
    private vistaMenu vMenu;

    private CentroComercial centroComercial;

    public ControladorCentro() {

        this.vCentro = new VistaCentro();

        this.vCentroT = new VistaCentroTemp();
        this.vMenu = new vistaMenu();

     

        this.addListener();

    }

    private void addListener() {
        this.vCentro.getBtn_Carrito().addActionListener(this);
        this.vCentro.getBtn_Heladeria().addActionListener(this);
        this.vCentro.getBtn_Relojeria().addActionListener(this);
        this.vCentro.getBtn_Electronica().addActionListener(this);
        
        this.vMenu.getBtn_Relojeria().addActionListener(this);

    }

    public void iniciarVista() {
//        this.vCentro.setVisible(true);
        this.vCentroT.getjPanel1().add(vMenu);
        this.vCentroT.setVisible(true);
        this.vCentroT.validate();
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.vCentro.getBtn_Carrito() == e.getSource()) {

        }
        if (this.vCentro.getBtn_Heladeria() == e.getSource()) {
            new ControladorHeladeria().iniciarVista();

        }
        if (this.vMenu.getBtn_Relojeria() == e.getSource()) {
            this.vMenu.setVisible(false);
            new ControladorRelojeria(vCentroT).iniciarVista();
        }
        if (this.vCentro.getBtn_Electronica() == e.getSource()) {
            new ControladorElectronica().iniciarVista();

        }
    }

}
