/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3.controlador;
import static reto3.controlador.pasar_pagina.lineas_a_paradas;
import static reto3.controlador.pasar_pagina.registrado_a_lineas;
import reto3.modelo.Consultas;

import reto3.modelo.lineas;


public class Seleccionar_linea {
     public String lineax;
    public Seleccionar_linea(String lineax)
    {
        Consultas cone =new Consultas();
        lineas linea=cone.ObtenerLineas(lineax);
        lineas_a_paradas();
        }
        
      
    
}
 