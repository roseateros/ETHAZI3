
package reto3.controlador;

import java.util.ArrayList;
import reto3.modelo.Consultas;
import reto3.modelo.autobus;
import reto3.modelo.cliente;
import reto3.modelo.lineas;

public class Seleccionar_Autobus {
    
     public static ArrayList<autobus> Seleccionar_Autobus (lineas lineas,cliente cliente)
    {        	
        ArrayList<autobus> bus;
        bus = new ArrayList();
        Consultas cone =new Consultas();
        bus= cone.datosAutobus(lineas);
  
        return bus; 
    } 
}

