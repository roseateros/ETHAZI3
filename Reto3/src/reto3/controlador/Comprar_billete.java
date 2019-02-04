
package reto3.controlador;

import javax.swing.JOptionPane;
import reto3.modelo.cliente;
import reto3.modelo.lineas;
import reto3.modelo.Insertar;

public class Comprar_billete {
    public cliente cliente;
    public lineas lineas;
    public Comprar_billete(int cod_Billete, int NTrayecto, String dni, String fecha, String hora, String Cod_Linea, String Cod_Bus, String Cod_Parada_Inicio, String Cod_Parada_Fin, double precio){
        
        JOptionPane.showMessageDialog(null, "Compra realizada!");
        Insertar cone = new Insertar();
        cone.InsertarBillete(cod_Billete, NTrayecto, Cod_Linea, Cod_Bus, Cod_Parada_Inicio, Cod_Parada_Fin, fecha, hora, dni, precio);
        reto3.controlador.pasar_pagina.paradas_a_lista(cliente,lineas);   
    }  

}
