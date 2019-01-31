
package reto3.controlador;

import java.util.Calendar;
 

public class Calculos {
    
    public double calcularDistancia(float Lat, float Long, float latitud, float longitud) {
        
		double radioTierra = 6371;
		double dlat = Math.toRadians(Lat - latitud); //
		double dlng = Math.toRadians(Long - longitud);
		double sindLat = Math.sin(dlat / 2);
		double sindLng = Math.sin(dlng / 2);
		double va1 = Math.pow(sindLat, 2)
				+ Math.pow(sindLng, 2) * Math.cos(Math.toRadians(Lat)) * Math.cos(Math.toRadians(latitud));
		double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));
		double distancia = radioTierra * va2;

		return distancia;
    }
    public static double calcularPrecio(double distancia,double consumo_bus,int viajeros) {
        
		double precio=0;
		final double combustible=0.80;
		final double beneficio=0.20;
		double consumo_combustible=combustible*consumo_bus;
		double gasto_viaje=distancia*consumo_combustible;
		double beneficios= gasto_viaje*beneficio;
		double total_viaje=beneficios+gasto_viaje;
		precio=total_viaje/viajeros;
				
		return precio;		
	}
    
	public static String orduaAtera () {
            
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
        
	public static String dataAtera () {
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
