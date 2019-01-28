  package reto3.vista;

import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import reto3.controlador.crearCliente;
import static reto3.controlador.pasar_pagina.aux;

public class NoRegistrado extends javax.swing.JFrame {

    public NoRegistrado() {
    
        initComponents();
            setLocationRelativeTo(null);
            setResizable (false);
            setTitle ("Registro");
                       
    ImageIcon Imagen = new ImageIcon ("src/Imagenes/anterior.png");
    Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(BotonAnterior.getWidth(), BotonAnterior.getHeight(), Image.SCALE_DEFAULT));
    BotonAnterior.setIcon(icono);
    this.repaint();

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
        Registrar = new javax.swing.JButton();
        jlabel3 = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        H = new javax.swing.JRadioButton();
        M = new javax.swing.JRadioButton();
        dni = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        fecha_nac = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("DATOS USUARIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 130, 30));

        BotonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 120, 70));

        jlabel2.setBackground(new java.awt.Color(0, 0, 0));
        jlabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jlabel2.setText("NOMBRE:");
        getContentPane().add(jlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jlabel1.setBackground(new java.awt.Color(0, 0, 0));
        jlabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jlabel1.setText("DNI:");
        getContentPane().add(jlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 30, 20));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel5.setText("APELLIDOS:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        Registrar.setBackground(new java.awt.Color(255, 255, 51));
        Registrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Registrar.setText("RESGISTRAR");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 120, 40));

        jlabel3.setBackground(new java.awt.Color(0, 0, 0));
        jlabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jlabel3.setText("SEXO:");
        getContentPane().add(jlabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 30, -1));

        contraseña.setBackground(new java.awt.Color(0, 0, 0));
        contraseña.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        contraseña.setText("CONTRASEÑA:");
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        gruposexo.add(H);
        H.setText("Hombre");
        getContentPane().add(H, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        gruposexo.add(M);
        M.setText("Mujer");
        getContentPane().add(M, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));
        getContentPane().add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 130, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 100, -1));
        getContentPane().add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 130, -1));

        fecha_nac.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(fecha_nac, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 100, 20));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel8.setText("FECHA DE NACIMIENTO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 130, -1));

        jPasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 130, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnteriorActionPerformed
        reto3.controlador.pasar_pagina.noregistrado_a_registrado();
        dispose (); 
    }//GEN-LAST:event_BotonAnteriorActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        if (H.isSelected()){
            sexo= "V";
        } else if (M.isSelected()){
            sexo= "M";
        }        
    
    String fecha = (new java.text.SimpleDateFormat("yyyy-MM-dd")).format(fecha_nac.getDate());

    crearCliente crearCliente = new crearCliente (dni.getText(), nombre.getText(), apellidos.getText(), fecha, sexo, contraseña.getText()) ;
    
    if (aux>0){
    dispose();
    aux=0;
    }
    }//GEN-LAST:event_RegistrarActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnterior;
    private javax.swing.JRadioButton H;
    private javax.swing.JRadioButton M;
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField apellidos;
    private javax.swing.JLabel contraseña;
    private javax.swing.JTextField dni;
    public static com.toedter.calendar.JDateChooser fecha_nac;
    private javax.swing.ButtonGroup gruposexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
