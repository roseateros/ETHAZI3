
package reto3.controlador;

import java.util.ArrayList;
import reto3.modelo.Consultas;

public class Poblacion {
    
    public String linea;
    
    public static ArrayList<String> poblac(String linea) {
        
        ArrayList<String> pobla=new ArrayList();   
        Consultas cone =new Consultas();
        pobla=cone.obtener_Poblacion(linea);
        return pobla;
    }
    
}
