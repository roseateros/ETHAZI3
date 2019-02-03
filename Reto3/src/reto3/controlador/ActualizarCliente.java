
package reto3.controlador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static reto3.controlador.pasar_pagina.aux;
import static reto3.controlador.pasar_pagina.noregistrado_a_registrado;
import reto3.modelo.Consultas;


public class ActualizarCliente {
    
    public ActualizarCliente(String dni,String nombre,String apellidos, String fecha, String sexo, String contraseña, String password){

        if ( (dni == null) || (dni.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado el Dni");
        }else if ( (nombre == null) || (nombre.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado el Nombre del usuario");
        }else if ( (apellidos == null) || (apellidos.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado los Apellidos"); 
        }else if ( (contraseña == null) || (contraseña.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado la contraseña");
        }else if ( (password == null) || (password.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado la contraseña");
        }else if ( (sexo == null) || (sexo.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado el sexo");
        }else if ( (fecha == null) || (fecha.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado la Fecha de Nacimiento");
        }else if (contraseña.equals(password)==false)
        {
            JOptionPane.showMessageDialog(null,"No coinciden las contraseñas");           
        }
        dni = dni.toUpperCase();
        Pattern dniPattern = Pattern.compile("\\d{8}[A-HJ-NP-TV-Z]");
	Matcher m = dniPattern.matcher(dni);
        Pattern nombrePattern = Pattern.compile("[a-zA-Z]*");
	Matcher n = nombrePattern.matcher(nombre);
        
        if (contraseña.equals(password) && (!fecha.equals("")) && (!dni.equals("")) && (!nombre.equals("")) && (!apellidos.equals("")) && (!sexo.equals("")))
        {
	if(m.matches()){
            if(n.matches()){
                    JOptionPane.showMessageDialog(null,"Usuario actualizado");
                    Consultas cone =new Consultas(); 
                    cone.ActualizarCliente(dni,nombre,apellidos,contraseña,sexo,fecha);                   
                    noregistrado_a_registrado();  
                    aux++; 
                }
            else{
                JOptionPane.showMessageDialog(null,"Nombre no valido! No puede contener numeros");
            }                                 
        }
        else{
            JOptionPane.showMessageDialog(null,"DNI no valido! Introduzca este formato: 12345678A");
            }
        }  
    }
}

