
package reto3.vista;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import reto3.controlador.Seleccionar_linea;
import static reto3.controlador.Poblacion.poblac;
import reto3.modelo.billete;
import reto3.modelo.cliente;
import reto3.modelo.lineas;

public class Linea extends javax.swing.JFrame  {
    
    public ArrayList<billete> billetex;
    public ArrayList<String> uno;
    public ArrayList<String> dos;
    public ArrayList<String> tres;
    public ArrayList<String> cuatro;

    public cliente clientex;
    //cuando solo se recibe el cliente
        public Linea(cliente cliente) {
        initComponents();
        uno =new ArrayList();
        dos =new ArrayList();
        tres =new ArrayList();
        cuatro= new ArrayList();        
        
        uno=  poblac("L1");
        dos= poblac("L2");  
        tres= poblac("L3");  
        cuatro= poblac("L4");                    
       
        lista1.setText(""+uno.get(0)+"--"+uno.get(1)+"--"+uno.get(2)+"--"+uno.get(3)+"--"+uno.get(4)+"--"+uno.get(5));       
        lista2.setText(""+dos.get(0)+"--"+dos.get(1)+"--"+dos.get(2)+"--"+dos.get(3));
        lista3.setText(""+tres.get(0)+"--"+tres.get(1)+"--"+tres.get(2)+"--"+tres.get(3));
        lista4.setText(""+cuatro.get(0)+"--"+cuatro.get(1)+"--"+cuatro.get(2)+"--"+cuatro.get(3));   
      
            clientex=cliente;
            setLocationRelativeTo(null);
            setResizable (false);
            setTitle ("Paradas");   
            jLabel4.setText(cliente.nombre);
             
    }
    //cuando se recibe el cliente y la linea
    public Linea(cliente cliente,lineas lineas) {
        initComponents();
        
        uno =new ArrayList();
        dos =new ArrayList();
        tres =new ArrayList();
        cuatro= new ArrayList();
               
        uno=  poblac("L1");
        dos= poblac("L2");  
        tres= poblac("L3");  
        cuatro= poblac("L4"); 
        
        lista1.setText(""+uno.get(0)+"--"+uno.get(1)+"--"+uno.get(2)+"--"+uno.get(3)+"--"+uno.get(4)+"--"+uno.get(5));       
        lista2.setText(""+dos.get(0)+"--"+dos.get(1)+"--"+dos.get(2)+"--"+dos.get(3));
        lista3.setText(""+tres.get(0)+"--"+tres.get(1)+"--"+tres.get(2)+"--"+tres.get(3));
        lista4.setText(""+cuatro.get(0)+"--"+cuatro.get(1)+"--"+cuatro.get(2)+"--"+cuatro.get(3));    
       
    clientex=cliente;

            setLocationRelativeTo(null);
            setResizable (false);
            setTitle ("Paradas");   
            jLabel4.setText(cliente.nombre);  
            
    }
    //cuando se recbe el cliente, la linea y el billete
    public Linea(cliente cliente,lineas lineas,ArrayList<billete> billete) {

        initComponents();
        
        uno =new ArrayList();
        dos =new ArrayList();
        tres =new ArrayList();
        cuatro= new ArrayList();
        
        
        uno=  poblac("L1");
        dos= poblac("L2");  
        tres= poblac("L3");  
        cuatro= poblac("L4"); 
        
        lista1.setText(""+uno.get(0)+"--"+uno.get(1)+"--"+uno.get(2)+"--"+uno.get(3)+"--"+uno.get(4)+"--"+uno.get(5));       
        lista2.setText(""+dos.get(0)+"--"+dos.get(1)+"--"+dos.get(2)+"--"+dos.get(3));
        lista3.setText(""+tres.get(0)+"--"+tres.get(1)+"--"+tres.get(2)+"--"+tres.get(3));
        lista4.setText(""+cuatro.get(0)+"--"+cuatro.get(1)+"--"+cuatro.get(2)+"--"+cuatro.get(3));     
       
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
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lista2 = new javax.swing.JLabel();
        lista1 = new javax.swing.JLabel();
        lista3 = new javax.swing.JLabel();
        lista4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 64)); // NOI18N
        jLabel3.setText("UNA LÍNEA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 320, 40));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 64)); // NOI18N
        jLabel2.setText("SELECCIONA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 380, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("L1");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 90, 70));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("L2");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 90, 70));

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("L3");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 90, 70));

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("L4");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 90, 70));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setText("ALEJANDRO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jLabel5.setText("ICONO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

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

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Mapa de Poblaciones");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 180, -1));

        lista2.setBackground(new java.awt.Color(255, 255, 255));
        lista2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        lista2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lista2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 240, 60));

        lista1.setBackground(new java.awt.Color(255, 255, 255));
        lista1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        lista1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 330, 40));

        lista3.setBackground(new java.awt.Color(255, 255, 255));
        lista3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        lista3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lista3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 270, 50));

        lista4.setBackground(new java.awt.Color(255, 255, 255));
        lista4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        lista4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lista4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 250, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/linea1.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 300, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/linea4.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 290, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/linea2.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 260, 80));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/linea3.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 280, 80));

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lista1;
    private javax.swing.JLabel lista2;
    private javax.swing.JLabel lista3;
    private javax.swing.JLabel lista4;
    // End of variables declaration//GEN-END:variables


}
