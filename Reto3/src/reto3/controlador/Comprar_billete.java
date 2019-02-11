
package reto3.controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import reto3.modelo.billete;
import reto3.modelo.cliente;
import reto3.modelo.lineas;


public class Comprar_billete {
    
    public cliente clientex;
    public lineas lineasx;

    
    public Comprar_billete( String inicio, String Finale,int NTrayecto, cliente cliente, String ida, String horaida,  lineas lineas, int Cod_Bus,int Cod_Parada_Inicio, int Cod_Parada_Fin, double precio,ArrayList<billete> billete){
        
      System.out.println("Marico estoy en compra");

        
        
        billete billetico=new billete(NTrayecto,cliente.dni,ida,horaida,lineas.Cod_Linea,Cod_Bus,Cod_Parada_Inicio,Cod_Parada_Fin,precio,inicio,Finale);
        billete.add(billetico);
        
        reto3.controlador.pasar_pagina.paradas_a_lista(cliente,lineas,billete);   
    }  
    
        public Comprar_billete(String inicio, String Finale, int NTrayecto,cliente cliente, String ida, String horaida, lineas lineas, int Cod_Bus, int Cod_Parada_Inicio, int Cod_Parada_Fin, double precio){
        
       System.out.println("Marico estoy en compra");
     ArrayList<billete> billete;
       billete = new ArrayList();
        billete billetico=new billete(NTrayecto,cliente.dni,ida,horaida,lineas.Cod_Linea,Cod_Bus,Cod_Parada_Inicio,Cod_Parada_Fin,precio,inicio,Finale);
        billete.add(billetico);
        
        reto3.controlador.pasar_pagina.paradas_a_lista(cliente,lineas,billete);   
    }
}
