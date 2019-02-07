
package reto3.controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import reto3.modelo.billete;
import reto3.modelo.cliente;
import reto3.modelo.lineas;


public class Comprar_billete {
    
    public cliente cliente;
    public lineas lineas;
    
    public Comprar_billete( int NTrayecto, String dni, String ida, String horaida, String Cod_Linea, int Cod_Bus, int Cod_Parada_Inicio, int Cod_Parada_Fin, double precio){
        
        JOptionPane.showMessageDialog(null, "Compra realizada!");

        ArrayList<billete> billete;
        billete = new ArrayList();
        billete billetico=new billete(NTrayecto,dni,ida,horaida,Cod_Linea,Cod_Bus,Cod_Parada_Inicio,Cod_Parada_Fin,precio);
        billete.add(billetico);
        
        reto3.controlador.pasar_pagina.paradas_a_lista(cliente,lineas,billete);   
    }  
}
