
package reto3.modelo;

public class lineas {
    
	public int Cod_Linea, Cod_Parada, Cod_Bus;
	public String nombre;
	
	public lineas(int Cod_Linea, int Cod_Parada, int Cod_Bus, String nombre) {
		this.Cod_Linea = Cod_Linea;
		this.Cod_Parada = Cod_Parada;
                this.Cod_Bus = Cod_Bus;
		this.nombre = nombre;
    }

    public int getCod_Linea() {
        return Cod_Linea;
    }

    public int getCod_Parada() {
        return Cod_Parada;
    }

    public int getCod_Bus() {
        return Cod_Bus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCod_Linea(int Cod_Linea) {
        this.Cod_Linea = Cod_Linea;
    }

    public void setCod_Parada(int Cod_Parada) {
        this.Cod_Parada = Cod_Parada;
    }

    public void setCod_Bus(int Cod_Bus) {
        this.Cod_Bus = Cod_Bus;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
}
