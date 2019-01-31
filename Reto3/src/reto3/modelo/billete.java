
package reto3.modelo;

public class billete {
    
    	public int cod_Billete, NTrayecto;
	public String fecha, hora, Cod_Linea,Cod_Bus, Cod_Parada_Inicio, Cod_Parada_Fin, dni;
        double precio;
	
	public billete(int cod_Billete, int NTrayecto, String dni, String fecha, String hora, String Cod_Linea, String Cod_Bus, String Cod_Parada_Inicio, String Cod_Parada_Fin, double precio) {
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
}
