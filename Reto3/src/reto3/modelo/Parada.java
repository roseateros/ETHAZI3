
package reto3.modelo;

public class Parada {
    	private int codParada;
	private String nombre;
	private String calle;
	private float latitud;
	private float longitud;
	
	public Parada(int codParada, String nombre, String calle,float latitud,float longitud) {
		this.codParada = codParada;
		this.nombre = nombre;
		this.calle = calle;
		this.latitud = latitud;
		this.longitud = longitud;
    }

    public int getCodParada() {
        return codParada;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCalle() {
        return calle;
    }

    public float getLatitud() {
        return latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setCodParada(int codParada) {
        this.codParada = codParada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }
        
}
