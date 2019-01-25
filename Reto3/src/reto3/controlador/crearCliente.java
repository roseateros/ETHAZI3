
package reto3.controlador;

import java.sql.Date;
import javax.swing.JOptionPane;
import static reto3.controlador.pasar_pagina.aux;
import static reto3.controlador.pasar_pagina.noregistrado_a_registrado;
import reto3.modelo.Consultas;
import reto3.modelo.cliente;

public class crearCliente {
        public String dni,nombre,apellidos,contraseña, gruposexo;
        public Date fecha_nac;

    public crearCliente(String dni,String nombre,String apellidos,String contraseña, String gruposexo, Date fecha_nac){
        reto3.controlador.pasar_pagina.noregistrado_a_registrado();
                if ( (dni == null) || (dni.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado el Dni");
        }else if ( (nombre == null) || (nombre.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado el Nombre del usuario");
        }            Consultas cone =new Consultas(); 
                     cliente cliente;
                     cliente = cone.ObtenerCliente(dni,nombre,apellidos,contraseña,gruposexo,fecha_nac);
                     System.out.println(cliente.dni);
                     noregistrado_a_registrado();  
                     aux++;
    }
}
