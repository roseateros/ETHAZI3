
package reto3.controlador;
 
public class Calculos {
    
    public static double calcularDistancia(float Lat, float Long, float latitud, float longitud) {
        
		double radioTierra = 6371;//en kilometros
		double dlat = Math.toRadians(Lat - latitud); 
		double dlng = Math.toRadians(Long - longitud);
		double sindLat = Math.sin(dlat / 2);
		double sindLng = Math.sin(dlng / 2);
		double va1 = Math.pow(sindLat, 2)
				+ Math.pow(sindLng, 2) * Math.cos(Math.toRadians(Lat)) * Math.cos(Math.toRadians(latitud));
		double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));
		double distancia = radioTierra * va2;

		return distancia; // distancia en kms entre dos puntos(paradaInicio-paradaFin)
                
    }
    
        public static double calcularTotal(double distancia,double consumo_bus){
        
		double precio=0;
		final double combustible=0.80;
		final double beneficio=0.20;
		double consumo_combustible=combustible*consumo_bus;
		double gasto_viaje=distancia*consumo_combustible;
		double beneficios= gasto_viaje*beneficio;
		double total_viaje=beneficios+gasto_viaje;
		return total_viaje;
	
    }
        
        public static double Redondear(double total_viaje){
            
		return Math.rint(total_viaje*100)/100;
    }
}

