
package reto3.controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import reto3.modelo.Consultas;
import reto3.modelo.Parada;
import reto3.modelo.cliente;
import reto3.modelo.lineas;

public class Seleccionar_paradas {
   
    public static ArrayList<Parada> Seleccionar_paradas (lineas lineas,cliente cliente)
    {        	
        ArrayList<Parada> paradax;
        paradax = new ArrayList();
        Consultas cone =new Consultas();
        paradax= cone.ObtenerParadas(lineas);
        Calculos cal= new Calculos();
        for(int i=1;i<paradax.size();i++)
        {
            paradax.get(i).distancia=cal.calcularDistancia(paradax.get(0).latitud,paradax.get(0).longitud,paradax.get(i).latitud,paradax.get(i).longitud);

        }

        
        return paradax; 
    }
    
}
