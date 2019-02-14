
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
   
        billete billetico=new billete(NTrayecto,cliente.dni,ida,horaida,lineas.Cod_Linea,Cod_Bus,Cod_Parada_Inicio,Cod_Parada_Fin,precio,inicio,Finale);
        billete.add(billetico);
        
        reto3.controlador.pasar_pagina.paradas_a_lista(cliente,lineas,billete);   
    }  
    
    public Comprar_billete(String inicio, String Finale, int NTrayecto,cliente cliente, String ida, String horaida, lineas lineas, int Cod_Bus, int Cod_Parada_Inicio, int Cod_Parada_Fin, double precio){

        ArrayList<billete> billete;
        billete = new ArrayList();
        billete billetico=new billete(NTrayecto,cliente.dni,ida,horaida,lineas.Cod_Linea,Cod_Bus,Cod_Parada_Inicio,Cod_Parada_Fin,precio,inicio,Finale);
        billete.add(billetico);
        
        reto3.controlador.pasar_pagina.paradas_a_lista(cliente,lineas,billete);   
    }
        
    public Comprar_billete(String inicio, String Finale, int NTrayecto,cliente cliente, String ida, String horaida, lineas lineas, int Cod_Bus, int Cod_Parada_Inicio, int Cod_Parada_Fin, double precio,ArrayList<billete> billete,int Cod_ini, int Cod_fin,String vuelta,String horavu){
        
        System.out.println(Cod_ini+" "+Cod_fin);
        billete billetico=new billete(NTrayecto,cliente.dni,ida,horaida,lineas.Cod_Linea,Cod_Bus,Cod_Parada_Inicio,Cod_Parada_Fin,precio,inicio,Finale);
        billete.add(billetico);
        
        billete billetico2=new billete(2,cliente.dni,vuelta,horavu,lineas.Cod_Linea,Cod_Bus,Cod_ini,Cod_fin,precio,Finale,inicio);
        billete.add(billetico2);
        
        reto3.controlador.pasar_pagina.paradas_a_lista(cliente,lineas,billete);   
    }
         
    public Comprar_billete(String inicio, String Finale, int NTrayecto,cliente cliente, String ida, String horaida, lineas lineas, int Cod_Bus, int Cod_Parada_Inicio, int Cod_Parada_Fin, double precio,int Cod_ini, int Cod_fin,String vuelta,String horavu){
        
        ArrayList<billete> billete;
        billete = new ArrayList();
        billete billetico=new billete(NTrayecto,cliente.dni,ida,horaida,lineas.Cod_Linea,Cod_Bus,Cod_Parada_Inicio,Cod_Parada_Fin,precio,inicio,Finale);
        billete.add(billetico);
        System.out.println(Cod_ini+" "+Cod_fin);
         billete billetico2=new billete(2,cliente.dni,vuelta,horavu,lineas.Cod_Linea,Cod_Bus,Cod_ini,Cod_fin,precio,Finale,inicio);
        billete.add(billetico2);
        
        reto3.controlador.pasar_pagina.paradas_a_lista(cliente,lineas,billete);   
    }
}
