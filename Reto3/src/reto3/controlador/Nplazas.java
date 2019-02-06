
package reto3.controlador;

import reto3.modelo.Consultas;

public class Nplazas {
   
     public int Nplazasx(int Cod_bus,int numero_plazas,String horaida){
         
         Consultas cone =new Consultas();
         int numerito= cone.NPlazas(Cod_bus,horaida);
         numerito=numero_plazas-numerito;
         return numerito;
     }
    
}
