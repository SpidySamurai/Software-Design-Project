/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.vistas.VistaElectronica;
import com.proyecto.vistas.VistaHeladeria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Javier
 */
public class ControladorElectronica implements ActionListener {
    
    private VistaElectronica vElectronica;
    
    public ControladorElectronica(){
        vElectronica = new VistaElectronica();
    }
    
    public void addListener(){
        
    }
    
    public void iniciarVista(){
        vElectronica.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
