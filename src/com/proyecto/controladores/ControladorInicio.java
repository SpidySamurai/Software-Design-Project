package com.proyecto.controladores;

import com.proyecto.base.CentroComercial;
import com.proyecto.vistas.VistaInicial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.proyecto.base.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public final class ControladorInicio implements ActionListener {

    private final VistaInicial vInicial;
    private final CentroComercial centroComercial;

    public ControladorInicio() {
        this.centroComercial = CentroComercial.getInstance();

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

            String nombre = this.vInicial.getJTNombre().getText();

            Cliente cliente = new Cliente(nombre);
            centroComercial.entrarCliente(cliente);

            int capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la capacidad del carrito"));
            while (capacidad < 1 || capacidad > 15) {
                capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una capcidad valida 0 < cap <= 15"));
            }
            cliente.setCarrito(centroComercial.getCarrito(5));
            this.vInicial.dispose();
            new ControladorCentro(cliente, this.centroComercial).iniciarVista();
        }

    }

}
