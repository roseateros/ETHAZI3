/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3.controlador;

import javax.swing.JOptionPane;
import reto3.modelo.Consultas;
import reto3.modelo.cliente;

/**
 *
 * @author Tarde
 */
public class llamarCliente {
        String us;
    String pass;
    public llamarCliente(String us, String pass){
         if ( (us.equals("")) || (pass.equals("")) ){
         JOptionPane.showMessageDialog(null, "Ingrese Usuario y/o Contraseña");
        }
         if((!us.equals("")) && (!pass.equals(""))){
             Consultas cone = new Consultas();
        cliente cliente;
        cliente= cone.ObtenerCliente(us, pass);
        reto3.controlador.pasar_pagina.linia_a_actulizar(cliente);
         }else{
            reto3.controlador.pasar_pagina.registrado_a_saludo();
         }
        
    }
}
