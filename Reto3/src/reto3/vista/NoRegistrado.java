  package reto3.vista;


import reto3.controlador.crearCliente;
import static reto3.controlador.pasar_pagina.aux;

public class NoRegistrado extends javax.swing.JFrame {

    public NoRegistrado() {
    
        initComponents();
            setLocationRelativeTo(null);
            setResizable (false);
            setTitle ("Registro");
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
        pass = new javax.swing.JLabel();
        H = new javax.swing.JRadioButton();
        M = new javax.swing.JRadioButton();
        dni = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        fecha_nac = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("DATOS USUARIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 130, 30));

        BotonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anterior.png"))); // NOI18N
        BotonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 120, 70));

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

        Registrar.setBackground(new java.awt.Color(255, 255, 51));
        Registrar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        Registrar.setForeground(new java.awt.Color(0, 0, 0));
        Registrar.setText("RESGISTRAR");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 120, 40));

        jlabel3.setBackground(new java.awt.Color(255, 255, 255));
        jlabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jlabel3.setForeground(new java.awt.Color(0, 0, 0));
        jlabel3.setText("SEXO:");
        getContentPane().add(jlabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 30, -1));

        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(0, 0, 0));
        pass.setText("CONTRASEÑA:");
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        gruposexo.add(H);
        H.setText("Hombre");
        getContentPane().add(H, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        gruposexo.add(M);
        M.setText("Mujer");
        getContentPane().add(M, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));
        getContentPane().add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 130, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 100, -1));
        getContentPane().add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 130, -1));

        fecha_nac.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(fecha_nac, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 100, 20));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("FECHA DE NACIMIENTO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 130, -1));

        contraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("REPETIR CONTRASEÑA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 130, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

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
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField dni;
    public static com.toedter.calendar.JDateChooser fecha_nac;
    private javax.swing.ButtonGroup gruposexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
