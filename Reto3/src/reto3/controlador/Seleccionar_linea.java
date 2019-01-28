
package reto3.controlador;
import javax.swing.JOptionPane;
import static reto3.controlador.pasar_pagina.lineas_a_paradas;
import reto3.modelo.Consultas;
import reto3.modelo.cliente;

import reto3.modelo.lineas;




public class Seleccionar_linea {
    
     public String lineax;
    public Seleccionar_linea(String lineax,cliente cliente)
    {
        Consultas cone =new Consultas();
        lineas linea=cone.ObtenerLineas(lineax);
        lineas_a_paradas(cliente,linea);
        }    
}
 