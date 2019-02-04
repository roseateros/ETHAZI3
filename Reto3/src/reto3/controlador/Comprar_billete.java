
package reto3.controlador;

import javax.swing.JOptionPane;
import java.util.Calendar;
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
    	public static String ObtenerHora () {
            
		int hora,minutos = 0;
		Calendar fecha = Calendar.getInstance();
			
		//Guardar hora
		hora =fecha.get(Calendar.HOUR_OF_DAY);
		minutos = fecha.get(Calendar.MINUTE);
			
		String ordua = hora+":"+minutos;

		if (hora<10) {
			ordua = "0"+hora+":"+minutos;
		}
		if (minutos<10) {
			ordua = hora+":"+"0"+minutos;
		}
		if(hora<10 && minutos<10) {
			ordua = hora+":"+"0"+minutos;
		}
		System.out.println(ordua);
                
		return ordua;
		}
        
	public static String ObtenerFecha () {
		int año,mes,dia = 0;
			
		Calendar fecha = Calendar.getInstance();

		//Guardar fecha
	        año = fecha.get(Calendar.YEAR);
	        mes = fecha.get(Calendar.MONTH) + 1;
	        dia = fecha.get(Calendar.DAY_OF_MONTH);
	        
		String fech = dia+"/"+mes+"/"+año;
	        
	        if(dia<10) {
			fech = "0"+dia+"/"+mes+"/"+año;
		}
		if(mes<10) {
			fech = dia+"/"+"0"+mes+"/"+año;
		}
		if (dia<10 && mes<10) {
			fech = "0"+dia+"/"+"0"+mes+"/"+año;
		}
		System.out.println(fech);
                
		return fech;
    }
}
