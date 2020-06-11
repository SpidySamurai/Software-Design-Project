package com.proyecto.controladores;

import com.proyecto.base.CentroComercial;
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

    private final CentroComercial centroComercial;

    public ControladorInicio(CentroComercial centroComercial) {
        this.centroComercial = centroComercial;

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
            Cliente cliente = new Cliente(nombre);
            centroComercial.entrarCliente(cliente);
            new ControladorCentro(cliente, this.centroComercial).iniciarVista();
        }

    }

}
