
package reto3.controlador;

import static reto3.controlador.pasar_pagina.imprimir_a_adios;
import reto3.modelo.Consultas;

public class ImprimirTicket {
    
    public ImprimirTicket(){
        
        Consultas cone =new Consultas();
        //cone.ObtenerBoleto();                   
        imprimir_a_adios(); 
    }
}