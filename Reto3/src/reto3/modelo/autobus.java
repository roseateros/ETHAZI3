
package reto3.modelo;

public class autobus {
    public String color,Cod_Linea;
    public int Cod_Bus, N_Plazas;
    public double Consumo_km;
    
    public autobus (String color, String Cod_Linea, int Cod_Bus, int N_Plazas, double Consumo_km)
    {
    this.Cod_Bus=Cod_Bus;
    this.Cod_Linea=Cod_Linea;
    this.Consumo_km=Consumo_km;
    this.N_Plazas=N_Plazas;
    this.color=color;
    }
}
