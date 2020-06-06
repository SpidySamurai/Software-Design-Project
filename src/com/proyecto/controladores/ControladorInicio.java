/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.vistas.VistaInicial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Javier
 */
public class ControladorInicio implements ActionListener {

    private VistaInicial vInicial;

    public ControladorInicio() {
        this.vInicial = new VistaInicial();
        this.addListener();

    }

    private void addListener() {
        //Botones
        this.vInicial.getjBIngresar().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.vInicial.getjBIngresar() == e.getSource()) {
            this.vInicial.dispose();
            new ControladorCentro().iniciarVista();
        }

    }

}
