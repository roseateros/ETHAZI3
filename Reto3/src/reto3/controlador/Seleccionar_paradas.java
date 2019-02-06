
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
        Calculos cal= new Calculos();
        for(int i=1;i<paradax.size();i++)
        {
            paradax.get(i).distancia=cal.calcularDistancia(paradax.get(0).latitud,paradax.get(0).longitud,paradax.get(i).latitud,paradax.get(i).longitud);
        }

        Parada parad;
        for(int k=0;k<(paradax.size()-1);k++)
        {
            System.out.println(paradax.size());
            for(int f=0;f<((paradax.size()-k)-1);f++)
            {
                System.out.println("Dentro del For 2");
                if(paradax.get(f).distancia>paradax.get(f+1).distancia)
                {
                    parad=paradax.get(f+1);
                    paradax.set(f+1,paradax.get(f));
                    paradax.set(f,parad);
                    System.out.println("Valor :"+(f+1)+paradax.get(f+1).nombre+" valor : "+f+paradax.get(f).nombre);
                }
            }
        }       
        return paradax; 
    }
    
}
