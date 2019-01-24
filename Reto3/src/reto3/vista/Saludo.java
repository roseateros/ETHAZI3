package reto3.vista;

import reto3.controlador.pasar_pagina;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Saludo extends javax.swing.JFrame {

    public Saludo() {
        initComponents();
            
    setLocationRelativeTo(null);
    setResizable (false);
    setTitle ("¡BIENVENIDO!");
    
    ImageIcon Imagen = new ImageIcon ("src/Imagenes/logo.png");
    Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenLogo.getWidth(), ImagenLogo.getHeight(), Image.SCALE_DEFAULT));
    ImagenLogo.setIcon(icono);
    this.repaint();
    ImageIcon Imagen2 = new ImageIcon ("src/Imagenes/siguiente.png");
    Icon icono2 = new ImageIcon(Imagen2.getImage().getScaledInstance(BotonContinuar.getWidth(), BotonContinuar.getHeight(), Image.SCALE_DEFAULT));
    BotonContinuar.setIcon(icono2);
    this.repaint();

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImagenLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotonContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(ImagenLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 380, 350));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VENTA DE BILLETES");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 190, 40));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BIENVENIDOS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 260, 40));

        BotonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 100, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonContinuarActionPerformed
    reto3.controlador.pasar_pagina.classsaludoaregistrado();
    dispose();
    }//GEN-LAST:event_BotonContinuarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonContinuar;
    private javax.swing.JLabel ImagenLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
