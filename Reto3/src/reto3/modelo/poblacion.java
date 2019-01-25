
package reto3.modelo;

public class poblacion {
    	public String nombre;
	public int Cod_Postal, Cod_Parada;
	
	public poblacion (String nombre, int Cod_Postal, int paradas) {
		this.nombre = nombre;
		this.Cod_Postal = Cod_Postal;
		this.Cod_Parada = Cod_Parada;
    }   

    public String getNombre() {
        return nombre;
    }

    public int getCod_Postal() {
        return Cod_Postal;
    }

    public int getCod_Parada() {
        return Cod_Parada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCod_Postal(int Cod_Postal) {
        this.Cod_Postal = Cod_Postal;
    }

    public void setCod_Parada(int Cod_Parada) {
        this.Cod_Parada = Cod_Parada;
    }
        
}
