
package reto3.controlador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static reto3.controlador.pasar_pagina.aux;
import static reto3.controlador.pasar_pagina.noregistrado_a_registrado;
import reto3.modelo.Consultas;
import reto3.modelo.cliente;


public class ActualizarCliente {

    public ActualizarCliente(String dni,String nombre,String apellidos, String fecha, String sexo, String contraseña, String password){
       
        if ( (nombre == null) || (nombre.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado el Nombre del usuario");
        }else if ( (apellidos == null) || (apellidos.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado los Apellidos"); 
        }else if ( (sexo.isEmpty()) || (sexo.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado el Sexo"); 
        }else if ( (contraseña == null) || (contraseña.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado la contraseña");
        }else if ( (password == null) || (password.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado la contraseña");
        }else if (contraseña.equals(password)==false)
        {
            JOptionPane.showMessageDialog(null,"No coinciden las contraseñas");           
        }
        
        Pattern nombrePattern = Pattern.compile("[a-zA-Z]*");
	Matcher n = nombrePattern.matcher(nombre);
        
        if (contraseña.equals(password) && (!dni.equals("")) && (!nombre.equals("")) && (!apellidos.equals("")) && (!sexo.equals("")))
        {
            if(n.matches()){
                    JOptionPane.showMessageDialog(null,"Usuario actualizado");
                    Consultas cone =new Consultas(); 
                    cliente cliente;
                    cone.ActualizarCliente(dni,nombre,apellidos,fecha,sexo,contraseña);                   
                    noregistrado_a_registrado();  
                    aux++;                    
                }
            else{
                JOptionPane.showMessageDialog(null,"Nombre no valido! No puede contener numeros");
            }                                 
        }
    }  
}


