package reto3.vista;

import reto3.controlador.ActualizarCliente;
import reto3.controlador.BorrarCliente;
import reto3.controlador.VerificarCliente;
import reto3.controlador.llamarCliente;
import static reto3.controlador.pasar_pagina.aux;

public class Registrado extends javax.swing.JFrame {
    public Registrado() {
        initComponents();
        
            setLocationRelativeTo(null);
            setResizable (false);
            setTitle ("Usuario");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        pass = new javax.swing.JPasswordField();
        us = new java.awt.TextField();
        BotonAnterior = new javax.swing.JButton();
        BotonSiguiente = new javax.swing.JButton();
        jButton = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("LOGIN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 100, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 30)); // NOI18N
        label1.setText("Contraseña:");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.setForeground(new java.awt.Color(0, 0, 0));
        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 130, 30));
        getContentPane().add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 130, 30));

        BotonAnterior.setBackground(new java.awt.Color(51, 51, 51));
        BotonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anterior.png"))); // NOI18N
        BotonAnterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 100, 70));

        BotonSiguiente.setBackground(new java.awt.Color(255, 255, 51));
        BotonSiguiente.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        BotonSiguiente.setForeground(new java.awt.Color(0, 0, 0));
        BotonSiguiente.setText("CONECTAR");
        BotonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 150, 30));

        jButton.setBackground(new java.awt.Color(255, 255, 51));
        jButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButton.setForeground(new java.awt.Color(0, 0, 0));
        jButton.setText("SI NO ESTAS REGISTRADO");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 240, 40));

        delete.setBackground(new java.awt.Color(255, 0, 51));
        delete.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("SI DESEA ELIMINAR USUARIO");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 240, 40));

        jButton1.setBackground(new java.awt.Color(102, 255, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("ACTULIZAR DATOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 150, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnteriorActionPerformed
        reto3.controlador.pasar_pagina.registrado_a_saludo();
        dispose (); 
    }//GEN-LAST:event_BotonAnteriorActionPerformed

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        reto3.controlador.pasar_pagina.registrado_a_noregistrado();
        dispose (); 
    }//GEN-LAST:event_jButtonActionPerformed

    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguienteActionPerformed
    VerificarCliente verificar= new VerificarCliente(us.getText(),pass.getText());
    if (aux>0){
        dispose();
        aux=0;
    }
    }//GEN-LAST:event_BotonSiguienteActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
    BorrarCliente borrar= new BorrarCliente(us.getText(),pass.getText());
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    llamarCliente borrar= new llamarCliente(us.getText(),pass.getText());
    
        dispose ();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnterior;
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label1;
    private javax.swing.JPasswordField pass;
    private java.awt.TextField us;
    // End of variables declaration//GEN-END:variables
}
