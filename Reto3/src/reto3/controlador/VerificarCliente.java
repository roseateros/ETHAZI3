
package reto3.controlador;

import javax.swing.JOptionPane;
import static reto3.controlador.pasar_pagina.aux;
import static reto3.controlador.pasar_pagina.registrado_a_lineas;
import reto3.modelo.Consultas;
import reto3.modelo.cliente;

public class VerificarCliente 
{
    //DEBEMOS CREAR LOS ATRIBUTOS US Y PASS COMO PUBLICOS
    public String us;
    public String pass;

     public VerificarCliente(String us,String  pass)//ESTA ES LA FUNCION CONSTRUCTORA DE LA CLASE VERIFICARCLIENTE 
     {
         //AQUI EMPEZAMOS A VERIFICAR 
        if ( (us == null) || (us.equals("")) )// ESTO ES SI EL COÑO È MADRE NO DEJÒ VACÌO EL ESPACIO DE USUARIO 
        {
           JOptionPane.showMessageDialog(null,"No has ingresado el Nombre del usuario");
        }
             else if ( (pass == null) || (pass.equals("")) )// ESTO ES SI EL COÑO È MADRE NO DEJÒ VACÌO EL ESPACIO DE PASSWORD
             {
                 JOptionPane.showMessageDialog(null,"No has ingresado la Contraseña");
             }
                 else if ( (pass != null) || us != null )// AQUÌ EL PANA NO ES TAN COÑO È MADRE, PORQUE NADA ESTÀ VACÌO
                  {
                     Consultas cone =new Consultas(); // SE INSTANCIA EL OBJETO CONE EN LA CLASE CONSULTAS, LO CUAL DESPIERTA LA FURIA DE THANOS ._. , MENTIRA XD SOLO CONECTA A LA BASES DE DATOS
                     cliente cliente;// DECLARAMOS UN OBJETO CLIENTE , ESTE OBJETO VA A SERVIR PARA ALMACENAR EL OBJETO QUE SE CREA CUANDO HACEMOS LA CONSULTA
                     cliente = cone.ObtenerCliente(us,pass);// AQUÌ EJECUTAMOS LA FUNCIÒN Y NOS DEVUELVE EL OBJETO
                     System.out.println(cliente.dni);
                     registrado_a_lineas();  
                     aux++;
                   }
     

      }
}