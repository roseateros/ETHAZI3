
package reto3.vista;

import java.util.Timer;
import java.util.TimerTask;

public class Adios extends javax.swing.JFrame {
   
    private int repe, aux;
    
    public Adios() {
        initComponents();
        setResizable (false);
        setLocationRelativeTo(null);
        setTitle ("Hasta Luego");
        volverBienvenida();
       
    }
    
    public void volverBienvenida(){
        Timer timer = new Timer();
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                if (aux==0){
                   reto3.controlador.pasar_pagina.adios_a_saludo();
                    dispose (); 
                    aux=1;
                }
            }
        };
        
         repe=5000;
         timer.schedule(tarea, 5000, repe);           
    }
       
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Gracias por confiar en nosotros ¡HASTA PRONTO!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 420, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 420, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
