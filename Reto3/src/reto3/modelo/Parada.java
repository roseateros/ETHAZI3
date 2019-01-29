
package reto3.modelo;

public class Parada {
    	public int codParada;
	public String nombre;
	public String calle;
	public float latitud;
	public float longitud;
	
	public Parada(int codParada, String nombre, String calle,float latitud,float longitud) {
		this.codParada = codParada;
		this.nombre = nombre;
		this.calle = calle;
		this.latitud = latitud;
		this.longitud = longitud;
    }      
}
