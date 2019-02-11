
package reto3.vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import reto3.controlador.Seleccionar_linea;
import reto3.modelo.billete;
import reto3.modelo.cliente;
import reto3.modelo.lineas;

public class Linea extends javax.swing.JFrame  {
 public ArrayList<billete> billetex;

    public cliente clientex;
    //cuando solo se recibe el cliente
        public Linea(cliente cliente) {
        initComponents();

            clientex=cliente;
            setLocationRelativeTo(null);
            setResizable (false);
            setTitle ("Paradas");   
            jLabel4.setText(cliente.nombre);
    }
    //cuando se recibe el cliente y la linea
    public Linea(cliente cliente,lineas lineas) {
        initComponents();
    clientex=cliente;

            setLocationRelativeTo(null);
            setResizable (false);
            setTitle ("Paradas");   
            jLabel4.setText(cliente.nombre);            
    }
    //cuando se recbe el cliente, la linea y el billete
    public Linea(cliente cliente,lineas lineas,ArrayList<billete> billete) {

        initComponents();
        clientex=cliente;
        billetex = new ArrayList();
        for(int x=0;x<billete.size();x++)
        {
        billetex.add(billete.get(x));
        }
            setLocationRelativeTo(null);
            setResizable (false);
            setTitle ("Paradas");            
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 64)); // NOI18N
        jLabel3.setText("UNA LÍNEA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 320, 40));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 64)); // NOI18N
        jLabel2.setText("SELECCIONA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 380, 40));

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        jButton1.setText("L1");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 150, 40));

        jButton2.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        jButton2.setText("L2");
        jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 150, 40));

        jButton3.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        jButton3.setText("L3");
        jButton3.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 150, 40));

        jButton4.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        jButton4.setText("L4");
        jButton4.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), null));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 150, 40));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setText("ALEJANDRO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jLabel5.setText("ICONO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("TERMIBUS-PLENTZIA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 110, 20));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("TERMIBUS-MUSKIZ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 100, 20));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("TERMIBUS-BALMASEDA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("TERMIBUS-DURANGO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        jButton5.setBackground(new java.awt.Color(204, 0, 51));
        jButton5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Cerrar Sesión");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String  lineax="L1";
          try{
        if(billetex.size()>0)
        {
         Seleccionar_linea seleccion= new Seleccionar_linea(lineax,clientex,billetex);          
         dispose();
        }
        
        }catch(Exception e){     
         Seleccionar_linea seleccion= new Seleccionar_linea(lineax,clientex);
         dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String  lineax="L2";     
        try{
        if(billetex.size()>0)
        {
         Seleccionar_linea seleccion= new Seleccionar_linea(lineax,clientex,billetex);
         dispose();        
        }
      
        }catch(Exception e){
         Seleccionar_linea seleccion= new Seleccionar_linea(lineax,clientex); 
         dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String  lineax="L3";    
        try{
        if(billetex.size()>0)
        {
         Seleccionar_linea seleccion= new Seleccionar_linea(lineax,clientex,billetex);
         dispose();   
        }

        }catch(Exception e){
         Seleccionar_linea seleccion= new Seleccionar_linea(lineax,clientex); 
         dispose();
        }    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String  lineax="L4";      
        try{
        if(billetex.size()>0)
        {
         Seleccionar_linea seleccion= new Seleccionar_linea(lineax,clientex,billetex);
         dispose();     
        }
        
        }catch(Exception e){
         Seleccionar_linea seleccion= new Seleccionar_linea(lineax,clientex);
         dispose();
        }       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
            if(billetex.size()>0)
            {
                int n= JOptionPane.showConfirmDialog(null, "¿Quiere Cerrar Sesion? \n Has comprado: "+billetex.size(), "Cerrar Sesion" , JOptionPane.YES_NO_OPTION);
                if (n == JOptionPane.YES_OPTION)
                {
                    reto3.controlador.pasar_pagina.classsaludoaregistrado();
                    dispose();
                }
            }
        }
        catch(Exception e){
            int n= JOptionPane.showConfirmDialog(null, "¿Quiere Cerrar Sesion?", "Cerrar Sesion" , JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION)
            {
                reto3.controlador.pasar_pagina.classsaludoaregistrado();
                dispose();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
