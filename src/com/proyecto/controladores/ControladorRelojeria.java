/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controladores;

import com.proyecto.vistas.VistaCentroTemp;
import com.proyecto.vistas.VistaRelojeria;
import com.proyecto.vistas.vistaRelojeriaTemp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Javier
 */
public class ControladorRelojeria implements ActionListener {
    
    private VistaRelojeria vRelojeria;
    
    private VistaCentroTemp vCentroT;
    private vistaRelojeriaTemp vRelojeriaT;
    
    public ControladorRelojeria(VistaCentroTemp vCT) {
        vRelojeria = new VistaRelojeria();
        vRelojeriaT = new vistaRelojeriaTemp();
        
        vCentroT = vCT;
    }
    
    public void addListener() {
        
    }
    
    public void iniciarVista() {
//        this.vRelojeria.setVisible(true);

        vCentroT.getjPanel1().add(vRelojeriaT);
        vCentroT.validate();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
