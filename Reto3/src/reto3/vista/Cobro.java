
package reto3.vista;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public final class Cobro extends javax.swing.JFrame {
    
    public Cobro() {    
        
        initComponents(); 
        setLocationRelativeTo(null);
        setResizable (false);
        setTitle ("Cobro"); 
    
        ImageIcon Imagen = new ImageIcon ("src/Imagenes/200.jpg");
        Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(bi200.getWidth(), bi200.getHeight(), Image.SCALE_DEFAULT));
        bi200.setIcon(icono);
        this.repaint();

        ImageIcon Imagen2 = new ImageIcon ("src/Imagenes/100.jpg");
        Icon icono2 = new ImageIcon(Imagen2.getImage().getScaledInstance(bi100.getWidth(), bi100.getHeight(), Image.SCALE_DEFAULT));
        bi100.setIcon(icono2);
        this.repaint();

        ImageIcon Imagen3 = new ImageIcon ("src/Imagenes/50.png");
        Icon icono3 = new ImageIcon(Imagen3.getImage().getScaledInstance(bi50.getWidth(), bi50.getHeight(), Image.SCALE_DEFAULT));
        bi50.setIcon(icono3);
        this.repaint();

        ImageIcon Imagen4 = new ImageIcon ("src/Imagenes/20.png");
        Icon icono4 = new ImageIcon(Imagen4.getImage().getScaledInstance(bi20.getWidth(), bi20.getHeight(), Image.SCALE_DEFAULT));
        bi20.setIcon(icono4);
        this.repaint();

        ImageIcon Imagen5 = new ImageIcon ("src/Imagenes/10.jpg");
        Icon icono5 = new ImageIcon(Imagen5.getImage().getScaledInstance(bi10.getWidth(), bi10.getHeight(), Image.SCALE_DEFAULT));
        bi10.setIcon(icono5);
        this.repaint();

        ImageIcon Imagen6 = new ImageIcon ("src/Imagenes/5.png");
        Icon icono6 = new ImageIcon(Imagen6.getImage().getScaledInstance(bi5.getWidth(), bi5.getHeight(), Image.SCALE_DEFAULT));
        bi5.setIcon(icono6);
        this.repaint();

        ImageIcon Imagen7 = new ImageIcon ("src/Imagenes/2euros.gif");
        Icon icono7 = new ImageIcon(Imagen7.getImage().getScaledInstance(mo2.getWidth(), mo2.getHeight(), Image.SCALE_DEFAULT));
        mo2.setIcon(icono7);
        this.repaint();

        ImageIcon Imagen8 = new ImageIcon ("src/Imagenes/1.gif");
        Icon icono8 = new ImageIcon(Imagen8.getImage().getScaledInstance(mo1.getWidth(), mo1.getHeight(), Image.SCALE_DEFAULT));
        mo1.setIcon(icono8);
        this.repaint();

        ImageIcon Imagen9 = new ImageIcon ("src/Imagenes/50 cent.jpg");
        Icon icono9 = new ImageIcon(Imagen9.getImage().getScaledInstance(mo05.getWidth(), mo05.getHeight(), Image.SCALE_DEFAULT));
        mo05.setIcon(icono9);
        this.repaint();

        ImageIcon Imagen10 = new ImageIcon ("src/Imagenes/20 cent.gif");
        Icon icono10 = new ImageIcon(Imagen10.getImage().getScaledInstance(mo02.getWidth(), mo02.getHeight(), Image.SCALE_DEFAULT));
        mo02.setIcon(icono10);
        this.repaint();

        ImageIcon Imagen11 = new ImageIcon ("src/Imagenes/10 centimos.jpg");
        Icon icono11 = new ImageIcon(Imagen11.getImage().getScaledInstance(mo01.getWidth(), mo01.getHeight(), Image.SCALE_DEFAULT));
        mo01.setIcon(icono11);
        this.repaint();

        ImageIcon Imagen12 = new ImageIcon ("src/Imagenes/5 cent.jpg");
        Icon icono12 = new ImageIcon(Imagen12.getImage().getScaledInstance(mo005.getWidth(), mo005.getHeight(), Image.SCALE_DEFAULT));
        mo005.setIcon(icono12);
        this.repaint();

        ImageIcon Imagen13 = new ImageIcon ("src/Imagenes/2 cent.jpg");
        Icon icono13 = new ImageIcon(Imagen13.getImage().getScaledInstance(mo002.getWidth(), mo002.getHeight(), Image.SCALE_DEFAULT));
        mo002.setIcon(icono13);
        this.repaint();

        ImageIcon Imagen14 = new ImageIcon ("src/Imagenes/1 cent.jpg");
        Icon icono14 = new ImageIcon(Imagen14.getImage().getScaledInstance(mo001.getWidth(), mo001.getHeight(), Image.SCALE_DEFAULT));
        mo001.setIcon(icono14);
        this.repaint();
    }    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        confirmarPedido = new javax.swing.JButton();
        totalAPagar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bi50 = new javax.swing.JButton();
        bi20 = new javax.swing.JButton();
        bi10 = new javax.swing.JButton();
        bi5 = new javax.swing.JButton();
        mo2 = new javax.swing.JButton();
        mo1 = new javax.swing.JButton();
        mo05 = new javax.swing.JButton();
        mo02 = new javax.swing.JButton();
        mo01 = new javax.swing.JButton();
        mo005 = new javax.swing.JButton();
        bi100 = new javax.swing.JButton();
        mo002 = new javax.swing.JButton();
        mo001 = new javax.swing.JButton();
        bi200 = new javax.swing.JButton();
        actualizaPago = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        reiniciarPago = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButton1.setText("Cerrar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ICONO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setText("ALEJANDRO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 51));
        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("CANCELAR COMPRA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 140, 50));

        confirmarPedido.setBackground(new java.awt.Color(255, 255, 51));
        confirmarPedido.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        confirmarPedido.setForeground(new java.awt.Color(0, 0, 0));
        confirmarPedido.setText("CONFIRMAR PEDIDO");
        confirmarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(confirmarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 544, 140, 60));

        totalAPagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(totalAPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 80, 30));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TOTAL A PAGAR:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        bi50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bi50ActionPerformed(evt);
            }
        });
        getContentPane().add(bi50, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 110, 60));

        bi20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bi20ActionPerformed(evt);
            }
        });
        getContentPane().add(bi20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 110, 60));

        bi10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bi10ActionPerformed(evt);
            }
        });
        getContentPane().add(bi10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 110, 60));

        bi5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bi5ActionPerformed(evt);
            }
        });
        getContentPane().add(bi5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 110, 60));

        mo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mo2ActionPerformed(evt);
            }
        });
        getContentPane().add(mo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 80, 60));

        mo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mo1ActionPerformed(evt);
            }
        });
        getContentPane().add(mo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 80, 60));

        mo05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mo05ActionPerformed(evt);
            }
        });
        getContentPane().add(mo05, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 80, 60));

        mo02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mo02ActionPerformed(evt);
            }
        });
        getContentPane().add(mo02, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 80, 60));

        mo01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mo01ActionPerformed(evt);
            }
        });
        getContentPane().add(mo01, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 80, 60));

        mo005.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mo005ActionPerformed(evt);
            }
        });
        getContentPane().add(mo005, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 80, 60));

        bi100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bi100ActionPerformed(evt);
            }
        });
        getContentPane().add(bi100, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 110, 60));

        mo002.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mo002ActionPerformed(evt);
            }
        });
        getContentPane().add(mo002, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 80, 60));

        mo001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mo001ActionPerformed(evt);
            }
        });
        getContentPane().add(mo001, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 80, 60));

        bi200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bi200ActionPerformed(evt);
            }
        });
        getContentPane().add(bi200, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, 60));

        actualizaPago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(actualizaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 80, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("PAGADO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, -1, -1));

        reiniciarPago.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        reiniciarPago.setText("REINICIAR PAGO");
        reiniciarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarPagoActionPerformed(evt);
            }
        });
        getContentPane().add(reiniciarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Seleccione el dinero a ingresar:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 220, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reto3.controlador.pasar_pagina.classsaludoaregistrado();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        reto3.controlador.pasar_pagina.registrado_a_saludo();
        dispose ();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void confirmarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarPedidoActionPerformed
        reto3.controlador.pasar_pagina.cobro_a_imprimir();
        dispose();
    }//GEN-LAST:event_confirmarPedidoActionPerformed

    private void bi100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bi100ActionPerformed
        reto3.controlador.Cobro.bi100();
    }//GEN-LAST:event_bi100ActionPerformed

    private void bi50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bi50ActionPerformed
        reto3.controlador.Cobro.bi50();
    }//GEN-LAST:event_bi50ActionPerformed

    private void bi20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bi20ActionPerformed
        reto3.controlador.Cobro.bi20();
    }//GEN-LAST:event_bi20ActionPerformed

    private void bi10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bi10ActionPerformed
        reto3.controlador.Cobro.bi10();
    }//GEN-LAST:event_bi10ActionPerformed

    private void bi5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bi5ActionPerformed
        reto3.controlador.Cobro.bi5();
    }//GEN-LAST:event_bi5ActionPerformed

    private void mo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mo2ActionPerformed
        reto3.controlador.Cobro.mo2();
    }//GEN-LAST:event_mo2ActionPerformed

    private void mo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mo1ActionPerformed
        reto3.controlador.Cobro.mo1();
    }//GEN-LAST:event_mo1ActionPerformed

    private void mo05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mo05ActionPerformed
        reto3.controlador.Cobro.mo05();
    }//GEN-LAST:event_mo05ActionPerformed

    private void mo02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mo02ActionPerformed
        reto3.controlador.Cobro.mo02();
    }//GEN-LAST:event_mo02ActionPerformed

    private void mo01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mo01ActionPerformed
        reto3.controlador.Cobro.mo01();
    }//GEN-LAST:event_mo01ActionPerformed

    private void mo005ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mo005ActionPerformed
        reto3.controlador.Cobro.mo005();       
    }//GEN-LAST:event_mo005ActionPerformed

    private void mo002ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mo002ActionPerformed
        reto3.controlador.Cobro.mo002();
    }//GEN-LAST:event_mo002ActionPerformed

    private void mo001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mo001ActionPerformed
        reto3.controlador.Cobro.mo001();
    }//GEN-LAST:event_mo001ActionPerformed

    private void bi200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bi200ActionPerformed
        reto3.controlador.Cobro.bi200();
    }//GEN-LAST:event_bi200ActionPerformed

    private void reiniciarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarPagoActionPerformed
        reto3.controlador.Cobro.reiniciarPago();
    }//GEN-LAST:event_reiniciarPagoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actualizaPago;
    private javax.swing.JButton bi10;
    private javax.swing.JButton bi100;
    private javax.swing.JButton bi20;
    private javax.swing.JButton bi200;
    private javax.swing.JButton bi5;
    private javax.swing.JButton bi50;
    private javax.swing.JButton confirmarPedido;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mo001;
    private javax.swing.JButton mo002;
    private javax.swing.JButton mo005;
    private javax.swing.JButton mo01;
    private javax.swing.JButton mo02;
    private javax.swing.JButton mo05;
    private javax.swing.JButton mo1;
    private javax.swing.JButton mo2;
    private javax.swing.JButton reiniciarPago;
    private javax.swing.JLabel totalAPagar;
    // End of variables declaration//GEN-END:variables
}
