
package reto3.modelo;

public class billete {
    
    	public int cod_Billete, NTrayecto, dni;
	public String fecha, hora, Cod_Linea,Cod_Bus, Cod_Parada_Inicio, Cod_Parada_Fin;
        float precio;
	
	public billete(int cod_Billete, int NTrayecto, int dni, String fecha, String hora, String Cod_Linea, String Cod_Bus, String Cod_Parada_Inicio, String Cod_Parada_Fin, float precio) {
        this.Cod_Bus = Cod_Bus ; 
        this.Cod_Linea = Cod_Linea;
        this.Cod_Parada_Fin = Cod_Parada_Fin;
        this.Cod_Parada_Inicio = Cod_Parada_Inicio;
        this.NTrayecto = NTrayecto;
        this.cod_Billete = cod_Billete;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
    }

    public int getCod_Billete() {
        return cod_Billete;
    }

    public int getNTrayecto() {
        return NTrayecto;
    }

    public int getDni() {
        return dni;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getCod_Linea() {
        return Cod_Linea;
    }

    public String getCod_Bus() {
        return Cod_Bus;
    }

    public String getCod_Parada_Inicio() {
        return Cod_Parada_Inicio;
    }

    public String getCod_Parada_Fin() {
        return Cod_Parada_Fin;
    }

    public float getPrecio() {
        return precio;
    }

    public void setCod_Billete(int cod_Billete) {
        this.cod_Billete = cod_Billete;
    }

    public void setNTrayecto(int NTrayecto) {
        this.NTrayecto = NTrayecto;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setCod_Linea(String Cod_Linea) {
        this.Cod_Linea = Cod_Linea;
    }

    public void setCod_Bus(String Cod_Bus) {
        this.Cod_Bus = Cod_Bus;
    }

    public void setCod_Parada_Inicio(String Cod_Parada_Inicio) {
        this.Cod_Parada_Inicio = Cod_Parada_Inicio;
    }

    public void setCod_Parada_Fin(String Cod_Parada_Fin) {
        this.Cod_Parada_Fin = Cod_Parada_Fin;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }          
}
