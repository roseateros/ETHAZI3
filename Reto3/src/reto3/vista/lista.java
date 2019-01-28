
package reto3.vista;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import reto3.modelo.cliente;
import reto3.modelo.lineas;

public class lista extends javax.swing.JFrame {
public cliente clientex;
public lineas lineasx;
    public lista(cliente cliente,lineas lineas) {
        initComponents();
        lineasx=lineas;
        jLabel4.setText(cliente.nombre);
        clientex=cliente;
            setLocationRelativeTo(null);
            setResizable (false);
            setTitle ("Lista");
            
    ImageIcon Imagen = new ImageIcon ("src/Imagenes/anterior.png");
    Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(BotonAnterior.getWidth(), BotonAnterior.getHeight(), Image.SCALE_DEFAULT));
    BotonAnterior.setIcon(icono);
    this.repaint();
    ImageIcon Imagen2 = new ImageIcon ("src/Imagenes/siguiente.png");
    Icon icono2 = new ImageIcon(Imagen2.getImage().getScaledInstance(BotonSiguiente.getWidth(), BotonSiguiente.getHeight(), Image.SCALE_DEFAULT));
    BotonSiguiente.setIcon(icono2);
    this.repaint();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lista = new javax.swing.JTextField();
        BotonAnterior = new javax.swing.JButton();
        BotonSiguiente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaActionPerformed(evt);
            }
        });
        getContentPane().add(lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 280, 340));

        BotonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 90, 50));

        BotonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 90, 50));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setText("ALEJANDRO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel5.setText("ICONO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnteriorActionPerformed
        reto3.controlador.pasar_pagina.lista_a_paradas(clientex,lineasx);
        dispose();
    }//GEN-LAST:event_BotonAnteriorActionPerformed

    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguienteActionPerformed
        reto3.controlador.pasar_pagina.lista_a_cobro();
        dispose();
    }//GEN-LAST:event_BotonSiguienteActionPerformed

    private void listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnterior;
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lista;
    // End of variables declaration//GEN-END:variables
}
