
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
}

