
package reto3.controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static reto3.controlador.pasar_pagina.aux;
import reto3.modelo.Insertar;
import reto3.modelo.billete;
import reto3.modelo.cliente;
import reto3.modelo.lineas;

public class InsertarBillete {
public cliente clientex;
public lineas lineasx;
ArrayList<billete> billetex; 

    public InsertarBillete(ArrayList<billete> billete,cliente cliente){
        
        
        Insertar cone =new Insertar(); 
        billetex =new ArrayList();
        clientex=cliente;       
        for(int x=0;x<billete.size();x++)
        {
     
        billetex.add(billete.get(x));
        cone.InsertarBillete(billetex.get(x).NTrayecto,billetex.get(x).dni,billetex.get(x).fecha, billetex.get(x).hora, billetex.get(x).Cod_Linea, billetex.get(x).Cod_Bus, billetex.get(x).Cod_Parada_Inicio, billetex.get(x).Cod_Parada_Fin, billetex.get(x).precio);  
        }                         
        reto3.controlador.pasar_pagina.cobro_a_imprimir(clientex, billetex);
        aux++;    
    }   
}
