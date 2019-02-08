package reto3.vista;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import reto3.controlador.Calculos;
import reto3.controlador.Comprar_billete;
import reto3.controlador.Nplazas;
import static reto3.controlador.Seleccionar_Autobus.Seleccionar_Autobus;
import static reto3.controlador.Seleccionar_paradas.Seleccionar_paradas;
import reto3.modelo.Parada;
import reto3.modelo.autobus;
import reto3.modelo.cliente;
import reto3.modelo.lineas;

public class Paradas extends javax.swing.JFrame {
    
        public cliente clientex;
        public lineas lineasx;
        ArrayList<autobus> busx;
        ArrayList<Parada> paradax;
        ArrayList<String> horas;
        public int uno,dos,busesito;
        public double redondo;

    public Paradas(cliente cliente,lineas lineas) {
                
        initComponents();
        horaVuelta.setEnabled(false); 
        idaVuelta.setEnabled(false);
        horaIda.setEnabled(false);
        ida.setEnabled(false);
        Comprar.setEnabled(false);

        horas = new ArrayList();    
        horas.add(0, "08:00");
        horas.add(1, "12:00");
        horas.add(2, "16:00");
        horas.add(3, "20:00"); 
        
        for(int i=0;i<horas.size();i++)
        {          
            horaIda.addItem(horas.get(i));          
        }
        
        paradax = new ArrayList();
        paradax= Seleccionar_paradas(lineas,cliente);
        for(int i=0;i<paradax.size();i++)
        {
            origen.addItem(paradax.get(i).nombre);       
        }

        busx = new ArrayList();
        busx= Seleccionar_Autobus(lineas,cliente);

        for(int i=0;i<busx.size();i++)
        {
            jComboBox3.addItem(busx.get(i).color);
        }

        clientex=cliente;
        lineasx=lineas;
        jLabel2.setText("Linea "+lineas.Cod_Linea);
            setLocationRelativeTo(null);
            setResizable (false);
            setTitle ("Lineas");
            jLabel4.setText(cliente.nombre);     
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        BotonAnterior = new javax.swing.JButton();
        Comprar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        plazas = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idas = new javax.swing.JRadioButton();
        vueltas = new javax.swing.JRadioButton();
        origen = new javax.swing.JComboBox<>();
        destino = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        horaIda = new javax.swing.JComboBox<>();
        horaVuelta = new javax.swing.JComboBox<>();
        plazas2 = new javax.swing.JLabel();
        ida = new com.toedter.calendar.JCalendar();
        idaVuelta = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonAnterior.setBackground(new java.awt.Color(51, 51, 51));
        BotonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anterior.png"))); // NOI18N
        BotonAnterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 100, 70));

        Comprar.setBackground(new java.awt.Color(255, 255, 51));
        Comprar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        Comprar.setForeground(new java.awt.Color(0, 0, 0));
        Comprar.setText("COMPRAR");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });
        getContentPane().add(Comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 120, 70));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 64)); // NOI18N
        jLabel2.setText("Linea  2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 240, 50));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setText("ALEJANDRO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("IDA");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 30, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DESTINO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ORIGEN ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jButton5.setBackground(new java.awt.Color(204, 0, 51));
        jButton5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Cerrar Sesión");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 120, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText(" VUELTA");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("TIPO DE AUTOBUS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jComboBox3.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox3.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox3.setToolTipText("");
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 80, -1));
        getContentPane().add(plazas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 140, 20));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("TIPO DE TRAYECTO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        idas.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(idas);
        idas.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        idas.setForeground(new java.awt.Color(0, 0, 0));
        idas.setText("IDA");
        idas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idasActionPerformed(evt);
            }
        });
        getContentPane().add(idas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        vueltas.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(vueltas);
        vueltas.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        vueltas.setForeground(new java.awt.Color(0, 0, 0));
        vueltas.setText("IDA/VUELTA");
        vueltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vueltasActionPerformed(evt);
            }
        });
        getContentPane().add(vueltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        origen.setBackground(new java.awt.Color(255, 255, 255));
        origen.setForeground(new java.awt.Color(0, 0, 0));
        origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origenActionPerformed(evt);
            }
        });
        getContentPane().add(origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 200, -1));

        destino.setBackground(new java.awt.Color(255, 255, 255));
        destino.setForeground(new java.awt.Color(0, 0, 0));
        destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinoActionPerformed(evt);
            }
        });
        getContentPane().add(destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 200, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("PRECIO");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, -1, 30));

        precio.setBackground(new java.awt.Color(255, 255, 255));
        precio.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        precio.setForeground(new java.awt.Color(255, 255, 51));
        precio.setToolTipText("");
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 70, 30));

        horaIda.setBackground(new java.awt.Color(255, 255, 255));
        horaIda.setForeground(new java.awt.Color(0, 0, 0));
        horaIda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaIdaActionPerformed(evt);
            }
        });
        getContentPane().add(horaIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 110, -1));

        horaVuelta.setBackground(new java.awt.Color(255, 255, 255));
        horaVuelta.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(horaVuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 110, -1));
        getContentPane().add(plazas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 140, 20));

        ida.setMaxSelectableDate(new java.util.Date(1576108895000L));
        ida.setName(""); // NOI18N
        ida.setWeekOfYearVisible(false);
        ida.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                idaPropertyChange(evt);
            }
        });
        getContentPane().add(ida, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 200, 140));

        idaVuelta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        idaVuelta.setMaxSelectableDate(new java.util.Date(1576108882000L));
        idaVuelta.setMinSelectableDate(new java.util.Date(-62135769518000L));
        idaVuelta.setWeekOfYearVisible(false);
        getContentPane().add(idaVuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 200, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnteriorActionPerformed
        reto3.controlador.pasar_pagina.paradas_a_lineas(clientex,lineasx);
        dispose();
    }//GEN-LAST:event_BotonAnteriorActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        reto3.controlador.pasar_pagina.classsaludoaregistrado();
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        String ComboBox3 = (String) jComboBox3.getSelectedItem();
            for(int i=0;i<busx.size();i++)//numero de plazas disponibles
            {
                if(busx.get(i).color==ComboBox3)
                {
                    int uno=i;
                }
            }
                
             for(int p=0;p<paradax.size();p++)
            {   
                String ComboBox1 = (String) origen.getSelectedItem();
                if(paradax.get(p).nombre.equals(ComboBox1))
                {
                    uno=p;
                }
            }              
             
            for(int p=0;p<paradax.size();p++)
            {   
                String ComboBox2 = (String) destino.getSelectedItem();
                if(paradax.get(p).nombre.equals(ComboBox2))
                {
                dos=p;
                }
            } 
               
        String horaida = (String)horaIda.getSelectedItem();      
        String fecha1 = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(ida.getDate());
        //Date date = ida.getDate();
        //java.sql.Date sDate = new java.sql.Date(date.getTime());
        Comprar_billete compra= new Comprar_billete(1,clientex.dni,fecha1,horaida,lineasx.Cod_Linea,busx.get(uno).Cod_bus,paradax.get(uno).codParada,paradax.get(dos).codParada,redondo);        
        dispose();
    }//GEN-LAST:event_ComprarActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        String ComboBox3 = (String) jComboBox3.getSelectedItem();
        for(int i=0;i<busx.size();i++)//numero de plazas disponibles
        {
            if(busx.get(i).color==ComboBox3)
            {
                if(idas.isSelected() || vueltas.isSelected()){ 
                    if(idas.isSelected()){
                    plazas.setText(" "); 
                    plazas2.setText(" ");   
                    String horaida= (String) horaIda.getSelectedItem();
                    Nplazas nplaza= new Nplazas();   
                    int numero= nplaza.Nplazasx(busx.get(i).Cod_bus,busx.get(i).N_Plazas,horaida);
                    plazas.setText("Plazas Disponibles: "+String.valueOf(numero)); 
                    }
                    else if(vueltas.isSelected()){
                    plazas.setText(" "); 
                    plazas2.setText(" ");    
                    String horaida= (String) horaIda.getSelectedItem();
                    String horavuelta= (String) horaVuelta.getSelectedItem();
                    
                Nplazas nplaza= new Nplazas();   
                int numero= nplaza.Nplazasx(busx.get(i).Cod_bus,busx.get(i).N_Plazas,horaida);
                int numero2= nplaza.Nplazasx(busx.get(i).Cod_bus,busx.get(i).N_Plazas,horavuelta);
                plazas.setText("Plazas Disponibles: "+String.valueOf(numero)); 
                plazas2.setText("Plazas Disponibles: "+String.valueOf(numero));
                    }                        
                }
            }                
        }
        
        String ComboBox1 = (String) origen.getSelectedItem();
        for(int p=0;p<paradax.size();p++)//seleccionar parada de origen
        {
                if(paradax.get(p).nombre.equals(ComboBox1)){
                uno=p;
                }
        }

        String ComboBox2 = (String) destino.getSelectedItem();
        for(int p=0;p<paradax.size();p++)//selecionar parada de destino
        {
                if(paradax.get(p).nombre.equals(ComboBox2)){
                dos=p;
                }
        }

         for(int i=0;i<busx.size();i++)// seleccionar tipo de autobus
        {
                if(busx.get(i).color==ComboBox3)
                { 
                busesito=i;
                }       
        }       
         
        if(idas.isSelected() || vueltas.isSelected()){ //recoger todos los datos para hacer el calculo del precio
            Calculos cal= new Calculos();   
            double result=Calculos.calcularDistancia(paradax.get(uno).latitud,paradax.get(uno).longitud,paradax.get(dos).latitud,paradax.get(dos).longitud);
            double total_precio=Calculos.calcularTotal(result,busx.get(busesito).Consumo_km);
            redondo=Calculos.Redondear(total_precio);
            Comprar.setEnabled(true);
            precio.setText(String.valueOf(redondo+"€"));
        }        
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinoActionPerformed
        String ComboBox2 = (String) destino.getSelectedItem();
         for(int i=0;i<paradax.size();i++)
        {
             if(paradax.get(i).nombre==ComboBox2)
            {
       
               for(int p=0;p<paradax.size();p++)
            {   
            String ComboBox1 = (String) origen.getSelectedItem();
            if(paradax.get(p).nombre.equals(ComboBox1)){
            dos=p;
            }
        }  
            if(idas.isSelected() || vueltas.isSelected()){ 
            Calculos cal= new Calculos();   
            double result=Calculos.calcularDistancia(paradax.get(dos).latitud,paradax.get(dos).longitud,paradax.get(i).latitud,paradax.get(i).longitud);
            double total_precio=Calculos.calcularTotal(result,busx.get(busesito).Consumo_km);
            redondo=Calculos.Redondear(total_precio);
            Comprar.setEnabled(true);
            precio.setText(String.valueOf(redondo+"€"));
            }
        }
    }
    }//GEN-LAST:event_destinoActionPerformed

    private void origenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origenActionPerformed
        destino.removeAllItems();
        String ComboBox1 = (String) origen.getSelectedItem();
        for(int i=0;i<paradax.size();i++)
        {
            if(paradax.get(i).nombre==ComboBox1)
            {                
                for(int u=0;u<paradax.size();u++)
                {
                    if(u!=i)
                {
                    destino.addItem(paradax.get(u).nombre);  
                }
                    
        String ComboBox2 = (String) destino.getSelectedItem();
        for(int p=0;p<paradax.size();p++)
        {
            if(paradax.get(p).nombre.equals(ComboBox2)){
            dos=p;
            }
        }    
                    
                if(idas.isSelected() || vueltas.isSelected()){ 
                    Calculos cal= new Calculos();   
                    double result=Calculos.calcularDistancia(paradax.get(i).latitud,paradax.get(i).longitud,paradax.get(dos).latitud,paradax.get(dos).longitud);
                    double total_precio=Calculos.calcularTotal(result,busx.get(busesito).Consumo_km);
                    redondo=Calculos.Redondear(total_precio);
                    Comprar.setEnabled(true);
                    precio.setText(String.valueOf(redondo+"€"));
                    }     
                }
            }       
        }
    }//GEN-LAST:event_origenActionPerformed

    private void idasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idasActionPerformed
        plazas.setText(" ");
        plazas2.setText(" ");
     
        String horaida= (String) horaIda.getSelectedItem();
        String ComboBox3 = (String) jComboBox3.getSelectedItem();
       
        for(int i=0;i<busx.size();i++)
        {
            if(busx.get(i).color==ComboBox3)
                {
                Nplazas nplaza= new Nplazas();   
                int numero= nplaza.Nplazasx(busx.get(i).Cod_bus,busx.get(i).N_Plazas,horaida);
                plazas.setText("Plazas Disponibles: "+String.valueOf(numero));                
                }                     
        }       
        
        String ComboBox1 = (String) origen.getSelectedItem();
        for(int p=0;p<paradax.size();p++)
        {
            if(paradax.get(p).nombre.equals(ComboBox1)){
            uno=p;
            }
        }
        
        String ComboBox2 = (String) destino.getSelectedItem();
        for(int p=0;p<paradax.size();p++)
        {   
            if(paradax.get(p).nombre.equals(ComboBox2)){
            dos=p;
            }
        }   

    
         for(int i=0;i<busx.size();i++)
        {
            if(busx.get(i).color==ComboBox3)
            { 
               busesito=i;
            }       
        }
       
            Calculos cal= new Calculos();  
            double result=Calculos.calcularDistancia(paradax.get(uno).latitud,paradax.get(uno).longitud,paradax.get(dos).latitud,paradax.get(dos).longitud);
            double total_precio=Calculos.calcularTotal(result,busx.get(busesito).Consumo_km);
            redondo=Calculos.Redondear(total_precio);
            Comprar.setEnabled(true);
            precio.setText(String.valueOf(redondo+"€"));
            
        horaIda.setEnabled(true);
        ida.setEnabled(true);     
        ida.setMinSelectableDate(new Date());
        horaVuelta.setEnabled(false);  
        idaVuelta.setEnabled(false);
    }//GEN-LAST:event_idasActionPerformed

    private void vueltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vueltasActionPerformed
        plazas2.setText(" ");
                
        String horaida= (String) horaIda.getSelectedItem();
        String horavuelta= (String) horaVuelta.getSelectedItem();
        String ComboBox3 = (String) jComboBox3.getSelectedItem();
        
        for(int i=0;i<busx.size();i++)
        {
                if(busx.get(i).color==ComboBox3)
                {
                Nplazas nplaza= new Nplazas();   
                int numero= nplaza.Nplazasx(busx.get(i).Cod_bus,busx.get(i).N_Plazas,horaida);
                int numero2= nplaza.Nplazasx(busx.get(i).Cod_bus,busx.get(i).N_Plazas,horavuelta);
                plazas.setText("Plazas Disponibles: "+String.valueOf(numero)); 
                plazas2.setText("Plazas Disponibles: "+String.valueOf(numero2));
                }                       
        }
       
        String ComboBox1 = (String) origen.getSelectedItem();
        for(int p=0;p<paradax.size();p++)
        {
            if(paradax.get(p).nombre.equals(ComboBox1)){
            uno=p;
            }
        }
        
        String ComboBox2 = (String) destino.getSelectedItem();
        for(int p=0;p<paradax.size();p++)
        {
            if(paradax.get(p).nombre.equals(ComboBox2)){
            dos=p;
            }
        }

         for(int i=0;i<busx.size();i++)
        {
                if(busx.get(i).color==ComboBox3)
                { 
                    busesito=i;
                }       
        }
       
            Calculos cal= new Calculos();  
            double result=Calculos.calcularDistancia(paradax.get(uno).latitud,paradax.get(uno).longitud,paradax.get(dos).latitud,paradax.get(dos).longitud);
            double total_precio=Calculos.calcularTotal(result,busx.get(busesito).Consumo_km);
            total_precio=total_precio+total_precio;
            redondo=Calculos.Redondear(total_precio);
            Comprar.setEnabled(true);
            precio.setText(String.valueOf(redondo+"€")); 
            
        horaIda.setEnabled(true);
        ida.setEnabled(true);     
        horaVuelta.setEnabled(true);  
        idaVuelta.setEnabled(true);
        ida.setMinSelectableDate(new Date());
        idaVuelta.setMinSelectableDate(new Date());
    }//GEN-LAST:event_vueltasActionPerformed

    private void horaIdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaIdaActionPerformed
    String horaida = (String)horaIda.getSelectedItem();
    horaVuelta.removeAllItems();
    String fecha1 = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(ida.getDate());
    String fecha2 = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(idaVuelta.getDate());
    if ((fecha1.compareTo(fecha2) ==0)){
            if(horas.get(0).equals(horaida)){
                horaVuelta.addItem(horas.get(1));
                horaVuelta.addItem(horas.get(2));
                horaVuelta.addItem(horas.get(3));
            }

            if(horas.get(1).equals(horaida)){
                horaVuelta.addItem(horas.get(2));
                horaVuelta.addItem(horas.get(3));
            }
            if(horas.get(2).equals(horaida)){
                horaVuelta.addItem(horas.get(3));
            }
            if(horas.get(3).equals(horaida)){
                horaVuelta.addItem("No Disponible");
            }   
            else{
                for(int i=0;i<horas.size();i++)
                {          
                    horaVuelta.addItem(horas.get(i));          
                }
            }
    }
    }//GEN-LAST:event_horaIdaActionPerformed

    private void idaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_idaPropertyChange
    
    if (vueltas.isSelected()){
        idaVuelta.setMinSelectableDate(ida.getDate());
    } 
    }//GEN-LAST:event_idaPropertyChange
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnterior;
    private javax.swing.JButton Comprar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> destino;
    private javax.swing.JComboBox<String> horaIda;
    private javax.swing.JComboBox<String> horaVuelta;
    private com.toedter.calendar.JCalendar ida;
    private com.toedter.calendar.JCalendar idaVuelta;
    private javax.swing.JRadioButton idas;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> origen;
    private javax.swing.JLabel plazas;
    private javax.swing.JLabel plazas2;
    private javax.swing.JLabel precio;
    private javax.swing.JRadioButton vueltas;
    // End of variables declaration//GEN-END:variables
}
