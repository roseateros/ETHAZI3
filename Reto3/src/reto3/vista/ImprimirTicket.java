
package reto3.vista;

import reto3.modelo.cliente;
import reto3.modelo.lineas;

public class ImprimirTicket extends javax.swing.JFrame {
    
 public cliente clientex;
 public lineas lineasx;
 
    public ImprimirTicket(cliente cliente) {
        initComponents(); 
        clientex=cliente;
        lineasx=lineas;
        setLocationRelativeTo(null);
        setResizable (false);
        setTitle ("ImprimirTicket");
        jLabel3.setText(cliente.nombre);      
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ImprimirTicket = new javax.swing.JButton();
        finalizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setText("ALEJANDRO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        ImprimirTicket.setBackground(new java.awt.Color(255, 255, 0));
        ImprimirTicket.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        ImprimirTicket.setForeground(new java.awt.Color(0, 0, 0));
        ImprimirTicket.setText("Imprimir Ticket");
        ImprimirTicket.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ImprimirTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirTicketActionPerformed(evt);
            }
        });
        getContentPane().add(ImprimirTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 140, 70));

        finalizar.setBackground(new java.awt.Color(255, 255, 0));
        finalizar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        finalizar.setForeground(new java.awt.Color(0, 0, 0));
        finalizar.setText("FINALIZAR");
        finalizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });
        getContentPane().add(finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 140, 70));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("GRACIAS POR SU COMPRA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        reto3.controlador.pasar_pagina.imprimir_a_adios();
        dispose();
    }//GEN-LAST:event_finalizarActionPerformed

    private void ImprimirTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirTicketActionPerformed
        //reto3.controlador.ImprimirTicket();
        dispose();
    }//GEN-LAST:event_ImprimirTicketActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ImprimirTicket;
    private javax.swing.JButton finalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
