
package reto3.controlador;

import java.awt.List;
import java.util.ArrayList;
import static reto3.controlador.pasar_pagina.lineas_a_paradas;
import reto3.modelo.Consultas;
import reto3.modelo.Parada;
import reto3.modelo.cliente;
import reto3.modelo.lineas;

public class Seleccionar_paradas {
    public Seleccionar_paradas (lineas lineas,cliente cliente)
    {
         	

ArrayList<Parada> paradax;
        paradax = new ArrayList();
        Consultas cone =new Consultas();
       cone.ObtenerParadas(lineas);
       // lineas_a_paradas(cliente,lineas);
       
        
        
    }
}
