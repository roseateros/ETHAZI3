
package reto3.vista;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImprimirTicket extends javax.swing.JFrame {

    public ImprimirTicket() {
        initComponents(); 
        setLocationRelativeTo(null);
        setResizable (false);
        setTitle ("ImprimirTicket");
            
    ImageIcon Imagen2 = new ImageIcon ("src/Imagenes/siguiente.png");
    Icon icono2 = new ImageIcon(Imagen2.getImage().getScaledInstance(BotonSiguiente.getWidth(), BotonSiguiente.getHeight(), Image.SCALE_DEFAULT));
    BotonSiguiente.setIcon(icono2);
    this.repaint();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lista = new javax.swing.JTextField();
        BotonSiguiente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 280, 340));

        BotonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 90, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguienteActionPerformed
        reto3.controlador.pasar_pagina.imprimir_a_adios();
        dispose();
    }//GEN-LAST:event_BotonSiguienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lista;
    // End of variables declaration//GEN-END:variables
}
