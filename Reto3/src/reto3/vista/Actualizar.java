package reto3.vista;

import reto3.controlador.ActualizarCliente;
import static reto3.controlador.pasar_pagina.aux;
import reto3.modelo.cliente;

public class Actualizar extends javax.swing.JFrame {
    
    public cliente clientex;

    public Actualizar(cliente cliente) {  
        
        clientex=cliente;
        initComponents();
            setLocationRelativeTo(null);
            setResizable (false);
            setTitle ("Actualizar");   
            
        dni.setEnabled(false);
        dni.setText(cliente.dni);
        nombre.setText(cliente.nombre);
        apellidos.setText(cliente.apellidos);
        contraseña.setText(cliente.contraseña);
        password.setText(cliente.contraseña);


    }
    public String sexo = "";

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gruposexo = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        BotonAnterior = new javax.swing.JButton();
        jlabel2 = new javax.swing.JLabel();
        jlabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        actualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ACTULIZAR DATOS DE USUARIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 250, 30));

        BotonAnterior.setBackground(new java.awt.Color(51, 51, 51));
        BotonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anterior.png"))); // NOI18N
        BotonAnterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 100, 70));

        jlabel2.setBackground(new java.awt.Color(255, 255, 255));
        jlabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jlabel2.setForeground(new java.awt.Color(0, 0, 0));
        jlabel2.setText("NOMBRE:");
        getContentPane().add(jlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jlabel1.setBackground(new java.awt.Color(255, 255, 255));
        jlabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jlabel1.setForeground(new java.awt.Color(0, 0, 0));
        jlabel1.setText("DNI:");
        getContentPane().add(jlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 30, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("APELLIDOS:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jlabel.setBackground(new java.awt.Color(255, 255, 255));
        jlabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jlabel.setForeground(new java.awt.Color(0, 0, 0));
        jlabel.setText("CONTRASEÑA:");
        getContentPane().add(jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));
        getContentPane().add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 130, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 100, -1));
        getContentPane().add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 130, -1));

        contraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("REPETIR CONTRASEÑA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 130, -1));

        actualizar.setBackground(new java.awt.Color(255, 255, 51));
        actualizar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        actualizar.setForeground(new java.awt.Color(0, 0, 0));
        actualizar.setText("ACTUALIZAR");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 130, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jLabel1.setText("SI  QUIERE CAMBIAR LOS DATOS...");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnteriorActionPerformed
        reto3.controlador.pasar_pagina.noregistrado_a_registrado();
        dispose (); 
    }//GEN-LAST:event_BotonAnteriorActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
    ActualizarCliente ActualizarCliente = new ActualizarCliente (dni.getText(), nombre.getText(), apellidos.getText(), contraseña.getText(),password.getText()) ; 
    if (aux>0){
    dispose();
    aux=0;
    }
    }//GEN-LAST:event_actualizarActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnterior;
    private javax.swing.JButton actualizar;
    private javax.swing.JTextField apellidos;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField dni;
    private javax.swing.ButtonGroup gruposexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JTextField nombre;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables

}