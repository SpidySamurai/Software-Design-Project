/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.vistas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Javier
 */
public class VistaInfoArticulo extends javax.swing.JFrame {

    /**
     * Creates new form VistaInfoArticulo
     */
    public VistaInfoArticulo() {
        initComponents();
    }

    public JButton getjBAñadir() {
        return jBAñadir;
    }

    public JButton getjBCancelar() {
        return jBCancelar;
    }

    public JLabel getjLIdTienda() {
        return jLIdTienda;
    }

    public JLabel getjLNombre() {
        return jLNombre;
    }

    public JLabel getjLPrecio() {
        return jLPrecio;
    }

    public JLabel getjLIdProducto() {
        return jLIdProducto;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBAñadir = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLNombre = new javax.swing.JLabel();
        jLIdTienda = new javax.swing.JLabel();
        jLPrecio = new javax.swing.JLabel();
        jLIdProducto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBAñadir.setText("Añadir");
        jPanel1.add(jBAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 20, -1, -1));

        jBCancelar.setText("Cancelar");
        jPanel1.add(jBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLNombre.setText("Nombre:");
        jPanel2.add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jLIdTienda.setText("IdTienda:");
        jPanel2.add(jLIdTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, -1));

        jLPrecio.setText("Precio:");
        jPanel2.add(jLPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, -1));

        jLIdProducto.setText("Id:");
        jPanel2.add(jLIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 60, -1));

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaInfoArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInfoArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInfoArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInfoArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaInfoArticulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAñadir;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JLabel jLIdProducto;
    private javax.swing.JLabel jLIdTienda;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPrecio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
