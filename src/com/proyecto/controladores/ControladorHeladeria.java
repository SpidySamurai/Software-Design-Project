/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.vistas.VistaHeladeria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Javier
 */
public class ControladorHeladeria implements ActionListener {
    private VistaHeladeria vHeladeria;
    
    public ControladorHeladeria(){
        vHeladeria = new VistaHeladeria();
    }
    
    public void addListener(){
        
    }
    
    public void iniciarVista(){
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
