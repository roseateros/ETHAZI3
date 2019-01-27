package reto3.vista;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import reto3.controlador.VerificarCliente;
import static reto3.controlador.pasar_pagina.aux;

public class Registrado extends javax.swing.JFrame {
    public Registrado() {
        initComponents();
        
            setLocationRelativeTo(null);
            setResizable (false);
            setTitle ("Usuario");
    
    ImageIcon Imagen = new ImageIcon ("src/Imagenes/anterior.png");
    Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(BotonAnterior.getWidth(), BotonAnterior.getHeight(), Image.SCALE_DEFAULT));
    BotonAnterior.setIcon(icono);
    this.repaint();
    
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
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("LOGIN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 100, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label1.setText("Contraseña:");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 130, 30));
        getContentPane().add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 130, 30));

        BotonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 120, 70));

        BotonSiguiente.setBackground(new java.awt.Color(255, 255, 51));
        BotonSiguiente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonSiguiente.setText("CONECTAR");
        BotonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 120, 70));

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("CLICK AQUI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 120, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("SI NO ESTAS REGISTRADO....");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 220, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnteriorActionPerformed
        reto3.controlador.pasar_pagina.registrado_a_saludo();
        dispose (); 
    }//GEN-LAST:event_BotonAnteriorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reto3.controlador.pasar_pagina.registrado_a_noregistrado();
        dispose (); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguienteActionPerformed
    VerificarCliente verificar= new VerificarCliente(us.getText(),pass.getText());
    if (aux>0){
        dispose();
        aux=0;
    }
    }//GEN-LAST:event_BotonSiguienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnterior;
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.Label label1;
    private javax.swing.JPasswordField pass;
    private java.awt.TextField us;
    // End of variables declaration//GEN-END:variables
}
