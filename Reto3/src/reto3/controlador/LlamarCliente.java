
package reto3.controlador;

import javax.swing.JOptionPane;
import static reto3.controlador.pasar_pagina.aux;
import static reto3.controlador.pasar_pagina.registro_a_actualizar;
import reto3.modelo.Consultas;
import reto3.modelo.cliente;

public class LlamarCliente {
    
    String us;
    String pass;
    public LlamarCliente(String us, String pass){
        
        if ( (us == null) || (us.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado el Nombre del usuario");
        }
             else if ( (pass == null) || (pass.equals("")) )
             {
                JOptionPane.showMessageDialog(null,"No has ingresado la Contraseña");
             }
                else if ( (pass != null) || us != null )
                {
                    Consultas cone = new Consultas();
                    cliente cliente;
                    cliente= cone.ObtenerCliente(us, pass);
                    if (cliente==null){
                        JOptionPane.showMessageDialog(null,"El usuario "+us+" no existe o has introducido mal la contraseña");
                    }
                    JOptionPane.showMessageDialog(null,"Bienvenido "+cliente.nombre);
                    registro_a_actualizar(cliente);
                    aux++;
            }
        }        
    }

