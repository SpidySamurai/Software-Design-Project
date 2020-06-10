/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.vistas.VistaInicial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.proyecto.base.Cliente;

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

    public void iniciarVista() {
        this.vInicial.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.vInicial.getjBIngresar() == e.getSource()) {
            this.vInicial.dispose();
            String nombre = this.vInicial.getJTNombre().getText();
            new ControladorCentro(new Cliente(nombre)).iniciarVista();
        }

    }

}
