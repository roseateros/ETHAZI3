
package reto3.controlador;

import javax.swing.JOptionPane;
import static reto3.controlador.pasar_pagina.registrado_a_lineas;

public class VerificarCliente {
    public String us;
    public String pass;

     public VerificarCliente(String us,String  pass) {
        if ( (us == null) || (us.equals("")) ) {
           JOptionPane.showMessageDialog(null,"No has ingresado el Nombre del usuario");
        }
        else if ( (pass == null) || (pass.equals("")) ){
           JOptionPane.showMessageDialog(null,"No has ingresado la Contraseña");
        }
        else if ( (pass != null) || us != null ){
         registrado_a_lineas();       
        }
     

    }
}