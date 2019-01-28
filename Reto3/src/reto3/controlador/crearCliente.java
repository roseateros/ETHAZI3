
package reto3.controlador;

import javax.swing.JOptionPane;
import static reto3.controlador.pasar_pagina.aux;
import static reto3.controlador.pasar_pagina.noregistrado_a_registrado;
import reto3.modelo.Insertar;
import reto3.modelo.cliente;

public class crearCliente {


    public crearCliente(String dni,String nombre,String apellidos,String contraseña, String sexo, String fecha_nac){
        reto3.controlador.pasar_pagina.noregistrado_a_registrado();
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
        }else if ( (sexo == null) || (sexo.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado el sexo");
        }else if ( (fecha_nac == null) || (fecha_nac.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado la Fecha de Nacimiento");
        }else 
        {
            JOptionPane.showMessageDialog(null,"Registro correcto");
        }
                    Insertar cone =new Insertar(); 
                     cliente cliente;
                     cliente = cone.InsertarCliente(dni,nombre,apellidos,contraseña,sexo,fecha_nac);
                     System.out.println(cliente.dni);
                     noregistrado_a_registrado();  
                     aux++;
    }
}
