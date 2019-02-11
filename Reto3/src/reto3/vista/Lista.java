
package reto3.vista;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import reto3.modelo.Parada;
import reto3.modelo.billete;
import reto3.modelo.cliente;
import reto3.modelo.lineas;

public class Lista extends javax.swing.JFrame {
    
public cliente clientex;
public lineas lineasx;
public ArrayList<billete> billetex;
public ArrayList<Parada> paradax;
public ArrayList<String> nombres;
public double valor;
//Main uno
    public Lista(cliente cliente,lineas lineas, ArrayList<billete> billete) {
        initComponents();
        
        DefaultListModel modelio = new DefaultListModel();
        lista.setModel(modelio);
        billetex =new ArrayList();
        nombres =new ArrayList();

        for(int x=0;x<billete.size();x++)
        {
        billetex.add(billete.get(x));
        modelio.addElement((x+1)+") Linea "+String.valueOf(billetex.get(x).Cod_Linea)+"   "+billetex.get(x).inicio+"-"+billetex.get(x).finale+"       Fecha:   "+String.valueOf(billetex.get(x).fecha)+"   Hora:   "+billetex.get(x).hora);       
        valor = valor + billetex.get(x).precio;
        }
        
        lineasx=lineas;        
        clientex=cliente;
       
            setLocationRelativeTo(null);
            setResizable (false);
            setTitle ("Lista");
        
        cobro.setText(String.valueOf(valor)+" €");
    }
//Main uno      
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        cobro = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setText("ALEJANDRO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("COMPRAR OTRO BILLETE");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 190, 50));

        jButton2.setBackground(new java.awt.Color(255, 255, 51));
        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("FINALIZAR COMPRA");
        jButton2.setActionCommand("");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 190, 50));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CESTA DE LA COMPRA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jScrollPane1.setViewportView(lista);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 510, 230));

        cobro.setBackground(new java.awt.Color(255, 255, 255));
        cobro.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        cobro.setForeground(new java.awt.Color(255, 255, 0));
        cobro.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(cobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 70, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TOTAL A PAGAR:");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, -1, -1));

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
        reto3.controlador.pasar_pagina.lista_a_lineas(clientex, lineasx,billetex);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        reto3.controlador.pasar_pagina.lista_a_cobro(clientex, lineasx,billetex);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JLabel cobro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    // End of variables declaration//GEN-END:variables
}
