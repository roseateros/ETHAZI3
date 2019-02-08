
package reto3.modelo;

public class billete {
    
    	public int cod_Billete, NTrayecto,Cod_Bus,Cod_Parada_Fin,Cod_Parada_Inicio;
	public String fecha, hora, dni,Cod_Linea;
        double precio;
	
	public billete( int NTrayecto, String dni, String fecha, String hora, String Cod_Linea, int Cod_Bus, int Cod_Parada_Inicio, int Cod_Parada_Fin, double precio) {
        this.Cod_Bus = Cod_Bus ; 
        this.Cod_Linea = Cod_Linea;
        this.Cod_Parada_Fin = Cod_Parada_Fin;
        this.Cod_Parada_Inicio = Cod_Parada_Inicio;
        this.NTrayecto = NTrayecto;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
    }    
}
