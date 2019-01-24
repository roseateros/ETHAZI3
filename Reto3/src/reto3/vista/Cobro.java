
package reto3.vista;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class Cobro extends javax.swing.JFrame {
    
    private float precio, cambio=0, pago;
    private float billete200=0, billete100=0, billete50=0, billete20=0, billete10=0, billete5=0, moneda2=0, moneda1=0;  
    private float moneda05=0, moneda02=0, moneda01=0, moneda005=0, moneda002=0, moneda001=0;
    
    public Cobro() {    
        
        initComponents();
        calcularTotal(); 
        totalAPagar.setText(String.valueOf(precio+" €")); 
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
    
    public void calcularTotal(){

    }
    
    public void calcularPago(){
         
        pago = (200*billete200)+(100*billete100)+(50*billete50)
                 +(20*billete20)+(10*billete10)+(5*billete5)+(2*moneda2)
                 +(1*moneda1)+(0.5f*moneda05)+(0.2f*moneda02)+(0.1f*moneda01)+(0.05f*moneda005)+(0.02f*moneda002)+(0.01f*moneda001);
         
        pago =(float)(Math.round(pago*100d)/100d);
        actualizaPago.setText(String.valueOf(pago+" €"));
     } 

    public void calcularCambio(){
         
            cambio = (pago-precio);
     
            cambio = (float)(Math.round(cambio*100f)/100f);
            billete200 = cambio / 200f;
            cambio = (cambio%200f);
           
          
            billete100 = cambio / 100f;
            cambio = (cambio%100f);
                           
            billete50 = cambio / 50f;
            cambio = (cambio%50f);
                  
            billete20 = cambio / 20f;
            cambio = (cambio%20f);
                      
            billete10 = cambio / 10f;
            cambio = (cambio%10f);
                      
            billete5 = cambio / 5f;
            cambio = (cambio%5f);
                 
            moneda2 = cambio / 2f;
            cambio = (cambio%2f);
                     
            moneda1 = cambio / 1f;
            cambio = (cambio%1f);            
           
            moneda05 = cambio / 0.5f;
            cambio =  (cambio%0.5f);
                      
            moneda02 = cambio / 0.2f;
            cambio =  (cambio%0.2f);          
         
            moneda01 = cambio / 0.1f;
            cambio = (cambio%0.1f);        
      
            moneda005 = cambio / 0.05f;
            cambio =  (cambio%0.05f);            
     
            moneda002 = cambio / 0.02f;
            cambio =  (cambio%0.02f);
             
            moneda001 = cambio / 0.01f;
            moneda001 = (Math.round(moneda001*100f)/100f);
            
               JOptionPane.showMessageDialog(null,  "\nSe devolveran: "+(int)billete200+" Billetes de 200€\n"
                                                    + "Se devolveran: "+(int)billete100+" Billetes de 100€\n"
                                                    + "Se devolveran: "+(int)billete50+" Billetes de 50€\n"
                                                    + "Se devolveran: "+(int)billete20+" Billetes de 20€\n"
                                                    + "Se devolveran: "+(int)billete10+" Billetes de 10€\n"
                                                    + "Se devolveran: "+(int)billete5+" Billetes de 5€\n"
                                                    + "Se devolveran: "+(int)moneda2+" Monedas de 2€\n"
                                                    + "Se devolveran: "+(int)moneda1+" Monedas de 1€\n"
                                                    + "Se devolveran: "+(int)moneda05+" Monedas de 50cents\n"
                                                    + "Se devolveran: "+(int)moneda02+" Monedas de 20cents\n"
                                                    + "Se devolveran: "+(int)moneda01+" Monedas de 10cents\n"
                                                    + "Se devolveran: "+(int)moneda005+" Monedas de 5cents\n"
                                                    + "Se devolveran: "+(int)moneda002+" Monedas de 2cents\n"
                                                    + "Se devolveran: "+(int)moneda001+" Monedas de 1cent\n");       
     }
     
     public void reiniciarPago(){
        pago=0;
        actualizaPago.setText(String.valueOf(pago+" €"));
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

        if (precio==pago){
            Adios objPago= new Adios();
            objPago.setVisible(true);
            dispose ();
        }
        if (pago>precio){
            calcularCambio();
            Adios objPago= new Adios();
            objPago.setVisible(true);
            dispose ();
        } else if (pago<precio){
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una cantidad igual o superior al precio total");
        }

    }//GEN-LAST:event_confirmarPedidoActionPerformed

    private void bi100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bi100ActionPerformed

        billete100++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){

            billete200=0; billete100=1; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();

        }
    }//GEN-LAST:event_bi100ActionPerformed

    private void bi50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bi50ActionPerformed

        billete50++;
        if (pago!=0){
            calcularPago();

        }
        if (pago==0){

            billete200=0; billete100=0; billete50=1; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();

        }
    }//GEN-LAST:event_bi50ActionPerformed

    private void bi20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bi20ActionPerformed

        billete20++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=1; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }//GEN-LAST:event_bi20ActionPerformed

    private void bi10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bi10ActionPerformed

        billete10++;

        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=1; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }//GEN-LAST:event_bi10ActionPerformed

    private void bi5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bi5ActionPerformed

        billete5++;

        if (pago!=0){
            calcularPago();
        }

        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=1; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }//GEN-LAST:event_bi5ActionPerformed

    private void mo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mo2ActionPerformed
        moneda2++;

        if (pago!=0){
            calcularPago();
        }

        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=1; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }//GEN-LAST:event_mo2ActionPerformed

    private void mo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mo1ActionPerformed
        moneda1++;
        
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=1;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }//GEN-LAST:event_mo1ActionPerformed

    private void mo05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mo05ActionPerformed
        moneda05++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=1; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }//GEN-LAST:event_mo05ActionPerformed

    private void mo02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mo02ActionPerformed

        moneda02++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=1; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }//GEN-LAST:event_mo02ActionPerformed

    private void mo01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mo01ActionPerformed

        moneda01++;

        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=1; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }//GEN-LAST:event_mo01ActionPerformed

    private void mo005ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mo005ActionPerformed
       
        moneda005++;

        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=1; moneda002=0; moneda001=0;
            calcularPago();
        }
    }//GEN-LAST:event_mo005ActionPerformed

    private void mo002ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mo002ActionPerformed
        moneda002++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=1; moneda001=0;
            calcularPago();
        }
    }//GEN-LAST:event_mo002ActionPerformed

    private void mo001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mo001ActionPerformed
        moneda001++;

        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=1;
            calcularPago();
        }
    }//GEN-LAST:event_mo001ActionPerformed

    private void bi200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bi200ActionPerformed
        billete200++;

        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=1; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }//GEN-LAST:event_bi200ActionPerformed

    private void reiniciarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarPagoActionPerformed

        reiniciarPago();
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
