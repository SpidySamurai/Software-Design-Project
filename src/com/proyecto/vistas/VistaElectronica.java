package com.proyecto.vistas;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Javier
 */
public class VistaElectronica extends javax.swing.JFrame {

    /**
     * Creates new form VistaElectronica
     */
    public VistaElectronica() {
        initComponents();
        setLocationRelativeTo(this);
    }

    public JButton getjBCelular() {
        return jBCelular;
    }

    public JButton getjBLaptop() {
        return jBLaptop;
    }

    public JButton getjBSmartBand() {
        return jBSmartBand;
    }

    public JButton getjBTablet() {
        return jBTablet;
    }

    public JButton getjBTeclado() {
        return jBTeclado;
    }

    public JLabel getjLAtras() {
        return jLAtras;
    }

    public JLabel getjLCarrito() {
        return jLCarrito;
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
        jBCelular = new javax.swing.JButton();
        jBSmartBand = new javax.swing.JButton();
        jBLaptop = new javax.swing.JButton();
        jBTablet = new javax.swing.JButton();
        jBTeclado = new javax.swing.JButton();
        jLCarrito = new javax.swing.JLabel();
        jLAtras = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBCelular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/imagenes/E1.png"))); // NOI18N
        jBCelular.setBorder(null);
        jPanel1.add(jBCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 316, 180));

        jBSmartBand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/imagenes/E3.png"))); // NOI18N
        jPanel1.add(jBSmartBand, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 256, 101));

        jBLaptop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/imagenes/E2.png"))); // NOI18N
        jPanel1.add(jBLaptop, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 316, 169));

        jBTablet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/imagenes/E5.png"))); // NOI18N
        jPanel1.add(jBTablet, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 333, 256, 106));

        jBTeclado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/imagenes/E4.png"))); // NOI18N
        jPanel1.add(jBTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 256, 128));
        jPanel1.add(jLCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 8, 50, 50));
        jPanel1.add(jLAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, 50, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/imagenes/Fondo Electrónica.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(VistaElectronica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaElectronica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaElectronica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaElectronica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaElectronica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jBCelular;
    private javax.swing.JButton jBLaptop;
    private javax.swing.JButton jBSmartBand;
    private javax.swing.JButton jBTablet;
    private javax.swing.JButton jBTeclado;
    private javax.swing.JLabel jLAtras;
    private javax.swing.JLabel jLCarrito;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
