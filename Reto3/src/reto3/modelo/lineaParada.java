
package reto3.modelo;

public class lineaParada {
    	public double[] calculoEuclideo(Parada[] paradas) {

		double[] euclideo = null;
	
		float cateto1 = 0;
		float cateto2 = 0;

		for(int i=0;i<paradas.length;i++)
		{
			
			cateto1 =paradas[0].getLatitud()-paradas[i].getLatitud();
			cateto2 =paradas[0].getLongitud()-paradas[i].getLongitud();
			euclideo[i]=Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		}
	 
		return euclideo;
	}
	public Parada[] ordenarParadas(Parada[]paradas,double[]euclideo) {
		
		 for(int k=0;k<euclideo.length;k++) {
	            for(int f=0;f<euclideo.length;f++) {
	                if (euclideo[f]>euclideo[f+1]) {
	                    Parada aux;
	                    aux=paradas[f];
	                    paradas[f] = paradas[f+1];
	                    paradas[f+1]=aux;
	                }
	            }
	        }		
		return paradas;				
	}
}
