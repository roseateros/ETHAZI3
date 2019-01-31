
package reto3.controlador;

import java.util.ArrayList;
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
        
        return paradax; 
    }
}
