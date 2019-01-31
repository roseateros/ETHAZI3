
package reto3.controlador;

import static reto3.controlador.pasar_pagina.lineas_a_paradas;
import reto3.modelo.Consultas;
import reto3.modelo.cliente;


public class Seleccionar_Autobus {
    
    public String autobus;
    
    public Seleccionar_Autobus(String lineax,cliente cliente)
    {
        Consultas cone =new Consultas();
        autobus autobus=cone.(autobus);
        lineas_a_paradas(cliente,linea);
    }    
}

